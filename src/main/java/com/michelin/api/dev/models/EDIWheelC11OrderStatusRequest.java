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
 * This is a model class for EDIWheelC11OrderStatusRequest type.
 */
public class EDIWheelC11OrderStatusRequest {
    private String documentID;
    private String variant;
    private String orderDateFrom;
    private String orderDateTo;
    private String orderingMethod;
    private String orderStatusIndicator;
    private BuyerParty buyerParty;
    private SellerParty sellerParty;
    private Consignee4 consignee;
    private SupplierParty supplierParty;
    private List<ReferencedOrder> referencedOrder;

    /**
     * Default constructor.
     */
    public EDIWheelC11OrderStatusRequest() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  buyerParty  BuyerParty value for buyerParty.
     * @param  variant  String value for variant.
     * @param  orderDateFrom  String value for orderDateFrom.
     * @param  orderDateTo  String value for orderDateTo.
     * @param  orderingMethod  String value for orderingMethod.
     * @param  orderStatusIndicator  String value for orderStatusIndicator.
     * @param  sellerParty  SellerParty value for sellerParty.
     * @param  consignee  Consignee4 value for consignee.
     * @param  supplierParty  SupplierParty value for supplierParty.
     * @param  referencedOrder  List of ReferencedOrder value for referencedOrder.
     */
    public EDIWheelC11OrderStatusRequest(
            String documentID,
            BuyerParty buyerParty,
            String variant,
            String orderDateFrom,
            String orderDateTo,
            String orderingMethod,
            String orderStatusIndicator,
            SellerParty sellerParty,
            Consignee4 consignee,
            SupplierParty supplierParty,
            List<ReferencedOrder> referencedOrder) {
        this.documentID = documentID;
        this.variant = variant;
        this.orderDateFrom = orderDateFrom;
        this.orderDateTo = orderDateTo;
        this.orderingMethod = orderingMethod;
        this.orderStatusIndicator = orderStatusIndicator;
        this.buyerParty = buyerParty;
        this.sellerParty = sellerParty;
        this.consignee = consignee;
        this.supplierParty = supplierParty;
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
     * Getter for OrderingMethod.
     * @return Returns the String
     */
    @JsonGetter("OrderingMethod")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderingMethod() {
        return orderingMethod;
    }

    /**
     * Setter for OrderingMethod.
     * @param orderingMethod Value for String
     */
    @JsonSetter("OrderingMethod")
    public void setOrderingMethod(String orderingMethod) {
        this.orderingMethod = orderingMethod;
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
     * Getter for BuyerParty.
     * @return Returns the BuyerParty
     */
    @JsonGetter("BuyerParty")
    public BuyerParty getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty
     */
    @JsonSetter("BuyerParty")
    public void setBuyerParty(BuyerParty buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Getter for SellerParty.
     * @return Returns the SellerParty
     */
    @JsonGetter("SellerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerParty getSellerParty() {
        return sellerParty;
    }

    /**
     * Setter for SellerParty.
     * @param sellerParty Value for SellerParty
     */
    @JsonSetter("SellerParty")
    public void setSellerParty(SellerParty sellerParty) {
        this.sellerParty = sellerParty;
    }

    /**
     * Getter for Consignee.
     * @return Returns the Consignee4
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee4 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee4
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee4 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for SupplierParty.
     * @return Returns the SupplierParty
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty supplierParty) {
        this.supplierParty = supplierParty;
    }

    /**
     * Getter for ReferencedOrder.
     * @return Returns the List of ReferencedOrder
     */
    @JsonGetter("ReferencedOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ReferencedOrder> getReferencedOrder() {
        return referencedOrder;
    }

    /**
     * Setter for ReferencedOrder.
     * @param referencedOrder Value for List of ReferencedOrder
     */
    @JsonSetter("ReferencedOrder")
    public void setReferencedOrder(List<ReferencedOrder> referencedOrder) {
        this.referencedOrder = referencedOrder;
    }

    /**
     * Converts this EDIWheelC11OrderStatusRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC11OrderStatusRequest [" + "documentID=" + documentID + ", buyerParty="
                + buyerParty + ", variant=" + variant + ", orderDateFrom=" + orderDateFrom
                + ", orderDateTo=" + orderDateTo + ", orderingMethod=" + orderingMethod
                + ", orderStatusIndicator=" + orderStatusIndicator + ", sellerParty=" + sellerParty
                + ", consignee=" + consignee + ", supplierParty=" + supplierParty
                + ", referencedOrder=" + referencedOrder + "]";
    }

    /**
     * Builds a new {@link EDIWheelC11OrderStatusRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC11OrderStatusRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, buyerParty)
                .variant(getVariant())
                .orderDateFrom(getOrderDateFrom())
                .orderDateTo(getOrderDateTo())
                .orderingMethod(getOrderingMethod())
                .orderStatusIndicator(getOrderStatusIndicator())
                .sellerParty(getSellerParty())
                .consignee(getConsignee())
                .supplierParty(getSupplierParty())
                .referencedOrder(getReferencedOrder());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC11OrderStatusRequest}.
     */
    public static class Builder {
        private String documentID;
        private BuyerParty buyerParty;
        private String variant;
        private String orderDateFrom;
        private String orderDateTo;
        private String orderingMethod;
        private String orderStatusIndicator;
        private SellerParty sellerParty;
        private Consignee4 consignee;
        private SupplierParty supplierParty;
        private List<ReferencedOrder> referencedOrder;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  buyerParty  BuyerParty value for buyerParty.
         */
        public Builder(String documentID, BuyerParty buyerParty) {
            this.documentID = documentID;
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
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty buyerParty) {
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
         * Setter for orderingMethod.
         * @param  orderingMethod  String value for orderingMethod.
         * @return Builder
         */
        public Builder orderingMethod(String orderingMethod) {
            this.orderingMethod = orderingMethod;
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
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty sellerParty) {
            this.sellerParty = sellerParty;
            return this;
        }

        /**
         * Setter for consignee.
         * @param  consignee  Consignee4 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee4 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty supplierParty) {
            this.supplierParty = supplierParty;
            return this;
        }

        /**
         * Setter for referencedOrder.
         * @param  referencedOrder  List of ReferencedOrder value for referencedOrder.
         * @return Builder
         */
        public Builder referencedOrder(List<ReferencedOrder> referencedOrder) {
            this.referencedOrder = referencedOrder;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC11OrderStatusRequest} object using the set fields.
         * @return {@link EDIWheelC11OrderStatusRequest}
         */
        public EDIWheelC11OrderStatusRequest build() {
            return new EDIWheelC11OrderStatusRequest(documentID, buyerParty, variant, orderDateFrom,
                    orderDateTo, orderingMethod, orderStatusIndicator, sellerParty, consignee,
                    supplierParty, referencedOrder);
        }
    }
}
