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
 * This is a model class for EDIWheelC11StockInquiryResponse type.
 */
public class EDIWheelC11StockInquiryResponse {
    private String documentID;
    private String variant;
    private ErrorHead4 errorHead;
    private String transportPriority;
    private List<OrderLine4> orderLine;
    private CustomerReference4 customerReference;
    private Consignee10 consignee;
    private BuyerParty9 buyerParty;

    /**
     * Default constructor.
     */
    public EDIWheelC11StockInquiryResponse() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  variant  String value for variant.
     * @param  errorHead  ErrorHead4 value for errorHead.
     * @param  transportPriority  String value for transportPriority.
     * @param  orderLine  List of OrderLine4 value for orderLine.
     * @param  customerReference  CustomerReference4 value for customerReference.
     * @param  consignee  Consignee10 value for consignee.
     * @param  buyerParty  BuyerParty9 value for buyerParty.
     */
    public EDIWheelC11StockInquiryResponse(
            String documentID,
            String variant,
            ErrorHead4 errorHead,
            String transportPriority,
            List<OrderLine4> orderLine,
            CustomerReference4 customerReference,
            Consignee10 consignee,
            BuyerParty9 buyerParty) {
        this.documentID = documentID;
        this.variant = variant;
        this.errorHead = errorHead;
        this.transportPriority = transportPriority;
        this.orderLine = orderLine;
        this.customerReference = customerReference;
        this.consignee = consignee;
        this.buyerParty = buyerParty;
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
     * Getter for Variant.
     * @return Returns the String
     */
    @JsonGetter("variant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVariant() {
        return variant;
    }

    /**
     * Setter for Variant.
     * @param variant Value for String
     */
    @JsonSetter("variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Getter for ErrorHead.
     * @return Returns the ErrorHead4
     */
    @JsonGetter("errorHead")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorHead4 getErrorHead() {
        return errorHead;
    }

    /**
     * Setter for ErrorHead.
     * @param errorHead Value for ErrorHead4
     */
    @JsonSetter("errorHead")
    public void setErrorHead(ErrorHead4 errorHead) {
        this.errorHead = errorHead;
    }

    /**
     * Getter for TransportPriority.
     * @return Returns the String
     */
    @JsonGetter("transportPriority")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransportPriority() {
        return transportPriority;
    }

    /**
     * Setter for TransportPriority.
     * @param transportPriority Value for String
     */
    @JsonSetter("transportPriority")
    public void setTransportPriority(String transportPriority) {
        this.transportPriority = transportPriority;
    }

    /**
     * Getter for OrderLine.
     * @return Returns the List of OrderLine4
     */
    @JsonGetter("orderLine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderLine4> getOrderLine() {
        return orderLine;
    }

    /**
     * Setter for OrderLine.
     * @param orderLine Value for List of OrderLine4
     */
    @JsonSetter("orderLine")
    public void setOrderLine(List<OrderLine4> orderLine) {
        this.orderLine = orderLine;
    }

    /**
     * Getter for CustomerReference.
     * @return Returns the CustomerReference4
     */
    @JsonGetter("customerReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerReference4 getCustomerReference() {
        return customerReference;
    }

    /**
     * Setter for CustomerReference.
     * @param customerReference Value for CustomerReference4
     */
    @JsonSetter("customerReference")
    public void setCustomerReference(CustomerReference4 customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Getter for Consignee.
     * @return Returns the Consignee10
     */
    @JsonGetter("consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee10 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee10
     */
    @JsonSetter("consignee")
    public void setConsignee(Consignee10 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty9
     */
    @JsonGetter("buyerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BuyerParty9 getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty9
     */
    @JsonSetter("buyerParty")
    public void setBuyerParty(BuyerParty9 buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Converts this EDIWheelC11StockInquiryResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC11StockInquiryResponse [" + "documentID=" + documentID + ", variant="
                + variant + ", errorHead=" + errorHead + ", transportPriority=" + transportPriority
                + ", orderLine=" + orderLine + ", customerReference=" + customerReference
                + ", consignee=" + consignee + ", buyerParty=" + buyerParty + "]";
    }

    /**
     * Builds a new {@link EDIWheelC11StockInquiryResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC11StockInquiryResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .documentID(getDocumentID())
                .variant(getVariant())
                .errorHead(getErrorHead())
                .transportPriority(getTransportPriority())
                .orderLine(getOrderLine())
                .customerReference(getCustomerReference())
                .consignee(getConsignee())
                .buyerParty(getBuyerParty());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC11StockInquiryResponse}.
     */
    public static class Builder {
        private String documentID;
        private String variant;
        private ErrorHead4 errorHead;
        private String transportPriority;
        private List<OrderLine4> orderLine;
        private CustomerReference4 customerReference;
        private Consignee10 consignee;
        private BuyerParty9 buyerParty;



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
         * Setter for errorHead.
         * @param  errorHead  ErrorHead4 value for errorHead.
         * @return Builder
         */
        public Builder errorHead(ErrorHead4 errorHead) {
            this.errorHead = errorHead;
            return this;
        }

        /**
         * Setter for transportPriority.
         * @param  transportPriority  String value for transportPriority.
         * @return Builder
         */
        public Builder transportPriority(String transportPriority) {
            this.transportPriority = transportPriority;
            return this;
        }

        /**
         * Setter for orderLine.
         * @param  orderLine  List of OrderLine4 value for orderLine.
         * @return Builder
         */
        public Builder orderLine(List<OrderLine4> orderLine) {
            this.orderLine = orderLine;
            return this;
        }

        /**
         * Setter for customerReference.
         * @param  customerReference  CustomerReference4 value for customerReference.
         * @return Builder
         */
        public Builder customerReference(CustomerReference4 customerReference) {
            this.customerReference = customerReference;
            return this;
        }

        /**
         * Setter for consignee.
         * @param  consignee  Consignee10 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee10 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty9 value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty9 buyerParty) {
            this.buyerParty = buyerParty;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC11StockInquiryResponse} object using the set fields.
         * @return {@link EDIWheelC11StockInquiryResponse}
         */
        public EDIWheelC11StockInquiryResponse build() {
            return new EDIWheelC11StockInquiryResponse(documentID, variant, errorHead,
                    transportPriority, orderLine, customerReference, consignee, buyerParty);
        }
    }
}
