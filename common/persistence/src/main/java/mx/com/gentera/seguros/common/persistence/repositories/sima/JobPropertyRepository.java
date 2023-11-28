package mx.com.gentera.seguros.common.persistence.repositories.sima;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobPropertyPK;

public interface JobPropertyRepository extends CrudRepository<JobProperty, JobPropertyPK> {

	@Query("SELECT distinct j.id.jobName FROM JobProperty j WHERE j.id.jobName <> 'sendFilesClaimMX' and j.id.jobName <> 'sendFilesClaimPE' order by j.id.jobName asc")
	public List<String> getJobNames();

	public List<JobProperty> findByIdJobName(String jobName);

}