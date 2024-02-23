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
 * This is a model class for GeneralError type.
 */
public class GeneralError {
    private Integer code;
    private String message;

    /**
     * Default constructor.
     */
    public GeneralError() {
    }

    /**
     * Initialization constructor.
     * @param  code  Integer value for code.
     * @param  message  String value for message.
     */
    public GeneralError(
            Integer code,
            String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Getter for Code.
     * @return Returns the Integer
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for Integer
     */
    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this GeneralError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneralError [" + "code=" + code + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link GeneralError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneralError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link GeneralError}.
     */
    public static class Builder {
        private Integer code;
        private String message;



        /**
         * Setter for code.
         * @param  code  Integer value for code.
         * @return Builder
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link GeneralError} object using the set fields.
         * @return {@link GeneralError}
         */
        public GeneralError build() {
            return new GeneralError(code, message);
        }
    }
}
