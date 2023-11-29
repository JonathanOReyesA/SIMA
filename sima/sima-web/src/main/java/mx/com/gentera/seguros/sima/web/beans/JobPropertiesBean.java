package mx.com.gentera.seguros.sima.web.beans;

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
}
