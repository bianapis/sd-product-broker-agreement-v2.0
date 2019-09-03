package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord
 */
public class CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord   {
  private String brokerAgreementInstanceReportReference = null;

  private String brokerAgreementInstanceReportType = null;

  private String brokerAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return brokerAgreementInstanceReportReference
  **/

  public String getBrokerAgreementInstanceReportReference() {
    return brokerAgreementInstanceReportReference;
  }

  public void setBrokerAgreementInstanceReportReference(String brokerAgreementInstanceReportReference) {
    this.brokerAgreementInstanceReportReference = brokerAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return brokerAgreementInstanceReportType
  **/

  public String getBrokerAgreementInstanceReportType() {
    return brokerAgreementInstanceReportType;
  }

  public void setBrokerAgreementInstanceReportType(String brokerAgreementInstanceReportType) {
    this.brokerAgreementInstanceReportType = brokerAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return brokerAgreementInstanceReportParameters
  **/

  public String getBrokerAgreementInstanceReportParameters() {
    return brokerAgreementInstanceReportParameters;
  }

  public void setBrokerAgreementInstanceReportParameters(String brokerAgreementInstanceReportParameters) {
    this.brokerAgreementInstanceReportParameters = brokerAgreementInstanceReportParameters;
  }


}

