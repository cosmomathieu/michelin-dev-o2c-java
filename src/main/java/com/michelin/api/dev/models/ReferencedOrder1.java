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
 * This is a model class for ReferencedOrder1 type.
 */
public class ReferencedOrder1 {
    private Error1 error;
    private String orderDate;
    private SupplierOrderNumber1 supplierOrderNumber;
    private String orderingMethod;
    private OrderReference orderReference;
    private String pickUp;
    private String deliveryOption;
    private SellerParty sellerParty;
    private SupplierParty5 supplierParty;
    private Contract contract;
    private List<OrderLine2> orderLine;

    /**
     * Default constructor.
     */
    public ReferencedOrder1() {
    }

    /**
     * Initialization constructor.
     * @param  error  Error1 value for error.
     * @param  orderDate  String value for orderDate.
     * @param  supplierOrderNumber  SupplierOrderNumber1 value for supplierOrderNumber.
     * @param  orderingMethod  String value for orderingMethod.
     * @param  orderReference  OrderReference value for orderReference.
     * @param  pickUp  String value for pickUp.
     * @param  deliveryOption  String value for deliveryOption.
     * @param  sellerParty  SellerParty value for sellerParty.
     * @param  supplierParty  SupplierParty5 value for supplierParty.
     * @param  contract  Contract value for contract.
     * @param  orderLine  List of OrderLine2 value for orderLine.
     */
    public ReferencedOrder1(
            Error1 error,
            String orderDate,
            SupplierOrderNumber1 supplierOrderNumber,
            String orderingMethod,
            OrderReference orderReference,
            String pickUp,
            String deliveryOption,
            SellerParty sellerParty,
            SupplierParty5 supplierParty,
            Contract contract,
            List<OrderLine2> orderLine) {
        this.error = error;
        this.orderDate = orderDate;
        this.supplierOrderNumber = supplierOrderNumber;
        this.orderingMethod = orderingMethod;
        this.orderReference = orderReference;
        this.pickUp = pickUp;
        this.deliveryOption = deliveryOption;
        this.sellerParty = sellerParty;
        this.supplierParty = supplierParty;
        this.contract = contract;
        this.orderLine = orderLine;
    }

    /**
     * Getter for Error.
     * @return Returns the Error1
     */
    @JsonGetter("Error")
    public Error1 getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for Error1
     */
    @JsonSetter("Error")
    public void setError(Error1 error) {
        this.error = error;
    }

    /**
     * Getter for OrderDate.
     * @return Returns the String
     */
    @JsonGetter("OrderDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Setter for OrderDate.
     * @param orderDate Value for String
     */
    @JsonSetter("OrderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Getter for SupplierOrderNumber.
     * @return Returns the SupplierOrderNumber1
     */
    @JsonGetter("SupplierOrderNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierOrderNumber1 getSupplierOrderNumber() {
        return supplierOrderNumber;
    }

    /**
     * Setter for SupplierOrderNumber.
     * @param supplierOrderNumber Value for SupplierOrderNumber1
     */
    @JsonSetter("SupplierOrderNumber")
    public void setSupplierOrderNumber(SupplierOrderNumber1 supplierOrderNumber) {
        this.supplierOrderNumber = supplierOrderNumber;
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
     * Getter for OrderReference.
     * @return Returns the OrderReference
     */
    @JsonGetter("OrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Setter for OrderReference.
     * @param orderReference Value for OrderReference
     */
    @JsonSetter("OrderReference")
    public void setOrderReference(OrderReference orderReference) {
        this.orderReference = orderReference;
    }

    /**
     * Getter for PickUp.
     * @return Returns the String
     */
    @JsonGetter("PickUp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPickUp() {
        return pickUp;
    }

    /**
     * Setter for PickUp.
     * @param pickUp Value for String
     */
    @JsonSetter("PickUp")
    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    /**
     * Getter for DeliveryOption.
     * @return Returns the String
     */
    @JsonGetter("DeliveryOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Setter for DeliveryOption.
     * @param deliveryOption Value for String
     */
    @JsonSetter("DeliveryOption")
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
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
     * Getter for SupplierParty.
     * @return Returns the SupplierParty5
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty5 getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty5
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty5 supplierParty) {
        this.supplierParty = supplierParty;
    }

    /**
     * Getter for Contract.
     * @return Returns the Contract
     */
    @JsonGetter("Contract")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Contract getContract() {
        return contract;
    }

    /**
     * Setter for Contract.
     * @param contract Value for Contract
     */
    @JsonSetter("Contract")
    public void setContract(Contract contract) {
        this.contract = contract;
    }

    /**
     * Getter for OrderLine.
     * @return Returns the List of OrderLine2
     */
    @JsonGetter("OrderLine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderLine2> getOrderLine() {
        return orderLine;
    }

    /**
     * Setter for OrderLine.
     * @param orderLine Value for List of OrderLine2
     */
    @JsonSetter("OrderLine")
    public void setOrderLine(List<OrderLine2> orderLine) {
        this.orderLine = orderLine;
    }

    /**
     * Converts this ReferencedOrder1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReferencedOrder1 [" + "error=" + error + ", orderDate=" + orderDate
                + ", supplierOrderNumber=" + supplierOrderNumber + ", orderingMethod="
                + orderingMethod + ", orderReference=" + orderReference + ", pickUp=" + pickUp
                + ", deliveryOption=" + deliveryOption + ", sellerParty=" + sellerParty
                + ", supplierParty=" + supplierParty + ", contract=" + contract + ", orderLine="
                + orderLine + "]";
    }

    /**
     * Builds a new {@link ReferencedOrder1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReferencedOrder1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(error)
                .orderDate(getOrderDate())
                .supplierOrderNumber(getSupplierOrderNumber())
                .orderingMethod(getOrderingMethod())
                .orderReference(getOrderReference())
                .pickUp(getPickUp())
                .deliveryOption(getDeliveryOption())
                .sellerParty(getSellerParty())
                .supplierParty(getSupplierParty())
                .contract(getContract())
                .orderLine(getOrderLine());
        return builder;
    }

    /**
     * Class to build instances of {@link ReferencedOrder1}.
     */
    public static class Builder {
        private Error1 error;
        private String orderDate;
        private SupplierOrderNumber1 supplierOrderNumber;
        private String orderingMethod;
        private OrderReference orderReference;
        private String pickUp;
        private String deliveryOption;
        private SellerParty sellerParty;
        private SupplierParty5 supplierParty;
        private Contract contract;
        private List<OrderLine2> orderLine;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  error  Error1 value for error.
         */
        public Builder(Error1 error) {
            this.error = error;
        }

        /**
         * Setter for error.
         * @param  error  Error1 value for error.
         * @return Builder
         */
        public Builder error(Error1 error) {
            this.error = error;
            return this;
        }

        /**
         * Setter for orderDate.
         * @param  orderDate  String value for orderDate.
         * @return Builder
         */
        public Builder orderDate(String orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        /**
         * Setter for supplierOrderNumber.
         * @param  supplierOrderNumber  SupplierOrderNumber1 value for supplierOrderNumber.
         * @return Builder
         */
        public Builder supplierOrderNumber(SupplierOrderNumber1 supplierOrderNumber) {
            this.supplierOrderNumber = supplierOrderNumber;
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
         * Setter for orderReference.
         * @param  orderReference  OrderReference value for orderReference.
         * @return Builder
         */
        public Builder orderReference(OrderReference orderReference) {
            this.orderReference = orderReference;
            return this;
        }

        /**
         * Setter for pickUp.
         * @param  pickUp  String value for pickUp.
         * @return Builder
         */
        public Builder pickUp(String pickUp) {
            this.pickUp = pickUp;
            return this;
        }

        /**
         * Setter for deliveryOption.
         * @param  deliveryOption  String value for deliveryOption.
         * @return Builder
         */
        public Builder deliveryOption(String deliveryOption) {
            this.deliveryOption = deliveryOption;
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
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty5 value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty5 supplierParty) {
            this.supplierParty = supplierParty;
            return this;
        }

        /**
         * Setter for contract.
         * @param  contract  Contract value for contract.
         * @return Builder
         */
        public Builder contract(Contract contract) {
            this.contract = contract;
            return this;
        }

        /**
         * Setter for orderLine.
         * @param  orderLine  List of OrderLine2 value for orderLine.
         * @return Builder
         */
        public Builder orderLine(List<OrderLine2> orderLine) {
            this.orderLine = orderLine;
            return this;
        }

        /**
         * Builds a new {@link ReferencedOrder1} object using the set fields.
         * @return {@link ReferencedOrder1}
         */
        public ReferencedOrder1 build() {
            return new ReferencedOrder1(error, orderDate, supplierOrderNumber, orderingMethod,
                    orderReference, pickUp, deliveryOption, sellerParty, supplierParty, contract,
                    orderLine);
        }
    }
}
