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
 * This is a model class for OrderedArticle1 type.
 */
public class OrderedArticle1 {
    private ArticleIdentification articleIdentification;
    private ArticleDescription articleDescription;
    private DespatchedQuantity despatchedQuantity;
    private List<String> deliveryOption;
    private List<TracingInformation> tracingInformation;

    /**
     * Default constructor.
     */
    public OrderedArticle1() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification value for articleIdentification.
     * @param  articleDescription  ArticleDescription value for articleDescription.
     * @param  despatchedQuantity  DespatchedQuantity value for despatchedQuantity.
     * @param  deliveryOption  List of String value for deliveryOption.
     * @param  tracingInformation  List of TracingInformation value for tracingInformation.
     */
    public OrderedArticle1(
            ArticleIdentification articleIdentification,
            ArticleDescription articleDescription,
            DespatchedQuantity despatchedQuantity,
            List<String> deliveryOption,
            List<TracingInformation> tracingInformation) {
        this.articleIdentification = articleIdentification;
        this.articleDescription = articleDescription;
        this.despatchedQuantity = despatchedQuantity;
        this.deliveryOption = deliveryOption;
        this.tracingInformation = tracingInformation;
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
     * Getter for ArticleDescription.
     * @return Returns the ArticleDescription
     */
    @JsonGetter("ArticleDescription")
    public ArticleDescription getArticleDescription() {
        return articleDescription;
    }

    /**
     * Setter for ArticleDescription.
     * @param articleDescription Value for ArticleDescription
     */
    @JsonSetter("ArticleDescription")
    public void setArticleDescription(ArticleDescription articleDescription) {
        this.articleDescription = articleDescription;
    }

    /**
     * Getter for DespatchedQuantity.
     * @return Returns the DespatchedQuantity
     */
    @JsonGetter("DespatchedQuantity")
    public DespatchedQuantity getDespatchedQuantity() {
        return despatchedQuantity;
    }

    /**
     * Setter for DespatchedQuantity.
     * @param despatchedQuantity Value for DespatchedQuantity
     */
    @JsonSetter("DespatchedQuantity")
    public void setDespatchedQuantity(DespatchedQuantity despatchedQuantity) {
        this.despatchedQuantity = despatchedQuantity;
    }

    /**
     * Getter for DeliveryOption.
     * @return Returns the List of String
     */
    @JsonGetter("DeliveryOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Setter for DeliveryOption.
     * @param deliveryOption Value for List of String
     */
    @JsonSetter("DeliveryOption")
    public void setDeliveryOption(List<String> deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    /**
     * Getter for TracingInformation.
     * @return Returns the List of TracingInformation
     */
    @JsonGetter("TracingInformation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TracingInformation> getTracingInformation() {
        return tracingInformation;
    }

    /**
     * Setter for TracingInformation.
     * @param tracingInformation Value for List of TracingInformation
     */
    @JsonSetter("TracingInformation")
    public void setTracingInformation(List<TracingInformation> tracingInformation) {
        this.tracingInformation = tracingInformation;
    }

    /**
     * Converts this OrderedArticle1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle1 [" + "articleIdentification=" + articleIdentification
                + ", articleDescription=" + articleDescription + ", despatchedQuantity="
                + despatchedQuantity + ", deliveryOption=" + deliveryOption
                + ", tracingInformation=" + tracingInformation + "]";
    }

    /**
     * Builds a new {@link OrderedArticle1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification, articleDescription, despatchedQuantity)
                .deliveryOption(getDeliveryOption())
                .tracingInformation(getTracingInformation());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle1}.
     */
    public static class Builder {
        private ArticleIdentification articleIdentification;
        private ArticleDescription articleDescription;
        private DespatchedQuantity despatchedQuantity;
        private List<String> deliveryOption;
        private List<TracingInformation> tracingInformation;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         * @param  articleDescription  ArticleDescription value for articleDescription.
         * @param  despatchedQuantity  DespatchedQuantity value for despatchedQuantity.
         */
        public Builder(ArticleIdentification articleIdentification,
                ArticleDescription articleDescription, DespatchedQuantity despatchedQuantity) {
            this.articleIdentification = articleIdentification;
            this.articleDescription = articleDescription;
            this.despatchedQuantity = despatchedQuantity;
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
         * Setter for articleDescription.
         * @param  articleDescription  ArticleDescription value for articleDescription.
         * @return Builder
         */
        public Builder articleDescription(ArticleDescription articleDescription) {
            this.articleDescription = articleDescription;
            return this;
        }

        /**
         * Setter for despatchedQuantity.
         * @param  despatchedQuantity  DespatchedQuantity value for despatchedQuantity.
         * @return Builder
         */
        public Builder despatchedQuantity(DespatchedQuantity despatchedQuantity) {
            this.despatchedQuantity = despatchedQuantity;
            return this;
        }

        /**
         * Setter for deliveryOption.
         * @param  deliveryOption  List of String value for deliveryOption.
         * @return Builder
         */
        public Builder deliveryOption(List<String> deliveryOption) {
            this.deliveryOption = deliveryOption;
            return this;
        }

        /**
         * Setter for tracingInformation.
         * @param  tracingInformation  List of TracingInformation value for tracingInformation.
         * @return Builder
         */
        public Builder tracingInformation(List<TracingInformation> tracingInformation) {
            this.tracingInformation = tracingInformation;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle1} object using the set fields.
         * @return {@link OrderedArticle1}
         */
        public OrderedArticle1 build() {
            return new OrderedArticle1(articleIdentification, articleDescription,
                    despatchedQuantity, deliveryOption, tracingInformation);
        }
    }
}
