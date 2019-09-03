package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsEvaluateInputModelBrokerAgreementInstanceRecord;
import org.bian.dto.BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsEvaluateInputModel
 */
public class BQRegulatoryTermsEvaluateInputModel   {
  private BQRegulatoryTermsEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementInstanceReference = null;

  private Object regulatoryTermsInitiateActionRecord = null;

  private BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public BQRegulatoryTermsEvaluateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(BQRegulatoryTermsEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return regulatoryTermsInitiateActionRecord
  **/

  public Object getRegulatoryTermsInitiateActionRecord() {
    return regulatoryTermsInitiateActionRecord;
  }

  public void setRegulatoryTermsInitiateActionRecord(Object regulatoryTermsInitiateActionRecord) {
    this.regulatoryTermsInitiateActionRecord = regulatoryTermsInitiateActionRecord;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsEvaluateInputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


}

