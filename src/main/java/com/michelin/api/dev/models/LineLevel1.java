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
 * This is a model class for LineLevel1 type.
 */
public class LineLevel1 {
    private String lineID;
    private String orderingMethod;
    private References5 references;
    private LineItemNetAmount lineItemNetAmount;
    private Article article;

    /**
     * Default constructor.
     */
    public LineLevel1() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  lineItemNetAmount  LineItemNetAmount value for lineItemNetAmount.
     * @param  article  Article value for article.
     * @param  orderingMethod  String value for orderingMethod.
     * @param  references  References5 value for references.
     */
    public LineLevel1(
            String lineID,
            LineItemNetAmount lineItemNetAmount,
            Article article,
            String orderingMethod,
            References5 references) {
        this.lineID = lineID;
        this.orderingMethod = orderingMethod;
        this.references = references;
        this.lineItemNetAmount = lineItemNetAmount;
        this.article = article;
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
     * @return Returns the References5
     */
    @JsonGetter("References")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public References5 getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for References5
     */
    @JsonSetter("References")
    public void setReferences(References5 references) {
        this.references = references;
    }

    /**
     * Getter for LineItemNetAmount.
     * @return Returns the LineItemNetAmount
     */
    @JsonGetter("LineItemNetAmount")
    public LineItemNetAmount getLineItemNetAmount() {
        return lineItemNetAmount;
    }

    /**
     * Setter for LineItemNetAmount.
     * @param lineItemNetAmount Value for LineItemNetAmount
     */
    @JsonSetter("LineItemNetAmount")
    public void setLineItemNetAmount(LineItemNetAmount lineItemNetAmount) {
        this.lineItemNetAmount = lineItemNetAmount;
    }

    /**
     * Getter for Article.
     * @return Returns the Article
     */
    @JsonGetter("Article")
    public Article getArticle() {
        return article;
    }

    /**
     * Setter for Article.
     * @param article Value for Article
     */
    @JsonSetter("Article")
    public void setArticle(Article article) {
        this.article = article;
    }

    /**
     * Converts this LineLevel1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LineLevel1 [" + "lineID=" + lineID + ", lineItemNetAmount=" + lineItemNetAmount
                + ", article=" + article + ", orderingMethod=" + orderingMethod + ", references="
                + references + "]";
    }

    /**
     * Builds a new {@link LineLevel1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LineLevel1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, lineItemNetAmount, article)
                .orderingMethod(getOrderingMethod())
                .references(getReferences());
        return builder;
    }

    /**
     * Class to build instances of {@link LineLevel1}.
     */
    public static class Builder {
        private String lineID;
        private LineItemNetAmount lineItemNetAmount;
        private Article article;
        private String orderingMethod;
        private References5 references;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  lineItemNetAmount  LineItemNetAmount value for lineItemNetAmount.
         * @param  article  Article value for article.
         */
        public Builder(String lineID, LineItemNetAmount lineItemNetAmount, Article article) {
            this.lineID = lineID;
            this.lineItemNetAmount = lineItemNetAmount;
            this.article = article;
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
         * Setter for lineItemNetAmount.
         * @param  lineItemNetAmount  LineItemNetAmount value for lineItemNetAmount.
         * @return Builder
         */
        public Builder lineItemNetAmount(LineItemNetAmount lineItemNetAmount) {
            this.lineItemNetAmount = lineItemNetAmount;
            return this;
        }

        /**
         * Setter for article.
         * @param  article  Article value for article.
         * @return Builder
         */
        public Builder article(Article article) {
            this.article = article;
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
         * @param  references  References5 value for references.
         * @return Builder
         */
        public Builder references(References5 references) {
            this.references = references;
            return this;
        }

        /**
         * Builds a new {@link LineLevel1} object using the set fields.
         * @return {@link LineLevel1}
         */
        public LineLevel1 build() {
            return new LineLevel1(lineID, lineItemNetAmount, article, orderingMethod, references);
        }
    }
}
