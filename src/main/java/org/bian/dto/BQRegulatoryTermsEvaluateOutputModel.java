package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsEvaluateOutputModel
 */
public class BQRegulatoryTermsEvaluateOutputModel   {
  private String regulatoryTermsInstanceReference = null;

  private String regulatoryTermsInitiateActionReference = null;

  private Object regulatoryTermsInitiateActionRecord = null;

  private String regulatoryTermsInstanceStatus = null;

  private BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return regulatoryTermsInitiateActionReference
  **/

  public String getRegulatoryTermsInitiateActionReference() {
    return regulatoryTermsInitiateActionReference;
  }

  public void setRegulatoryTermsInitiateActionReference(String regulatoryTermsInitiateActionReference) {
    this.regulatoryTermsInitiateActionReference = regulatoryTermsInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Regulatory Terms instance (e.g. initialised, pending, active) 
   * @return regulatoryTermsInstanceStatus
  **/

  public String getRegulatoryTermsInstanceStatus() {
    return regulatoryTermsInstanceStatus;
  }

  public void setRegulatoryTermsInstanceStatus(String regulatoryTermsInstanceStatus) {
    this.regulatoryTermsInstanceStatus = regulatoryTermsInstanceStatus;
  }


  /**
   * Get regulatoryTermsInstanceRecord
   * @return regulatoryTermsInstanceRecord
  **/

  public BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord getRegulatoryTermsInstanceRecord() {
    return regulatoryTermsInstanceRecord;
  }

  public void setRegulatoryTermsInstanceRecord(BQRegulatoryTermsEvaluateOutputModelRegulatoryTermsInstanceRecord regulatoryTermsInstanceRecord) {
    this.regulatoryTermsInstanceRecord = regulatoryTermsInstanceRecord;
  }


}

