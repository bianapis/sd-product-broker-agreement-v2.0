package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis;
import org.bian.dto.CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceRecord;
import org.bian.dto.CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRetrieveOutputModel
 */
public class CRBrokerAgreementRetrieveOutputModel   {
  private CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementRetrieveActionTaskReference = null;

  private Object brokerAgreementRetrieveActionTaskRecord = null;

  private String brokerAgreementRetrieveActionResponse = null;

  private CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord brokerAgreementInstanceReportRecord = null;

  private CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis brokerAgreementInstanceAnalysis = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broker Agreement instance retrieve service call 
   * @return brokerAgreementRetrieveActionTaskReference
  **/

  public String getBrokerAgreementRetrieveActionTaskReference() {
    return brokerAgreementRetrieveActionTaskReference;
  }

  public void setBrokerAgreementRetrieveActionTaskReference(String brokerAgreementRetrieveActionTaskReference) {
    this.brokerAgreementRetrieveActionTaskReference = brokerAgreementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return brokerAgreementRetrieveActionResponse
  **/

  public String getBrokerAgreementRetrieveActionResponse() {
    return brokerAgreementRetrieveActionResponse;
  }

  public void setBrokerAgreementRetrieveActionResponse(String brokerAgreementRetrieveActionResponse) {
    this.brokerAgreementRetrieveActionResponse = brokerAgreementRetrieveActionResponse;
  }


  /**
   * Get brokerAgreementInstanceReportRecord
   * @return brokerAgreementInstanceReportRecord
  **/

  public CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord getBrokerAgreementInstanceReportRecord() {
    return brokerAgreementInstanceReportRecord;
  }

  public void setBrokerAgreementInstanceReportRecord(CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceReportRecord brokerAgreementInstanceReportRecord) {
    this.brokerAgreementInstanceReportRecord = brokerAgreementInstanceReportRecord;
  }


  /**
   * Get brokerAgreementInstanceAnalysis
   * @return brokerAgreementInstanceAnalysis
  **/

  public CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis getBrokerAgreementInstanceAnalysis() {
    return brokerAgreementInstanceAnalysis;
  }

  public void setBrokerAgreementInstanceAnalysis(CRBrokerAgreementRetrieveOutputModelBrokerAgreementInstanceAnalysis brokerAgreementInstanceAnalysis) {
    this.brokerAgreementInstanceAnalysis = brokerAgreementInstanceAnalysis;
  }


}

