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
 * This is a model class for ScheduleDetail1 type.
 */
public class ScheduleDetail1 {
    private String deliveryDate;
    private String deliveryTime;
    private ConfirmedQuantity confirmedQuantity;
    private CancelledQuantity cancelledQuantity;
    private OpenQuantity openQuantity;
    private ScheduledArticleDespatchDetails scheduledArticleDespatchDetails;

    /**
     * Default constructor.
     */
    public ScheduleDetail1() {
    }

    /**
     * Initialization constructor.
     * @param  deliveryDate  String value for deliveryDate.
     * @param  deliveryTime  String value for deliveryTime.
     * @param  confirmedQuantity  ConfirmedQuantity value for confirmedQuantity.
     * @param  cancelledQuantity  CancelledQuantity value for cancelledQuantity.
     * @param  openQuantity  OpenQuantity value for openQuantity.
     * @param  scheduledArticleDespatchDetails  ScheduledArticleDespatchDetails value for
     *         scheduledArticleDespatchDetails.
     */
    public ScheduleDetail1(
            String deliveryDate,
            String deliveryTime,
            ConfirmedQuantity confirmedQuantity,
            CancelledQuantity cancelledQuantity,
            OpenQuantity openQuantity,
            ScheduledArticleDespatchDetails scheduledArticleDespatchDetails) {
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.confirmedQuantity = confirmedQuantity;
        this.cancelledQuantity = cancelledQuantity;
        this.openQuantity = openQuantity;
        this.scheduledArticleDespatchDetails = scheduledArticleDespatchDetails;
    }

    /**
     * Getter for DeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("DeliveryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Setter for DeliveryDate.
     * @param deliveryDate Value for String
     */
    @JsonSetter("DeliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Getter for DeliveryTime.
     * @return Returns the String
     */
    @JsonGetter("DeliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Setter for DeliveryTime.
     * @param deliveryTime Value for String
     */
    @JsonSetter("DeliveryTime")
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * Getter for ConfirmedQuantity.
     * @return Returns the ConfirmedQuantity
     */
    @JsonGetter("ConfirmedQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConfirmedQuantity getConfirmedQuantity() {
        return confirmedQuantity;
    }

    /**
     * Setter for ConfirmedQuantity.
     * @param confirmedQuantity Value for ConfirmedQuantity
     */
    @JsonSetter("ConfirmedQuantity")
    public void setConfirmedQuantity(ConfirmedQuantity confirmedQuantity) {
        this.confirmedQuantity = confirmedQuantity;
    }

    /**
     * Getter for CancelledQuantity.
     * @return Returns the CancelledQuantity
     */
    @JsonGetter("CancelledQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CancelledQuantity getCancelledQuantity() {
        return cancelledQuantity;
    }

    /**
     * Setter for CancelledQuantity.
     * @param cancelledQuantity Value for CancelledQuantity
     */
    @JsonSetter("CancelledQuantity")
    public void setCancelledQuantity(CancelledQuantity cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
    }

    /**
     * Getter for OpenQuantity.
     * @return Returns the OpenQuantity
     */
    @JsonGetter("OpenQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OpenQuantity getOpenQuantity() {
        return openQuantity;
    }

    /**
     * Setter for OpenQuantity.
     * @param openQuantity Value for OpenQuantity
     */
    @JsonSetter("OpenQuantity")
    public void setOpenQuantity(OpenQuantity openQuantity) {
        this.openQuantity = openQuantity;
    }

    /**
     * Getter for ScheduledArticleDespatchDetails.
     * @return Returns the ScheduledArticleDespatchDetails
     */
    @JsonGetter("ScheduledArticleDespatchDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ScheduledArticleDespatchDetails getScheduledArticleDespatchDetails() {
        return scheduledArticleDespatchDetails;
    }

    /**
     * Setter for ScheduledArticleDespatchDetails.
     * @param scheduledArticleDespatchDetails Value for ScheduledArticleDespatchDetails
     */
    @JsonSetter("ScheduledArticleDespatchDetails")
    public void setScheduledArticleDespatchDetails(ScheduledArticleDespatchDetails scheduledArticleDespatchDetails) {
        this.scheduledArticleDespatchDetails = scheduledArticleDespatchDetails;
    }

    /**
     * Converts this ScheduleDetail1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduleDetail1 [" + "deliveryDate=" + deliveryDate + ", deliveryTime="
                + deliveryTime + ", confirmedQuantity=" + confirmedQuantity + ", cancelledQuantity="
                + cancelledQuantity + ", openQuantity=" + openQuantity
                + ", scheduledArticleDespatchDetails=" + scheduledArticleDespatchDetails + "]";
    }

    /**
     * Builds a new {@link ScheduleDetail1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduleDetail1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deliveryDate(getDeliveryDate())
                .deliveryTime(getDeliveryTime())
                .confirmedQuantity(getConfirmedQuantity())
                .cancelledQuantity(getCancelledQuantity())
                .openQuantity(getOpenQuantity())
                .scheduledArticleDespatchDetails(getScheduledArticleDespatchDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduleDetail1}.
     */
    public static class Builder {
        private String deliveryDate;
        private String deliveryTime;
        private ConfirmedQuantity confirmedQuantity;
        private CancelledQuantity cancelledQuantity;
        private OpenQuantity openQuantity;
        private ScheduledArticleDespatchDetails scheduledArticleDespatchDetails;



        /**
         * Setter for deliveryDate.
         * @param  deliveryDate  String value for deliveryDate.
         * @return Builder
         */
        public Builder deliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        /**
         * Setter for deliveryTime.
         * @param  deliveryTime  String value for deliveryTime.
         * @return Builder
         */
        public Builder deliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        /**
         * Setter for confirmedQuantity.
         * @param  confirmedQuantity  ConfirmedQuantity value for confirmedQuantity.
         * @return Builder
         */
        public Builder confirmedQuantity(ConfirmedQuantity confirmedQuantity) {
            this.confirmedQuantity = confirmedQuantity;
            return this;
        }

        /**
         * Setter for cancelledQuantity.
         * @param  cancelledQuantity  CancelledQuantity value for cancelledQuantity.
         * @return Builder
         */
        public Builder cancelledQuantity(CancelledQuantity cancelledQuantity) {
            this.cancelledQuantity = cancelledQuantity;
            return this;
        }

        /**
         * Setter for openQuantity.
         * @param  openQuantity  OpenQuantity value for openQuantity.
         * @return Builder
         */
        public Builder openQuantity(OpenQuantity openQuantity) {
            this.openQuantity = openQuantity;
            return this;
        }

        /**
         * Setter for scheduledArticleDespatchDetails.
         * @param  scheduledArticleDespatchDetails  ScheduledArticleDespatchDetails value for
         *         scheduledArticleDespatchDetails.
         * @return Builder
         */
        public Builder scheduledArticleDespatchDetails(
                ScheduledArticleDespatchDetails scheduledArticleDespatchDetails) {
            this.scheduledArticleDespatchDetails = scheduledArticleDespatchDetails;
            return this;
        }

        /**
         * Builds a new {@link ScheduleDetail1} object using the set fields.
         * @return {@link ScheduleDetail1}
         */
        public ScheduleDetail1 build() {
            return new ScheduleDetail1(deliveryDate, deliveryTime, confirmedQuantity,
                    cancelledQuantity, openQuantity, scheduledArticleDespatchDetails);
        }
    }
}
