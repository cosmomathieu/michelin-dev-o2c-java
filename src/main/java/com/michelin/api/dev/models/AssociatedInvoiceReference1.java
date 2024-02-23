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
 * This is a model class for AssociatedInvoiceReference1 type.
 */
public class AssociatedInvoiceReference1 {
    private String documentID;
    private String lineID;
    private String issueDate;

    /**
     * Default constructor.
     */
    public AssociatedInvoiceReference1() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  lineID  String value for lineID.
     * @param  issueDate  String value for issueDate.
     */
    public AssociatedInvoiceReference1(
            String documentID,
            String lineID,
            String issueDate) {
        this.documentID = documentID;
        this.lineID = lineID;
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
     * Converts this AssociatedInvoiceReference1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AssociatedInvoiceReference1 [" + "documentID=" + documentID + ", lineID=" + lineID
                + ", issueDate=" + issueDate + "]";
    }

    /**
     * Builds a new {@link AssociatedInvoiceReference1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AssociatedInvoiceReference1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID)
                .lineID(getLineID())
                .issueDate(getIssueDate());
        return builder;
    }

    /**
     * Class to build instances of {@link AssociatedInvoiceReference1}.
     */
    public static class Builder {
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
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Builds a new {@link AssociatedInvoiceReference1} object using the set fields.
         * @return {@link AssociatedInvoiceReference1}
         */
        public AssociatedInvoiceReference1 build() {
            return new AssociatedInvoiceReference1(documentID, lineID, issueDate);
        }
    }
}
