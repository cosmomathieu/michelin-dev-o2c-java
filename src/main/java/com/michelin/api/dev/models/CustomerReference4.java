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
 * This is a model class for CustomerReference4 type.
 */
public class CustomerReference4 {
    private String documentID;

    /**
     * Default constructor.
     */
    public CustomerReference4() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     */
    public CustomerReference4(
            String documentID) {
        this.documentID = documentID;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("documentID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this CustomerReference4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerReference4 [" + "documentID=" + documentID + "]";
    }

    /**
     * Builds a new {@link CustomerReference4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerReference4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .documentID(getDocumentID());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerReference4}.
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
         * Builds a new {@link CustomerReference4} object using the set fields.
         * @return {@link CustomerReference4}
         */
        public CustomerReference4 build() {
            return new CustomerReference4(documentID);
        }
    }
}
