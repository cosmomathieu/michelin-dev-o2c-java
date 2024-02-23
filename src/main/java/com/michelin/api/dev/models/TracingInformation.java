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
 * This is a model class for TracingInformation type.
 */
public class TracingInformation {
    private String tracingID;
    private String serialNumber;
    private String tracingURI;

    /**
     * Default constructor.
     */
    public TracingInformation() {
    }

    /**
     * Initialization constructor.
     * @param  tracingID  String value for tracingID.
     * @param  serialNumber  String value for serialNumber.
     * @param  tracingURI  String value for tracingURI.
     */
    public TracingInformation(
            String tracingID,
            String serialNumber,
            String tracingURI) {
        this.tracingID = tracingID;
        this.serialNumber = serialNumber;
        this.tracingURI = tracingURI;
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
     * Getter for TracingURI.
     * @return Returns the String
     */
    @JsonGetter("TracingURI")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTracingURI() {
        return tracingURI;
    }

    /**
     * Setter for TracingURI.
     * @param tracingURI Value for String
     */
    @JsonSetter("TracingURI")
    public void setTracingURI(String tracingURI) {
        this.tracingURI = tracingURI;
    }

    /**
     * Converts this TracingInformation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TracingInformation [" + "tracingID=" + tracingID + ", serialNumber=" + serialNumber
                + ", tracingURI=" + tracingURI + "]";
    }

    /**
     * Builds a new {@link TracingInformation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TracingInformation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tracingID(getTracingID())
                .serialNumber(getSerialNumber())
                .tracingURI(getTracingURI());
        return builder;
    }

    /**
     * Class to build instances of {@link TracingInformation}.
     */
    public static class Builder {
        private String tracingID;
        private String serialNumber;
        private String tracingURI;



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
         * Setter for tracingURI.
         * @param  tracingURI  String value for tracingURI.
         * @return Builder
         */
        public Builder tracingURI(String tracingURI) {
            this.tracingURI = tracingURI;
            return this;
        }

        /**
         * Builds a new {@link TracingInformation} object using the set fields.
         * @return {@link TracingInformation}
         */
        public TracingInformation build() {
            return new TracingInformation(tracingID, serialNumber, tracingURI);
        }
    }
}
