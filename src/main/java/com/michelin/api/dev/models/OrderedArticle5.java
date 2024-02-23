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
 * This is a model class for OrderedArticle5 type.
 */
public class OrderedArticle5 {
    private ArticleIdentification articleIdentification;
    private ArticleDescription1 articleDescription;
    private String requestedDeliveryDate;
    private String requestedDeliveryTime;
    private String articleComment;
    private List<ScheduleDetail1> scheduleDetails;
    private OrderedQuantity orderedQuantity;

    /**
     * Default constructor.
     */
    public OrderedArticle5() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification value for articleIdentification.
     * @param  articleDescription  ArticleDescription1 value for articleDescription.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     * @param  articleComment  String value for articleComment.
     * @param  scheduleDetails  List of ScheduleDetail1 value for scheduleDetails.
     * @param  orderedQuantity  OrderedQuantity value for orderedQuantity.
     */
    public OrderedArticle5(
            ArticleIdentification articleIdentification,
            ArticleDescription1 articleDescription,
            String requestedDeliveryDate,
            String requestedDeliveryTime,
            String articleComment,
            List<ScheduleDetail1> scheduleDetails,
            OrderedQuantity orderedQuantity) {
        this.articleIdentification = articleIdentification;
        this.articleDescription = articleDescription;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.requestedDeliveryTime = requestedDeliveryTime;
        this.articleComment = articleComment;
        this.scheduleDetails = scheduleDetails;
        this.orderedQuantity = orderedQuantity;
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
     * @return Returns the ArticleDescription1
     */
    @JsonGetter("ArticleDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArticleDescription1 getArticleDescription() {
        return articleDescription;
    }

    /**
     * Setter for ArticleDescription.
     * @param articleDescription Value for ArticleDescription1
     */
    @JsonSetter("ArticleDescription")
    public void setArticleDescription(ArticleDescription1 articleDescription) {
        this.articleDescription = articleDescription;
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
     * Getter for ArticleComment.
     * @return Returns the String
     */
    @JsonGetter("ArticleComment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getArticleComment() {
        return articleComment;
    }

    /**
     * Setter for ArticleComment.
     * @param articleComment Value for String
     */
    @JsonSetter("ArticleComment")
    public void setArticleComment(String articleComment) {
        this.articleComment = articleComment;
    }

    /**
     * Getter for ScheduleDetails.
     * @return Returns the List of ScheduleDetail1
     */
    @JsonGetter("ScheduleDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ScheduleDetail1> getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * Setter for ScheduleDetails.
     * @param scheduleDetails Value for List of ScheduleDetail1
     */
    @JsonSetter("ScheduleDetails")
    public void setScheduleDetails(List<ScheduleDetail1> scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * Getter for OrderedQuantity.
     * @return Returns the OrderedQuantity
     */
    @JsonGetter("OrderedQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderedQuantity getOrderedQuantity() {
        return orderedQuantity;
    }

    /**
     * Setter for OrderedQuantity.
     * @param orderedQuantity Value for OrderedQuantity
     */
    @JsonSetter("OrderedQuantity")
    public void setOrderedQuantity(OrderedQuantity orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    /**
     * Converts this OrderedArticle5 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle5 [" + "articleIdentification=" + articleIdentification
                + ", articleDescription=" + articleDescription + ", requestedDeliveryDate="
                + requestedDeliveryDate + ", requestedDeliveryTime=" + requestedDeliveryTime
                + ", articleComment=" + articleComment + ", scheduleDetails=" + scheduleDetails
                + ", orderedQuantity=" + orderedQuantity + "]";
    }

    /**
     * Builds a new {@link OrderedArticle5.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle5.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification)
                .articleDescription(getArticleDescription())
                .requestedDeliveryDate(getRequestedDeliveryDate())
                .requestedDeliveryTime(getRequestedDeliveryTime())
                .articleComment(getArticleComment())
                .scheduleDetails(getScheduleDetails())
                .orderedQuantity(getOrderedQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle5}.
     */
    public static class Builder {
        private ArticleIdentification articleIdentification;
        private ArticleDescription1 articleDescription;
        private String requestedDeliveryDate;
        private String requestedDeliveryTime;
        private String articleComment;
        private List<ScheduleDetail1> scheduleDetails;
        private OrderedQuantity orderedQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         */
        public Builder(ArticleIdentification articleIdentification) {
            this.articleIdentification = articleIdentification;
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
         * @param  articleDescription  ArticleDescription1 value for articleDescription.
         * @return Builder
         */
        public Builder articleDescription(ArticleDescription1 articleDescription) {
            this.articleDescription = articleDescription;
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
         * Setter for articleComment.
         * @param  articleComment  String value for articleComment.
         * @return Builder
         */
        public Builder articleComment(String articleComment) {
            this.articleComment = articleComment;
            return this;
        }

        /**
         * Setter for scheduleDetails.
         * @param  scheduleDetails  List of ScheduleDetail1 value for scheduleDetails.
         * @return Builder
         */
        public Builder scheduleDetails(List<ScheduleDetail1> scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            return this;
        }

        /**
         * Setter for orderedQuantity.
         * @param  orderedQuantity  OrderedQuantity value for orderedQuantity.
         * @return Builder
         */
        public Builder orderedQuantity(OrderedQuantity orderedQuantity) {
            this.orderedQuantity = orderedQuantity;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle5} object using the set fields.
         * @return {@link OrderedArticle5}
         */
        public OrderedArticle5 build() {
            return new OrderedArticle5(articleIdentification, articleDescription,
                    requestedDeliveryDate, requestedDeliveryTime, articleComment, scheduleDetails,
                    orderedQuantity);
        }
    }
}
