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
 * This is a model class for EDIWheelB44InvoiceListRequest type.
 */
public class EDIWheelB44InvoiceListRequest {
    private String documentID;
    private String variant;
    private List<Invoice> invoice;

    /**
     * Default constructor.
     */
    public EDIWheelB44InvoiceListRequest() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  invoice  List of Invoice value for invoice.
     * @param  variant  String value for variant.
     */
    public EDIWheelB44InvoiceListRequest(
            String documentID,
            List<Invoice> invoice,
            String variant) {
        this.documentID = documentID;
        this.variant = variant;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Invoice.
     * @return Returns the List of Invoice
     */
    @JsonGetter("invoice")
    public List<Invoice> getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for List of Invoice
     */
    @JsonSetter("invoice")
    public void setInvoice(List<Invoice> invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this EDIWheelB44InvoiceListRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelB44InvoiceListRequest [" + "documentID=" + documentID + ", invoice="
                + invoice + ", variant=" + variant + "]";
    }

    /**
     * Builds a new {@link EDIWheelB44InvoiceListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelB44InvoiceListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, invoice)
                .variant(getVariant());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelB44InvoiceListRequest}.
     */
    public static class Builder {
        private String documentID;
        private List<Invoice> invoice;
        private String variant;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  invoice  List of Invoice value for invoice.
         */
        public Builder(String documentID, List<Invoice> invoice) {
            this.documentID = documentID;
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
         * Setter for invoice.
         * @param  invoice  List of Invoice value for invoice.
         * @return Builder
         */
        public Builder invoice(List<Invoice> invoice) {
            this.invoice = invoice;
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
         * Builds a new {@link EDIWheelB44InvoiceListRequest} object using the set fields.
         * @return {@link EDIWheelB44InvoiceListRequest}
         */
        public EDIWheelB44InvoiceListRequest build() {
            return new EDIWheelB44InvoiceListRequest(documentID, invoice, variant);
        }
    }
}
