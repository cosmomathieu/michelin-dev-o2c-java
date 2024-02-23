/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Contract2 type.
 */
public class Contract2 {
    private String documentID;

    /**
     * Default constructor.
     */
    public Contract2() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     */
    public Contract2(
            String documentID) {
        this.documentID = documentID;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("documentID")
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Setter for DocumentID.
     * @param documentID Value for String
     */
    @JsonSetter("documentID")
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /**
     * Converts this Contract2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Contract2 [" + "documentID=" + documentID + "]";
    }

    /**
     * Builds a new {@link Contract2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Contract2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID);
        return builder;
    }

    /**
     * Class to build instances of {@link Contract2}.
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
         * Builds a new {@link Contract2} object using the set fields.
         * @return {@link Contract2}
         */
        public Contract2 build() {
            return new Contract2(documentID);
        }
    }
}
