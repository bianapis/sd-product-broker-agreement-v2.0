package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord;
import org.bian.dto.CRBrokerAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRequestInputModel
 */
public class CRBrokerAgreementRequestInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private String brokerAgreementInstanceReference = null;

  private CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private Object brokerAgreementRequestActionTaskRecord = null;

  private CRBrokerAgreementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return brokerAgreementRequestActionTaskRecord
  **/

  public Object getBrokerAgreementRequestActionTaskRecord() {
    return brokerAgreementRequestActionTaskRecord;
  }

  public void setBrokerAgreementRequestActionTaskRecord(Object brokerAgreementRequestActionTaskRecord) {
    this.brokerAgreementRequestActionTaskRecord = brokerAgreementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBrokerAgreementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBrokerAgreementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

