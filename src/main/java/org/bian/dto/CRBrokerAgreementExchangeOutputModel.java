package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementExchangeOutputModel
 */
public class CRBrokerAgreementExchangeOutputModel   {
  private String brokerAgreementExchangeActionTaskReference = null;

  private Object brokerAgreementExchangeActionTaskRecord = null;

  private String brokerAgreementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broker Agreement instance exchange service call 
   * @return brokerAgreementExchangeActionTaskReference
  **/

  public String getBrokerAgreementExchangeActionTaskReference() {
    return brokerAgreementExchangeActionTaskReference;
  }

  public void setBrokerAgreementExchangeActionTaskReference(String brokerAgreementExchangeActionTaskReference) {
    this.brokerAgreementExchangeActionTaskReference = brokerAgreementExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return brokerAgreementExchangeActionResponse
  **/

  public String getBrokerAgreementExchangeActionResponse() {
    return brokerAgreementExchangeActionResponse;
  }

  public void setBrokerAgreementExchangeActionResponse(String brokerAgreementExchangeActionResponse) {
    this.brokerAgreementExchangeActionResponse = brokerAgreementExchangeActionResponse;
  }


}

