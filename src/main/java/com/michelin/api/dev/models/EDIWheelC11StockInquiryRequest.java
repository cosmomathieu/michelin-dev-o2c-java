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
 * This is a model class for EDIWheelC11StockInquiryRequest type.
 */
public class EDIWheelC11StockInquiryRequest {
    private String variant;
    private List<OrderLine3> orderLine;
    private String documentID;
    private CustomerReference4 customerReference;
    private Consignee9 consignee;
    private BuyerParty8 buyerParty;

    /**
     * Default constructor.
     */
    public EDIWheelC11StockInquiryRequest() {
    }

    /**
     * Initialization constructor.
     * @param  variant  String value for variant.
     * @param  orderLine  List of OrderLine3 value for orderLine.
     * @param  documentID  String value for documentID.
     * @param  consignee  Consignee9 value for consignee.
     * @param  buyerParty  BuyerParty8 value for buyerParty.
     * @param  customerReference  CustomerReference4 value for customerReference.
     */
    public EDIWheelC11StockInquiryRequest(
            String variant,
            List<OrderLine3> orderLine,
            String documentID,
            Consignee9 consignee,
            BuyerParty8 buyerParty,
            CustomerReference4 customerReference) {
        this.variant = variant;
        this.orderLine = orderLine;
        this.documentID = documentID;
        this.customerReference = customerReference;
        this.consignee = consignee;
        this.buyerParty = buyerParty;
    }

    /**
     * Getter for Variant.
     * @return Returns the String
     */
    @JsonGetter("variant")
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
     * Getter for OrderLine.
     * @return Returns the List of OrderLine3
     */
    @JsonGetter("orderLine")
    public List<OrderLine3> getOrderLine() {
        return orderLine;
    }

    /**
     * Setter for OrderLine.
     * @param orderLine Value for List of OrderLine3
     */
    @JsonSetter("orderLine")
    public void setOrderLine(List<OrderLine3> orderLine) {
        this.orderLine = orderLine;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("documentID")
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
     * @return Returns the Consignee9
     */
    @JsonGetter("consignee")
    public Consignee9 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee9
     */
    @JsonSetter("consignee")
    public void setConsignee(Consignee9 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty8
     */
    @JsonGetter("buyerParty")
    public BuyerParty8 getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty8
     */
    @JsonSetter("buyerParty")
    public void setBuyerParty(BuyerParty8 buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Converts this EDIWheelC11StockInquiryRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC11StockInquiryRequest [" + "variant=" + variant + ", orderLine="
                + orderLine + ", documentID=" + documentID + ", consignee=" + consignee
                + ", buyerParty=" + buyerParty + ", customerReference=" + customerReference + "]";
    }

    /**
     * Builds a new {@link EDIWheelC11StockInquiryRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC11StockInquiryRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(variant, orderLine, documentID, consignee, buyerParty)
                .customerReference(getCustomerReference());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC11StockInquiryRequest}.
     */
    public static class Builder {
        private String variant;
        private List<OrderLine3> orderLine;
        private String documentID;
        private Consignee9 consignee;
        private BuyerParty8 buyerParty;
        private CustomerReference4 customerReference;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  variant  String value for variant.
         * @param  orderLine  List of OrderLine3 value for orderLine.
         * @param  documentID  String value for documentID.
         * @param  consignee  Consignee9 value for consignee.
         * @param  buyerParty  BuyerParty8 value for buyerParty.
         */
        public Builder(String variant, List<OrderLine3> orderLine, String documentID,
                Consignee9 consignee, BuyerParty8 buyerParty) {
            this.variant = variant;
            this.orderLine = orderLine;
            this.documentID = documentID;
            this.consignee = consignee;
            this.buyerParty = buyerParty;
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
         * Setter for orderLine.
         * @param  orderLine  List of OrderLine3 value for orderLine.
         * @return Builder
         */
        public Builder orderLine(List<OrderLine3> orderLine) {
            this.orderLine = orderLine;
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
         * Setter for consignee.
         * @param  consignee  Consignee9 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee9 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty8 value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty8 buyerParty) {
            this.buyerParty = buyerParty;
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
         * Builds a new {@link EDIWheelC11StockInquiryRequest} object using the set fields.
         * @return {@link EDIWheelC11StockInquiryRequest}
         */
        public EDIWheelC11StockInquiryRequest build() {
            return new EDIWheelC11StockInquiryRequest(variant, orderLine, documentID, consignee,
                    buyerParty, customerReference);
        }
    }
}
