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
 * This is a model class for OrderLine4 type.
 */
public class OrderLine4 {
    private String lineID;
    private OrderedArticle7 orderedArticle;

    /**
     * Default constructor.
     */
    public OrderLine4() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle7 value for orderedArticle.
     */
    public OrderLine4(
            String lineID,
            OrderedArticle7 orderedArticle) {
        this.lineID = lineID;
        this.orderedArticle = orderedArticle;
    }

    /**
     * Getter for LineID.
     * @return Returns the String
     */
    @JsonGetter("lineID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLineID() {
        return lineID;
    }

    /**
     * Setter for LineID.
     * @param lineID Value for String
     */
    @JsonSetter("lineID")
    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle7
     */
    @JsonGetter("orderedArticle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderedArticle7 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle7
     */
    @JsonSetter("orderedArticle")
    public void setOrderedArticle(OrderedArticle7 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this OrderLine4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLine4 [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle + "]";
    }

    /**
     * Builds a new {@link OrderLine4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLine4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .lineID(getLineID())
                .orderedArticle(getOrderedArticle());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLine4}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle7 orderedArticle;



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
         * @param  orderedArticle  OrderedArticle7 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle7 orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Builds a new {@link OrderLine4} object using the set fields.
         * @return {@link OrderLine4}
         */
        public OrderLine4 build() {
            return new OrderLine4(lineID, orderedArticle);
        }
    }
}
