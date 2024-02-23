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
 * This is a model class for ErrorHead3 type.
 */
public class ErrorHead3 {
    private String errorCode;

    /**
     * Default constructor.
     */
    public ErrorHead3() {
    }

    /**
     * Initialization constructor.
     * @param  errorCode  String value for errorCode.
     */
    public ErrorHead3(
            String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorCode.
     * @return Returns the String
     */
    @JsonGetter("ErrorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for ErrorCode.
     * @param errorCode Value for String
     */
    @JsonSetter("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Converts this ErrorHead3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorHead3 [" + "errorCode=" + errorCode + "]";
    }

    /**
     * Builds a new {@link ErrorHead3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorHead3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errorCode(getErrorCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorHead3}.
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
         * Builds a new {@link ErrorHead3} object using the set fields.
         * @return {@link ErrorHead3}
         */
        public ErrorHead3 build() {
            return new ErrorHead3(errorCode);
        }
    }
}
