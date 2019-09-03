package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLegalTermsEvaluateOutputModelLegalTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLegalTermsEvaluateOutputModel
 */
public class BQLegalTermsEvaluateOutputModel   {
  private String legalTermsInstanceReference = null;

  private String legalTermsInitiateActionReference = null;

  private Object legalTermsInitiateActionRecord = null;

  private String legalTermsInstanceStatus = null;

  private BQLegalTermsEvaluateOutputModelLegalTermsInstanceRecord legalTermsInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Legal Terms instance 
   * @return legalTermsInstanceReference
  **/

  public String getLegalTermsInstanceReference() {
    return legalTermsInstanceReference;
  }

  public void setLegalTermsInstanceReference(String legalTermsInstanceReference) {
    this.legalTermsInstanceReference = legalTermsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return legalTermsInitiateActionReference
  **/

  public String getLegalTermsInitiateActionReference() {
    return legalTermsInitiateActionReference;
  }

  public void setLegalTermsInitiateActionReference(String legalTermsInitiateActionReference) {
    this.legalTermsInitiateActionReference = legalTermsInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Legal Terms instance (e.g. initialised, pending, active) 
   * @return legalTermsInstanceStatus
  **/

  public String getLegalTermsInstanceStatus() {
    return legalTermsInstanceStatus;
  }

  public void setLegalTermsInstanceStatus(String legalTermsInstanceStatus) {
    this.legalTermsInstanceStatus = legalTermsInstanceStatus;
  }


  /**
   * Get legalTermsInstanceRecord
   * @return legalTermsInstanceRecord
  **/

  public BQLegalTermsEvaluateOutputModelLegalTermsInstanceRecord getLegalTermsInstanceRecord() {
    return legalTermsInstanceRecord;
  }

  public void setLegalTermsInstanceRecord(BQLegalTermsEvaluateOutputModelLegalTermsInstanceRecord legalTermsInstanceRecord) {
    this.legalTermsInstanceRecord = legalTermsInstanceRecord;
  }


}

