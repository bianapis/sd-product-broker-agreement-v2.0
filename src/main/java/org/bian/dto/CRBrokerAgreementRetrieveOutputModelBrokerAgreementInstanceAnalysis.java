package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis
 */
public class CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis   {
  private String brokerAgreementInstanceAnalysisData = null;

  private String brokerAgreementInstanceAnalysisReportType = null;

  private Object brokerAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return brokerAgreementInstanceAnalysisData
  **/

  public String getBrokerAgreementInstanceAnalysisData() {
    return brokerAgreementInstanceAnalysisData;
  }

  public void setBrokerAgreementInstanceAnalysisData(String brokerAgreementInstanceAnalysisData) {
    this.brokerAgreementInstanceAnalysisData = brokerAgreementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return brokerAgreementInstanceAnalysisReport
  **/

  public Object getBrokerAgreementInstanceAnalysisReport() {
    return brokerAgreementInstanceAnalysisReport;
  }

  public void setBrokerAgreementInstanceAnalysisReport(Object brokerAgreementInstanceAnalysisReport) {
    this.brokerAgreementInstanceAnalysisReport = brokerAgreementInstanceAnalysisReport;
  }


}

