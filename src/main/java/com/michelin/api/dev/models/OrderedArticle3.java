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
 * This is a model class for OrderedArticle3 type.
 */
public class OrderedArticle3 {
    private ArticleIdentification articleIdentification;
    private ArticleDescription1 articleDescription;
    private String requestedDeliveryDate;
    private String requestedDeliveryTime;
    private String availability;
    private String articleComment;
    private OrderReference orderReference;
    private Error error;
    private List<ScheduleDetail> scheduleDetails;
    private KilledQuantity killedQuantity;
    private OrderedQuantity orderedQuantity;

    /**
     * Default constructor.
     */
    public OrderedArticle3() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification value for articleIdentification.
     * @param  articleDescription  ArticleDescription1 value for articleDescription.
     * @param  orderReference  OrderReference value for orderReference.
     * @param  error  Error value for error.
     * @param  scheduleDetails  List of ScheduleDetail value for scheduleDetails.
     * @param  orderedQuantity  OrderedQuantity value for orderedQuantity.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     * @param  availability  String value for availability.
     * @param  articleComment  String value for articleComment.
     * @param  killedQuantity  KilledQuantity value for killedQuantity.
     */
    public OrderedArticle3(
            ArticleIdentification articleIdentification,
            ArticleDescription1 articleDescription,
            OrderReference orderReference,
            Error error,
            List<ScheduleDetail> scheduleDetails,
            OrderedQuantity orderedQuantity,
            String requestedDeliveryDate,
            String requestedDeliveryTime,
            String availability,
            String articleComment,
            KilledQuantity killedQuantity) {
        this.articleIdentification = articleIdentification;
        this.articleDescription = articleDescription;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.requestedDeliveryTime = requestedDeliveryTime;
        this.availability = availability;
        this.articleComment = articleComment;
        this.orderReference = orderReference;
        this.error = error;
        this.scheduleDetails = scheduleDetails;
        this.killedQuantity = killedQuantity;
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
     * Getter for Availability.
     * @return Returns the String
     */
    @JsonGetter("Availability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAvailability() {
        return availability;
    }

    /**
     * Setter for Availability.
     * @param availability Value for String
     */
    @JsonSetter("Availability")
    public void setAvailability(String availability) {
        this.availability = availability;
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
     * Getter for OrderReference.
     * @return Returns the OrderReference
     */
    @JsonGetter("OrderReference")
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Setter for OrderReference.
     * @param orderReference Value for OrderReference
     */
    @JsonSetter("OrderReference")
    public void setOrderReference(OrderReference orderReference) {
        this.orderReference = orderReference;
    }

    /**
     * Getter for Error.
     * @return Returns the Error
     */
    @JsonGetter("Error")
    public Error getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for Error
     */
    @JsonSetter("Error")
    public void setError(Error error) {
        this.error = error;
    }

    /**
     * Getter for ScheduleDetails.
     * @return Returns the List of ScheduleDetail
     */
    @JsonGetter("ScheduleDetails")
    public List<ScheduleDetail> getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * Setter for ScheduleDetails.
     * @param scheduleDetails Value for List of ScheduleDetail
     */
    @JsonSetter("ScheduleDetails")
    public void setScheduleDetails(List<ScheduleDetail> scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * Getter for KilledQuantity.
     * @return Returns the KilledQuantity
     */
    @JsonGetter("KilledQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public KilledQuantity getKilledQuantity() {
        return killedQuantity;
    }

    /**
     * Setter for KilledQuantity.
     * @param killedQuantity Value for KilledQuantity
     */
    @JsonSetter("KilledQuantity")
    public void setKilledQuantity(KilledQuantity killedQuantity) {
        this.killedQuantity = killedQuantity;
    }

    /**
     * Getter for OrderedQuantity.
     * @return Returns the OrderedQuantity
     */
    @JsonGetter("OrderedQuantity")
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
     * Converts this OrderedArticle3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle3 [" + "articleIdentification=" + articleIdentification
                + ", articleDescription=" + articleDescription + ", orderReference="
                + orderReference + ", error=" + error + ", scheduleDetails=" + scheduleDetails
                + ", orderedQuantity=" + orderedQuantity + ", requestedDeliveryDate="
                + requestedDeliveryDate + ", requestedDeliveryTime=" + requestedDeliveryTime
                + ", availability=" + availability + ", articleComment=" + articleComment
                + ", killedQuantity=" + killedQuantity + "]";
    }

    /**
     * Builds a new {@link OrderedArticle3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification, articleDescription, orderReference,
                error, scheduleDetails, orderedQuantity)
                .requestedDeliveryDate(getRequestedDeliveryDate())
                .requestedDeliveryTime(getRequestedDeliveryTime())
                .availability(getAvailability())
                .articleComment(getArticleComment())
                .killedQuantity(getKilledQuantity());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle3}.
     */
    public static class Builder {
        private ArticleIdentification articleIdentification;
        private ArticleDescription1 articleDescription;
        private OrderReference orderReference;
        private Error error;
        private List<ScheduleDetail> scheduleDetails;
        private OrderedQuantity orderedQuantity;
        private String requestedDeliveryDate;
        private String requestedDeliveryTime;
        private String availability;
        private String articleComment;
        private KilledQuantity killedQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         * @param  articleDescription  ArticleDescription1 value for articleDescription.
         * @param  orderReference  OrderReference value for orderReference.
         * @param  error  Error value for error.
         * @param  scheduleDetails  List of ScheduleDetail value for scheduleDetails.
         * @param  orderedQuantity  OrderedQuantity value for orderedQuantity.
         */
        public Builder(ArticleIdentification articleIdentification,
                ArticleDescription1 articleDescription, OrderReference orderReference, Error error,
                List<ScheduleDetail> scheduleDetails, OrderedQuantity orderedQuantity) {
            this.articleIdentification = articleIdentification;
            this.articleDescription = articleDescription;
            this.orderReference = orderReference;
            this.error = error;
            this.scheduleDetails = scheduleDetails;
            this.orderedQuantity = orderedQuantity;
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
         * Setter for orderReference.
         * @param  orderReference  OrderReference value for orderReference.
         * @return Builder
         */
        public Builder orderReference(OrderReference orderReference) {
            this.orderReference = orderReference;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  Error value for error.
         * @return Builder
         */
        public Builder error(Error error) {
            this.error = error;
            return this;
        }

        /**
         * Setter for scheduleDetails.
         * @param  scheduleDetails  List of ScheduleDetail value for scheduleDetails.
         * @return Builder
         */
        public Builder scheduleDetails(List<ScheduleDetail> scheduleDetails) {
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
         * Setter for availability.
         * @param  availability  String value for availability.
         * @return Builder
         */
        public Builder availability(String availability) {
            this.availability = availability;
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
         * Setter for killedQuantity.
         * @param  killedQuantity  KilledQuantity value for killedQuantity.
         * @return Builder
         */
        public Builder killedQuantity(KilledQuantity killedQuantity) {
            this.killedQuantity = killedQuantity;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle3} object using the set fields.
         * @return {@link OrderedArticle3}
         */
        public OrderedArticle3 build() {
            return new OrderedArticle3(articleIdentification, articleDescription, orderReference,
                    error, scheduleDetails, orderedQuantity, requestedDeliveryDate,
                    requestedDeliveryTime, availability, articleComment, killedQuantity);
        }
    }
}
