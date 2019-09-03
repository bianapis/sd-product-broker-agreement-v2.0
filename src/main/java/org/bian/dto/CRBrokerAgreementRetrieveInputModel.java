package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis;
import org.bian.dto.CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveInputModel
 */
public class CRBrokerAgreementRetrieveInputModel   {
  private Object brokerAgreementRetrieveActionTaskRecord = null;

  private String brokerAgreementRetrieveActionRequest = null;

  private CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord brokerAgreementInstanceReportRecord = null;

  private CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis brokerAgreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return brokerAgreementRetrieveActionTaskRecord
  **/

  public Object getBrokerAgreementRetrieveActionTaskRecord() {
    return brokerAgreementRetrieveActionTaskRecord;
  }

  public void setBrokerAgreementRetrieveActionTaskRecord(Object brokerAgreementRetrieveActionTaskRecord) {
    this.brokerAgreementRetrieveActionTaskRecord = brokerAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return brokerAgreementRetrieveActionRequest
  **/

  public String getBrokerAgreementRetrieveActionRequest() {
    return brokerAgreementRetrieveActionRequest;
  }

  public void setBrokerAgreementRetrieveActionRequest(String brokerAgreementRetrieveActionRequest) {
    this.brokerAgreementRetrieveActionRequest = brokerAgreementRetrieveActionRequest;
  }


  /**
   * Get brokerAgreementInstanceReportRecord
   * @return brokerAgreementInstanceReportRecord
  **/

  public CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord getBrokerAgreementInstanceReportRecord() {
    return brokerAgreementInstanceReportRecord;
  }

  public void setBrokerAgreementInstanceReportRecord(CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceReportRecord brokerAgreementInstanceReportRecord) {
    this.brokerAgreementInstanceReportRecord = brokerAgreementInstanceReportRecord;
  }


  /**
   * Get brokerAgreementInstanceAnalysis
   * @return brokerAgreementInstanceAnalysis
  **/

  public CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis getBrokerAgreementInstanceAnalysis() {
    return brokerAgreementInstanceAnalysis;
  }

  public void setBrokerAgreementInstanceAnalysis(CRBrokerAgreementRetrieveInputModelBrokerAgreementInstanceAnalysis brokerAgreementInstanceAnalysis) {
    this.brokerAgreementInstanceAnalysis = brokerAgreementInstanceAnalysis;
  }


}

