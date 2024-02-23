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
 * This is a model class for EDIWheelC11OrderStatusResponse type.
 */
public class EDIWheelC11OrderStatusResponse {
    private String documentID;
    private String variant;
    private String orderDateFrom;
    private String orderDateTo;
    private String orderStatusIndicator;
    private ErrorHead errorHead;
    private BuyerParty2 buyerParty;
    private OrderingParty orderingParty;
    private Consignee5 consignee;
    private List<ReferencedOrder1> referencedOrder;

    /**
     * Default constructor.
     */
    public EDIWheelC11OrderStatusResponse() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  errorHead  ErrorHead value for errorHead.
     * @param  buyerParty  BuyerParty2 value for buyerParty.
     * @param  variant  String value for variant.
     * @param  orderDateFrom  String value for orderDateFrom.
     * @param  orderDateTo  String value for orderDateTo.
     * @param  orderStatusIndicator  String value for orderStatusIndicator.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  consignee  Consignee5 value for consignee.
     * @param  referencedOrder  List of ReferencedOrder1 value for referencedOrder.
     */
    public EDIWheelC11OrderStatusResponse(
            String documentID,
            ErrorHead errorHead,
            BuyerParty2 buyerParty,
            String variant,
            String orderDateFrom,
            String orderDateTo,
            String orderStatusIndicator,
            OrderingParty orderingParty,
            Consignee5 consignee,
            List<ReferencedOrder1> referencedOrder) {
        this.documentID = documentID;
        this.variant = variant;
        this.orderDateFrom = orderDateFrom;
        this.orderDateTo = orderDateTo;
        this.orderStatusIndicator = orderStatusIndicator;
        this.errorHead = errorHead;
        this.buyerParty = buyerParty;
        this.orderingParty = orderingParty;
        this.consignee = consignee;
        this.referencedOrder = referencedOrder;
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
     * Getter for OrderDateFrom.
     * @return Returns the String
     */
    @JsonGetter("OrderDateFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderDateFrom() {
        return orderDateFrom;
    }

    /**
     * Setter for OrderDateFrom.
     * @param orderDateFrom Value for String
     */
    @JsonSetter("OrderDateFrom")
    public void setOrderDateFrom(String orderDateFrom) {
        this.orderDateFrom = orderDateFrom;
    }

    /**
     * Getter for OrderDateTo.
     * @return Returns the String
     */
    @JsonGetter("OrderDateTo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderDateTo() {
        return orderDateTo;
    }

    /**
     * Setter for OrderDateTo.
     * @param orderDateTo Value for String
     */
    @JsonSetter("OrderDateTo")
    public void setOrderDateTo(String orderDateTo) {
        this.orderDateTo = orderDateTo;
    }

    /**
     * Getter for OrderStatusIndicator.
     * @return Returns the String
     */
    @JsonGetter("OrderStatusIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderStatusIndicator() {
        return orderStatusIndicator;
    }

    /**
     * Setter for OrderStatusIndicator.
     * @param orderStatusIndicator Value for String
     */
    @JsonSetter("OrderStatusIndicator")
    public void setOrderStatusIndicator(String orderStatusIndicator) {
        this.orderStatusIndicator = orderStatusIndicator;
    }

    /**
     * Getter for ErrorHead.
     * @return Returns the ErrorHead
     */
    @JsonGetter("ErrorHead")
    public ErrorHead getErrorHead() {
        return errorHead;
    }

    /**
     * Setter for ErrorHead.
     * @param errorHead Value for ErrorHead
     */
    @JsonSetter("ErrorHead")
    public void setErrorHead(ErrorHead errorHead) {
        this.errorHead = errorHead;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty2
     */
    @JsonGetter("BuyerParty")
    public BuyerParty2 getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty2
     */
    @JsonSetter("BuyerParty")
    public void setBuyerParty(BuyerParty2 buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Getter for OrderingParty.
     * @return Returns the OrderingParty
     */
    @JsonGetter("OrderingParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderingParty getOrderingParty() {
        return orderingParty;
    }

    /**
     * Setter for OrderingParty.
     * @param orderingParty Value for OrderingParty
     */
    @JsonSetter("OrderingParty")
    public void setOrderingParty(OrderingParty orderingParty) {
        this.orderingParty = orderingParty;
    }

    /**
     * Getter for Consignee.
     * @return Returns the Consignee5
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee5 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee5
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee5 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for ReferencedOrder.
     * @return Returns the List of ReferencedOrder1
     */
    @JsonGetter("ReferencedOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ReferencedOrder1> getReferencedOrder() {
        return referencedOrder;
    }

    /**
     * Setter for ReferencedOrder.
     * @param referencedOrder Value for List of ReferencedOrder1
     */
    @JsonSetter("ReferencedOrder")
    public void setReferencedOrder(List<ReferencedOrder1> referencedOrder) {
        this.referencedOrder = referencedOrder;
    }

    /**
     * Converts this EDIWheelC11OrderStatusResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC11OrderStatusResponse [" + "documentID=" + documentID + ", errorHead="
                + errorHead + ", buyerParty=" + buyerParty + ", variant=" + variant
                + ", orderDateFrom=" + orderDateFrom + ", orderDateTo=" + orderDateTo
                + ", orderStatusIndicator=" + orderStatusIndicator + ", orderingParty="
                + orderingParty + ", consignee=" + consignee + ", referencedOrder="
                + referencedOrder + "]";
    }

    /**
     * Builds a new {@link EDIWheelC11OrderStatusResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC11OrderStatusResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, errorHead, buyerParty)
                .variant(getVariant())
                .orderDateFrom(getOrderDateFrom())
                .orderDateTo(getOrderDateTo())
                .orderStatusIndicator(getOrderStatusIndicator())
                .orderingParty(getOrderingParty())
                .consignee(getConsignee())
                .referencedOrder(getReferencedOrder());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC11OrderStatusResponse}.
     */
    public static class Builder {
        private String documentID;
        private ErrorHead errorHead;
        private BuyerParty2 buyerParty;
        private String variant;
        private String orderDateFrom;
        private String orderDateTo;
        private String orderStatusIndicator;
        private OrderingParty orderingParty;
        private Consignee5 consignee;
        private List<ReferencedOrder1> referencedOrder;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  errorHead  ErrorHead value for errorHead.
         * @param  buyerParty  BuyerParty2 value for buyerParty.
         */
        public Builder(String documentID, ErrorHead errorHead, BuyerParty2 buyerParty) {
            this.documentID = documentID;
            this.errorHead = errorHead;
            this.buyerParty = buyerParty;
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
         * Setter for errorHead.
         * @param  errorHead  ErrorHead value for errorHead.
         * @return Builder
         */
        public Builder errorHead(ErrorHead errorHead) {
            this.errorHead = errorHead;
            return this;
        }

        /**
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty2 value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty2 buyerParty) {
            this.buyerParty = buyerParty;
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
         * Setter for orderDateFrom.
         * @param  orderDateFrom  String value for orderDateFrom.
         * @return Builder
         */
        public Builder orderDateFrom(String orderDateFrom) {
            this.orderDateFrom = orderDateFrom;
            return this;
        }

        /**
         * Setter for orderDateTo.
         * @param  orderDateTo  String value for orderDateTo.
         * @return Builder
         */
        public Builder orderDateTo(String orderDateTo) {
            this.orderDateTo = orderDateTo;
            return this;
        }

        /**
         * Setter for orderStatusIndicator.
         * @param  orderStatusIndicator  String value for orderStatusIndicator.
         * @return Builder
         */
        public Builder orderStatusIndicator(String orderStatusIndicator) {
            this.orderStatusIndicator = orderStatusIndicator;
            return this;
        }

        /**
         * Setter for orderingParty.
         * @param  orderingParty  OrderingParty value for orderingParty.
         * @return Builder
         */
        public Builder orderingParty(OrderingParty orderingParty) {
            this.orderingParty = orderingParty;
            return this;
        }

        /**
         * Setter for consignee.
         * @param  consignee  Consignee5 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee5 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for referencedOrder.
         * @param  referencedOrder  List of ReferencedOrder1 value for referencedOrder.
         * @return Builder
         */
        public Builder referencedOrder(List<ReferencedOrder1> referencedOrder) {
            this.referencedOrder = referencedOrder;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC11OrderStatusResponse} object using the set fields.
         * @return {@link EDIWheelC11OrderStatusResponse}
         */
        public EDIWheelC11OrderStatusResponse build() {
            return new EDIWheelC11OrderStatusResponse(documentID, errorHead, buyerParty, variant,
                    orderDateFrom, orderDateTo, orderStatusIndicator, orderingParty, consignee,
                    referencedOrder);
        }
    }
}
