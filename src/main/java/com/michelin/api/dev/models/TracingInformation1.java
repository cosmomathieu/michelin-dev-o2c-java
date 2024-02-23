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
 * This is a model class for TracingInformation1 type.
 */
public class TracingInformation1 {
    private String tracingID;
    private String serialNumber;

    /**
     * Default constructor.
     */
    public TracingInformation1() {
    }

    /**
     * Initialization constructor.
     * @param  tracingID  String value for tracingID.
     * @param  serialNumber  String value for serialNumber.
     */
    public TracingInformation1(
            String tracingID,
            String serialNumber) {
        this.tracingID = tracingID;
        this.serialNumber = serialNumber;
    }

    /**
     * Getter for TracingID.
     * @return Returns the String
     */
    @JsonGetter("TracingID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTracingID() {
        return tracingID;
    }

    /**
     * Setter for TracingID.
     * @param tracingID Value for String
     */
    @JsonSetter("TracingID")
    public void setTracingID(String tracingID) {
        this.tracingID = tracingID;
    }

    /**
     * Getter for SerialNumber.
     * @return Returns the String
     */
    @JsonGetter("SerialNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Setter for SerialNumber.
     * @param serialNumber Value for String
     */
    @JsonSetter("SerialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Converts this TracingInformation1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TracingInformation1 [" + "tracingID=" + tracingID + ", serialNumber=" + serialNumber
                + "]";
    }

    /**
     * Builds a new {@link TracingInformation1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TracingInformation1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tracingID(getTracingID())
                .serialNumber(getSerialNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link TracingInformation1}.
     */
    public static class Builder {
        private String tracingID;
        private String serialNumber;



        /**
         * Setter for tracingID.
         * @param  tracingID  String value for tracingID.
         * @return Builder
         */
        public Builder tracingID(String tracingID) {
            this.tracingID = tracingID;
            return this;
        }

        /**
         * Setter for serialNumber.
         * @param  serialNumber  String value for serialNumber.
         * @return Builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * Builds a new {@link TracingInformation1} object using the set fields.
         * @return {@link TracingInformation1}
         */
        public TracingInformation1 build() {
            return new TracingInformation1(tracingID, serialNumber);
        }
    }
}
