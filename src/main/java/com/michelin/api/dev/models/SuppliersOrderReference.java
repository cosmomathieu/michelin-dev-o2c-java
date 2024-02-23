/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SuppliersOrderReference type.
 */
public class SuppliersOrderReference {
    private String documentID;
    private String issueDate;

    /**
     * Default constructor.
     */
    public SuppliersOrderReference() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  issueDate  String value for issueDate.
     */
    public SuppliersOrderReference(
            String documentID,
            String issueDate) {
        this.documentID = documentID;
        this.issueDate = issueDate;
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
     * Getter for IssueDate.
     * @return Returns the String
     */
    @JsonGetter("IssueDate")
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * @param issueDate Value for String
     */
    @JsonSetter("IssueDate")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Converts this SuppliersOrderReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SuppliersOrderReference [" + "documentID=" + documentID + ", issueDate=" + issueDate
                + "]";
    }

    /**
     * Builds a new {@link SuppliersOrderReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SuppliersOrderReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, issueDate);
        return builder;
    }

    /**
     * Class to build instances of {@link SuppliersOrderReference}.
     */
    public static class Builder {
        private String documentID;
        private String issueDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  issueDate  String value for issueDate.
         */
        public Builder(String documentID, String issueDate) {
            this.documentID = documentID;
            this.issueDate = issueDate;
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
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Builds a new {@link SuppliersOrderReference} object using the set fields.
         * @return {@link SuppliersOrderReference}
         */
        public SuppliersOrderReference build() {
            return new SuppliersOrderReference(documentID, issueDate);
        }
    }
}
