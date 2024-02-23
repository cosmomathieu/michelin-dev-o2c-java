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
 * This is a model class for References1 type.
 */
public class References1 {
    private String referenceTypeCode;
    private String documentID;
    private String issueDate;

    /**
     * Default constructor.
     */
    public References1() {
    }

    /**
     * Initialization constructor.
     * @param  referenceTypeCode  String value for referenceTypeCode.
     * @param  documentID  String value for documentID.
     * @param  issueDate  String value for issueDate.
     */
    public References1(
            String referenceTypeCode,
            String documentID,
            String issueDate) {
        this.referenceTypeCode = referenceTypeCode;
        this.documentID = documentID;
        this.issueDate = issueDate;
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
     * Getter for IssueDate.
     * @return Returns the String
     */
    @JsonGetter("IssueDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this References1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "References1 [" + "referenceTypeCode=" + referenceTypeCode + ", documentID="
                + documentID + ", issueDate=" + issueDate + "]";
    }

    /**
     * Builds a new {@link References1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link References1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(referenceTypeCode, documentID)
                .issueDate(getIssueDate());
        return builder;
    }

    /**
     * Class to build instances of {@link References1}.
     */
    public static class Builder {
        private String referenceTypeCode;
        private String documentID;
        private String issueDate;

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
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Builds a new {@link References1} object using the set fields.
         * @return {@link References1}
         */
        public References1 build() {
            return new References1(referenceTypeCode, documentID, issueDate);
        }
    }
}
