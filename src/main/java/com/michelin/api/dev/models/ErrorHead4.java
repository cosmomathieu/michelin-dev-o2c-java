/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ErrorHead4 type.
 */
public class ErrorHead4 {
    private String errorCode;

    /**
     * Default constructor.
     */
    public ErrorHead4() {
    }

    /**
     * Initialization constructor.
     * @param  errorCode  String value for errorCode.
     */
    public ErrorHead4(
            String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorCode.
     * @return Returns the String
     */
    @JsonGetter("errorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for ErrorCode.
     * @param errorCode Value for String
     */
    @JsonSetter("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Converts this ErrorHead4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorHead4 [" + "errorCode=" + errorCode + "]";
    }

    /**
     * Builds a new {@link ErrorHead4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorHead4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errorCode(getErrorCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorHead4}.
     */
    public static class Builder {
        private String errorCode;



        /**
         * Setter for errorCode.
         * @param  errorCode  String value for errorCode.
         * @return Builder
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Builds a new {@link ErrorHead4} object using the set fields.
         * @return {@link ErrorHead4}
         */
        public ErrorHead4 build() {
            return new ErrorHead4(errorCode);
        }
    }
}
