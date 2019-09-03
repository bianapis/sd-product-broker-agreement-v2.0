package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementRequestOutputModel
 */
public class CRBrokerAgreementRequestOutputModel   {
  private CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementRequestActionTaskReference = null;

  private Object brokerAgreementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementRequestInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Broker Agreement instance request service call 
   * @return brokerAgreementRequestActionTaskReference
  **/

  public String getBrokerAgreementRequestActionTaskReference() {
    return brokerAgreementRequestActionTaskReference;
  }

  public void setBrokerAgreementRequestActionTaskReference(String brokerAgreementRequestActionTaskReference) {
    this.brokerAgreementRequestActionTaskReference = brokerAgreementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return brokerAgreementRequestActionTaskRecord
  **/

  public Object getBrokerAgreementRequestActionTaskRecord() {
    return brokerAgreementRequestActionTaskRecord;
  }

  public void setBrokerAgreementRequestActionTaskRecord(Object brokerAgreementRequestActionTaskRecord) {
    this.brokerAgreementRequestActionTaskRecord = brokerAgreementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

