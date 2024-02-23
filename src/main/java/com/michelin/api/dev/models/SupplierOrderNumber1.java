/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SupplierOrderNumber1 type.
 */
public class SupplierOrderNumber1 {
    private String documentID;

    /**
     * Default constructor.
     */
    public SupplierOrderNumber1() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     */
    public SupplierOrderNumber1(
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
     * Converts this SupplierOrderNumber1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplierOrderNumber1 [" + "documentID=" + documentID + "]";
    }

    /**
     * Builds a new {@link SupplierOrderNumber1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplierOrderNumber1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID);
        return builder;
    }

    /**
     * Class to build instances of {@link SupplierOrderNumber1}.
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
         * Builds a new {@link SupplierOrderNumber1} object using the set fields.
         * @return {@link SupplierOrderNumber1}
         */
        public SupplierOrderNumber1 build() {
            return new SupplierOrderNumber1(documentID);
        }
    }
}
