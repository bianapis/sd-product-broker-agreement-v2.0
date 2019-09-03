/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductBrokerAgreementApiService {

	SDProductBrokerAgreementActivateOutputModel activate(SDProductBrokerAgreementActivateInputModel request);
	
	SDProductBrokerAgreementConfigureOutputModel configure(String sdReferenceId, SDProductBrokerAgreementConfigureInputModel request);
	
	CRBrokerAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRBrokerAgreementControlInputModel request);
	
	CRBrokerAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRBrokerAgreementEvaluateInputModel request);
	
	BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request);
	
	BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request);
	
	BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request);
	
	CRBrokerAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBrokerAgreementExchangeInputModel request);
	
	SDProductBrokerAgreementFeedbackOutputModel feedback(String sdReferenceId, SDProductBrokerAgreementFeedbackInputModel request);
	
	CRBrokerAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBrokerAgreementGrantInputModel request);
	
	BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request);
	
	BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request);
	
	BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request);
	
	CRBrokerAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBrokerAgreementRequestInputModel request);
	
	BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRBrokerAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductBrokerAgreementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBrokerAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBrokerAgreementUpdateInputModel request);
	
	BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request);
	
	BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request);
	
	BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request);
	
}
