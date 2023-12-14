package com.gentera.insurances.configuration;

import com.gentera.insurances.beans.EndpointBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {
	@Bean
	@ConfigurationProperties(prefix = "endpoint.CoverageCatalogueV2")
	public EndpointBean coverageCatalogueV2EndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.relationshipDataQuery")
	public EndpointBean relationshipDataQueryEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchClaimComments")
	public EndpointBean searchClaimCommentsEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.createComment")
	public EndpointBean createCommentEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchPartners")
	public EndpointBean searchPartnersEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.coverageDocumentsSearch")
	public EndpointBean coverageDocumentsSearchEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.coverageCataloguePEV2")
	public EndpointBean coverageCataloguePEV2EndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.coverageCatalogue")
	public EndpointBean coverageCatalogueEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.coverageCataloguePE")
	public EndpointBean coverageCataloguePEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.beneficiariesSearch")
	public EndpointBean beneficiariesSearchEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.businessPartnerSearch")
	public EndpointBean businessPartnerSearchEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchService")
	public EndpointBean searchServiceEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getCauseCataloguePE")
	public EndpointBean getCauseCataloguePEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getCauseCatalogue")
	public EndpointBean getCauseCatalogueEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchClaimPE")
	public EndpointBean searchClaimPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchClaims")
	public EndpointBean searchClaimsEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchClaim")
	public EndpointBean searchClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimsSearchCertificate")
	public EndpointBean claimsSearchCertificateEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.moneyCatalogue")
	public EndpointBean moneyCatalogueEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.serviceGetAge")
	public EndpointBean serviceGetAgeEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchAddressMultiRiesgoPE")
	public EndpointBean searchAddressMultiRiesgoPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.paymentlogSearch")
	public EndpointBean paymentlogSearchEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchServiceClaim")
	public EndpointBean searchServiceClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.insuranceClaimsSearch")
	public EndpointBean insuranceClaimsSearchEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.insuranceClaimsSearchPE")
	public EndpointBean insuranceClaimsSearchPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getAmountToPay")
	public EndpointBean getAmountToPayEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getAmountToPayPE")
	public EndpointBean getAmountToPayPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.beneficiariesSearchPE")
	public EndpointBean beneficiariesSearchPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.coverageDocumentsSearchPE")
	public EndpointBean coverageDocumentsSearchPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.createClaim")
	public EndpointBean createClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.createClaimPE")
	public EndpointBean createClaimPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimRejectionCatalogue")
	public EndpointBean claimRejectionCatalogueEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimStatusCatalogue")
	public EndpointBean claimStatusCatalogueEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.serviceMail")
	public EndpointBean serviceMailEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getPaymentType")
	public EndpointBean getPaymentTypeEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchServiceUser")
	public EndpointBean searchServiceUserEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimPaymentlog")
	public EndpointBean claimPaymentlogEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.documentsCreation")
	public EndpointBean documentsCreationEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.updateBeneficiaries")
	public EndpointBean updateBeneficiariesEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimRejectionCataloguePE")
	public EndpointBean claimRejectionCataloguePEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimPayment")
	public EndpointBean claimPaymentEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimRejection")
	public EndpointBean claimRejectionEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getExtensionValidation")
	public EndpointBean getExtensionValidationEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.relationshipDataQueryPE")
	public EndpointBean relationshipDataQueryPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.insuranceSearchDashboard")
	public EndpointBean insuranceSearchDashboardEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.siBeneficiariesManageSyncIn")
	public EndpointBean siBeneficiariesManageSyncInEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimUpdate")
	public EndpointBean claimUpdateEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.createServiceClaim")
	public EndpointBean createServiceClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.confirmationClaim")
	public EndpointBean confirmationClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.updateServiceUser")
	public EndpointBean updateServiceUserEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.manualPaymentValidation")
	public EndpointBean manualPaymentValidationEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.updateClaimStatus")
	public EndpointBean updateClaimStatusEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimAutomaticPayment")
	public EndpointBean claimAutomaticPaymentEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.claimAutomaticPaymentPE")
	public EndpointBean claimAutomaticPaymentPEEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.processOperationInsurance")
	public EndpointBean processOperationInsuranceEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getAffectedName")
	public EndpointBean getAffectedNameEndpointBean() {
		return new EndpointBean();
	}
}
