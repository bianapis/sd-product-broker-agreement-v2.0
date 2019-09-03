package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPolicyTermsEvaluateOutputModel
 */
public class BQPolicyTermsEvaluateOutputModel   {
  private String policyTermsInstanceReference = null;

  private String policyTermsInitiateActionReference = null;

  private Object policyTermsInitiateActionRecord = null;

  private String policyTermsInstanceStatus = null;

  private BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return policyTermsInitiateActionReference
  **/

  public String getPolicyTermsInitiateActionReference() {
    return policyTermsInitiateActionReference;
  }

  public void setPolicyTermsInitiateActionReference(String policyTermsInitiateActionReference) {
    this.policyTermsInitiateActionReference = policyTermsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return policyTermsInitiateActionRecord
  **/

  public Object getPolicyTermsInitiateActionRecord() {
    return policyTermsInitiateActionRecord;
  }

  public void setPolicyTermsInitiateActionRecord(Object policyTermsInitiateActionRecord) {
    this.policyTermsInitiateActionRecord = policyTermsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Policy Terms instance (e.g. initialised, pending, active) 
   * @return policyTermsInstanceStatus
  **/

  public String getPolicyTermsInstanceStatus() {
    return policyTermsInstanceStatus;
  }

  public void setPolicyTermsInstanceStatus(String policyTermsInstanceStatus) {
    this.policyTermsInstanceStatus = policyTermsInstanceStatus;
  }


  /**
   * Get policyTermsInstanceRecord
   * @return policyTermsInstanceRecord
  **/

  public BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord getPolicyTermsInstanceRecord() {
    return policyTermsInstanceRecord;
  }

  public void setPolicyTermsInstanceRecord(BQPolicyTermsEvaluateOutputModelPolicyTermsInstanceRecord policyTermsInstanceRecord) {
    this.policyTermsInstanceRecord = policyTermsInstanceRecord;
  }


}

