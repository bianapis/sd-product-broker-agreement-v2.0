package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementEvaluateOutputModelBrokerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementEvaluateOutputModel
 */
public class CRBrokerAgreementEvaluateOutputModel   {
  private String brokerAgreementInstanceReference = null;

  private String brokerAgreementEvaluateActionReference = null;

  private Object brokerAgreementEvaluateActionRecord = null;

  private String brokerAgreementInstanceStatus = null;

  private CRBrokerAgreementEvaluateOutputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Broker Agreement instance 
   * @return brokerAgreementInstanceReference
  **/

  public String getBrokerAgreementInstanceReference() {
    return brokerAgreementInstanceReference;
  }

  public void setBrokerAgreementInstanceReference(String brokerAgreementInstanceReference) {
    this.brokerAgreementInstanceReference = brokerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return brokerAgreementEvaluateActionReference
  **/

  public String getBrokerAgreementEvaluateActionReference() {
    return brokerAgreementEvaluateActionReference;
  }

  public void setBrokerAgreementEvaluateActionReference(String brokerAgreementEvaluateActionReference) {
    this.brokerAgreementEvaluateActionReference = brokerAgreementEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return brokerAgreementEvaluateActionRecord
  **/

  public Object getBrokerAgreementEvaluateActionRecord() {
    return brokerAgreementEvaluateActionRecord;
  }

  public void setBrokerAgreementEvaluateActionRecord(Object brokerAgreementEvaluateActionRecord) {
    this.brokerAgreementEvaluateActionRecord = brokerAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Broker Agreement instance (e.g. initialised, pending, active) 
   * @return brokerAgreementInstanceStatus
  **/

  public String getBrokerAgreementInstanceStatus() {
    return brokerAgreementInstanceStatus;
  }

  public void setBrokerAgreementInstanceStatus(String brokerAgreementInstanceStatus) {
    this.brokerAgreementInstanceStatus = brokerAgreementInstanceStatus;
  }


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public CRBrokerAgreementEvaluateOutputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementEvaluateOutputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


}

