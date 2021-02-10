package com.cresen.locale.rest;


/**
 * @Author dolyt
 * @create 20-01-2021 14:26
 */
public enum ResponseStatusEnum {

    /**
     * Ok response type enum.
     */
    OK(200),

    /**
     * Error response type enum.
     */
    ERROR(409);

    /**
     * The Response type.
     */
    public Integer responseType;

    ResponseStatusEnum(Integer responseType) {
        this.responseType = responseType;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    public Integer value() {
        return responseType;
    }

}
