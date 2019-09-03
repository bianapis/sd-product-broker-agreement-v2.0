package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRegulatoryTermsUpdateInputModelBrokerAgreementInstanceRecord
 */
public class BQRegulatoryTermsUpdateInputModelBrokerAgreementInstanceRecord   {
  private String partyReference = null;

  private String agreementType = null;

  private String agreementJurisdiction = null;

  private String agreementValidFromToDate = null;

  private String agreementSignaturesResponsibleParties = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the broker organization 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of agreement (e.g. service provider, product alliance) 
   * @return agreementType
  **/

  public String getAgreementType() {
    return agreementType;
  }

  public void setAgreementType(String agreementType) {
    this.agreementType = agreementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The contractual jurisdiction or coverage of the agreement (e.g. governed by State) 
   * @return agreementJurisdiction
  **/

  public String getAgreementJurisdiction() {
    return agreementJurisdiction;
  }

  public void setAgreementJurisdiction(String agreementJurisdiction) {
    this.agreementJurisdiction = agreementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The term of the agreement 
   * @return agreementValidFromToDate
  **/

  public String getAgreementValidFromToDate() {
    return agreementValidFromToDate;
  }

  public void setAgreementValidFromToDate(String agreementValidFromToDate) {
    this.agreementValidFromToDate = agreementValidFromToDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to signatories 
   * @return agreementSignaturesResponsibleParties
  **/

  public String getAgreementSignaturesResponsibleParties() {
    return agreementSignaturesResponsibleParties;
  }

  public void setAgreementSignaturesResponsibleParties(String agreementSignaturesResponsibleParties) {
    this.agreementSignaturesResponsibleParties = agreementSignaturesResponsibleParties;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

