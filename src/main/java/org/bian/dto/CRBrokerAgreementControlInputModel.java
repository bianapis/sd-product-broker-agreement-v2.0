package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementControlInputModelBrokerAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementControlInputModel
 */
public class CRBrokerAgreementControlInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private String brokerAgreementInstanceReference = null;

  private Object brokerAgreementControlActionTaskRecord = null;

  private CRBrokerAgreementControlInputModelBrokerAgreementControlActionRequest brokerAgreementControlActionRequest = null;


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
   * Get brokerAgreementControlActionRequest
   * @return brokerAgreementControlActionRequest
  **/

  public CRBrokerAgreementControlInputModelBrokerAgreementControlActionRequest getBrokerAgreementControlActionRequest() {
    return brokerAgreementControlActionRequest;
  }

  public void setBrokerAgreementControlActionRequest(CRBrokerAgreementControlInputModelBrokerAgreementControlActionRequest brokerAgreementControlActionRequest) {
    this.brokerAgreementControlActionRequest = brokerAgreementControlActionRequest;
  }


}

