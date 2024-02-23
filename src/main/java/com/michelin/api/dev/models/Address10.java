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
 * This is a model class for Address10 type.
 */
public class Address10 {
    private String street;
    private String city;
    private String district;
    private String postCode;
    private String postBoxCode;
    private String subCountry;
    private String countryCode;
    private Geolocation geolocation;

    /**
     * Default constructor.
     */
    public Address10() {
    }

    /**
     * Initialization constructor.
     * @param  street  String value for street.
     * @param  city  String value for city.
     * @param  postCode  String value for postCode.
     * @param  countryCode  String value for countryCode.
     * @param  district  String value for district.
     * @param  postBoxCode  String value for postBoxCode.
     * @param  subCountry  String value for subCountry.
     * @param  geolocation  Geolocation value for geolocation.
     */
    public Address10(
            String street,
            String city,
            String postCode,
            String countryCode,
            String district,
            String postBoxCode,
            String subCountry,
            Geolocation geolocation) {
        this.street = street;
        this.city = city;
        this.district = district;
        this.postCode = postCode;
        this.postBoxCode = postBoxCode;
        this.subCountry = subCountry;
        this.countryCode = countryCode;
        this.geolocation = geolocation;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    @JsonGetter("Street")
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * @param street Value for String
     */
    @JsonSetter("Street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("City")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for District.
     * @return Returns the String
     */
    @JsonGetter("District")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDistrict() {
        return district;
    }

    /**
     * Setter for District.
     * @param district Value for String
     */
    @JsonSetter("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Getter for PostCode.
     * @return Returns the String
     */
    @JsonGetter("PostCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     * Setter for PostCode.
     * @param postCode Value for String
     */
    @JsonSetter("PostCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Getter for PostBoxCode.
     * @return Returns the String
     */
    @JsonGetter("PostBoxCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostBoxCode() {
        return postBoxCode;
    }

    /**
     * Setter for PostBoxCode.
     * @param postBoxCode Value for String
     */
    @JsonSetter("PostBoxCode")
    public void setPostBoxCode(String postBoxCode) {
        this.postBoxCode = postBoxCode;
    }

    /**
     * Getter for SubCountry.
     * @return Returns the String
     */
    @JsonGetter("SubCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubCountry() {
        return subCountry;
    }

    /**
     * Setter for SubCountry.
     * @param subCountry Value for String
     */
    @JsonSetter("SubCountry")
    public void setSubCountry(String subCountry) {
        this.subCountry = subCountry;
    }

    /**
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Geolocation.
     * @return Returns the Geolocation
     */
    @JsonGetter("Geolocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Geolocation getGeolocation() {
        return geolocation;
    }

    /**
     * Setter for Geolocation.
     * @param geolocation Value for Geolocation
     */
    @JsonSetter("Geolocation")
    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    /**
     * Converts this Address10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Address10 [" + "street=" + street + ", city=" + city + ", postCode=" + postCode
                + ", countryCode=" + countryCode + ", district=" + district + ", postBoxCode="
                + postBoxCode + ", subCountry=" + subCountry + ", geolocation=" + geolocation + "]";
    }

    /**
     * Builds a new {@link Address10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Address10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(street, city, postCode, countryCode)
                .district(getDistrict())
                .postBoxCode(getPostBoxCode())
                .subCountry(getSubCountry())
                .geolocation(getGeolocation());
        return builder;
    }

    /**
     * Class to build instances of {@link Address10}.
     */
    public static class Builder {
        private String street;
        private String city;
        private String postCode;
        private String countryCode;
        private String district;
        private String postBoxCode;
        private String subCountry;
        private Geolocation geolocation;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  street  String value for street.
         * @param  city  String value for city.
         * @param  postCode  String value for postCode.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String street, String city, String postCode, String countryCode) {
            this.street = street;
            this.city = city;
            this.postCode = postCode;
            this.countryCode = countryCode;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for postCode.
         * @param  postCode  String value for postCode.
         * @return Builder
         */
        public Builder postCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for district.
         * @param  district  String value for district.
         * @return Builder
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * Setter for postBoxCode.
         * @param  postBoxCode  String value for postBoxCode.
         * @return Builder
         */
        public Builder postBoxCode(String postBoxCode) {
            this.postBoxCode = postBoxCode;
            return this;
        }

        /**
         * Setter for subCountry.
         * @param  subCountry  String value for subCountry.
         * @return Builder
         */
        public Builder subCountry(String subCountry) {
            this.subCountry = subCountry;
            return this;
        }

        /**
         * Setter for geolocation.
         * @param  geolocation  Geolocation value for geolocation.
         * @return Builder
         */
        public Builder geolocation(Geolocation geolocation) {
            this.geolocation = geolocation;
            return this;
        }

        /**
         * Builds a new {@link Address10} object using the set fields.
         * @return {@link Address10}
         */
        public Address10 build() {
            return new Address10(street, city, postCode, countryCode, district, postBoxCode,
                    subCountry, geolocation);
        }
    }
}
