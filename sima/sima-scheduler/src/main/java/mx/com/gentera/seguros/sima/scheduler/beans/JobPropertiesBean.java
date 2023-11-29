package mx.com.gentera.seguros.sima.scheduler.beans;

import java.util.HashMap;
import java.util.Map;

public class JobPropertiesBean {
	
	public String type;

	public String cronExpression;

	public String storedProcedureName;

	public String sqlQuery;

	public String byItemStoredProcedureName;

	public String afterStepStoredProcedureName;

	public String localSourceFolder;

	public String localTargetFolder;

	public String remoteSourceFolder;

	public Map<String, String> remoteTargetFolder = new HashMap<>();

	public String remoteTargetFolderProcessed;

	public String remoteTargetFolderError;

	public String remoteTargetFileName;

	public String remoteTargetFolderDes;

	public String remoteTargetFolderErrorBack;

	public String pattern;

	public String prefix;

	public String sufix;

	public String dateFormat;

	public String extension;

	public String zipExtension;

	public String destinationEmailError;

	public String subjectEmailError;

	public String partnerId;

	public Integer chunk;

	public String productType;

	public Integer recordsPerCall;

	public Boolean scheduleOnStartup;

	public Integer retries;

	public Integer secondsBeforeRetry;

	public String localTargetErrorFolder;

	public String storedProcedureNameHeader;

	public String storedProcedureNameDetail;

	public String remoteFileDB;

	public String remoteTargetDB;

	public String remoteErrorNameFile;

	public String nameCron;

	private String remoteTargetFolderStr() {
		String result = "[";
		for (Map.Entry<String, String> entry : this.remoteTargetFolder.entrySet())
			result = result + (String) entry.getKey() + "= " + (String) entry.getValue() + ", ";
		result = result + "]";
		return result;
	}

	public String toString() {
		return "JobPropertiesBean [" + ((this.type != null) ? ("type=" + this.type + ", ") : "")
				+ ((this.cronExpression != null) ? ("cronExpression=" + this.cronExpression + ", ") : "")
				+ ((this.storedProcedureName != null) ? ("storedProcedureName=" + this.storedProcedureName + ", ") : "")
				+ ((this.sqlQuery != null) ? ("sqlQuery=" + this.sqlQuery + ", ") : "")
				+ ((this.byItemStoredProcedureName != null)
						? ("byItemStoredProcedureName=" + this.byItemStoredProcedureName + ", ")
						: "")
				+ ((this.afterStepStoredProcedureName != null)
						? ("afterStepStoredProcedureName=" + this.afterStepStoredProcedureName + ", ")
						: "")
				+ ((this.localSourceFolder != null) ? ("localSourceFolder=" + this.localSourceFolder + ", ") : "")
				+ ((this.localTargetFolder != null) ? ("localTargetFolder=" + this.localTargetFolder + ", ") : "")
				+ ((this.remoteSourceFolder != null) ? ("remoteSourceFolder=" + this.remoteSourceFolder + ", ") : "")
				+ ((this.remoteTargetFolder != null) ? ("remoteTargetFolder=" +

						remoteTargetFolderStr() + ", ") : "")
				+ ((this.remoteTargetFolderProcessed != null)
						? ("remoteTargetFolderProcessed=" + this.remoteTargetFolderProcessed + ", ")
						: "")
				+ ((this.remoteTargetFolderError != null)
						? ("remoteTargetFolderError=" + this.remoteTargetFolderError + ", ")
						: "")
				+ ((this.remoteTargetFileName != null) ? ("remoteTargetFileName=" + this.remoteTargetFileName + ", ")
						: "")
				+ ((this.pattern != null) ? ("pattern=" + this.pattern + ", ") : "")
				+ ((this.prefix != null) ? ("prefix=" + this.prefix + ", ") : "")
				+ ((this.sufix != null) ? ("sufix=" + this.sufix + ", ") : "")
				+ ((this.dateFormat != null) ? ("dateFormat=" + this.dateFormat + ", ") : "")
				+ ((this.extension != null) ? ("extension=" + this.extension + ", ") : "")
				+ ((this.zipExtension != null) ? ("zipExtension=" + this.zipExtension + ", ") : "")
				+ ((this.destinationEmailError != null) ? ("destinationEmailError=" + this.destinationEmailError + ", ")
						: "")
				+ ((this.subjectEmailError != null) ? ("subjectEmailError=" + this.subjectEmailError + ", ") : "")
				+ ((this.partnerId != null) ? ("partnerId=" + this.partnerId + ", ") : "")
				+ ((this.chunk != null) ? ("chunk=" + this.chunk + ", ") : "")
				+ ((this.productType != null) ? ("productType=" + this.productType + ", ") : "")
				+ ((this.recordsPerCall != null) ? ("recordsPerCall=" + this.recordsPerCall + ", ") : "")
				+ ((this.scheduleOnStartup != null) ? ("scheduleOnStartup=" + this.scheduleOnStartup + ", ") : "")
				+ ((this.retries != null) ? ("retries=" + this.retries + ", ") : "")
				+ ((this.secondsBeforeRetry != null) ? ("secondsBeforeRetry=" + this.secondsBeforeRetry + ", ") : "")
				+ ((this.localTargetErrorFolder != null)
						? ("localTargetErrorFolder=" + this.localTargetErrorFolder + ", ")
						: "")
				+ ((this.storedProcedureNameHeader != null)
						? ("storedProcedureNameHeader=" + this.storedProcedureNameHeader + ", ")
						: "")
				+ ((this.storedProcedureNameDetail != null)
						? ("storedProcedureNameDetail=" + this.storedProcedureNameDetail)
						: "")
				+ "]";
	}
}