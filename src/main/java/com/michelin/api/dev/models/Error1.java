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
 * This is a model class for Error1 type.
 */
public class Error1 {
    private String errorCode;
    private String errorText;

    /**
     * Default constructor.
     */
    public Error1() {
    }

    /**
     * Initialization constructor.
     * @param  errorCode  String value for errorCode.
     * @param  errorText  String value for errorText.
     */
    public Error1(
            String errorCode,
            String errorText) {
        this.errorCode = errorCode;
        this.errorText = errorText;
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
     * Getter for ErrorText.
     * @return Returns the String
     */
    @JsonGetter("ErrorText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorText() {
        return errorText;
    }

    /**
     * Setter for ErrorText.
     * @param errorText Value for String
     */
    @JsonSetter("ErrorText")
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    /**
     * Converts this Error1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Error1 [" + "errorCode=" + errorCode + ", errorText=" + errorText + "]";
    }

    /**
     * Builds a new {@link Error1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Error1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errorCode(getErrorCode())
                .errorText(getErrorText());
        return builder;
    }

    /**
     * Class to build instances of {@link Error1}.
     */
    public static class Builder {
        private String errorCode;
        private String errorText;



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
         * Setter for errorText.
         * @param  errorText  String value for errorText.
         * @return Builder
         */
        public Builder errorText(String errorText) {
            this.errorText = errorText;
            return this;
        }

        /**
         * Builds a new {@link Error1} object using the set fields.
         * @return {@link Error1}
         */
        public Error1 build() {
            return new Error1(errorCode, errorText);
        }
    }
}
