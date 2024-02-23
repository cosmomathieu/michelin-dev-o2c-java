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
 * This is a model class for Address19 type.
 */
public class Address19 {
    private List<String> street;
    private String city;
    private String postCode;
    private String subCountry;
    private String countryCode;

    /**
     * Default constructor.
     */
    public Address19() {
    }

    /**
     * Initialization constructor.
     * @param  street  List of String value for street.
     * @param  city  String value for city.
     * @param  postCode  String value for postCode.
     * @param  subCountry  String value for subCountry.
     * @param  countryCode  String value for countryCode.
     */
    public Address19(
            List<String> street,
            String city,
            String postCode,
            String subCountry,
            String countryCode) {
        this.street = street;
        this.city = city;
        this.postCode = postCode;
        this.subCountry = subCountry;
        this.countryCode = countryCode;
    }

    /**
     * Getter for Street.
     * @return Returns the List of String
     */
    @JsonGetter("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * @param street Value for List of String
     */
    @JsonSetter("street")
    public void setStreet(List<String> street) {
        this.street = street;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for PostCode.
     * @return Returns the String
     */
    @JsonGetter("postCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostCode() {
        return postCode;
    }

    /**
     * Setter for PostCode.
     * @param postCode Value for String
     */
    @JsonSetter("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Getter for SubCountry.
     * @return Returns the String
     */
    @JsonGetter("subCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubCountry() {
        return subCountry;
    }

    /**
     * Setter for SubCountry.
     * @param subCountry Value for String
     */
    @JsonSetter("subCountry")
    public void setSubCountry(String subCountry) {
        this.subCountry = subCountry;
    }

    /**
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("countryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Converts this Address19 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Address19 [" + "street=" + street + ", city=" + city + ", postCode=" + postCode
                + ", subCountry=" + subCountry + ", countryCode=" + countryCode + "]";
    }

    /**
     * Builds a new {@link Address19.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Address19.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .street(getStreet())
                .city(getCity())
                .postCode(getPostCode())
                .subCountry(getSubCountry())
                .countryCode(getCountryCode());
        return builder;
    }

    /**
     * Class to build instances of {@link Address19}.
     */
    public static class Builder {
        private List<String> street;
        private String city;
        private String postCode;
        private String subCountry;
        private String countryCode;



        /**
         * Setter for street.
         * @param  street  List of String value for street.
         * @return Builder
         */
        public Builder street(List<String> street) {
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
         * Setter for subCountry.
         * @param  subCountry  String value for subCountry.
         * @return Builder
         */
        public Builder subCountry(String subCountry) {
            this.subCountry = subCountry;
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
         * Builds a new {@link Address19} object using the set fields.
         * @return {@link Address19}
         */
        public Address19 build() {
            return new Address19(street, city, postCode, subCountry, countryCode);
        }
    }
}
