/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for EDIWheelB44InvoiceListResponse type.
 */
public class EDIWheelB44InvoiceListResponse {
    private String documentID;
    private String variant;
    private int numberOfMessages;
    private ErrorHead3 errorHead;
    private List<Invoice1> invoice;

    /**
     * Default constructor.
     */
    public EDIWheelB44InvoiceListResponse() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  variant  String value for variant.
     * @param  numberOfMessages  int value for numberOfMessages.
     * @param  invoice  List of Invoice1 value for invoice.
     * @param  errorHead  ErrorHead3 value for errorHead.
     */
    public EDIWheelB44InvoiceListResponse(
            String documentID,
            String variant,
            int numberOfMessages,
            List<Invoice1> invoice,
            ErrorHead3 errorHead) {
        this.documentID = documentID;
        this.variant = variant;
        this.numberOfMessages = numberOfMessages;
        this.errorHead = errorHead;
        this.invoice = invoice;
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
     * Getter for Variant.
     * @return Returns the String
     */
    @JsonGetter("Variant")
    public String getVariant() {
        return variant;
    }

    /**
     * Setter for Variant.
     * @param variant Value for String
     */
    @JsonSetter("Variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Getter for NumberOfMessages.
     * @return Returns the int
     */
    @JsonGetter("NumberOfMessages")
    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    /**
     * Setter for NumberOfMessages.
     * @param numberOfMessages Value for int
     */
    @JsonSetter("NumberOfMessages")
    public void setNumberOfMessages(int numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }

    /**
     * Getter for ErrorHead.
     * @return Returns the ErrorHead3
     */
    @JsonGetter("ErrorHead")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorHead3 getErrorHead() {
        return errorHead;
    }

    /**
     * Setter for ErrorHead.
     * @param errorHead Value for ErrorHead3
     */
    @JsonSetter("ErrorHead")
    public void setErrorHead(ErrorHead3 errorHead) {
        this.errorHead = errorHead;
    }

    /**
     * Getter for Invoice.
     * @return Returns the List of Invoice1
     */
    @JsonGetter("invoice")
    public List<Invoice1> getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for List of Invoice1
     */
    @JsonSetter("invoice")
    public void setInvoice(List<Invoice1> invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this EDIWheelB44InvoiceListResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelB44InvoiceListResponse [" + "documentID=" + documentID + ", variant="
                + variant + ", numberOfMessages=" + numberOfMessages + ", invoice=" + invoice
                + ", errorHead=" + errorHead + "]";
    }

    /**
     * Builds a new {@link EDIWheelB44InvoiceListResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelB44InvoiceListResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, variant, numberOfMessages, invoice)
                .errorHead(getErrorHead());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelB44InvoiceListResponse}.
     */
    public static class Builder {
        private String documentID;
        private String variant;
        private int numberOfMessages;
        private List<Invoice1> invoice;
        private ErrorHead3 errorHead;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  variant  String value for variant.
         * @param  numberOfMessages  int value for numberOfMessages.
         * @param  invoice  List of Invoice1 value for invoice.
         */
        public Builder(String documentID, String variant, int numberOfMessages,
                List<Invoice1> invoice) {
            this.documentID = documentID;
            this.variant = variant;
            this.numberOfMessages = numberOfMessages;
            this.invoice = invoice;
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
         * Setter for variant.
         * @param  variant  String value for variant.
         * @return Builder
         */
        public Builder variant(String variant) {
            this.variant = variant;
            return this;
        }

        /**
         * Setter for numberOfMessages.
         * @param  numberOfMessages  int value for numberOfMessages.
         * @return Builder
         */
        public Builder numberOfMessages(int numberOfMessages) {
            this.numberOfMessages = numberOfMessages;
            return this;
        }

        /**
         * Setter for invoice.
         * @param  invoice  List of Invoice1 value for invoice.
         * @return Builder
         */
        public Builder invoice(List<Invoice1> invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Setter for errorHead.
         * @param  errorHead  ErrorHead3 value for errorHead.
         * @return Builder
         */
        public Builder errorHead(ErrorHead3 errorHead) {
            this.errorHead = errorHead;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelB44InvoiceListResponse} object using the set fields.
         * @return {@link EDIWheelB44InvoiceListResponse}
         */
        public EDIWheelB44InvoiceListResponse build() {
            return new EDIWheelB44InvoiceListResponse(documentID, variant, numberOfMessages,
                    invoice, errorHead);
        }
    }
}
