package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord
 */
public class CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord   {
  private String brokerAgreementInstanceReportData = null;

  private String brokerAgreementInstanceReportType = null;

  private Object brokerAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return brokerAgreementInstanceReportData
  **/

  public String getBrokerAgreementInstanceReportData() {
    return brokerAgreementInstanceReportData;
  }

  public void setBrokerAgreementInstanceReportData(String brokerAgreementInstanceReportData) {
    this.brokerAgreementInstanceReportData = brokerAgreementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return brokerAgreementInstanceReport
  **/

  public Object getBrokerAgreementInstanceReport() {
    return brokerAgreementInstanceReport;
  }

  public void setBrokerAgreementInstanceReport(Object brokerAgreementInstanceReport) {
    this.brokerAgreementInstanceReport = brokerAgreementInstanceReport;
  }


}

