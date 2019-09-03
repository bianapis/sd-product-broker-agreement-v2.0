package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementEvaluateInputModelBrokerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementEvaluateInputModel
 */
public class CRBrokerAgreementEvaluateInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private Object brokerAgreementEvaluateActionRecord = null;

  private String brokerAgreementInstanceStatus = null;

  private CRBrokerAgreementEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productBrokerAgreementServicingSessionReference
  **/

  public String getProductBrokerAgreementServicingSessionReference() {
    return productBrokerAgreementServicingSessionReference;
  }

  public void setProductBrokerAgreementServicingSessionReference(String productBrokerAgreementServicingSessionReference) {
    this.productBrokerAgreementServicingSessionReference = productBrokerAgreementServicingSessionReference;
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

  public CRBrokerAgreementEvaluateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


}

