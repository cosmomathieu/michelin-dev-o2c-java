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
 * This is a model class for ScheduleDetail2 type.
 */
public class ScheduleDetail2 {
    private String deliveryDate;
    private String deliveryTime;
    private String orderByDate;
    private String orderByTime;
    private String pickUp;
    private String transportPriority;
    private AvailableQuantity availableQuantity;
    private PriceDetails2 priceDetails;
    private List<Charge2> charge;
    private SupplierParty8 supplierParty;

    /**
     * Default constructor.
     */
    public ScheduleDetail2() {
    }

    /**
     * Initialization constructor.
     * @param  deliveryDate  String value for deliveryDate.
     * @param  deliveryTime  String value for deliveryTime.
     * @param  orderByDate  String value for orderByDate.
     * @param  orderByTime  String value for orderByTime.
     * @param  pickUp  String value for pickUp.
     * @param  transportPriority  String value for transportPriority.
     * @param  availableQuantity  AvailableQuantity value for availableQuantity.
     * @param  priceDetails  PriceDetails2 value for priceDetails.
     * @param  charge  List of Charge2 value for charge.
     * @param  supplierParty  SupplierParty8 value for supplierParty.
     */
    public ScheduleDetail2(
            String deliveryDate,
            String deliveryTime,
            String orderByDate,
            String orderByTime,
            String pickUp,
            String transportPriority,
            AvailableQuantity availableQuantity,
            PriceDetails2 priceDetails,
            List<Charge2> charge,
            SupplierParty8 supplierParty) {
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.orderByDate = orderByDate;
        this.orderByTime = orderByTime;
        this.pickUp = pickUp;
        this.transportPriority = transportPriority;
        this.availableQuantity = availableQuantity;
        this.priceDetails = priceDetails;
        this.charge = charge;
        this.supplierParty = supplierParty;
    }

    /**
     * Getter for DeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("deliveryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Setter for DeliveryDate.
     * @param deliveryDate Value for String
     */
    @JsonSetter("deliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Getter for DeliveryTime.
     * @return Returns the String
     */
    @JsonGetter("deliveryTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * Setter for DeliveryTime.
     * @param deliveryTime Value for String
     */
    @JsonSetter("deliveryTime")
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * Getter for OrderByDate.
     * @return Returns the String
     */
    @JsonGetter("orderByDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderByDate() {
        return orderByDate;
    }

    /**
     * Setter for OrderByDate.
     * @param orderByDate Value for String
     */
    @JsonSetter("orderByDate")
    public void setOrderByDate(String orderByDate) {
        this.orderByDate = orderByDate;
    }

    /**
     * Getter for OrderByTime.
     * @return Returns the String
     */
    @JsonGetter("orderByTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderByTime() {
        return orderByTime;
    }

    /**
     * Setter for OrderByTime.
     * @param orderByTime Value for String
     */
    @JsonSetter("orderByTime")
    public void setOrderByTime(String orderByTime) {
        this.orderByTime = orderByTime;
    }

    /**
     * Getter for PickUp.
     * @return Returns the String
     */
    @JsonGetter("pickUp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPickUp() {
        return pickUp;
    }

    /**
     * Setter for PickUp.
     * @param pickUp Value for String
     */
    @JsonSetter("pickUp")
    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    /**
     * Getter for TransportPriority.
     * @return Returns the String
     */
    @JsonGetter("transportPriority")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransportPriority() {
        return transportPriority;
    }

    /**
     * Setter for TransportPriority.
     * @param transportPriority Value for String
     */
    @JsonSetter("transportPriority")
    public void setTransportPriority(String transportPriority) {
        this.transportPriority = transportPriority;
    }

    /**
     * Getter for AvailableQuantity.
     * @return Returns the AvailableQuantity
     */
    @JsonGetter("availableQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AvailableQuantity getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Setter for AvailableQuantity.
     * @param availableQuantity Value for AvailableQuantity
     */
    @JsonSetter("availableQuantity")
    public void setAvailableQuantity(AvailableQuantity availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /**
     * Getter for PriceDetails.
     * @return Returns the PriceDetails2
     */
    @JsonGetter("priceDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PriceDetails2 getPriceDetails() {
        return priceDetails;
    }

    /**
     * Setter for PriceDetails.
     * @param priceDetails Value for PriceDetails2
     */
    @JsonSetter("priceDetails")
    public void setPriceDetails(PriceDetails2 priceDetails) {
        this.priceDetails = priceDetails;
    }

    /**
     * Getter for Charge.
     * @return Returns the List of Charge2
     */
    @JsonGetter("charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Charge2> getCharge() {
        return charge;
    }

    /**
     * Setter for Charge.
     * @param charge Value for List of Charge2
     */
    @JsonSetter("charge")
    public void setCharge(List<Charge2> charge) {
        this.charge = charge;
    }

    /**
     * Getter for SupplierParty.
     * @return Returns the SupplierParty8
     */
    @JsonGetter("supplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty8 getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty8
     */
    @JsonSetter("supplierParty")
    public void setSupplierParty(SupplierParty8 supplierParty) {
        this.supplierParty = supplierParty;
    }

    /**
     * Converts this ScheduleDetail2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduleDetail2 [" + "deliveryDate=" + deliveryDate + ", deliveryTime="
                + deliveryTime + ", orderByDate=" + orderByDate + ", orderByTime=" + orderByTime
                + ", pickUp=" + pickUp + ", transportPriority=" + transportPriority
                + ", availableQuantity=" + availableQuantity + ", priceDetails=" + priceDetails
                + ", charge=" + charge + ", supplierParty=" + supplierParty + "]";
    }

    /**
     * Builds a new {@link ScheduleDetail2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduleDetail2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deliveryDate(getDeliveryDate())
                .deliveryTime(getDeliveryTime())
                .orderByDate(getOrderByDate())
                .orderByTime(getOrderByTime())
                .pickUp(getPickUp())
                .transportPriority(getTransportPriority())
                .availableQuantity(getAvailableQuantity())
                .priceDetails(getPriceDetails())
                .charge(getCharge())
                .supplierParty(getSupplierParty());
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduleDetail2}.
     */
    public static class Builder {
        private String deliveryDate;
        private String deliveryTime;
        private String orderByDate;
        private String orderByTime;
        private String pickUp;
        private String transportPriority;
        private AvailableQuantity availableQuantity;
        private PriceDetails2 priceDetails;
        private List<Charge2> charge;
        private SupplierParty8 supplierParty;



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
         * Setter for orderByDate.
         * @param  orderByDate  String value for orderByDate.
         * @return Builder
         */
        public Builder orderByDate(String orderByDate) {
            this.orderByDate = orderByDate;
            return this;
        }

        /**
         * Setter for orderByTime.
         * @param  orderByTime  String value for orderByTime.
         * @return Builder
         */
        public Builder orderByTime(String orderByTime) {
            this.orderByTime = orderByTime;
            return this;
        }

        /**
         * Setter for pickUp.
         * @param  pickUp  String value for pickUp.
         * @return Builder
         */
        public Builder pickUp(String pickUp) {
            this.pickUp = pickUp;
            return this;
        }

        /**
         * Setter for transportPriority.
         * @param  transportPriority  String value for transportPriority.
         * @return Builder
         */
        public Builder transportPriority(String transportPriority) {
            this.transportPriority = transportPriority;
            return this;
        }

        /**
         * Setter for availableQuantity.
         * @param  availableQuantity  AvailableQuantity value for availableQuantity.
         * @return Builder
         */
        public Builder availableQuantity(AvailableQuantity availableQuantity) {
            this.availableQuantity = availableQuantity;
            return this;
        }

        /**
         * Setter for priceDetails.
         * @param  priceDetails  PriceDetails2 value for priceDetails.
         * @return Builder
         */
        public Builder priceDetails(PriceDetails2 priceDetails) {
            this.priceDetails = priceDetails;
            return this;
        }

        /**
         * Setter for charge.
         * @param  charge  List of Charge2 value for charge.
         * @return Builder
         */
        public Builder charge(List<Charge2> charge) {
            this.charge = charge;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty8 value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty8 supplierParty) {
            this.supplierParty = supplierParty;
            return this;
        }

        /**
         * Builds a new {@link ScheduleDetail2} object using the set fields.
         * @return {@link ScheduleDetail2}
         */
        public ScheduleDetail2 build() {
            return new ScheduleDetail2(deliveryDate, deliveryTime, orderByDate, orderByTime, pickUp,
                    transportPriority, availableQuantity, priceDetails, charge, supplierParty);
        }
    }
}
