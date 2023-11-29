package mx.com.gentera.seguros.sima.scheduler.readers;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.PassThroughLineMapper;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class FileStringReader implements ItemStreamReader<String> {
	private static final Logger log = LoggerFactory.getLogger(FileStringReader.class);

	private final FlatFileItemReader<String> delegate = new FlatFileItemReader<String>();

	private static String ENCODING = "Cp1252";

	private Resource resource;

	@BeforeStep
	public void beforeStep(StepExecution stepExecution) throws IOException {
		String fileName = stepExecution.getExecutionContext().getString("fileName").replace("file:", "");
		log.info("fileName: {}", fileName);
		this.resource = (Resource) new FileSystemResource(fileName);
		stepExecution.getJobExecution().getExecutionContext().put("fileToWrite", this.resource.getFilename());
		this.delegate.setEncoding(ENCODING);
		this.delegate.setResource(this.resource);
		log.info("Iniciando lectura del archivo origen: {}", this.resource.getFilename());
	}

	@AfterStep
	public void afterStep(StepExecution stepExecution) {
		log.info("La lectura del archivo {} fue exitosa!", this.resource.getFilename());
	}

	public void open(ExecutionContext executionContext) throws ItemStreamException {
		this.delegate.setLineMapper((LineMapper<String>) new PassThroughLineMapper());
		this.delegate.open(executionContext);
	}

	public void update(ExecutionContext executionContext) throws ItemStreamException {
		this.delegate.update(executionContext);
	}

	public void close() throws ItemStreamException {
		this.delegate.close();
	}

	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		String a = this.delegate.read();
		return a;
	}
}
