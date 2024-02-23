/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderLine3 type.
 */
public class OrderLine3 {
    private String lineID;
    private OrderedArticle6 orderedArticle;

    /**
     * Default constructor.
     */
    public OrderLine3() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle6 value for orderedArticle.
     */
    public OrderLine3(
            String lineID,
            OrderedArticle6 orderedArticle) {
        this.lineID = lineID;
        this.orderedArticle = orderedArticle;
    }

    /**
     * Getter for LineID.
     * @return Returns the String
     */
    @JsonGetter("lineID")
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
     * @return Returns the OrderedArticle6
     */
    @JsonGetter("orderedArticle")
    public OrderedArticle6 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle6
     */
    @JsonSetter("orderedArticle")
    public void setOrderedArticle(OrderedArticle6 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this OrderLine3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLine3 [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle + "]";
    }

    /**
     * Builds a new {@link OrderLine3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLine3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, orderedArticle);
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLine3}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle6 orderedArticle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  orderedArticle  OrderedArticle6 value for orderedArticle.
         */
        public Builder(String lineID, OrderedArticle6 orderedArticle) {
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
         * @param  orderedArticle  OrderedArticle6 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle6 orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Builds a new {@link OrderLine3} object using the set fields.
         * @return {@link OrderLine3}
         */
        public OrderLine3 build() {
            return new OrderLine3(lineID, orderedArticle);
        }
    }
}
