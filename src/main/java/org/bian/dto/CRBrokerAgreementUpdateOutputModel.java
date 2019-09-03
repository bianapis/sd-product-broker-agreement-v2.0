package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBrokerAgreementUpdateOutputModel
 */
public class CRBrokerAgreementUpdateOutputModel   {
  private CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord = null;

  private String brokerAgreementUpdateActionTaskReference = null;

  private Object brokerAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get brokerAgreementInstanceRecord
   * @return brokerAgreementInstanceRecord
  **/

  public CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord getBrokerAgreementInstanceRecord() {
    return brokerAgreementInstanceRecord;
  }

  public void setBrokerAgreementInstanceRecord(CRBrokerAgreementUpdateInputModelBrokerAgreementInstanceRecord brokerAgreementInstanceRecord) {
    this.brokerAgreementInstanceRecord = brokerAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return brokerAgreementUpdateActionTaskReference
  **/

  public String getBrokerAgreementUpdateActionTaskReference() {
    return brokerAgreementUpdateActionTaskReference;
  }

  public void setBrokerAgreementUpdateActionTaskReference(String brokerAgreementUpdateActionTaskReference) {
    this.brokerAgreementUpdateActionTaskReference = brokerAgreementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return brokerAgreementUpdateActionTaskRecord
  **/

  public Object getBrokerAgreementUpdateActionTaskRecord() {
    return brokerAgreementUpdateActionTaskRecord;
  }

  public void setBrokerAgreementUpdateActionTaskRecord(Object brokerAgreementUpdateActionTaskRecord) {
    this.brokerAgreementUpdateActionTaskRecord = brokerAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

