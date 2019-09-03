package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementGrantInputModel
 */
public class CRBrokerAgreementGrantInputModel   {
  private String productBrokerAgreementServicingSessionReference = null;

  private String brokerAgreementInstanceReference = null;

  private Object brokerAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRBrokerAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return brokerAgreementGrantActionTaskRecord
  **/

  public Object getBrokerAgreementGrantActionTaskRecord() {
    return brokerAgreementGrantActionTaskRecord;
  }

  public void setBrokerAgreementGrantActionTaskRecord(Object brokerAgreementGrantActionTaskRecord) {
    this.brokerAgreementGrantActionTaskRecord = brokerAgreementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRBrokerAgreementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRBrokerAgreementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

