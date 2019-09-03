package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementControlOutputModel
 */
public class CRBrokerAgreementControlOutputModel   {
  private String brokerAgreementControlActionTaskReference = null;

  private Object brokerAgreementControlActionTaskRecord = null;

  private String brokerAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broker Agreement instance control processing service call 
   * @return brokerAgreementControlActionTaskReference
  **/

  public String getBrokerAgreementControlActionTaskReference() {
    return brokerAgreementControlActionTaskReference;
  }

  public void setBrokerAgreementControlActionTaskReference(String brokerAgreementControlActionTaskReference) {
    this.brokerAgreementControlActionTaskReference = brokerAgreementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return brokerAgreementControlActionTaskRecord
  **/

  public Object getBrokerAgreementControlActionTaskRecord() {
    return brokerAgreementControlActionTaskRecord;
  }

  public void setBrokerAgreementControlActionTaskRecord(Object brokerAgreementControlActionTaskRecord) {
    this.brokerAgreementControlActionTaskRecord = brokerAgreementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return brokerAgreementControlActionResponse
  **/

  public String getBrokerAgreementControlActionResponse() {
    return brokerAgreementControlActionResponse;
  }

  public void setBrokerAgreementControlActionResponse(String brokerAgreementControlActionResponse) {
    this.brokerAgreementControlActionResponse = brokerAgreementControlActionResponse;
  }


}

