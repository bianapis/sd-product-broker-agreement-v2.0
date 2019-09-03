package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord;
import org.bian.dto.CRBrokerAgreementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsRequestInputModel
 */
public class BQRegulatoryTermsRequestInputModel   {
  private String brokerAgreementInstanceReference = null;

  private String regulatoryTermsInstanceReference = null;

  private BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;

  private Object regulatoryTermsRequestActionTaskRecord = null;

  private CRBrokerAgreementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Broker Agreement instance 
   * @return brokerAgreementInstanceReference
  **/

  public String getBrokerAgreementInstanceReference() {
    return brokerAgreementInstanceReference;
  }

  public void setBrokerAgreementInstanceReference(String brokerAgreementInstanceReference) {
    this.brokerAgreementInstanceReference = brokerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Regulatory Terms instance 
   * @return regulatoryTermsInstanceReference
  **/

  public String getRegulatoryTermsInstanceReference() {
    return regulatoryTermsInstanceReference;
  }

  public void setRegulatoryTermsInstanceReference(String regulatoryTermsInstanceReference) {
    this.regulatoryTermsInstanceReference = regulatoryTermsInstanceReference;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsRequestInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return regulatoryTermsRequestActionTaskRecord
  **/

  public Object getRegulatoryTermsRequestActionTaskRecord() {
    return regulatoryTermsRequestActionTaskRecord;
  }

  public void setRegulatoryTermsRequestActionTaskRecord(Object regulatoryTermsRequestActionTaskRecord) {
    this.regulatoryTermsRequestActionTaskRecord = regulatoryTermsRequestActionTaskRecord;
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

