/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class ProductBrokerAgreementApiController {

	@Autowired
	ProductBrokerAgreementApiService service;
	
	@AgreeTerms.Activate
	public BianResponse<SDProductBrokerAgreementActivateOutputModel> activate(@RequestBody BianRequest<SDProductBrokerAgreementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@AgreeTerms.Configure
	public BianResponse<SDProductBrokerAgreementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductBrokerAgreementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Control
	public BianResponse<CRBrokerAgreementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrokerAgreementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Evaluate
	public BianResponse<CRBrokerAgreementEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBrokerAgreementEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalterms")
	@AgreeTerms.Evaluate
	public BianResponse<BQLegalTermsEvaluateOutputModel> evaluateLegalterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQLegalTermsEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateLegalterms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("policyterms")
	@AgreeTerms.Evaluate
	public BianResponse<BQPolicyTermsEvaluateOutputModel> evaluatePolicyterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPolicyTermsEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluatePolicyterms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatoryterms")
	@AgreeTerms.Evaluate
	public BianResponse<BQRegulatoryTermsEvaluateOutputModel> evaluateRegulatoryterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRegulatoryTermsEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateRegulatoryterms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Exchange
	public BianResponse<CRBrokerAgreementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrokerAgreementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Feedback
	public BianResponse<SDProductBrokerAgreementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductBrokerAgreementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Grant
	public BianResponse<CRBrokerAgreementGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrokerAgreementGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalterms")
	@AgreeTerms.Request
	public BianResponse<BQLegalTermsRequestOutputModel> requestLegalterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLegalTermsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestLegalterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("policyterms")
	@AgreeTerms.Request
	public BianResponse<BQPolicyTermsRequestOutputModel> requestPolicyterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPolicyTermsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPolicyterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatoryterms")
	@AgreeTerms.Request
	public BianResponse<BQRegulatoryTermsRequestOutputModel> requestRegulatoryterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRegulatoryTermsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRegulatoryterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Request
	public BianResponse<CRBrokerAgreementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrokerAgreementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalterms")
	@AgreeTerms.Retrieve
	public BianResponse<BQLegalTermsRetrieveOutputModel> retrieveLegalterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLegalterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("policyterms")
	@AgreeTerms.Retrieve
	public BianResponse<BQPolicyTermsRetrieveOutputModel> retrievePolicyterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePolicyterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("regulatoryterms")
	@AgreeTerms.Retrieve
	public BianResponse<BQRegulatoryTermsRetrieveOutputModel> retrieveRegulatoryterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegulatoryterms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<CRBrokerAgreementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@AgreeTerms.RetrieveSD
	public BianResponse<SDProductBrokerAgreementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<CRBrokerAgreementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBrokerAgreementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("legalterms")
	@AgreeTerms.Update
	public BianResponse<BQLegalTermsUpdateOutputModel> updateLegalterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLegalTermsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLegalterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("policyterms")
	@AgreeTerms.Update
	public BianResponse<BQPolicyTermsUpdateOutputModel> updatePolicyterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPolicyTermsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePolicyterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("regulatoryterms")
	@AgreeTerms.Update
	public BianResponse<BQRegulatoryTermsUpdateOutputModel> updateRegulatoryterms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRegulatoryTermsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRegulatoryterms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
