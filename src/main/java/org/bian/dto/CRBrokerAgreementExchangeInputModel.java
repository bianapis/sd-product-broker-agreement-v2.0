package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementExchangeInputModelBrokerAgreementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementExchangeInputModel
 */
public class CRBrokerAgreementExchangeInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private String brokerAgreementInstanceReference = null;

  private Object brokerAgreementExchangeActionTaskRecord = null;

  private CRBrokerAgreementExchangeInputModelBrokerAgreementExchangeActionRequest brokerAgreementExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return brokerAgreementExchangeActionTaskRecord
  **/

  public Object getBrokerAgreementExchangeActionTaskRecord() {
    return brokerAgreementExchangeActionTaskRecord;
  }

  public void setBrokerAgreementExchangeActionTaskRecord(Object brokerAgreementExchangeActionTaskRecord) {
    this.brokerAgreementExchangeActionTaskRecord = brokerAgreementExchangeActionTaskRecord;
  }


  /**
   * Get brokerAgreementExchangeActionRequest
   * @return brokerAgreementExchangeActionRequest
  **/

  public CRBrokerAgreementExchangeInputModelBrokerAgreementExchangeActionRequest getBrokerAgreementExchangeActionRequest() {
    return brokerAgreementExchangeActionRequest;
  }

  public void setBrokerAgreementExchangeActionRequest(CRBrokerAgreementExchangeInputModelBrokerAgreementExchangeActionRequest brokerAgreementExchangeActionRequest) {
    this.brokerAgreementExchangeActionRequest = brokerAgreementExchangeActionRequest;
  }


}

