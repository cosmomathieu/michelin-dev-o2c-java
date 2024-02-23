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
 * This is a model class for ExternalnvoiceReference type.
 */
public class ExternalnvoiceReference {
    private String documentID;

    /**
     * Default constructor.
     */
    public ExternalnvoiceReference() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     */
    public ExternalnvoiceReference(
            String documentID) {
        this.documentID = documentID;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("DocumentID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ExternalnvoiceReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExternalnvoiceReference [" + "documentID=" + documentID + "]";
    }

    /**
     * Builds a new {@link ExternalnvoiceReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExternalnvoiceReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .documentID(getDocumentID());
        return builder;
    }

    /**
     * Class to build instances of {@link ExternalnvoiceReference}.
     */
    public static class Builder {
        private String documentID;



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
         * Builds a new {@link ExternalnvoiceReference} object using the set fields.
         * @return {@link ExternalnvoiceReference}
         */
        public ExternalnvoiceReference build() {
            return new ExternalnvoiceReference(documentID);
        }
    }
}
