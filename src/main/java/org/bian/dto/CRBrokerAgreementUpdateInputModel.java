package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementUpdateInputModel
 */
public class CRBrokerAgreementUpdateInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private String brokerAgreementInstanceReference = null;

  private CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private Object brokerAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return brokerAgreementUpdateActionTaskRecord
  **/

  public Object getBrokerAgreementUpdateActionTaskRecord() {
    return brokerAgreementUpdateActionTaskRecord;
  }

  public void setBrokerAgreementUpdateActionTaskRecord(Object brokerAgreementUpdateActionTaskRecord) {
    this.brokerAgreementUpdateActionTaskRecord = brokerAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

