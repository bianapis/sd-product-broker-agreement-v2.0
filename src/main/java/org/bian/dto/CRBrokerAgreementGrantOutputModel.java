package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementGrantOutputModel
 */
public class CRBrokerAgreementGrantOutputModel   {
  private String brokerAgreementGrantActionTaskReference = null;

  private Object brokerAgreementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRBrokerAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broker Agreement instance grant service call 
   * @return brokerAgreementGrantActionTaskReference
  **/

  public String getBrokerAgreementGrantActionTaskReference() {
    return brokerAgreementGrantActionTaskReference;
  }

  public void setBrokerAgreementGrantActionTaskReference(String brokerAgreementGrantActionTaskReference) {
    this.brokerAgreementGrantActionTaskReference = brokerAgreementGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRBrokerAgreementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRBrokerAgreementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

