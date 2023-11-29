package mx.com.gentera.seguros.sima.scheduler.processors;

import mx.com.gentera.seguros.sima.scheduler.model.InsuranceAltaItem;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class InsuranceAltaPEProcessor implements ItemProcessor<String, InsuranceAltaItem> {
	public InsuranceAltaItem process(String item) throws Exception {
		InsuranceAltaItem insurance = dto(item);
		return insurance;
	}

	private InsuranceAltaItem dto(String item) {
		InsuranceAltaItem insuranceCI;
		try {
			insuranceCI = new InsuranceAltaItem(item);
			if (insuranceCI.validaciones(item)) {
				insuranceCI.setSuccess(true);
			} else {
				insuranceCI.setSuccess(false);
			}
		} catch (Exception e) {
			insuranceCI = new InsuranceAltaItem();
		}
		return insuranceCI;
	}
}