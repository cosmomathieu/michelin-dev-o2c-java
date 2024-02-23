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
 * This is a model class for OrderLine2 type.
 */
public class OrderLine2 {
    private String lineID;
    private String customerLineItemNumber;
    private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;
    private OrderedArticle5 orderedArticle;

    /**
     * Default constructor.
     */
    public OrderLine2() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle5 value for orderedArticle.
     * @param  customerLineItemNumber  String value for customerLineItemNumber.
     * @param  additionalCustomerReferenceNumber  AdditionalCustomerReferenceNumber value for
     *         additionalCustomerReferenceNumber.
     */
    public OrderLine2(
            String lineID,
            OrderedArticle5 orderedArticle,
            String customerLineItemNumber,
            AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
        this.lineID = lineID;
        this.customerLineItemNumber = customerLineItemNumber;
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
     * Getter for CustomerLineItemNumber.
     * @return Returns the String
     */
    @JsonGetter("CustomerLineItemNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerLineItemNumber() {
        return customerLineItemNumber;
    }

    /**
     * Setter for CustomerLineItemNumber.
     * @param customerLineItemNumber Value for String
     */
    @JsonSetter("CustomerLineItemNumber")
    public void setCustomerLineItemNumber(String customerLineItemNumber) {
        this.customerLineItemNumber = customerLineItemNumber;
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
     * @return Returns the OrderedArticle5
     */
    @JsonGetter("OrderedArticle")
    public OrderedArticle5 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle5
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle5 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this OrderLine2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLine2 [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle
                + ", customerLineItemNumber=" + customerLineItemNumber
                + ", additionalCustomerReferenceNumber=" + additionalCustomerReferenceNumber + "]";
    }

    /**
     * Builds a new {@link OrderLine2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLine2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, orderedArticle)
                .customerLineItemNumber(getCustomerLineItemNumber())
                .additionalCustomerReferenceNumber(getAdditionalCustomerReferenceNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLine2}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle5 orderedArticle;
        private String customerLineItemNumber;
        private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  orderedArticle  OrderedArticle5 value for orderedArticle.
         */
        public Builder(String lineID, OrderedArticle5 orderedArticle) {
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
         * @param  orderedArticle  OrderedArticle5 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle5 orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Setter for customerLineItemNumber.
         * @param  customerLineItemNumber  String value for customerLineItemNumber.
         * @return Builder
         */
        public Builder customerLineItemNumber(String customerLineItemNumber) {
            this.customerLineItemNumber = customerLineItemNumber;
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
         * Builds a new {@link OrderLine2} object using the set fields.
         * @return {@link OrderLine2}
         */
        public OrderLine2 build() {
            return new OrderLine2(lineID, orderedArticle, customerLineItemNumber,
                    additionalCustomerReferenceNumber);
        }
    }
}
