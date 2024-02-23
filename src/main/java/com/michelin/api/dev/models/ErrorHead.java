/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ErrorHead type.
 */
public class ErrorHead {
    private String errorCode;

    /**
     * Default constructor.
     */
    public ErrorHead() {
    }

    /**
     * Initialization constructor.
     * @param  errorCode  String value for errorCode.
     */
    public ErrorHead(
            String errorCode) {
        this.errorCode = errorCode;
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
     * Converts this ErrorHead into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorHead [" + "errorCode=" + errorCode + "]";
    }

    /**
     * Builds a new {@link ErrorHead.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorHead.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(errorCode);
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorHead}.
     */
    public static class Builder {
        private String errorCode;

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
         * Builds a new {@link ErrorHead} object using the set fields.
         * @return {@link ErrorHead}
         */
        public ErrorHead build() {
            return new ErrorHead(errorCode);
        }
    }
}
