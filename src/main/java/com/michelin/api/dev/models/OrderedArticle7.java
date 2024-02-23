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
 * This is a model class for OrderedArticle7 type.
 */
public class OrderedArticle7 {
    private ArticleIdentification8 articleIdentification;
    private ArticleDescription4 articleDescription;
    private String availability;
    private RequestedQuantity2 requestedQuantity;
    private Error2 error;
    private String requestedDeliveryTime;
    private String requestedDeliveryDate;
    private List<ScheduleDetail2> scheduleDetails;

    /**
     * Default constructor.
     */
    public OrderedArticle7() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification8 value for articleIdentification.
     * @param  articleDescription  ArticleDescription4 value for articleDescription.
     * @param  availability  String value for availability.
     * @param  requestedQuantity  RequestedQuantity2 value for requestedQuantity.
     * @param  error  Error2 value for error.
     * @param  requestedDeliveryTime  String value for requestedDeliveryTime.
     * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
     * @param  scheduleDetails  List of ScheduleDetail2 value for scheduleDetails.
     */
    public OrderedArticle7(
            ArticleIdentification8 articleIdentification,
            ArticleDescription4 articleDescription,
            String availability,
            RequestedQuantity2 requestedQuantity,
            Error2 error,
            String requestedDeliveryTime,
            String requestedDeliveryDate,
            List<ScheduleDetail2> scheduleDetails) {
        this.articleIdentification = articleIdentification;
        this.articleDescription = articleDescription;
        this.availability = availability;
        this.requestedQuantity = requestedQuantity;
        this.error = error;
        this.requestedDeliveryTime = requestedDeliveryTime;
        this.requestedDeliveryDate = requestedDeliveryDate;
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * Getter for ArticleIdentification.
     * @return Returns the ArticleIdentification8
     */
    @JsonGetter("articleIdentification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArticleIdentification8 getArticleIdentification() {
        return articleIdentification;
    }

    /**
     * Setter for ArticleIdentification.
     * @param articleIdentification Value for ArticleIdentification8
     */
    @JsonSetter("articleIdentification")
    public void setArticleIdentification(ArticleIdentification8 articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Getter for ArticleDescription.
     * @return Returns the ArticleDescription4
     */
    @JsonGetter("articleDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArticleDescription4 getArticleDescription() {
        return articleDescription;
    }

    /**
     * Setter for ArticleDescription.
     * @param articleDescription Value for ArticleDescription4
     */
    @JsonSetter("articleDescription")
    public void setArticleDescription(ArticleDescription4 articleDescription) {
        this.articleDescription = articleDescription;
    }

    /**
     * Getter for Availability.
     * @return Returns the String
     */
    @JsonGetter("availability")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAvailability() {
        return availability;
    }

    /**
     * Setter for Availability.
     * @param availability Value for String
     */
    @JsonSetter("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Getter for RequestedQuantity.
     * @return Returns the RequestedQuantity2
     */
    @JsonGetter("requestedQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequestedQuantity2 getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Setter for RequestedQuantity.
     * @param requestedQuantity Value for RequestedQuantity2
     */
    @JsonSetter("requestedQuantity")
    public void setRequestedQuantity(RequestedQuantity2 requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    /**
     * Getter for Error.
     * @return Returns the Error2
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Error2 getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for Error2
     */
    @JsonSetter("error")
    public void setError(Error2 error) {
        this.error = error;
    }

    /**
     * Getter for RequestedDeliveryTime.
     * @return Returns the String
     */
    @JsonGetter("requestedDeliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestedDeliveryTime() {
        return requestedDeliveryTime;
    }

    /**
     * Setter for RequestedDeliveryTime.
     * @param requestedDeliveryTime Value for String
     */
    @JsonSetter("requestedDeliveryTime")
    public void setRequestedDeliveryTime(String requestedDeliveryTime) {
        this.requestedDeliveryTime = requestedDeliveryTime;
    }

    /**
     * Getter for RequestedDeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("requestedDeliveryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ScheduleDetails.
     * @return Returns the List of ScheduleDetail2
     */
    @JsonGetter("scheduleDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ScheduleDetail2> getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * Setter for ScheduleDetails.
     * @param scheduleDetails Value for List of ScheduleDetail2
     */
    @JsonSetter("scheduleDetails")
    public void setScheduleDetails(List<ScheduleDetail2> scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * Converts this OrderedArticle7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle7 [" + "articleIdentification=" + articleIdentification
                + ", articleDescription=" + articleDescription + ", availability=" + availability
                + ", requestedQuantity=" + requestedQuantity + ", error=" + error
                + ", requestedDeliveryTime=" + requestedDeliveryTime + ", requestedDeliveryDate="
                + requestedDeliveryDate + ", scheduleDetails=" + scheduleDetails + "]";
    }

    /**
     * Builds a new {@link OrderedArticle7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .articleIdentification(getArticleIdentification())
                .articleDescription(getArticleDescription())
                .availability(getAvailability())
                .requestedQuantity(getRequestedQuantity())
                .error(getError())
                .requestedDeliveryTime(getRequestedDeliveryTime())
                .requestedDeliveryDate(getRequestedDeliveryDate())
                .scheduleDetails(getScheduleDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle7}.
     */
    public static class Builder {
        private ArticleIdentification8 articleIdentification;
        private ArticleDescription4 articleDescription;
        private String availability;
        private RequestedQuantity2 requestedQuantity;
        private Error2 error;
        private String requestedDeliveryTime;
        private String requestedDeliveryDate;
        private List<ScheduleDetail2> scheduleDetails;



        /**
         * Setter for articleIdentification.
         * @param  articleIdentification  ArticleIdentification8 value for articleIdentification.
         * @return Builder
         */
        public Builder articleIdentification(ArticleIdentification8 articleIdentification) {
            this.articleIdentification = articleIdentification;
            return this;
        }

        /**
         * Setter for articleDescription.
         * @param  articleDescription  ArticleDescription4 value for articleDescription.
         * @return Builder
         */
        public Builder articleDescription(ArticleDescription4 articleDescription) {
            this.articleDescription = articleDescription;
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
         * Setter for requestedQuantity.
         * @param  requestedQuantity  RequestedQuantity2 value for requestedQuantity.
         * @return Builder
         */
        public Builder requestedQuantity(RequestedQuantity2 requestedQuantity) {
            this.requestedQuantity = requestedQuantity;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  Error2 value for error.
         * @return Builder
         */
        public Builder error(Error2 error) {
            this.error = error;
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
         * Setter for requestedDeliveryDate.
         * @param  requestedDeliveryDate  String value for requestedDeliveryDate.
         * @return Builder
         */
        public Builder requestedDeliveryDate(String requestedDeliveryDate) {
            this.requestedDeliveryDate = requestedDeliveryDate;
            return this;
        }

        /**
         * Setter for scheduleDetails.
         * @param  scheduleDetails  List of ScheduleDetail2 value for scheduleDetails.
         * @return Builder
         */
        public Builder scheduleDetails(List<ScheduleDetail2> scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle7} object using the set fields.
         * @return {@link OrderedArticle7}
         */
        public OrderedArticle7 build() {
            return new OrderedArticle7(articleIdentification, articleDescription, availability,
                    requestedQuantity, error, requestedDeliveryTime, requestedDeliveryDate,
                    scheduleDetails);
        }
    }
}
