package mx.com.gentera.seguros.sima.scheduler.configuration;

import javax.sql.DataSource;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
//import mx.com.gentera.seguros.sima.scheduler.configuration.MultiResource;
import mx.com.gentera.seguros.sima.scheduler.processors.InsuranceAltaPEProcessor;
import mx.com.gentera.seguros.sima.scheduler.processors.InsuranceCancelProcessor;
import mx.com.gentera.seguros.sima.scheduler.readers.FileStringReader;
import mx.com.gentera.seguros.sima.scheduler.readers.InsurancePEReader;
import mx.com.gentera.seguros.sima.scheduler.tasklets.CreateInsuranceTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.CreationFileRoboSendTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.DeleteFileTmpTasklet;
import mx.com.gentera.seguros.sima.scheduler.tasklets.DeleteTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.DownloadFileTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.FolderClaimTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.GetDataFromFileTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.GetInsurancePSCTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.MoveFilesTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.ReadRowsInsuranceTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SFTPTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SPTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SendEmailAutomationPaymentTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SendFilesClaimSPTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SendFilesRoboSPTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.SendFilesSPTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.ValidFormatFilePETasklet;
import mx.com.gentera.seguros.sima.scheduler.tasklets.WriteInsurancePSCBatchTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.tasklets.ZipTaskletStep;
import mx.com.gentera.seguros.sima.scheduler.writers.FileStringWrite;
import mx.com.gentera.seguros.sima.scheduler.writers.InsuranceAltaWriter;
import mx.com.gentera.seguros.sima.scheduler.writers.InsuranceCancelWriter;
//import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.FlowJobBuilder;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemProcessor;
//import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//import javassist.bytecode.StackMap;

@Configuration
@EnableBatchProcessing
public class BatchConfig extends DefaultBatchConfigurer {
	@Autowired
	@Qualifier("localDataSource")
	DataSource localDataSource;

	@Autowired
	private SftpSessionBean filesSftpSession;

	@Autowired
	private SftpSessionBean sftpSessionAterna;

	@Autowired
	private SftpSessionBean sftpSessionMapfre;

	@Autowired
	private SftpSessionBean sftpSessionUniversales;

	@Autowired
	private SftpSessionBean sftpSessionRimac;

	@Autowired
	private SftpSessionBean dbSftpSession;

	@Autowired
	private SftpSessionBean sftpSessionMapfre_MXA;

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	protected JobRepository createJobRepository() throws Exception {
		JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
		factory.setDataSource((DataSource) this.localDataSource);
		factory.setTransactionManager(getTransactionManager());
		factory.afterPropertiesSet();
		return factory.getObject();
	}

	private final String updateBPMX = "updateBPMX";
	private final String updateBPGT = "updateBPGT";
	private final String transferGTCartera = "transferGTCartera";
	private final String transferMXCartera = "transferMXCartera";
	private final String cancelInsurancePE = "cancelInsurancePE";
	private final String createInsurancePE = "createInsurancePE";
	private final String COMPLETED = "COMPLETED";
	private final String NOOP = "NOOP";

	@Bean
	@StepScope
	public SendFilesSPTaskletStep sendFilesSPTaskletStep() {
		return new SendFilesSPTaskletStep();
	}

	@Bean
	@StepScope
	public GetInsurancePSCTaskletStep getInsurancePSCTaskletStep() {
		return new GetInsurancePSCTaskletStep();
	}

	@Bean
	@StepScope
	public WriteInsurancePSCBatchTaskletStep writeInsurancePSCBatchTaskletStep() {
		return new WriteInsurancePSCBatchTaskletStep(this.dbSftpSession);
	}

	@Bean
	@StepScope
	public SendFilesRoboSPTaskletStep sendFilesRoboSPTaskletStep() {
		return new SendFilesRoboSPTaskletStep();
	}

	@Bean
	@StepScope
	public GetDataFromFileTaskletStep getDataFromFileTaskletStep() {
		return new GetDataFromFileTaskletStep(this.filesSftpSession);
	}

	@Bean
	@StepScope
	public CreateInsuranceTaskletStep createInsuranceTaskletStep() {
		return new CreateInsuranceTaskletStep();
	}

	@Bean
	@StepScope
	public SPTaskletStep spTaskletStep() {
		return new SPTaskletStep();
	}

	@Bean
	@StepScope
	public ZipTaskletStep zipTaskletStep() {
		return new ZipTaskletStep();
	}

	@Bean
	@StepScope
	public CreationFileRoboSendTaskletStep creationFileRoboSendTaskletStep() {
		return new CreationFileRoboSendTaskletStep();
	}

	@Bean
	@StepScope
	public SFTPTaskletStep sftpAternaTaskletStep() {
		return new SFTPTaskletStep(this.sftpSessionAterna);
	}

	@Bean
	@StepScope
	public SFTPTaskletStep sftpMapfreTaskletStep() {
		return new SFTPTaskletStep(this.sftpSessionMapfre);
	}

	@Bean
	@StepScope
	public SFTPTaskletStep sftpMapfreMXATaskletStep() {
		return new SFTPTaskletStep(this.sftpSessionMapfre_MXA);
	}

	@Bean
	@StepScope
	public SFTPTaskletStep sftpUniversalesTaskletStep() {
		return new SFTPTaskletStep(this.sftpSessionUniversales);
	}

	@Bean
	@StepScope
	public SFTPTaskletStep sftpRimacTaskletStep() {
		return new SFTPTaskletStep(this.sftpSessionRimac);
	}

	@Bean
	@StepScope
	public DeleteTaskletStep deleteTaskletStep() {
		return new DeleteTaskletStep();
	}

	@Bean
	@StepScope
	public SendFilesClaimSPTaskletStep sendFilesClaimSPTaskletStep() {
		return new SendFilesClaimSPTaskletStep();
	}

	@Bean
	@StepScope
	public FolderClaimTaskletStep folderClaimMapfreTaskletStep() {
		return new FolderClaimTaskletStep(this.filesSftpSession, this.sftpSessionMapfre);
	}

	@Bean
	@StepScope
	public MoveFilesTaskletStep moveFilesTaskletStep() {
		return new MoveFilesTaskletStep(this.filesSftpSession);
	}

	@Bean
	@StepScope
	public DownloadFileTaskletStep downloadFileTaskletStep() {
		return new DownloadFileTaskletStep(this.filesSftpSession);
	}

	@Bean
	@StepScope
	public SendEmailAutomationPaymentTaskletStep sendEmailAutomationPaymentTaskletStep() {
		return new SendEmailAutomationPaymentTaskletStep();
	}

	@Bean
	@StepScope
	public ValidFormatFilePETasklet validFormatFilePETasklet() {
		return new ValidFormatFilePETasklet(this.filesSftpSession);
	}

	@Bean
	@StepScope
	public FileStringWrite fileStringWrite() {
		return new FileStringWrite(this.dbSftpSession, this.filesSftpSession);
	}

	@Bean
	@StepScope
	public InsuranceCancelWriter insuranceCancelWriter() {
		return new InsuranceCancelWriter(this.dbSftpSession, this.filesSftpSession);
	}

	@Bean
	@StepScope
	public InsuranceAltaWriter insuranceAltaWriter() {
		return new InsuranceAltaWriter(this.dbSftpSession, this.filesSftpSession);
	}

	@Bean
	@StepScope
	public FileStringReader FileStringReader() {
		return new FileStringReader();
	}

	@Bean
	@StepScope
	public InsurancePEReader insurancePEReader() {
		return new InsurancePEReader();
	}

	@Bean
	@StepScope
	public InsuranceCancelProcessor insuranceCancelProcessor() {
		return new InsuranceCancelProcessor();
	}

	@Bean
	@StepScope
	public InsuranceAltaPEProcessor insuranceAltaPEProcessor() {
		return new InsuranceAltaPEProcessor();
	}

	@Bean
	public Step sendFilesSPStep() {
		return (Step) this.stepBuilderFactory.get("sendFilesSPStep").tasklet((Tasklet) sendFilesSPTaskletStep())
				.build();
	}

	@Bean
	public Step moveFilesStep() {
		return (Step) this.stepBuilderFactory.get("moveFilesTaskletStep").tasklet((Tasklet) moveFilesTaskletStep())
				.build();
	}

	@Bean
	public Step getInsurancePSCStep() {
		return (Step) this.stepBuilderFactory.get("getInsurancePSCStep").tasklet((Tasklet) getInsurancePSCTaskletStep())
				.build();
	}

	@Bean
	public Step writeInsurancePSCBatchStep() {
		return (Step) this.stepBuilderFactory.get("writeInsurancePSCBatchStep")
				.tasklet((Tasklet) writeInsurancePSCBatchTaskletStep()).build();
	}

	@Bean
	public Step sendFilesRoboSPStep() {
		return (Step) this.stepBuilderFactory.get("sendFilesRoboSPStep").tasklet((Tasklet) sendFilesRoboSPTaskletStep())
				.build();
	}

	@Bean
	public Step createInsuranceStep() {
		return (Step) this.stepBuilderFactory.get("createInsuranceStep").tasklet((Tasklet) createInsuranceTaskletStep())
				.build();
	}

	@Bean
	public Step spStep() {
		return (Step) this.stepBuilderFactory.get("spStep").tasklet((Tasklet) spTaskletStep()).build();
	}

	@Bean
	public Step zipStep() {
		return (Step) this.stepBuilderFactory.get("zipStep").tasklet((Tasklet) zipTaskletStep()).build();
	}

	@Bean
	public Step creationFilesStepRobo() {
		return (Step) this.stepBuilderFactory.get("creationFilesStepRobo")
				.tasklet((Tasklet) creationFileRoboSendTaskletStep()).build();
	}

	@Bean
	public Step sftpAternaStep() {
		return (Step) this.stepBuilderFactory.get("sftpAternaStep").tasklet((Tasklet) sftpAternaTaskletStep()).build();
	}

	@Bean
	public Step sftpMapfreStep() {
		return (Step) this.stepBuilderFactory.get("sftpMapfreStep").tasklet((Tasklet) sftpMapfreTaskletStep()).build();
	}

	@Bean
	public Step sftpMapfreeMXAStep() {
		return (Step) this.stepBuilderFactory.get("sftpMapfreeMXAStep").tasklet((Tasklet) sftpMapfreMXATaskletStep())
				.build();
	}

	@Bean
	public Step sftpUniversalesStep() {
		return (Step) this.stepBuilderFactory.get("sftpUniversalesStep").tasklet((Tasklet) sftpUniversalesTaskletStep())
				.build();
	}

	@Bean
	public Step sftpRimacStep() {
		return (Step) this.stepBuilderFactory.get("sftpRimacStep").tasklet((Tasklet) sftpRimacTaskletStep()).build();
	}

	@Bean
	public Step deleteStep() {
		return (Step) this.stepBuilderFactory.get("deleteStep").tasklet((Tasklet) deleteTaskletStep()).build();
	}

	@Bean
	public Step sendFilesClaimSPStep() {
		return (Step) this.stepBuilderFactory.get("sendFilesClaimSPStep")
				.tasklet((Tasklet) sendFilesClaimSPTaskletStep()).build();
	}

	@Bean
	public Step folderClaimMapfreStep() {
		return (Step) this.stepBuilderFactory.get("folderClaimMapfreStep")
				.tasklet((Tasklet) folderClaimMapfreTaskletStep()).build();
	}

	@Bean
	public Step downloadFileStep() {
		return (Step) this.stepBuilderFactory.get("downloadFileTaskletStep")
				.tasklet((Tasklet) downloadFileTaskletStep()).build();
	}

	@Bean
	public Step sendEmailAutomationPaymentStep() {
		return (Step) this.stepBuilderFactory.get("sendEmailAutomationPaymentTaskletStep")
				.tasklet((Tasklet) sendEmailAutomationPaymentTaskletStep()).build();
	}

	@Bean
	public Step deleteFileTmpStep() {
		return (Step) this.stepBuilderFactory.get("deleteFileTmpStep").tasklet((Tasklet) deleteFileTmpTaskletStep())
				.build();
	}

	@Bean
	public Step validFormatFilePEStep() {
		return (Step) this.stepBuilderFactory.get("validFormatFilePETasklet")
				.tasklet((Tasklet) validFormatFilePETasklet()).build();
	}

	@Bean
	@StepScope
	public ReadRowsInsuranceTaskletStep readRowsInsuranceTaskletStep() {
		return new ReadRowsInsuranceTaskletStep();
	}

	@Bean
	@StepScope
	public DeleteFileTmpTasklet deleteFileTmpTaskletStep() {
		return new DeleteFileTmpTasklet();
	}

	@Bean
	public Step readRowsInsuranceRoboStep() {
		return (Step) this.stepBuilderFactory.get("readRowsInsuranceRoboStep")
				.tasklet((Tasklet) readRowsInsuranceTaskletStep()).build();
	}

	@Bean
	public Step getDataFromFileStep() {
		return (Step) this.stepBuilderFactory.get("getDataFromFileStep").tasklet((Tasklet) getDataFromFileTaskletStep())
				.build();
	}

	@Bean
	@StepScope
	@Scope("prototype")
	public MultiResource multiReourse(String job) {
		return new MultiResource(job);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	@Scope("prototype")
	public Step actualizarBP(String job) {
		TaskletStep taskletStep = this.stepBuilderFactory.get("updateBPStep").chunk(1000000).reader(FileStringReader())
				.writer((ItemWriter) fileStringWrite()).build();
		return this.stepBuilderFactory.get("MultiResourcePartitionerMasterStep").partitioner((Step) taskletStep)
				.partitioner("step", (Partitioner) multiReourse(job)).build();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public Step validateFileInsurancesCancelStep() {
		TaskletStep taskletStep = this.stepBuilderFactory.get("validateFileInsurancesCancelStep").chunk(1000000)
				.reader(insurancePEReader()).processor((ItemProcessor) insuranceCancelProcessor())
				.writer(insuranceCancelWriter()).build();
		return this.stepBuilderFactory.get("MultiResourcePartitionerMasterStepCancel").partitioner((Step) taskletStep)
				.partitioner("step", (Partitioner) multiReourse("cancelInsurancePE")).build();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Bean
	public Step createInsurancePEStep() {
		TaskletStep taskletStep = this.stepBuilderFactory.get("createInsurancePEStep").chunk(1000000)
				.reader(insurancePEReader()).processor((ItemProcessor) insuranceAltaPEProcessor())
				.writer(insuranceAltaWriter()).build();
		return this.stepBuilderFactory.get("MultiResourcePartitionerMasterCreateInsuranceCancel")
				.partitioner((Step) taskletStep).partitioner("step", (Partitioner) multiReourse("createInsurancePE"))
				.build();
	}

	@Bean
	public Job createInsuranceRobo() {
		return this.jobBuilderFactory.get("createInsuranceRobo").start(readRowsInsuranceRoboStep()).build();
	}

	@Bean
	public Job createInsuranceRoboBatch() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("createInsuranceRoboBatch").start(getInsurancePSCStep())
				.on("NOOP").end("COMPLETED").from(getInsurancePSCStep()).on("COMPLETED")
				.to(writeInsurancePSCBatchStep()).end()).build();
	}

	@Bean
	public Job sendFilesMX() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("sendFilesMX").start(sendFilesSPStep()).on("NOOP")
				.end("COMPLETED").from(sendFilesSPStep()).on("COMPLETED").to(zipStep()).from(zipStep()).on("COMPLETED")
				.to(sftpAternaStep()).from(sftpAternaStep()).on("COMPLETED").to(sftpMapfreStep()).from(sftpMapfreStep())
				.on("COMPLETED").to(sendEmailAutomationPaymentStep()).from(sendEmailAutomationPaymentStep())
				.on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job sendFilesRoboMX() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("sendFilesRoboMX").start(sendFilesRoboSPStep()).on("NOOP")
				.end("COMPLETED").from(sendFilesRoboSPStep()).on("COMPLETED").to(zipStep()).from(zipStep())
				.on("COMPLETED").to(sftpAternaStep()).from(sftpAternaStep()).on("COMPLETED").to(sftpMapfreeMXAStep())
				.from(sftpMapfreeMXAStep()).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job sendFilesGT() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("sendFilesGT").start(sendFilesSPStep()).on("NOOP")
				.end("COMPLETED").from(sendFilesSPStep()).on("COMPLETED").to(zipStep()).from(zipStep()).on("COMPLETED")
				.to(sftpAternaStep()).from(sftpAternaStep()).on("COMPLETED").to(sftpUniversalesStep())
				.from(sftpUniversalesStep()).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job sendFilesPE() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("sendFilesPE").start(sendFilesSPStep()).on("NOOP")
				.end("COMPLETED").from(sendFilesSPStep()).on("COMPLETED").to(zipStep()).from(zipStep()).on("COMPLETED")
				.to(sftpAternaStep()).from(sftpAternaStep()).on("COMPLETED").to(sftpRimacStep()).from(sftpRimacStep())
				.on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job insuranceExpiration() {
		return this.jobBuilderFactory.get("insuranceExpiration").start(spStep()).build();
	}

	@Bean
	public Job debugErrors() {
		return this.jobBuilderFactory.get("debugErrors").start(spStep()).build();
	}

	@Bean
	public Job createInsurance() {
		return this.jobBuilderFactory.get("createInsurance").start(createInsuranceStep()).build();
	}

	@Bean
	public Job sendFilesClaimMX() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("sendFilesClaimMX").start(sendFilesClaimSPStep()).on("NOOP")
				.end("COMPLETED").from(sendFilesClaimSPStep()).on("COMPLETED").to(folderClaimMapfreStep())
				.from(folderClaimMapfreStep()).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job updateBPMX() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("updateBPMX").start(moveFilesStep()).on("NOOP")
				.end("COMPLETED").from(moveFilesStep()).on("COMPLETED").to(getDataFromFileStep())
				.from(getDataFromFileStep()).on("COMPLETED").to(actualizarBP("updateBPMX"))
				.from(actualizarBP("updateBPMX")).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job updateBPGT() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("updateBPGT").start(moveFilesStep()).on("NOOP")
				.end("COMPLETED").from(moveFilesStep()).on("COMPLETED").to(getDataFromFileStep())
				.from(getDataFromFileStep()).on("COMPLETED").to(actualizarBP("updateBPGT"))
				.from(actualizarBP("updateBPGT")).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job transferMXCartera() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("transferMXCartera").start(moveFilesStep()).on("NOOP")
				.end("COMPLETED").from(moveFilesStep()).on("COMPLETED").to(getDataFromFileStep())
				.from(getDataFromFileStep()).on("COMPLETED").to(actualizarBP("transferMXCartera"))
				.from(actualizarBP("transferMXCartera")).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job transferGTCartera() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("transferGTCartera").start(moveFilesStep()).on("NOOP")
				.end("COMPLETED").from(moveFilesStep()).on("COMPLETED").to(getDataFromFileStep())
				.from(getDataFromFileStep()).on("COMPLETED").to(actualizarBP("transferGTCartera"))
				.from(actualizarBP("transferGTCartera")).on("COMPLETED").to(deleteStep()).end()).build();
	}

	@Bean
	public Job cancelInsurancePE() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("cancelInsurancePE").start(validFormatFilePEStep())
				.on("NOOP").end("COMPLETED").from(validFormatFilePEStep()).on("COMPLETED").to(downloadFileStep())
				.from(downloadFileStep()).on("COMPLETED").to(moveFilesStep()).from(moveFilesStep()).on("COMPLETED")
				.to(validateFileInsurancesCancelStep()).from(validateFileInsurancesCancelStep()).on("COMPLETED")
				.to(deleteFileTmpStep()).end()).build();
	}

	@Bean
	public Job createInsurancePE() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("createInsurancePE").start(validFormatFilePEStep())
				.on("NOOP").end("COMPLETED").from(validFormatFilePEStep()).on("COMPLETED").to(downloadFileStep())
				.from(downloadFileStep()).on("COMPLETED").to(moveFilesStep()).from(moveFilesStep()).on("COMPLETED")
				.to(createInsurancePEStep()).from(createInsurancePEStep()).on("COMPLETED").to(deleteFileTmpStep())
				.end()).build();
	}

	@Bean
	public Job createInsuranceVoluntarioBatch() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("createInsuranceVoluntarioBatch")
				.start(getInsurancePSCStep()).on("NOOP").end("COMPLETED").from(getInsurancePSCStep()).on("COMPLETED")
				.to(writeInsurancePSCBatchStep()).end()).build();
	}

	@Bean
	public Job createInsuranceBasicoBatch() {
		return ((FlowJobBuilder) this.jobBuilderFactory.get("createInsuranceBasicoBatch").start(getInsurancePSCStep())
				.on("NOOP").end("COMPLETED").from(getInsurancePSCStep()).on("COMPLETED")
				.to(writeInsurancePSCBatchStep()).end()).build();
	}
}