/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AdditionalCustomerReferenceNumber type.
 */
public class AdditionalCustomerReferenceNumber {
    private String documentID;

    /**
     * Default constructor.
     */
    public AdditionalCustomerReferenceNumber() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     */
    public AdditionalCustomerReferenceNumber(
            String documentID) {
        this.documentID = documentID;
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
     * Converts this AdditionalCustomerReferenceNumber into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AdditionalCustomerReferenceNumber [" + "documentID=" + documentID + "]";
    }

    /**
     * Builds a new {@link AdditionalCustomerReferenceNumber.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AdditionalCustomerReferenceNumber.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID);
        return builder;
    }

    /**
     * Class to build instances of {@link AdditionalCustomerReferenceNumber}.
     */
    public static class Builder {
        private String documentID;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         */
        public Builder(String documentID) {
            this.documentID = documentID;
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
         * Builds a new {@link AdditionalCustomerReferenceNumber} object using the set fields.
         * @return {@link AdditionalCustomerReferenceNumber}
         */
        public AdditionalCustomerReferenceNumber build() {
            return new AdditionalCustomerReferenceNumber(documentID);
        }
    }
}
