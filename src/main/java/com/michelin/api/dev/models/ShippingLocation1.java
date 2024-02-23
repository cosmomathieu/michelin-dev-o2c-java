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
 * This is a model class for ShippingLocation1 type.
 */
public class ShippingLocation1 {
    private String locationName;

    /**
     * Default constructor.
     */
    public ShippingLocation1() {
    }

    /**
     * Initialization constructor.
     * @param  locationName  String value for locationName.
     */
    public ShippingLocation1(
            String locationName) {
        this.locationName = locationName;
    }

    /**
     * Getter for LocationName.
     * @return Returns the String
     */
    @JsonGetter("LocationName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationName() {
        return locationName;
    }

    /**
     * Setter for LocationName.
     * @param locationName Value for String
     */
    @JsonSetter("LocationName")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * Converts this ShippingLocation1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShippingLocation1 [" + "locationName=" + locationName + "]";
    }

    /**
     * Builds a new {@link ShippingLocation1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ShippingLocation1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .locationName(getLocationName());
        return builder;
    }

    /**
     * Class to build instances of {@link ShippingLocation1}.
     */
    public static class Builder {
        private String locationName;



        /**
         * Setter for locationName.
         * @param  locationName  String value for locationName.
         * @return Builder
         */
        public Builder locationName(String locationName) {
            this.locationName = locationName;
            return this;
        }

        /**
         * Builds a new {@link ShippingLocation1} object using the set fields.
         * @return {@link ShippingLocation1}
         */
        public ShippingLocation1 build() {
            return new ShippingLocation1(locationName);
        }
    }
}
