package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis
 */
public class CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis   {
  private String brokerAgreementInstanceAnalysisReference = null;

  private String brokerAgreementInstanceAnalysisReportType = null;

  private String brokerAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return brokerAgreementInstanceAnalysisReference
  **/

  public String getBrokerAgreementInstanceAnalysisReference() {
    return brokerAgreementInstanceAnalysisReference;
  }

  public void setBrokerAgreementInstanceAnalysisReference(String brokerAgreementInstanceAnalysisReference) {
    this.brokerAgreementInstanceAnalysisReference = brokerAgreementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return brokerAgreementInstanceAnalysisReportType
  **/

  public String getBrokerAgreementInstanceAnalysisReportType() {
    return brokerAgreementInstanceAnalysisReportType;
  }

  public void setBrokerAgreementInstanceAnalysisReportType(String brokerAgreementInstanceAnalysisReportType) {
    this.brokerAgreementInstanceAnalysisReportType = brokerAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return brokerAgreementInstanceAnalysisParameters
  **/

  public String getBrokerAgreementInstanceAnalysisParameters() {
    return brokerAgreementInstanceAnalysisParameters;
  }

  public void setBrokerAgreementInstanceAnalysisParameters(String brokerAgreementInstanceAnalysisParameters) {
    this.brokerAgreementInstanceAnalysisParameters = brokerAgreementInstanceAnalysisParameters;
  }


}

