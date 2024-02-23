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
 * This is a model class for OrderedArticle2 type.
 */
public class OrderedArticle2 {
    private ArticleIdentification articleIdentification;
    private String requestedDeliveryDate;
    private String requestedDeliveryTime;
    private RequestedQuantity requestedQuantity;

    /**
     * Default constructor.
     */
    public OrderedArticle2() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification value for articleIdentification.
     * @param  requestedQuantity  RequestedQuantity value for requestedQuantity.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     */
    public OrderedArticle2(
            ArticleIdentification articleIdentification,
            RequestedQuantity requestedQuantity,
            String requestedDeliveryDate,
            String requestedDeliveryTime) {
        this.articleIdentification = articleIdentification;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.requestedDeliveryTime = requestedDeliveryTime;
        this.requestedQuantity = requestedQuantity;
    }

    /**
     * Getter for ArticleIdentification.
     * @return Returns the ArticleIdentification
     */
    @JsonGetter("ArticleIdentification")
    public ArticleIdentification getArticleIdentification() {
        return articleIdentification;
    }

    /**
     * Setter for ArticleIdentification.
     * @param articleIdentification Value for ArticleIdentification
     */
    @JsonSetter("ArticleIdentification")
    public void setArticleIdentification(ArticleIdentification articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Getter for RequestedDeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("RequestedDeliveryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Setter for RequestedDeliveryDate.
     * @param requestedDeliveryDate Value for String
     */
    @JsonSetter("RequestedDeliveryDate")
    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    /**
     * Getter for RequestedDeliveryTime.
     * @return Returns the String
     */
    @JsonGetter("RequestedDeliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestedDeliveryTime() {
        return requestedDeliveryTime;
    }

    /**
     * Setter for RequestedDeliveryTime.
     * @param requestedDeliveryTime Value for String
     */
    @JsonSetter("RequestedDeliveryTime")
    public void setRequestedDeliveryTime(String requestedDeliveryTime) {
        this.requestedDeliveryTime = requestedDeliveryTime;
    }

    /**
     * Getter for RequestedQuantity.
     * @return Returns the RequestedQuantity
     */
    @JsonGetter("RequestedQuantity")
    public RequestedQuantity getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Setter for RequestedQuantity.
     * @param requestedQuantity Value for RequestedQuantity
     */
    @JsonSetter("RequestedQuantity")
    public void setRequestedQuantity(RequestedQuantity requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    /**
     * Converts this OrderedArticle2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle2 [" + "articleIdentification=" + articleIdentification
                + ", requestedQuantity=" + requestedQuantity + ", requestedDeliveryDate="
                + requestedDeliveryDate + ", requestedDeliveryTime=" + requestedDeliveryTime + "]";
    }

    /**
     * Builds a new {@link OrderedArticle2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification, requestedQuantity)
                .requestedDeliveryDate(getRequestedDeliveryDate())
                .requestedDeliveryTime(getRequestedDeliveryTime());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle2}.
     */
    public static class Builder {
        private ArticleIdentification articleIdentification;
        private RequestedQuantity requestedQuantity;
        private String requestedDeliveryDate;
        private String requestedDeliveryTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         * @param  requestedQuantity  RequestedQuantity value for requestedQuantity.
         */
        public Builder(ArticleIdentification articleIdentification,
                RequestedQuantity requestedQuantity) {
            this.articleIdentification = articleIdentification;
            this.requestedQuantity = requestedQuantity;
        }

        /**
         * Setter for articleIdentification.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         * @return Builder
         */
        public Builder articleIdentification(ArticleIdentification articleIdentification) {
            this.articleIdentification = articleIdentification;
            return this;
        }

        /**
         * Setter for requestedQuantity.
         * @param  requestedQuantity  RequestedQuantity value for requestedQuantity.
         * @return Builder
         */
        public Builder requestedQuantity(RequestedQuantity requestedQuantity) {
            this.requestedQuantity = requestedQuantity;
            return this;
        }

        /**
         * Setter for requestedDeliveryDate.
         * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
         * @return Builder
         */
        public Builder requestedDeliveryDate(String requestedDeliveryDate) {
            this.requestedDeliveryDate = requestedDeliveryDate;
            return this;
        }

        /**
         * Setter for requestedDeliveryTime.
         * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
         * @return Builder
         */
        public Builder requestedDeliveryTime(String requestedDeliveryTime) {
            this.requestedDeliveryTime = requestedDeliveryTime;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle2} object using the set fields.
         * @return {@link OrderedArticle2}
         */
        public OrderedArticle2 build() {
            return new OrderedArticle2(articleIdentification, requestedQuantity,
                    requestedDeliveryDate, requestedDeliveryTime);
        }
    }
}
