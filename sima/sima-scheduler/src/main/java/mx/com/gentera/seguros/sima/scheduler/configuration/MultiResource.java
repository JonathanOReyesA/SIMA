package mx.com.gentera.seguros.sima.scheduler.configuration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import mx.com.gentera.seguros.sima.scheduler.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.scheduler.services.ISchedulerTaskService;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.partition.support.MultiResourcePartitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
@StepScope
public class MultiResource extends MultiResourcePartitioner {
	private String jobName;

	private static final String DEFAULT_KEY_NAME = "fileName";

	private static final String PARTITION_KEY = "partition";

	private Resource[] resources = new Resource[0];

	private String keyName = "fileName";

	@Autowired
	ISchedulerTaskService schedulerTaskService;

	public MultiResource(String name) {
		this.jobName = name;
	}

	public Map<String, ExecutionContext> partition(int gridSize) {
		setKeyName("fileName");
		JobPropertiesBean jobPropertiesBean = this.schedulerTaskService.getJobPropertiesByName(this.jobName);
		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		try {
			this.resources = pathMatchingResourcePatternResolver
					.getResources("file:" + jobPropertiesBean.localSourceFolder + "/" + jobPropertiesBean.pattern);
			setResources(this.resources);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, ExecutionContext> map = new HashMap<>(gridSize);
		int i = 0;
		for (Resource resource : this.resources) {
			ExecutionContext context = new ExecutionContext();
			Assert.state(resource.exists(), "Resource does not exist: " + resource);
			try {
				context.putString(this.keyName, resource.getURL().toExternalForm());
			} catch (IOException e) {
				throw new IllegalArgumentException("File could not be located for: " + resource, e);
			}
			map.put("partition" + i, context);
			i++;
		}
		return map;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
}