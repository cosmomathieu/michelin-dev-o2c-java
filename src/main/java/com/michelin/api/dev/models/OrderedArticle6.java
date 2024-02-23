/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for OrderedArticle6 type.
 */
public class OrderedArticle6 {
    private RequestedQuantity1 requestedQuantity;
    private OptionalNullable<String> requestedDeliveryTime;
    private String requestedDeliveryDate;
    private ArticleIdentification7 articleIdentification;

    /**
     * Default constructor.
     */
    public OrderedArticle6() {
    }

    /**
     * Initialization constructor.
     * @param  requestedQuantity  RequestedQuantity1 value for requestedQuantity.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     * @param  articleIdentification  ArticleIdentification7 value for articleIdentification.
     */
    public OrderedArticle6(
            RequestedQuantity1 requestedQuantity,
            String requestedDeliveryDate,
            String requestedDeliveryTime,
            ArticleIdentification7 articleIdentification) {
        this.requestedQuantity = requestedQuantity;
        this.requestedDeliveryTime = OptionalNullable.of(requestedDeliveryTime);
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.articleIdentification = articleIdentification;
    }

    /**
     * Initialization constructor.
     * @param  requestedQuantity  RequestedQuantity1 value for requestedQuantity.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     * @param  articleIdentification  ArticleIdentification7 value for articleIdentification.
     */

    protected OrderedArticle6(RequestedQuantity1 requestedQuantity, String requestedDeliveryDate,
            OptionalNullable<String> requestedDeliveryTime,
            ArticleIdentification7 articleIdentification) {
        this.requestedQuantity = requestedQuantity;
        this.requestedDeliveryTime = requestedDeliveryTime;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.articleIdentification = articleIdentification;
    }

    /**
     * Getter for RequestedQuantity.
     * @return Returns the RequestedQuantity1
     */
    @JsonGetter("requestedQuantity")
    public RequestedQuantity1 getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Setter for RequestedQuantity.
     * @param requestedQuantity Value for RequestedQuantity1
     */
    @JsonSetter("requestedQuantity")
    public void setRequestedQuantity(RequestedQuantity1 requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    /**
     * Internal Getter for RequestedDeliveryTime.
     * @return Returns the Internal String
     */
    @JsonGetter("requestedDeliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRequestedDeliveryTime() {
        return this.requestedDeliveryTime;
    }

    /**
     * Getter for RequestedDeliveryTime.
     * @return Returns the String
     */
    public String getRequestedDeliveryTime() {
        return OptionalNullable.getFrom(requestedDeliveryTime);
    }

    /**
     * Setter for RequestedDeliveryTime.
     * @param requestedDeliveryTime Value for String
     */
    @JsonSetter("requestedDeliveryTime")
    public void setRequestedDeliveryTime(String requestedDeliveryTime) {
        this.requestedDeliveryTime = OptionalNullable.of(requestedDeliveryTime);
    }

    /**
     * UnSetter for RequestedDeliveryTime.
     */
    public void unsetRequestedDeliveryTime() {
        requestedDeliveryTime = null;
    }

    /**
     * Getter for RequestedDeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("requestedDeliveryDate")
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Setter for RequestedDeliveryDate.
     * @param requestedDeliveryDate Value for String
     */
    @JsonSetter("requestedDeliveryDate")
    public void setRequestedDeliveryDate(String requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    /**
     * Getter for ArticleIdentification.
     * @return Returns the ArticleIdentification7
     */
    @JsonGetter("articleIdentification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArticleIdentification7 getArticleIdentification() {
        return articleIdentification;
    }

    /**
     * Setter for ArticleIdentification.
     * @param articleIdentification Value for ArticleIdentification7
     */
    @JsonSetter("articleIdentification")
    public void setArticleIdentification(ArticleIdentification7 articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Converts this OrderedArticle6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle6 [" + "requestedQuantity=" + requestedQuantity
                + ", requestedDeliveryDate=" + requestedDeliveryDate + ", requestedDeliveryTime="
                + requestedDeliveryTime + ", articleIdentification=" + articleIdentification + "]";
    }

    /**
     * Builds a new {@link OrderedArticle6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(requestedQuantity, requestedDeliveryDate)
                .articleIdentification(getArticleIdentification());
        builder.requestedDeliveryTime = internalGetRequestedDeliveryTime();
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle6}.
     */
    public static class Builder {
        private RequestedQuantity1 requestedQuantity;
        private String requestedDeliveryDate;
        private OptionalNullable<String> requestedDeliveryTime;
        private ArticleIdentification7 articleIdentification;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  requestedQuantity  RequestedQuantity1 value for requestedQuantity.
         * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
         */
        public Builder(RequestedQuantity1 requestedQuantity, String requestedDeliveryDate) {
            this.requestedQuantity = requestedQuantity;
            this.requestedDeliveryDate = requestedDeliveryDate;
        }

        /**
         * Setter for requestedQuantity.
         * @param  requestedQuantity  RequestedQuantity1 value for requestedQuantity.
         * @return Builder
         */
        public Builder requestedQuantity(RequestedQuantity1 requestedQuantity) {
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
            this.requestedDeliveryTime = OptionalNullable.of(requestedDeliveryTime);
            return this;
        }

        /**
         * UnSetter for requestedDeliveryTime.
         * @return Builder
         */
        public Builder unsetRequestedDeliveryTime() {
            requestedDeliveryTime = null;
            return this;
        }

        /**
         * Setter for articleIdentification.
         * @param  articleIdentification  ArticleIdentification7 value for articleIdentification.
         * @return Builder
         */
        public Builder articleIdentification(ArticleIdentification7 articleIdentification) {
            this.articleIdentification = articleIdentification;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle6} object using the set fields.
         * @return {@link OrderedArticle6}
         */
        public OrderedArticle6 build() {
            return new OrderedArticle6(requestedQuantity, requestedDeliveryDate,
                    requestedDeliveryTime, articleIdentification);
        }
    }
}
