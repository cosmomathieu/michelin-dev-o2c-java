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
 * This is a model class for ReferencedOrder type.
 */
public class ReferencedOrder {
    private SupplierOrderNumber supplierOrderNumber;
    private OrderReference1 orderReference;
    private Contract2 contract;
    private OrderedArticle orderedArticle;

    /**
     * Default constructor.
     */
    public ReferencedOrder() {
    }

    /**
     * Initialization constructor.
     * @param  supplierOrderNumber  SupplierOrderNumber value for supplierOrderNumber.
     * @param  orderReference  OrderReference1 value for orderReference.
     * @param  contract  Contract2 value for contract.
     * @param  orderedArticle  OrderedArticle value for orderedArticle.
     */
    public ReferencedOrder(
            SupplierOrderNumber supplierOrderNumber,
            OrderReference1 orderReference,
            Contract2 contract,
            OrderedArticle orderedArticle) {
        this.supplierOrderNumber = supplierOrderNumber;
        this.orderReference = orderReference;
        this.contract = contract;
        this.orderedArticle = orderedArticle;
    }

    /**
     * Getter for SupplierOrderNumber.
     * @return Returns the SupplierOrderNumber
     */
    @JsonGetter("SupplierOrderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierOrderNumber getSupplierOrderNumber() {
        return supplierOrderNumber;
    }

    /**
     * Setter for SupplierOrderNumber.
     * @param supplierOrderNumber Value for SupplierOrderNumber
     */
    @JsonSetter("SupplierOrderNumber")
    public void setSupplierOrderNumber(SupplierOrderNumber supplierOrderNumber) {
        this.supplierOrderNumber = supplierOrderNumber;
    }

    /**
     * Getter for OrderReference.
     * @return Returns the OrderReference1
     */
    @JsonGetter("OrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderReference1 getOrderReference() {
        return orderReference;
    }

    /**
     * Setter for OrderReference.
     * @param orderReference Value for OrderReference1
     */
    @JsonSetter("OrderReference")
    public void setOrderReference(OrderReference1 orderReference) {
        this.orderReference = orderReference;
    }

    /**
     * Getter for Contract.
     * @return Returns the Contract2
     */
    @JsonGetter("Contract")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Contract2 getContract() {
        return contract;
    }

    /**
     * Setter for Contract.
     * @param contract Value for Contract2
     */
    @JsonSetter("Contract")
    public void setContract(Contract2 contract) {
        this.contract = contract;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle
     */
    @JsonGetter("OrderedArticle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderedArticle getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this ReferencedOrder into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReferencedOrder [" + "supplierOrderNumber=" + supplierOrderNumber
                + ", orderReference=" + orderReference + ", contract=" + contract
                + ", orderedArticle=" + orderedArticle + "]";
    }

    /**
     * Builds a new {@link ReferencedOrder.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReferencedOrder.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .supplierOrderNumber(getSupplierOrderNumber())
                .orderReference(getOrderReference())
                .contract(getContract())
                .orderedArticle(getOrderedArticle());
        return builder;
    }

    /**
     * Class to build instances of {@link ReferencedOrder}.
     */
    public static class Builder {
        private SupplierOrderNumber supplierOrderNumber;
        private OrderReference1 orderReference;
        private Contract2 contract;
        private OrderedArticle orderedArticle;



        /**
         * Setter for supplierOrderNumber.
         * @param  supplierOrderNumber  SupplierOrderNumber value for supplierOrderNumber.
         * @return Builder
         */
        public Builder supplierOrderNumber(SupplierOrderNumber supplierOrderNumber) {
            this.supplierOrderNumber = supplierOrderNumber;
            return this;
        }

        /**
         * Setter for orderReference.
         * @param  orderReference  OrderReference1 value for orderReference.
         * @return Builder
         */
        public Builder orderReference(OrderReference1 orderReference) {
            this.orderReference = orderReference;
            return this;
        }

        /**
         * Setter for contract.
         * @param  contract  Contract2 value for contract.
         * @return Builder
         */
        public Builder contract(Contract2 contract) {
            this.contract = contract;
            return this;
        }

        /**
         * Setter for orderedArticle.
         * @param  orderedArticle  OrderedArticle value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Builds a new {@link ReferencedOrder} object using the set fields.
         * @return {@link ReferencedOrder}
         */
        public ReferencedOrder build() {
            return new ReferencedOrder(supplierOrderNumber, orderReference, contract,
                    orderedArticle);
        }
    }
}
