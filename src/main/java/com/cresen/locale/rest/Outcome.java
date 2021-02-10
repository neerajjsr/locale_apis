package com.cresen.locale.rest;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @Author dolyt
 * @create 20-01-2021 14:26
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Outcome {

    /**
     * Instantiates a new Outcome.
     */
    public Outcome() {
        super();
    }

    private Integer status;

    private String type;

    private String message;

    private Integer code;

    //private List<AdditionalDetail> additionalDetailList;

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Sets success outcome.
     */
    public void setSuccessOutcome() {
        this.status = ResponseStatusEnum.OK.value();
        this.type = ResponseTypeEnum.OK.value();
        this.message = RestServiceConstants.REST_SERVICE_SUCCESS_MSG;
        this.code = RestServiceConstants.REST_SERVICE_SUCCESS_CODE;
    }

    /**
     * Sets error outcome.
     *
     * @param e the e
     */
    public void setErrorOutcome(Exception e) {
        this.status = ResponseStatusEnum.ERROR.value();
        this.type = ResponseTypeEnum.ERROR.value();
        this.message = e.getMessage();
        this.code = RestServiceConstants.REST_SERVICE_ERROR_CODE;
    }
}
