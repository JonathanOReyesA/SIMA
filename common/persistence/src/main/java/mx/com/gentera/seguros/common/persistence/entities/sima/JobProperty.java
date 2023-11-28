package mx.com.gentera.seguros.common.persistence.entities.sima;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the JOB_PROPERTIES database table.
 * 
 */
@Entity
@Table(name = "JOB_PROPERTIES")
@NamedQuery(name = "JobProperty.findAll", query = "SELECT j FROM JobProperty j WHERE j.id.jobName <> 'sendFilesClaimMX'")
public class JobProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private JobPropertyPK id;

	@Column(name = "PROPERTY_DESCRIPTION")
	private String propertyDescription;

	@Column(name = "PROPERTY_VALUE")
	private String propertyValue;

	@Column(name = "PROPERTY_EDITABLE")
	private Boolean propertyEditable;

	public JobProperty() {
	}

	public JobPropertyPK getId() {
		return this.id;
	}

	public void setId(JobPropertyPK id) {
		this.id = id;
	}

	public String getPropertyDescription() {
		return this.propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public Boolean getPropertyEditable() {
		return propertyEditable;
	}

	public void setPropertyEditable(Boolean propertyEditable) {
		this.propertyEditable = propertyEditable;
	}

}