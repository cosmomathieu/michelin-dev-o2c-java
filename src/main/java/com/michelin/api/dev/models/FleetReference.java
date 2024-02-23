/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FleetReference type.
 */
public class FleetReference {
    private String referenceTypeCode;
    private String documentID;

    /**
     * Default constructor.
     */
    public FleetReference() {
    }

    /**
     * Initialization constructor.
     * @param  referenceTypeCode  String value for referenceTypeCode.
     * @param  documentID  String value for documentID.
     */
    public FleetReference(
            String referenceTypeCode,
            String documentID) {
        this.referenceTypeCode = referenceTypeCode;
        this.documentID = documentID;
    }

    /**
     * Getter for ReferenceTypeCode.
     * @return Returns the String
     */
    @JsonGetter("ReferenceTypeCode")
    public String getReferenceTypeCode() {
        return referenceTypeCode;
    }

    /**
     * Setter for ReferenceTypeCode.
     * @param referenceTypeCode Value for String
     */
    @JsonSetter("ReferenceTypeCode")
    public void setReferenceTypeCode(String referenceTypeCode) {
        this.referenceTypeCode = referenceTypeCode;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("DocumentID")
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Setter for DocumentID.
     * @param documentID Value for String
     */
    @JsonSetter("DocumentID")
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /**
     * Converts this FleetReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FleetReference [" + "referenceTypeCode=" + referenceTypeCode + ", documentID="
                + documentID + "]";
    }

    /**
     * Builds a new {@link FleetReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FleetReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(referenceTypeCode, documentID);
        return builder;
    }

    /**
     * Class to build instances of {@link FleetReference}.
     */
    public static class Builder {
        private String referenceTypeCode;
        private String documentID;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  referenceTypeCode  String value for referenceTypeCode.
         * @param  documentID  String value for documentID.
         */
        public Builder(String referenceTypeCode, String documentID) {
            this.referenceTypeCode = referenceTypeCode;
            this.documentID = documentID;
        }

        /**
         * Setter for referenceTypeCode.
         * @param  referenceTypeCode  String value for referenceTypeCode.
         * @return Builder
         */
        public Builder referenceTypeCode(String referenceTypeCode) {
            this.referenceTypeCode = referenceTypeCode;
            return this;
        }

        /**
         * Setter for documentID.
         * @param  documentID  String value for documentID.
         * @return Builder
         */
        public Builder documentID(String documentID) {
            this.documentID = documentID;
            return this;
        }

        /**
         * Builds a new {@link FleetReference} object using the set fields.
         * @return {@link FleetReference}
         */
        public FleetReference build() {
            return new FleetReference(referenceTypeCode, documentID);
        }
    }
}
