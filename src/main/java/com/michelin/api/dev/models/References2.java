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
 * This is a model class for References2 type.
 */
public class References2 {
    private String referenceTypeCode;
    private String documentID;
    private String lineID;
    private String issueDate;

    /**
     * Default constructor.
     */
    public References2() {
    }

    /**
     * Initialization constructor.
     * @param  referenceTypeCode  String value for referenceTypeCode.
     * @param  documentID  String value for documentID.
     * @param  lineID  String value for lineID.
     * @param  issueDate  String value for issueDate.
     */
    public References2(
            String referenceTypeCode,
            String documentID,
            String lineID,
            String issueDate) {
        this.referenceTypeCode = referenceTypeCode;
        this.documentID = documentID;
        this.lineID = lineID;
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
     * Getter for LineID.
     * @return Returns the String
     */
    @JsonGetter("LineID")
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
     * Converts this References2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "References2 [" + "referenceTypeCode=" + referenceTypeCode + ", documentID="
                + documentID + ", lineID=" + lineID + ", issueDate=" + issueDate + "]";
    }

    /**
     * Builds a new {@link References2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link References2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(referenceTypeCode, documentID, lineID)
                .issueDate(getIssueDate());
        return builder;
    }

    /**
     * Class to build instances of {@link References2}.
     */
    public static class Builder {
        private String referenceTypeCode;
        private String documentID;
        private String lineID;
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
         * @param  lineID  String value for lineID.
         */
        public Builder(String referenceTypeCode, String documentID, String lineID) {
            this.referenceTypeCode = referenceTypeCode;
            this.documentID = documentID;
            this.lineID = lineID;
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
         * Setter for lineID.
         * @param  lineID  String value for lineID.
         * @return Builder
         */
        public Builder lineID(String lineID) {
            this.lineID = lineID;
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
         * Builds a new {@link References2} object using the set fields.
         * @return {@link References2}
         */
        public References2 build() {
            return new References2(referenceTypeCode, documentID, lineID, issueDate);
        }
    }
}
