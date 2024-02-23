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
 * This is a model class for Error type.
 */
public class Error {
    private String errorCode;
    private String errorText;

    /**
     * Default constructor.
     */
    public Error() {
    }

    /**
     * Initialization constructor.
     * @param  errorCode  String value for errorCode.
     * @param  errorText  String value for errorText.
     */
    public Error(
            String errorCode,
            String errorText) {
        this.errorCode = errorCode;
        this.errorText = errorText;
    }

    /**
     * Getter for ErrorCode.
     * @return Returns the String
     */
    @JsonGetter("ErrorCode")
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
     * Converts this Error into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Error [" + "errorCode=" + errorCode + ", errorText=" + errorText + "]";
    }

    /**
     * Builds a new {@link Error.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Error.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(errorCode)
                .errorText(getErrorText());
        return builder;
    }

    /**
     * Class to build instances of {@link Error}.
     */
    public static class Builder {
        private String errorCode;
        private String errorText;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  errorCode  String value for errorCode.
         */
        public Builder(String errorCode) {
            this.errorCode = errorCode;
        }

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
         * Builds a new {@link Error} object using the set fields.
         * @return {@link Error}
         */
        public Error build() {
            return new Error(errorCode, errorText);
        }
    }
}
