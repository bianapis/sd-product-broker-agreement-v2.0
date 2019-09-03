/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductBrokerAgreementApiServiceImpl implements ProductBrokerAgreementApiService {

	public SDProductBrokerAgreementActivateOutputModel activate(SDProductBrokerAgreementActivateInputModel request){
		return JsonReader.read("activate-SDProductBrokerAgreementActivateOutputModel.json",new TypeReference<SDProductBrokerAgreementActivateOutputModel>(){});
	}
	
	public SDProductBrokerAgreementConfigureOutputModel configure(String sdReferenceId, SDProductBrokerAgreementConfigureInputModel request){
		return JsonReader.read("configure-SDProductBrokerAgreementConfigureOutputModel.json",new TypeReference<SDProductBrokerAgreementConfigureOutputModel>(){});
	}
	
	public CRBrokerAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRBrokerAgreementControlInputModel request){
		return JsonReader.read("control-CRBrokerAgreementControlOutputModel.json",new TypeReference<CRBrokerAgreementControlOutputModel>(){});
	}
	
	public CRBrokerAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRBrokerAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRBrokerAgreementEvaluateOutputModel.json",new TypeReference<CRBrokerAgreementEvaluateOutputModel>(){});
	}
	
	public BQLegalTermsEvaluateOutputModel evaluateLegalterms(String sdReferenceId, String crReferenceId, BQLegalTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQLegalTermsEvaluateOutputModel.json",new TypeReference<BQLegalTermsEvaluateOutputModel>(){});
	}
	
	public BQPolicyTermsEvaluateOutputModel evaluatePolicyterms(String sdReferenceId, String crReferenceId, BQPolicyTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQPolicyTermsEvaluateOutputModel.json",new TypeReference<BQPolicyTermsEvaluateOutputModel>(){});
	}
	
	public BQRegulatoryTermsEvaluateOutputModel evaluateRegulatoryterms(String sdReferenceId, String crReferenceId, BQRegulatoryTermsEvaluateInputModel request){
		return JsonReader.read("evaluate-BQRegulatoryTermsEvaluateOutputModel.json",new TypeReference<BQRegulatoryTermsEvaluateOutputModel>(){});
	}
	
	public CRBrokerAgreementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBrokerAgreementExchangeInputModel request){
		return JsonReader.read("exchange-CRBrokerAgreementExchangeOutputModel.json",new TypeReference<CRBrokerAgreementExchangeOutputModel>(){});
	}
	
	public SDProductBrokerAgreementFeedbackOutputModel feedback(String sdReferenceId, SDProductBrokerAgreementFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductBrokerAgreementFeedbackOutputModel.json",new TypeReference<SDProductBrokerAgreementFeedbackOutputModel>(){});
	}
	
	public CRBrokerAgreementGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRBrokerAgreementGrantInputModel request){
		return JsonReader.read("grant-CRBrokerAgreementGrantOutputModel.json",new TypeReference<CRBrokerAgreementGrantOutputModel>(){});
	}
	
	public BQLegalTermsRequestOutputModel requestLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsRequestInputModel request){
		return JsonReader.read("request-BQLegalTermsRequestOutputModel.json",new TypeReference<BQLegalTermsRequestOutputModel>(){});
	}
	
	public BQPolicyTermsRequestOutputModel requestPolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsRequestInputModel request){
		return JsonReader.read("request-BQPolicyTermsRequestOutputModel.json",new TypeReference<BQPolicyTermsRequestOutputModel>(){});
	}
	
	public BQRegulatoryTermsRequestOutputModel requestRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsRequestInputModel request){
		return JsonReader.read("request-BQRegulatoryTermsRequestOutputModel.json",new TypeReference<BQRegulatoryTermsRequestOutputModel>(){});
	}
	
	public CRBrokerAgreementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBrokerAgreementRequestInputModel request){
		return JsonReader.read("request-CRBrokerAgreementRequestOutputModel.json",new TypeReference<CRBrokerAgreementRequestOutputModel>(){});
	}
	
	public BQLegalTermsRetrieveOutputModel retrieveLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLegalTermsRetrieveOutputModel.json",new TypeReference<BQLegalTermsRetrieveOutputModel>(){});
	}
	
	public BQPolicyTermsRetrieveOutputModel retrievePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPolicyTermsRetrieveOutputModel.json",new TypeReference<BQPolicyTermsRetrieveOutputModel>(){});
	}
	
	public BQRegulatoryTermsRetrieveOutputModel retrieveRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRegulatoryTermsRetrieveOutputModel.json",new TypeReference<BQRegulatoryTermsRetrieveOutputModel>(){});
	}
	
	public CRBrokerAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBrokerAgreementRetrieveOutputModel.json",new TypeReference<CRBrokerAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductBrokerAgreementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductBrokerAgreementRetrieveOutputModel.json",new TypeReference<SDProductBrokerAgreementRetrieveOutputModel>(){});
	}
	
	public CRBrokerAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBrokerAgreementUpdateInputModel request){
		return JsonReader.read("update-CRBrokerAgreementUpdateOutputModel.json",new TypeReference<CRBrokerAgreementUpdateOutputModel>(){});
	}
	
	public BQLegalTermsUpdateOutputModel updateLegalterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLegalTermsUpdateInputModel request){
		return JsonReader.read("update-BQLegalTermsUpdateOutputModel.json",new TypeReference<BQLegalTermsUpdateOutputModel>(){});
	}
	
	public BQPolicyTermsUpdateOutputModel updatePolicyterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPolicyTermsUpdateInputModel request){
		return JsonReader.read("update-BQPolicyTermsUpdateOutputModel.json",new TypeReference<BQPolicyTermsUpdateOutputModel>(){});
	}
	
	public BQRegulatoryTermsUpdateOutputModel updateRegulatoryterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRegulatoryTermsUpdateInputModel request){
		return JsonReader.read("update-BQRegulatoryTermsUpdateOutputModel.json",new TypeReference<BQRegulatoryTermsUpdateOutputModel>(){});
	}
	
}
