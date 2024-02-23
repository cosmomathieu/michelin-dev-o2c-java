/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ShippingLocation type.
 */
public class ShippingLocation {
    private String locationName;

    /**
     * Default constructor.
     */
    public ShippingLocation() {
    }

    /**
     * Initialization constructor.
     * @param  locationName  String value for locationName.
     */
    public ShippingLocation(
            String locationName) {
        this.locationName = locationName;
    }

    /**
     * Getter for LocationName.
     * @return Returns the String
     */
    @JsonGetter("LocationName")
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
     * Converts this ShippingLocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ShippingLocation [" + "locationName=" + locationName + "]";
    }

    /**
     * Builds a new {@link ShippingLocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ShippingLocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(locationName);
        return builder;
    }

    /**
     * Class to build instances of {@link ShippingLocation}.
     */
    public static class Builder {
        private String locationName;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  locationName  String value for locationName.
         */
        public Builder(String locationName) {
            this.locationName = locationName;
        }

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
         * Builds a new {@link ShippingLocation} object using the set fields.
         * @return {@link ShippingLocation}
         */
        public ShippingLocation build() {
            return new ShippingLocation(locationName);
        }
    }
}
