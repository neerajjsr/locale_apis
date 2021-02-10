package com.cresen.locale.rest;

/**
 * @Author dolyt
 * @create 20-01-2021 14:26
 */
public enum ResponseTypeEnum {

    /**
     * Ok response type enum.
     */
    OK("OK"),

    /**
     * Error response type enum.
     */
    ERROR("ERROR");

    /**
     * The Response type.
     */
    public String responseType;

    ResponseTypeEnum(String responseType) {
        this.responseType = responseType;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    public String value() {
        return responseType;
    }

}
