package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord
 */
public class BQLegalTermsRetrieveOutputModelLegalTermsInstanceRecord   {
  private String jurisdiction = null;

  private String applicableLawReference = null;

  private String applicableLawInterpretation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The legal jurisdiction 
   * @return jurisdiction
  **/

  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any legal requirements 
   * @return applicableLawReference
  **/

  public String getApplicableLawReference() {
    return applicableLawReference;
  }

  public void setApplicableLawReference(String applicableLawReference) {
    this.applicableLawReference = applicableLawReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Explanation or interpretation of the law as applied 
   * @return applicableLawInterpretation
  **/

  public String getApplicableLawInterpretation() {
    return applicableLawInterpretation;
  }

  public void setApplicableLawInterpretation(String applicableLawInterpretation) {
    this.applicableLawInterpretation = applicableLawInterpretation;
  }


}

