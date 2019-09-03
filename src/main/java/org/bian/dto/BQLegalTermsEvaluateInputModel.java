package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsEvaluateInputModelBrokerAgreementInstanceRecord;
import org.bian.dto.BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsEvaluateInputModel
 */
public class BQLegalTermsEvaluateInputModel   {
  private BQLegalTermsEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementInstanceReference = null;

  private Object legalTermsInitiateActionRecord = null;

  private BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(BQLegalTermsEvaluateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
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
   * @return legalTermsInitiateActionRecord
  **/

  public Object getLegalTermsInitiateActionRecord() {
    return legalTermsInitiateActionRecord;
  }

  public void setLegalTermsInitiateActionRecord(Object legalTermsInitiateActionRecord) {
    this.legalTermsInitiateActionRecord = legalTermsInitiateActionRecord;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsEvaluateInputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


}

