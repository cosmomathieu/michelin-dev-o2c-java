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
 * This is a model class for DespatchAdviceReference type.
 */
public class DespatchAdviceReference {
    private String documentID;
    private String lineID;

    /**
     * Default constructor.
     */
    public DespatchAdviceReference() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  lineID  String value for lineID.
     */
    public DespatchAdviceReference(
            String documentID,
            String lineID) {
        this.documentID = documentID;
        this.lineID = lineID;
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
     * Getter for LineID.
     * @return Returns the String
     */
    @JsonGetter("LineID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLineID() {
        return lineID;
    }

    /**
     * Setter for LineID.
     * @param lineID Value for String
     */
    @JsonSetter("LineID")
    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    /**
     * Converts this DespatchAdviceReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DespatchAdviceReference [" + "documentID=" + documentID + ", lineID=" + lineID
                + "]";
    }

    /**
     * Builds a new {@link DespatchAdviceReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DespatchAdviceReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID)
                .lineID(getLineID());
        return builder;
    }

    /**
     * Class to build instances of {@link DespatchAdviceReference}.
     */
    public static class Builder {
        private String documentID;
        private String lineID;

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
         * Setter for lineID.
         * @param  lineID  String value for lineID.
         * @return Builder
         */
        public Builder lineID(String lineID) {
            this.lineID = lineID;
            return this;
        }

        /**
         * Builds a new {@link DespatchAdviceReference} object using the set fields.
         * @return {@link DespatchAdviceReference}
         */
        public DespatchAdviceReference build() {
            return new DespatchAdviceReference(documentID, lineID);
        }
    }
}
