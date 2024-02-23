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
 * This is a model class for LineLevel type.
 */
public class LineLevel {
    private String lineID;
    private String orderingMethod;
    private List<References2> references;
    private OrderedArticle1 orderedArticle;

    /**
     * Default constructor.
     */
    public LineLevel() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle1 value for orderedArticle.
     * @param  orderingMethod  String value for orderingMethod.
     * @param  references  List of References2 value for references.
     */
    public LineLevel(
            String lineID,
            OrderedArticle1 orderedArticle,
            String orderingMethod,
            List<References2> references) {
        this.lineID = lineID;
        this.orderingMethod = orderingMethod;
        this.references = references;
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
     * Getter for References.
     * @return Returns the List of References2
     */
    @JsonGetter("References")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<References2> getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for List of References2
     */
    @JsonSetter("References")
    public void setReferences(List<References2> references) {
        this.references = references;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle1
     */
    @JsonGetter("OrderedArticle")
    public OrderedArticle1 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle1
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle1 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this LineLevel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LineLevel [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle
                + ", orderingMethod=" + orderingMethod + ", references=" + references + "]";
    }

    /**
     * Builds a new {@link LineLevel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LineLevel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, orderedArticle)
                .orderingMethod(getOrderingMethod())
                .references(getReferences());
        return builder;
    }

    /**
     * Class to build instances of {@link LineLevel}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle1 orderedArticle;
        private String orderingMethod;
        private List<References2> references;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  orderedArticle  OrderedArticle1 value for orderedArticle.
         */
        public Builder(String lineID, OrderedArticle1 orderedArticle) {
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
         * @param  orderedArticle  OrderedArticle1 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle1 orderedArticle) {
            this.orderedArticle = orderedArticle;
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
         * Setter for references.
         * @param  references  List of References2 value for references.
         * @return Builder
         */
        public Builder references(List<References2> references) {
            this.references = references;
            return this;
        }

        /**
         * Builds a new {@link LineLevel} object using the set fields.
         * @return {@link LineLevel}
         */
        public LineLevel build() {
            return new LineLevel(lineID, orderedArticle, orderingMethod, references);
        }
    }
}
