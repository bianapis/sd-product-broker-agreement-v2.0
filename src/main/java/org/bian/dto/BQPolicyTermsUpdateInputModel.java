package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsUpdateInputModelBrokerAgreementInstanceRecord;
import org.bian.dto.BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsUpdateInputModel
 */
public class BQPolicyTermsUpdateInputModel   {
  private BQPolicyTermsUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementInstanceReference = null;

  private String policyTermsInstanceReference = null;

  private BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;

  private Object policyTermsUpdateActionTaskRecord = null;

  private String policyTermsUpdateActionRequest = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public BQPolicyTermsUpdateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(BQPolicyTermsUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Broker Agreement instance 
   * @return brokerAgreementInstanceReference
  **/

  public String getBrokerAgreementInstanceReference() {
    return brokerAgreementInstanceReference;
  }

  public void setBrokerAgreementInstanceReference(String brokerAgreementInstanceReference) {
    this.brokerAgreementInstanceReference = brokerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Policy Terms instance 
   * @return policyTermsInstanceReference
  **/

  public String getPolicyTermsInstanceReference() {
    return policyTermsInstanceReference;
  }

  public void setPolicyTermsInstanceReference(String policyTermsInstanceReference) {
    this.policyTermsInstanceReference = policyTermsInstanceReference;
  }


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsUpdateInputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return policyTermsUpdateActionTaskRecord
  **/

  public Object getPolicyTermsUpdateActionTaskRecord() {
    return policyTermsUpdateActionTaskRecord;
  }

  public void setPolicyTermsUpdateActionTaskRecord(Object policyTermsUpdateActionTaskRecord) {
    this.policyTermsUpdateActionTaskRecord = policyTermsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return policyTermsUpdateActionRequest
  **/

  public String getPolicyTermsUpdateActionRequest() {
    return policyTermsUpdateActionRequest;
  }

  public void setPolicyTermsUpdateActionRequest(String policyTermsUpdateActionRequest) {
    this.policyTermsUpdateActionRequest = policyTermsUpdateActionRequest;
  }


}

