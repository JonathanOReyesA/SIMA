package mx.com.gentera.seguros.sima.scheduler.processors;

import mx.com.gentera.seguros.sima.scheduler.model.InsuranceCancelItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
@StepScope
public class InsuranceCancelProcessor implements ItemProcessor<String, InsuranceCancelItem> {
	private static final Logger log = LoggerFactory.getLogger(InsuranceCancelProcessor.class);

	public InsuranceCancelItem process(String item) throws Exception {
		log.info("Procesamiento de la información");
		InsuranceCancelItem insurance = dto(item);
		return insurance;
	}

	private InsuranceCancelItem dto(String item) {
		InsuranceCancelItem insuranceCI;
		try {
			insuranceCI = new InsuranceCancelItem(item.split("\\|"));
			if (insuranceCI.validaciones(item)) {
				insuranceCI.setIssuccess(true);
			} else {
				insuranceCI.setIssuccess(false);
			}
		} catch (Exception e) {
			insuranceCI = new InsuranceCancelItem();
		}
		return insuranceCI;
	}
}