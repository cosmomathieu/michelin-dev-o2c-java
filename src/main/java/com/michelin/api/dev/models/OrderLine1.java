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
 * This is a model class for OrderLine1 type.
 */
public class OrderLine1 {
    private String lineID;
    private String suppliersOrderLineID;
    private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;
    private OrderedArticle3 orderedArticle;

    /**
     * Default constructor.
     */
    public OrderLine1() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle3 value for orderedArticle.
     * @param  suppliersOrderLineID  String value for suppliersOrderLineID.
     * @param  additionalCustomerReferenceNumber  AdditionalCustomerReferenceNumber value for
     *         additionalCustomerReferenceNumber.
     */
    public OrderLine1(
            String lineID,
            OrderedArticle3 orderedArticle,
            String suppliersOrderLineID,
            AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
        this.lineID = lineID;
        this.suppliersOrderLineID = suppliersOrderLineID;
        this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
        this.orderedArticle = orderedArticle;
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
     * Getter for SuppliersOrderLineID.
     * @return Returns the String
     */
    @JsonGetter("SuppliersOrderLineID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuppliersOrderLineID() {
        return suppliersOrderLineID;
    }

    /**
     * Setter for SuppliersOrderLineID.
     * @param suppliersOrderLineID Value for String
     */
    @JsonSetter("SuppliersOrderLineID")
    public void setSuppliersOrderLineID(String suppliersOrderLineID) {
        this.suppliersOrderLineID = suppliersOrderLineID;
    }

    /**
     * Getter for AdditionalCustomerReferenceNumber.
     * @return Returns the AdditionalCustomerReferenceNumber
     */
    @JsonGetter("AdditionalCustomerReferenceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AdditionalCustomerReferenceNumber getAdditionalCustomerReferenceNumber() {
        return additionalCustomerReferenceNumber;
    }

    /**
     * Setter for AdditionalCustomerReferenceNumber.
     * @param additionalCustomerReferenceNumber Value for AdditionalCustomerReferenceNumber
     */
    @JsonSetter("AdditionalCustomerReferenceNumber")
    public void setAdditionalCustomerReferenceNumber(AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
        this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle3
     */
    @JsonGetter("OrderedArticle")
    public OrderedArticle3 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle3
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle3 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this OrderLine1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLine1 [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle
                + ", suppliersOrderLineID=" + suppliersOrderLineID
                + ", additionalCustomerReferenceNumber=" + additionalCustomerReferenceNumber + "]";
    }

    /**
     * Builds a new {@link OrderLine1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLine1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, orderedArticle)
                .suppliersOrderLineID(getSuppliersOrderLineID())
                .additionalCustomerReferenceNumber(getAdditionalCustomerReferenceNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLine1}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle3 orderedArticle;
        private String suppliersOrderLineID;
        private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  orderedArticle  OrderedArticle3 value for orderedArticle.
         */
        public Builder(String lineID, OrderedArticle3 orderedArticle) {
            this.lineID = lineID;
            this.orderedArticle = orderedArticle;
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
         * Setter for orderedArticle.
         * @param  orderedArticle  OrderedArticle3 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle3 orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Setter for suppliersOrderLineID.
         * @param  suppliersOrderLineID  String value for suppliersOrderLineID.
         * @return Builder
         */
        public Builder suppliersOrderLineID(String suppliersOrderLineID) {
            this.suppliersOrderLineID = suppliersOrderLineID;
            return this;
        }

        /**
         * Setter for additionalCustomerReferenceNumber.
         * @param  additionalCustomerReferenceNumber  AdditionalCustomerReferenceNumber value for
         *         additionalCustomerReferenceNumber.
         * @return Builder
         */
        public Builder additionalCustomerReferenceNumber(
                AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
            this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
            return this;
        }

        /**
         * Builds a new {@link OrderLine1} object using the set fields.
         * @return {@link OrderLine1}
         */
        public OrderLine1 build() {
            return new OrderLine1(lineID, orderedArticle, suppliersOrderLineID,
                    additionalCustomerReferenceNumber);
        }
    }
}
