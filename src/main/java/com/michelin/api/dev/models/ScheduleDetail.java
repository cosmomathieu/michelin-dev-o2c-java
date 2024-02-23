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
 * This is a model class for ScheduleDetail type.
 */
public class ScheduleDetail {
    private String deliveryDate;
    private String deliveryTime;
    private ConfirmedQuantity confirmedQuantity;
    private String transportMode;
    private PriceDetails priceDetails;
    private List<Charge> charge;

    /**
     * Default constructor.
     */
    public ScheduleDetail() {
    }

    /**
     * Initialization constructor.
     * @param  deliveryDate  String value for deliveryDate.
     * @param  confirmedQuantity  ConfirmedQuantity value for confirmedQuantity.
     * @param  deliveryTime  String value for deliveryTime.
     * @param  transportMode  String value for transportMode.
     * @param  priceDetails  PriceDetails value for priceDetails.
     * @param  charge  List of Charge value for charge.
     */
    public ScheduleDetail(
            String deliveryDate,
            ConfirmedQuantity confirmedQuantity,
            String deliveryTime,
            String transportMode,
            PriceDetails priceDetails,
            List<Charge> charge) {
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.confirmedQuantity = confirmedQuantity;
        this.transportMode = transportMode;
        this.priceDetails = priceDetails;
        this.charge = charge;
    }

    /**
     * Getter for DeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("DeliveryDate")
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
     * Getter for TransportMode.
     * @return Returns the String
     */
    @JsonGetter("TransportMode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransportMode() {
        return transportMode;
    }

    /**
     * Setter for TransportMode.
     * @param transportMode Value for String
     */
    @JsonSetter("TransportMode")
    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    /**
     * Getter for PriceDetails.
     * @return Returns the PriceDetails
     */
    @JsonGetter("PriceDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    /**
     * Setter for PriceDetails.
     * @param priceDetails Value for PriceDetails
     */
    @JsonSetter("PriceDetails")
    public void setPriceDetails(PriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    /**
     * Getter for Charge.
     * @return Returns the List of Charge
     */
    @JsonGetter("Charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Charge> getCharge() {
        return charge;
    }

    /**
     * Setter for Charge.
     * @param charge Value for List of Charge
     */
    @JsonSetter("Charge")
    public void setCharge(List<Charge> charge) {
        this.charge = charge;
    }

    /**
     * Converts this ScheduleDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduleDetail [" + "deliveryDate=" + deliveryDate + ", confirmedQuantity="
                + confirmedQuantity + ", deliveryTime=" + deliveryTime + ", transportMode="
                + transportMode + ", priceDetails=" + priceDetails + ", charge=" + charge + "]";
    }

    /**
     * Builds a new {@link ScheduleDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduleDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deliveryDate, confirmedQuantity)
                .deliveryTime(getDeliveryTime())
                .transportMode(getTransportMode())
                .priceDetails(getPriceDetails())
                .charge(getCharge());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduleDetail}.
     */
    public static class Builder {
        private String deliveryDate;
        private ConfirmedQuantity confirmedQuantity;
        private String deliveryTime;
        private String transportMode;
        private PriceDetails priceDetails;
        private List<Charge> charge;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deliveryDate  String value for deliveryDate.
         * @param  confirmedQuantity  ConfirmedQuantity value for confirmedQuantity.
         */
        public Builder(String deliveryDate, ConfirmedQuantity confirmedQuantity) {
            this.deliveryDate = deliveryDate;
            this.confirmedQuantity = confirmedQuantity;
        }

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
         * Setter for confirmedQuantity.
         * @param  confirmedQuantity  ConfirmedQuantity value for confirmedQuantity.
         * @return Builder
         */
        public Builder confirmedQuantity(ConfirmedQuantity confirmedQuantity) {
            this.confirmedQuantity = confirmedQuantity;
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
         * Setter for transportMode.
         * @param  transportMode  String value for transportMode.
         * @return Builder
         */
        public Builder transportMode(String transportMode) {
            this.transportMode = transportMode;
            return this;
        }

        /**
         * Setter for priceDetails.
         * @param  priceDetails  PriceDetails value for priceDetails.
         * @return Builder
         */
        public Builder priceDetails(PriceDetails priceDetails) {
            this.priceDetails = priceDetails;
            return this;
        }

        /**
         * Setter for charge.
         * @param  charge  List of Charge value for charge.
         * @return Builder
         */
        public Builder charge(List<Charge> charge) {
            this.charge = charge;
            return this;
        }

        /**
         * Builds a new {@link ScheduleDetail} object using the set fields.
         * @return {@link ScheduleDetail}
         */
        public ScheduleDetail build() {
            return new ScheduleDetail(deliveryDate, confirmedQuantity, deliveryTime, transportMode,
                    priceDetails, charge);
        }
    }
}
