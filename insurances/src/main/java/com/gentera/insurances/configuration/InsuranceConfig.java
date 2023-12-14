package com.gentera.insurances.configuration;

import com.gentera.insurances.beans.EndpointBean;
import com.gentera.insurances.endpoints.BeneficiariesSearchEndpoint;
import com.gentera.insurances.endpoints.BeneficiariesSearchPEEndpoint;
import com.gentera.insurances.endpoints.BusinessPartnerSearchEndpoint;
import com.gentera.insurances.endpoints.ClaimAutomaticPaymentEndpoint;
import com.gentera.insurances.endpoints.ClaimAutomaticPaymentPEEndpoint;
import com.gentera.insurances.endpoints.ClaimPaymentEndpoint;
import com.gentera.insurances.endpoints.ClaimPaymentlogEndpoint;
import com.gentera.insurances.endpoints.ClaimRejectionCatalogueEndpoint;
import com.gentera.insurances.endpoints.ClaimRejectionCataloguePEEndpoint;
import com.gentera.insurances.endpoints.ClaimRejectionEndpoint;
import com.gentera.insurances.endpoints.ClaimStatusCatalogueEndpoint;
import com.gentera.insurances.endpoints.ClaimUpdateEndpoint;
import com.gentera.insurances.endpoints.ClaimsSearchCertificateEndpoint;
import com.gentera.insurances.endpoints.ConfirmationClaimEndpoint;
import com.gentera.insurances.endpoints.CoverageCatalogueEndpoint;
import com.gentera.insurances.endpoints.CoverageCataloguePEEndpoint;
import com.gentera.insurances.endpoints.CoverageCataloguePEV2Endpoint;
import com.gentera.insurances.endpoints.CoverageCatalogueV2Endpoint;
import com.gentera.insurances.endpoints.CoverageDocumentsSearchEndpoint;
import com.gentera.insurances.endpoints.CoverageDocumentsSearchPEEndpoint;
import com.gentera.insurances.endpoints.CreateClaimEndpoint;
import com.gentera.insurances.endpoints.CreateClaimPEEndpoint;
import com.gentera.insurances.endpoints.CreateCommentEndpoint;
import com.gentera.insurances.endpoints.CreateServiceClaimEndpoint;
import com.gentera.insurances.endpoints.DocumentsCreationEndpoint;
import com.gentera.insurances.endpoints.GetAffectedNameEndpoint;
import com.gentera.insurances.endpoints.GetAmountToPayEndpoint;
import com.gentera.insurances.endpoints.GetAmountToPayPEEndpoint;
import com.gentera.insurances.endpoints.GetCauseCatalogueEndpoint;
import com.gentera.insurances.endpoints.GetCauseCataloguePEEndpoint;
import com.gentera.insurances.endpoints.GetExtensionValidationEndpoint;
import com.gentera.insurances.endpoints.GetPaymentTypeEndpoint;
import com.gentera.insurances.endpoints.InsuranceClaimsSearchEndpoint;
import com.gentera.insurances.endpoints.InsuranceClaimsSearchPEEndpoint;
import com.gentera.insurances.endpoints.InsuranceSearchDashboardEndpoint;
import com.gentera.insurances.endpoints.ManualPaymentValidationEndpoint;
import com.gentera.insurances.endpoints.MoneyCatalogueEndpoint;
import com.gentera.insurances.endpoints.PaymentlogSearchEndpoint;
import com.gentera.insurances.endpoints.ProcessOperationInsuranceEndpoint;
import com.gentera.insurances.endpoints.RelationshipDataQueryEndpoint;
import com.gentera.insurances.endpoints.RelationshipDataQueryPEEndpoint;
import com.gentera.insurances.endpoints.SearchAddressMultiRiesgoPEEndpoint;
import com.gentera.insurances.endpoints.SearchClaimCommentsEndpoint;
import com.gentera.insurances.endpoints.SearchClaimEndpoint;
import com.gentera.insurances.endpoints.SearchClaimPEEndpoint;
import com.gentera.insurances.endpoints.SearchClaimsEndpoint;
import com.gentera.insurances.endpoints.SearchPartnersEndpoint;
import com.gentera.insurances.endpoints.SearchServiceClaimEndpoint;
import com.gentera.insurances.endpoints.SearchServiceEndpoint;
import com.gentera.insurances.endpoints.SearchServiceUserEndpoint;
import com.gentera.insurances.endpoints.ServiceGetAgeEndpoint;
import com.gentera.insurances.endpoints.ServiceMailEndpoint;
import com.gentera.insurances.endpoints.SiBeneficiariesManageSyncInEndpoint;
import com.gentera.insurances.endpoints.UpdateBeneficiariesEndpoint;
import com.gentera.insurances.endpoints.UpdateClaimStatusEndpoint;
import com.gentera.insurances.endpoints.UpdateServiceUserEndpoint;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"*.com.gentera"})
public class InsuranceConfig {
  @Autowired
  private Bus bus;
  
  private String targetName = "http://gentera.com.mx/";
  
  private String targenNameGlobal = "http://gentera.com.mx/global/insuranceSearchDashboard/";
  
  private String targetNamePE = "http://gentera.com.pe/";
  
  private String port = "Port";
  
  @Autowired
  IPersistenceService persistenceService;
  
  @Autowired
  RelationshipDataQueryEndpoint relationshipDataQueryEndpointImpl;
  
  @Autowired
  EndpointBean relationshipDataQueryEndpointBean;
  
  @Autowired
  CoverageCatalogueV2Endpoint coverageCatalogueV2EndpointImpl;
  
  @Autowired
  EndpointBean coverageCatalogueV2EndpointBean;
  
  @Autowired
  SearchClaimCommentsEndpoint searchClaimCommentsEndpointImpl;
  
  @Autowired
  EndpointBean searchClaimCommentsEndpointBean;
  
  @Autowired
  CreateCommentEndpoint createCommentEndpointImpl;
  
  @Autowired
  EndpointBean createCommentEndpointBean;
  
  @Autowired
  SearchPartnersEndpoint searchPartnersEndpointImpl;
  
  @Autowired
  EndpointBean searchPartnersEndpointBean;
  
  @Autowired
  CoverageDocumentsSearchEndpoint coverageDocumentsSearchEndpointImpl;
  
  @Autowired
  EndpointBean coverageDocumentsSearchEndpointBean;
  
  @Autowired
  CoverageCataloguePEV2Endpoint coverageCataloguePEV2EndpointImpl;
  
  @Autowired
  EndpointBean coverageCataloguePEV2EndpointBean;
  
  @Autowired
  CoverageCatalogueEndpoint coverageCatalogueEndpointImpl;
  
  @Autowired
  EndpointBean coverageCatalogueEndpointBean;
  
  @Autowired
  CoverageCataloguePEEndpoint coverageCataloguePEEndpointImpl;
  
  @Autowired
  EndpointBean coverageCataloguePEEndpointBean;
  
  @Autowired
  BeneficiariesSearchEndpoint beneficiariesSearchEndpointImpl;
  
  @Autowired
  EndpointBean beneficiariesSearchEndpointBean;
  
  @Autowired
  BusinessPartnerSearchEndpoint businessPartnerSearchEndpointImpl;
  
  @Autowired
  EndpointBean businessPartnerSearchEndpointBean;
  
  @Autowired
  SearchServiceEndpoint searchServiceEndpointImpl;
  
  @Autowired
  EndpointBean searchServiceEndpointBean;
  
  @Autowired
  GetCauseCataloguePEEndpoint getCauseCataloguePEEndpointImpl;
  
  @Autowired
  EndpointBean getCauseCataloguePEEndpointBean;
  
  @Autowired
  GetCauseCatalogueEndpoint getCauseCatalogueEndpointImpl;
  
  @Autowired
  EndpointBean getCauseCatalogueEndpointBean;
  
  @Autowired
  SearchClaimPEEndpoint searchClaimPEEndpointImpl;
  
  @Autowired
  EndpointBean searchClaimPEEndpointBean;
  
  @Autowired
  
  SearchClaimsEndpoint searchClaimsEndpointImpl;
  
  @Autowired
  EndpointBean searchClaimsEndpointBean;
  
  @Autowired
  SearchClaimEndpoint searchClaimEndpointImpl;
  
  @Autowired
  EndpointBean searchClaimEndpointBean;
  
  @Autowired
  ClaimsSearchCertificateEndpoint claimsSearchCertificateEndpointImpl;
  
  @Autowired
  EndpointBean claimsSearchCertificateEndpointBean;
  
  @Autowired
  MoneyCatalogueEndpoint moneyCatalogueEndpointImpl;
  
  @Autowired
  EndpointBean moneyCatalogueEndpointBean;
  
  @Autowired
  ServiceGetAgeEndpoint serviceGetAgeEndpointImpl;
  
  @Autowired
  EndpointBean serviceGetAgeEndpointBean;
  
  @Autowired
  SearchAddressMultiRiesgoPEEndpoint searchAddressMultiRiesgoPEEndpointImpl;
  
  @Autowired
  EndpointBean searchAddressMultiRiesgoPEEndpointBean;
  
  @Autowired
  PaymentlogSearchEndpoint paymentlogSearchEndpointImpl;
  
  @Autowired
  EndpointBean paymentlogSearchEndpointBean;
  
  @Autowired
  SearchServiceClaimEndpoint searchServiceClaimEndpointImpl;
  
  @Autowired
  EndpointBean searchServiceClaimEndpointBean;
  
  @Autowired
  InsuranceClaimsSearchEndpoint insuranceClaimsSearchEndpointImpl;
  
  @Autowired
  EndpointBean insuranceClaimsSearchEndpointBean;
  
  @Autowired
  InsuranceClaimsSearchPEEndpoint insuranceClaimsSearchPEEndpointImpl;
  
  @Autowired
  EndpointBean insuranceClaimsSearchPEEndpointBean;
  
  @Autowired
  GetAmountToPayEndpoint getAmountToPayEndpointImpl;
  
  @Autowired
  EndpointBean getAmountToPayEndpointBean;
  
  @Autowired
  GetAmountToPayPEEndpoint getAmountToPayPEEndpointImpl;
  
  @Autowired
  EndpointBean getAmountToPayPEEndpointBean;
  
  @Autowired
  BeneficiariesSearchPEEndpoint beneficiariesSearchPEEndpointImpl;
  
  @Autowired
  EndpointBean beneficiariesSearchPEEndpointBean;
  
  @Autowired
  CoverageDocumentsSearchPEEndpoint coverageDocumentsSearchPEEndpointImpl;
  
  @Autowired
  EndpointBean coverageDocumentsSearchPEEndpointBean;
  
  @Autowired
  CreateClaimEndpoint createClaimEndpointImpl;
  
  @Autowired
  EndpointBean createClaimEndpointBean;
  
  @Autowired
  CreateClaimPEEndpoint createClaimPEEndpointImpl;
  
  @Autowired
  EndpointBean createClaimPEEndpointBean;
  
  @Autowired
  ClaimRejectionCatalogueEndpoint claimRejectionCatalogueEndpointImpl;
  
  @Autowired
  EndpointBean claimRejectionCatalogueEndpointBean;
  
  @Autowired
  ClaimStatusCatalogueEndpoint claimStatusCatalogueEndpointImpl;
  
  @Autowired
  EndpointBean claimStatusCatalogueEndpointBean;
  
  @Autowired
  ServiceMailEndpoint serviceMailEndpointImpl;
  
  @Autowired
  EndpointBean serviceMailEndpointBean;
  
  @Autowired
  GetPaymentTypeEndpoint getPaymentTypeEndpointImpl;
  
  @Autowired
  EndpointBean getPaymentTypeEndpointBean;
  
  @Autowired
  SearchServiceUserEndpoint searchServiceUserEndpointImpl;
  
  @Autowired
  EndpointBean searchServiceUserEndpointBean;
  
  @Autowired
  ClaimPaymentlogEndpoint claimPaymentlogEndpointImpl;
  
  @Autowired
  EndpointBean claimPaymentlogEndpointBean;
  
  @Autowired
  DocumentsCreationEndpoint documentsCreationEndpointImpl;
  
  @Autowired
  EndpointBean documentsCreationEndpointBean;
  
  @Autowired
  UpdateBeneficiariesEndpoint updateBeneficiariesEndpointImpl;
  
  @Autowired
  EndpointBean updateBeneficiariesEndpointBean;
  
  @Autowired
  ClaimRejectionCataloguePEEndpoint claimRejectionCataloguePEEndpointImpl;
  
  @Autowired
  EndpointBean claimRejectionCataloguePEEndpointBean;
  
  @Autowired
  ClaimPaymentEndpoint claimPaymentEndpointImpl;
  
  @Autowired
  EndpointBean claimPaymentEndpointBean;
  
  @Autowired
  ClaimRejectionEndpoint claimRejectionEndpointImpl;
  
  @Autowired
  EndpointBean claimRejectionEndpointBean;
  
  @Autowired
  GetExtensionValidationEndpoint getExtensionValidationEndpointImpl;
  
  @Autowired
  EndpointBean getExtensionValidationEndpointBean;
  
  @Autowired
  RelationshipDataQueryPEEndpoint relationshipDataQueryPEEndpointImpl;
  
  @Autowired
  EndpointBean relationshipDataQueryPEEndpointBean;
  
  @Autowired
  InsuranceSearchDashboardEndpoint insuranceSearchDashboardEndpointImpl;
  
  @Autowired
  EndpointBean insuranceSearchDashboardEndpointBean;
  
  @Autowired
  SiBeneficiariesManageSyncInEndpoint siBeneficiariesManageSyncInEndpointImpl;
  
  @Autowired
  EndpointBean siBeneficiariesManageSyncInEndpointBean;
  
  @Autowired
  ClaimUpdateEndpoint claimUpdateEndpointImpl;
  
  @Autowired
  EndpointBean claimUpdateEndpointBean;
  
  @Autowired
  CreateServiceClaimEndpoint createServiceClaimEndpointImpl;
  
  @Autowired
  EndpointBean createServiceClaimEndpointBean;
  
  @Autowired
  ConfirmationClaimEndpoint confirmationClaimEndpointImpl;
  
  @Autowired
  EndpointBean confirmationClaimEndpointBean;
  
  @Autowired
  UpdateServiceUserEndpoint updateServiceUserEndpointImpl;
  
  @Autowired
  EndpointBean updateServiceUserEndpointBean;
  
  @Autowired
  ManualPaymentValidationEndpoint manualPaymentValidationEndpointImpl;
  
  @Autowired
  EndpointBean manualPaymentValidationEndpointBean;
  
  @Autowired
  UpdateClaimStatusEndpoint updateClaimStatusEndpointImpl;
  
  @Autowired
  EndpointBean updateClaimStatusEndpointBean;
  
  @Autowired
  ClaimAutomaticPaymentEndpoint claimAutomaticPaymentEndpointImpl;
  
  @Autowired
  EndpointBean claimAutomaticPaymentEndpointBean;
  
  @Autowired
  ClaimAutomaticPaymentPEEndpoint claimAutomaticPaymentPEEndpointImpl;
  
  @Autowired
  EndpointBean claimAutomaticPaymentPEEndpointBean;
  
  @Autowired
  ProcessOperationInsuranceEndpoint processOperationInsuranceEndpointImpl;
  
  @Autowired
  EndpointBean processOperationInsuranceEndpointBean;
  
  @Autowired
  GetAffectedNameEndpoint getAffectedNameEndpointImpl;
  
  @Autowired
  EndpointBean getAffectedNameEndpointBean;
  
  @Bean
  RelationshipDataQueryEndpoint relationshipDataQueryEndpointImpl() {
    return new RelationshipDataQueryEndpoint();
  }
  
  @Bean
  public Endpoint relationshipDataQueryEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.relationshipDataQueryEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.relationshipDataQueryEndpointBean.getServiceName(), this.relationshipDataQueryEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("relationshipDataQuery" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.relationshipDataQueryEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CoverageCatalogueV2Endpoint coverageCatalogueV2EndpointImpl() {
    return new CoverageCatalogueV2Endpoint();
  }
  
  @Bean
  public Endpoint coverageCatalogueV2Endpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageCatalogueV2EndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.coverageCatalogueV2EndpointBean.getServiceName(), this.coverageCatalogueV2EndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("coverageCatalogueV2" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageCatalogueV2EndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchClaimCommentsEndpoint searchClaimCommentsEndpointImpl() {
    return new SearchClaimCommentsEndpoint();
  }
  
  @Bean
  public Endpoint searchClaimCommentsEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchClaimCommentsEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchClaimCommentsEndpointBean.getServiceName(), this.searchClaimCommentsEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchClaimCommentsEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchClaimCommentsEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CreateCommentEndpoint createCommentEndpointImpl() {
    return new CreateCommentEndpoint();
  }
  
  @Bean
  public Endpoint createCommentEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.createCommentEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.createCommentEndpointBean.getServiceName(), this.createCommentEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.createCommentEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.createCommentEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchPartnersEndpoint searchPartnersEndpointImpl() {
    return new SearchPartnersEndpoint();
  }
  
  @Bean
  public Endpoint searchPartnersEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchPartnersEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchPartnersEndpointBean.getServiceName(), this.searchPartnersEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchPartnersEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchPartnersEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CoverageDocumentsSearchEndpoint coverageDocumentsSearchEndpointImpl() {
    return new CoverageDocumentsSearchEndpoint();
  }
  
  @Bean
  public Endpoint coverageDocumentsSearchEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageDocumentsSearchEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.coverageDocumentsSearchEndpointBean.getServiceName(), this.coverageDocumentsSearchEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.coverageDocumentsSearchEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageDocumentsSearchEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CoverageCataloguePEV2Endpoint coverageCataloguePEV2EndpointImpl() {
    return new CoverageCataloguePEV2Endpoint();
  }
  
  @Bean
  public Endpoint coverageCataloguePEV2Endpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageCataloguePEV2EndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.coverageCataloguePEV2EndpointBean.getServiceName(), this.coverageCataloguePEV2EndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.coverageCataloguePEV2EndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageCataloguePEV2EndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CoverageCatalogueEndpoint coverageCatalogueEndpointImpl() {
    return new CoverageCatalogueEndpoint();
  }
  
  @Bean
  public Endpoint coverageCatalogueEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageCatalogueEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.coverageCatalogueEndpointBean.getServiceName(), this.coverageCatalogueEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("coverageCatalogue" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageCatalogueEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CoverageCataloguePEEndpoint coverageCataloguePEEndpointImpl() {
    return new CoverageCataloguePEEndpoint();
  }
  
  @Bean
  public Endpoint coverageCataloguePEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageCataloguePEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.coverageCataloguePEEndpointBean.getServiceName(), this.coverageCataloguePEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.coverageCataloguePEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageCataloguePEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  BeneficiariesSearchEndpoint beneficiariesSearchEndpointImpl() {
    return new BeneficiariesSearchEndpoint();
  }
  
  @Bean
  public Endpoint beneficiariesSearchEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.beneficiariesSearchEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.beneficiariesSearchEndpointBean.getServiceName(), this.beneficiariesSearchEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.beneficiariesSearchEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.beneficiariesSearchEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  BusinessPartnerSearchEndpoint businessPartnerSearchEndpointImpl() {
    return new BusinessPartnerSearchEndpoint();
  }
  
  @Bean
  public Endpoint businessPartnerSearchEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.businessPartnerSearchEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.businessPartnerSearchEndpointBean.getServiceName(), this.businessPartnerSearchEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.businessPartnerSearchEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.businessPartnerSearchEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchServiceEndpoint searchServiceEndpointImpl() {
    return new SearchServiceEndpoint();
  }
  
  @Bean
  public Endpoint searchServiceEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchServiceEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchServiceEndpointBean.getServiceName(), this.searchServiceEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("searchService" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchServiceEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  GetCauseCataloguePEEndpoint getCauseCataloguePEEndpointImpl() {
    return new GetCauseCataloguePEEndpoint();
  }
  
  @Bean
  public Endpoint getCauseCataloguePEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getCauseCataloguePEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.getCauseCataloguePEEndpointBean.getServiceName(), this.getCauseCataloguePEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getCauseCataloguePEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getCauseCataloguePEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  GetCauseCatalogueEndpoint getCauseCatalogueEndpointImpl() {
    return new GetCauseCatalogueEndpoint();
  }
  
  @Bean
  public Endpoint getCauseCatalogueEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getCauseCatalogueEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.getCauseCatalogueEndpointBean.getServiceName(), this.getCauseCatalogueEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getCauseCatalogueEndpointBean.getServiceName()) + this.port));
    endpoint.publish(this.getCauseCatalogueEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchClaimPEEndpoint searchClaimPEEndpointImpl() {
    return new SearchClaimPEEndpoint();
  }
  
  @Bean
  public Endpoint searchClaimPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchClaimPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.searchClaimPEEndpointBean.getServiceName(), this.searchClaimPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchClaimPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchClaimPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchClaimsEndpoint searchClaimsEndpointImpl() {
    return new SearchClaimsEndpoint();
  }
  
  @Bean
  public Endpoint searchClaimsEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchClaimsEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchClaimsEndpointBean.getServiceName(), this.searchClaimsEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchClaimsEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchClaimsEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchClaimEndpoint searchClaimEndpointImpl() {
    return new SearchClaimEndpoint();
  }
  
  @Bean
  public Endpoint searchClaimEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchClaimEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchClaimEndpointBean.getServiceName(), this.searchClaimEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchClaimEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchClaimEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ClaimsSearchCertificateEndpoint claimsSearchCertificateEndpointImpl() {
    return new ClaimsSearchCertificateEndpoint();
  }
  
  @Bean
  public Endpoint claimsSearchCertificateEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimsSearchCertificateEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimsSearchCertificateEndpointBean.getServiceName(), this.claimsSearchCertificateEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimsSearchCertificateEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimsSearchCertificateEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  MoneyCatalogueEndpoint moneyCatalogueEndpointImpl() {
    return new MoneyCatalogueEndpoint();
  }
  
  @Bean
  public Endpoint moneyCatalogueEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.moneyCatalogueEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.moneyCatalogueEndpointBean.getServiceName(), this.moneyCatalogueEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.moneyCatalogueEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.moneyCatalogueEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ServiceGetAgeEndpoint serviceGetAgeEndpointImpl() {
    return new ServiceGetAgeEndpoint();
  }
  
  @Bean
  public Endpoint serviceGetAgeEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.serviceGetAgeEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.serviceGetAgeEndpointBean.getServiceName(), this.serviceGetAgeEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.serviceGetAgeEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.serviceGetAgeEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchAddressMultiRiesgoPEEndpoint searchAddressMultiRiesgoPEEndpointImpl() {
    return new SearchAddressMultiRiesgoPEEndpoint();
  }
  
  @Bean
  public Endpoint searchAddressMultiRiesgoPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchAddressMultiRiesgoPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.searchAddressMultiRiesgoPEEndpointBean.getServiceName(), this.searchAddressMultiRiesgoPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchAddressMultiRiesgoPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchAddressMultiRiesgoPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  PaymentlogSearchEndpoint paymentlogSearchEndpointImpl() {
    return new PaymentlogSearchEndpoint();
  }
  
  @Bean
  public Endpoint paymentlogSearchEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.paymentlogSearchEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.paymentlogSearchEndpointBean.getServiceName(), this.paymentlogSearchEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.paymentlogSearchEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.paymentlogSearchEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SearchServiceClaimEndpoint searchServiceClaimEndpointImpl() {
    return new SearchServiceClaimEndpoint();
  }
  
  @Bean
  public Endpoint searchServiceClaimEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchServiceClaimEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchServiceClaimEndpointBean.getServiceName(), this.searchServiceClaimEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchServiceClaimEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchServiceClaimEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  InsuranceClaimsSearchEndpoint insuranceClaimsSearchEndpointImpl() {
    return new InsuranceClaimsSearchEndpoint();
  }
  
  @Bean
  public Endpoint insuranceClaimsSearchEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.insuranceClaimsSearchEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.insuranceClaimsSearchEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.insuranceClaimsSearchEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.insuranceClaimsSearchEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  InsuranceClaimsSearchPEEndpoint insuranceClaimsSearchPEEndpointImpl() {
    return new InsuranceClaimsSearchPEEndpoint();
  }
  
  @Bean
  public Endpoint insuranceClaimsSearchPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.insuranceClaimsSearchPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.insuranceClaimsSearchPEEndpointBean.getServiceName(), this.insuranceClaimsSearchPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.insuranceClaimsSearchPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.insuranceClaimsSearchPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  GetAmountToPayEndpoint getAmountToPayEndpointImpl() {
    return new GetAmountToPayEndpoint();
  }
  
  @Bean
  public Endpoint getAmountToPayEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getAmountToPayEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.getAmountToPayEndpointBean.getServiceName(), this.getAmountToPayEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getAmountToPayEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getAmountToPayEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  GetAmountToPayPEEndpoint getAmountToPayPEEndpointImpl() {
    return new GetAmountToPayPEEndpoint();
  }
  
  @Bean
  public Endpoint getAmountToPayPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getAmountToPayPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.getAmountToPayPEEndpointBean.getServiceName(), this.getAmountToPayPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getAmountToPayPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getAmountToPayPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public BeneficiariesSearchPEEndpoint beneficiariesSearchPEEndpointImpl() {
    return new BeneficiariesSearchPEEndpoint();
  }
  
  @Bean
  public Endpoint beneficiariesSearchPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.beneficiariesSearchPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.beneficiariesSearchPEEndpointBean.getServiceName(), this.beneficiariesSearchPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.beneficiariesSearchPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.beneficiariesSearchPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public CoverageDocumentsSearchPEEndpoint coverageDocumentsSearchPEEndpointImpl() {
    return new CoverageDocumentsSearchPEEndpoint();
  }
  
  @Bean
  public Endpoint coverageDocumentsSearchPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.coverageDocumentsSearchPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.coverageDocumentsSearchPEEndpointBean.getServiceName(), this.coverageDocumentsSearchPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.coverageDocumentsSearchPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.coverageDocumentsSearchPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public CreateClaimEndpoint createClaimEndpointImpl() {
    return new CreateClaimEndpoint();
  }
  
  @Bean
  public Endpoint createClaimEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.createClaimEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.createClaimEndpointBean.getServiceName(), this.createClaimEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.createClaimEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.createClaimEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public CreateClaimPEEndpoint createClaimPEEndpointImpl() {
    return new CreateClaimPEEndpoint();
  }
  
  @Bean
  public Endpoint createClaimPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.createClaimPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.createClaimPEEndpointBean.getServiceName(), this.createClaimPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.createClaimPEEndpointBean.getServiceName()) + this.port));
    endpoint.publish(this.createClaimPEEndpointBean.getEndpointContextPath());
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimRejectionCatalogueEndpoint claimRejectionCatalogueEndpointImpl() {
    return new ClaimRejectionCatalogueEndpoint();
  }
  
  @Bean
  public Endpoint claimRejectionCatalogueEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimRejectionCatalogueEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimRejectionCatalogueEndpointBean.getServiceName(), this.claimRejectionCatalogueEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimRejectionCatalogueEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimRejectionCatalogueEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimStatusCatalogueEndpoint claimStatusCatalogueEndpointImpl() {
    return new ClaimStatusCatalogueEndpoint();
  }
  
  @Bean
  public Endpoint claimStatusCatalogueEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimStatusCatalogueEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimStatusCatalogueEndpointBean.getServiceName(), this.claimStatusCatalogueEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimStatusCatalogueEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimStatusCatalogueEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ServiceMailEndpoint serviceMailEndpointImpl() {
    return new ServiceMailEndpoint();
  }
  
  @Bean
  public Endpoint serviceMailEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.serviceMailEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.serviceMailEndpointBean.getServiceName(), this.serviceMailEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.serviceMailEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.serviceMailEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public GetPaymentTypeEndpoint getPaymentTypeEndpointImpl() {
    return new GetPaymentTypeEndpoint();
  }
  
  @Bean
  public Endpoint searchInsuranceEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getPaymentTypeEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.getPaymentTypeEndpointBean.getServiceName(), this.getPaymentTypeEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getPaymentTypeEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getPaymentTypeEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public SearchServiceUserEndpoint searchServiceUserEndpointImpl() {
    return new SearchServiceUserEndpoint();
  }
  
  @Bean
  public Endpoint searchServiceUserEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.searchServiceUserEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.searchServiceUserEndpointBean.getServiceName(), this.searchServiceUserEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.searchServiceUserEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.searchServiceUserEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimPaymentlogEndpoint claimPaymentlogEndpointImpl() {
    return new ClaimPaymentlogEndpoint();
  }
  
  @Bean
  public Endpoint claimPaymentlogEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimPaymentlogEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimPaymentlogEndpointBean.getServiceName(), this.claimPaymentlogEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimPaymentlogEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimPaymentlogEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public DocumentsCreationEndpoint documentsCreationEndpointImpl() {
    return new DocumentsCreationEndpoint();
  }
  
  @Bean
  public Endpoint documentsCreationEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.documentsCreationEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.documentsCreationEndpointBean.getServiceName(), this.documentsCreationEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.documentsCreationEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.documentsCreationEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public UpdateBeneficiariesEndpoint updateBeneficiariesEndpointImpl() {
    return new UpdateBeneficiariesEndpoint();
  }
  
  @Bean
  public Endpoint updateBeneficiariesEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.updateBeneficiariesEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.updateBeneficiariesEndpointBean.getServiceName(), this.updateBeneficiariesEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.updateBeneficiariesEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.updateBeneficiariesEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimRejectionCataloguePEEndpoint claimRejectionCataloguePEEndpointImpl() {
    return new ClaimRejectionCataloguePEEndpoint();
  }
  
  @Bean
  public Endpoint claimRejectionCataloguePEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimRejectionCataloguePEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.claimRejectionCataloguePEEndpointBean.getServiceName(), this.claimRejectionCataloguePEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimRejectionCataloguePEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimRejectionCataloguePEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimPaymentEndpoint claimPaymentEndpointImpl() {
    return new ClaimPaymentEndpoint();
  }
  
  @Bean
  public Endpoint claimPaymentEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimPaymentEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimPaymentEndpointBean.getServiceName(), this.claimPaymentEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("claimPayment" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimPaymentEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public ClaimRejectionEndpoint claimRejectionEndpointImpl() {
    return new ClaimRejectionEndpoint();
  }
  
  @Bean
  public Endpoint claimRejectionEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimRejectionEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimRejectionEndpointBean.getServiceName(), this.claimRejectionEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimRejectionEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimRejectionEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  public GetExtensionValidationEndpoint getExtensionValidationEndpointImpl() {
    return new GetExtensionValidationEndpoint();
  }
  
  @Bean
  public Endpoint getExtensionValidationEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getExtensionValidationEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.getExtensionValidationEndpointBean.getServiceName(), this.getExtensionValidationEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getExtensionValidationEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getExtensionValidationEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  RelationshipDataQueryPEEndpoint relationshipDataQueryPEEndpointImpl() {
    return new RelationshipDataQueryPEEndpoint();
  }
  
  @Bean
  public Endpoint relationshipDataQueryPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.relationshipDataQueryPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetNamePE, this.relationshipDataQueryPEEndpointBean.getServiceName(), this.relationshipDataQueryPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("relationshipDataQueryPE" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.relationshipDataQueryPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  InsuranceSearchDashboardEndpoint insuranceSearchDashboardEndpointImpl() {
    return new InsuranceSearchDashboardEndpoint();
  }
  
  @Bean
  public Endpoint insuranceSearchDashboardEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.insuranceSearchDashboardEndpointImpl);
    endpoint.setServiceName(new QName(this.targenNameGlobal, this.insuranceSearchDashboardEndpointBean.getServiceName(), this.insuranceSearchDashboardEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName("insuranceSearchDashboard" + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.insuranceSearchDashboardEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  SiBeneficiariesManageSyncInEndpoint siBeneficiariesManageSyncInEndpointImpl() {
    return new SiBeneficiariesManageSyncInEndpoint();
  }
  
  @Bean
  public Endpoint siBeneficiariesManageSyncInEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.siBeneficiariesManageSyncInEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.siBeneficiariesManageSyncInEndpointBean.getServiceName(), this.siBeneficiariesManageSyncInEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.siBeneficiariesManageSyncInEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.siBeneficiariesManageSyncInEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ClaimUpdateEndpoint claimUpdateEndpointImpl() {
    return new ClaimUpdateEndpoint();
  }
  
  @Bean
  public Endpoint claimUpdateEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimUpdateEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimUpdateEndpointBean.getServiceName(), this.claimUpdateEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimUpdateEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimUpdateEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  CreateServiceClaimEndpoint createServiceClaimEndpointImpl() {
    return new CreateServiceClaimEndpoint();
  }
  
  @Bean
  public Endpoint createServiceClaimEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.createServiceClaimEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.createServiceClaimEndpointBean.getServiceName(), this.createServiceClaimEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.createServiceClaimEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.createServiceClaimEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ConfirmationClaimEndpoint confirmationClaimEndpointImpl() {
    return new ConfirmationClaimEndpoint();
  }
  
  @Bean
  public Endpoint confirmationClaimEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.confirmationClaimEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.confirmationClaimEndpointBean.getServiceName(), this.confirmationClaimEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.confirmationClaimEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.confirmationClaimEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  UpdateServiceUserEndpoint updateServiceUserEndpointImpl() {
    return new UpdateServiceUserEndpoint();
  }
  
  @Bean
  public Endpoint updateServiceUserEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.updateServiceUserEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.updateServiceUserEndpointBean.getServiceName(), this.updateServiceUserEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.updateServiceUserEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.updateServiceUserEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ManualPaymentValidationEndpoint manualPaymentValidationEndpointImpl() {
    return new ManualPaymentValidationEndpoint();
  }
  
  @Bean
  public Endpoint manualPaymentValidationEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.manualPaymentValidationEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.manualPaymentValidationEndpointBean.getServiceName(), this.manualPaymentValidationEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.manualPaymentValidationEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.manualPaymentValidationEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  UpdateClaimStatusEndpoint updateClaimStatusEndpointImpl() {
    return new UpdateClaimStatusEndpoint();
  }
  
  @Bean
  public Endpoint updateClaimStatusEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.updateClaimStatusEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.updateClaimStatusEndpointBean.getServiceName(), this.updateClaimStatusEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.updateClaimStatusEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.updateClaimStatusEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ClaimAutomaticPaymentEndpoint claimAutomaticPaymentEndpointImpl() {
    return new ClaimAutomaticPaymentEndpoint();
  }
  
  @Bean
  public Endpoint claimAutomaticPaymentEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimAutomaticPaymentEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimAutomaticPaymentEndpointBean.getServiceName(), this.claimAutomaticPaymentEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimAutomaticPaymentEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimAutomaticPaymentEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ClaimAutomaticPaymentPEEndpoint claimAutomaticPaymentPEEndpointImpl() {
    return new ClaimAutomaticPaymentPEEndpoint();
  }
  
  @Bean
  public Endpoint claimAutomaticPaymentPEEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.claimAutomaticPaymentPEEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.claimAutomaticPaymentPEEndpointBean.getServiceName(), this.claimAutomaticPaymentPEEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.claimAutomaticPaymentPEEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.claimAutomaticPaymentPEEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  ProcessOperationInsuranceEndpoint ProcessOperationInsuranceEndpointImpl() {
    return new ProcessOperationInsuranceEndpoint();
  }
  
  @Bean
  public Endpoint processOperationInsuranceEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.processOperationInsuranceEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.processOperationInsuranceEndpointBean.getServiceName(), this.processOperationInsuranceEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.processOperationInsuranceEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.processOperationInsuranceEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
  
  @Bean
  GetAffectedNameEndpoint getAffectedNameEndpointImpl() {
    return new GetAffectedNameEndpoint();
  }
  
  @Bean
  public Endpoint getAffectedNameEndpoint() {
    EndpointImpl endpoint = new EndpointImpl(this.bus, this.getAffectedNameEndpointImpl);
    endpoint.setServiceName(new QName(this.targetName, this.getAffectedNameEndpointBean.getServiceName(), this.getAffectedNameEndpointBean.getServiceName()));
    endpoint.setEndpointName(new QName(String.valueOf(this.getAffectedNameEndpointBean.getServiceName()) + this.port));
    endpoint.getInInterceptors().add(new LoggingInInterceptor());
    endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
    endpoint.publish(this.getAffectedNameEndpointBean.getEndpointContextPath());
    return (Endpoint)endpoint;
  }
}
