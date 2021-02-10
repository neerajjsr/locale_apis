package com.cresen.locale.rest;

import com.cresen.locale.rest.exception.ServiceErrorInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;


/**
 * @Author dolyt
 * @create 20-01-2021 14:26
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class Metadata {

    private String serviceReferenceId;
    private Integer status;
    private String type;
    private String message;
    private Integer code;
    private ServiceErrorInfo serviceErrorInfo;


    public void setServiceReferenceId(String serviceReferenceId) {
        if (serviceReferenceId != null) {
            this.serviceReferenceId = serviceReferenceId;
        } else {
            this.serviceReferenceId = UUID.randomUUID().toString();
        }
    }

    public String getServiceReferenceId() {

        if (this.serviceReferenceId != null) {
            return serviceReferenceId;
        } else {
            return UUID.randomUUID().toString();
        }
    }


    /**
     * Sets success outcome.
     */
    public void setSuccessOutcome() {
        this.serviceReferenceId = getServiceReferenceId();
        this.status = ResponseStatusEnum.OK.value();
        this.type = ResponseTypeEnum.OK.value();
        this.message = RestServiceConstants.REST_SERVICE_SUCCESS_MSG;
        this.code = RestServiceConstants.REST_SERVICE_SUCCESS_CODE;
    }


//    public void setErrorOutcome(ServiceException dataEZServiceException) {
//        this.serviceReferenceId = getServiceReferenceId();
//        this.status = HttpStatus.CONFLICT.value();
//        this.type = ResponseTypeEnum.ERROR.value();
//        this.dataEZServiceErrorInfo = dataEZServiceException.getDataEZServiceErrorInfo();
//        this.code = RestServiceConstants.REST_SERVICE_ERROR_CODE;
//    }

    @Override
    public String toString() {
        return "Metadata{" +
                "serviceReferenceId='" + serviceReferenceId + '\'' +
                ", status=" + status +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                ", code=" + code +
                ", serviceErrorInfo=" + serviceErrorInfo +
                '}';
    }
}
