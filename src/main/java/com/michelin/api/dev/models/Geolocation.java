/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Geolocation type.
 */
public class Geolocation {
    private String latitude;
    private String longitude;

    /**
     * Default constructor.
     */
    public Geolocation() {
    }

    /**
     * Initialization constructor.
     * @param  latitude  String value for latitude.
     * @param  longitude  String value for longitude.
     */
    public Geolocation(
            String latitude,
            String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Getter for Latitude.
     * @return Returns the String
     */
    @JsonGetter("Latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * Setter for Latitude.
     * @param latitude Value for String
     */
    @JsonSetter("Latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for Longitude.
     * @return Returns the String
     */
    @JsonGetter("Longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * Setter for Longitude.
     * @param longitude Value for String
     */
    @JsonSetter("Longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Converts this Geolocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Geolocation [" + "latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    /**
     * Builds a new {@link Geolocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Geolocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(latitude, longitude);
        return builder;
    }

    /**
     * Class to build instances of {@link Geolocation}.
     */
    public static class Builder {
        private String latitude;
        private String longitude;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  latitude  String value for latitude.
         * @param  longitude  String value for longitude.
         */
        public Builder(String latitude, String longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        /**
         * Setter for latitude.
         * @param  latitude  String value for latitude.
         * @return Builder
         */
        public Builder latitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Setter for longitude.
         * @param  longitude  String value for longitude.
         * @return Builder
         */
        public Builder longitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Builds a new {@link Geolocation} object using the set fields.
         * @return {@link Geolocation}
         */
        public Geolocation build() {
            return new Geolocation(latitude, longitude);
        }
    }
}
