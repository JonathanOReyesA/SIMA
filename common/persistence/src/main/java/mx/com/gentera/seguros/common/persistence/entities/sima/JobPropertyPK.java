package mx.com.gentera.seguros.common.persistence.entities.sima;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the JOB_PROPERTIES database table.
 * 
 */
@Embeddable
public class JobPropertyPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "JOB_NAME")
	private String jobName;

	@Column(name = "PROPERTY_NAME")
	private String propertyName;

	public JobPropertyPK() {
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JobPropertyPK)) {
			return false;
		}
		JobPropertyPK castOther = (JobPropertyPK) other;
		return this.jobName.equals(castOther.jobName) && this.propertyName.equals(castOther.propertyName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jobName.hashCode();
		hash = hash * prime + this.propertyName.hashCode();

		return hash;
	}
}