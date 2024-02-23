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
 * This is a model class for Address14 type.
 */
public class Address14 {
    private String street;
    private List<String> city;
    private String district;
    private String postCode;
    private String postBoxCode;
    private String subCountry;
    private String countryCode;

    /**
     * Default constructor.
     */
    public Address14() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  street  String value for street.
     * @param  city  List of String value for city.
     * @param  district  String value for district.
     * @param  postCode  String value for postCode.
     * @param  postBoxCode  String value for postBoxCode.
     * @param  subCountry  String value for subCountry.
     */
    public Address14(
            String countryCode,
            String street,
            List<String> city,
            String district,
            String postCode,
            String postBoxCode,
            String subCountry) {
        this.street = street;
        this.city = city;
        this.district = district;
        this.postCode = postCode;
        this.postBoxCode = postBoxCode;
        this.subCountry = subCountry;
        this.countryCode = countryCode;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    @JsonGetter("Street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the List of String
     */
    @JsonGetter("City")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for List of String
     */
    @JsonSetter("City")
    public void setCity(List<String> city) {
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Address14 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Address14 [" + "countryCode=" + countryCode + ", street=" + street + ", city="
                + city + ", district=" + district + ", postCode=" + postCode + ", postBoxCode="
                + postBoxCode + ", subCountry=" + subCountry + "]";
    }

    /**
     * Builds a new {@link Address14.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Address14.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode)
                .street(getStreet())
                .city(getCity())
                .district(getDistrict())
                .postCode(getPostCode())
                .postBoxCode(getPostBoxCode())
                .subCountry(getSubCountry());
        return builder;
    }

    /**
     * Class to build instances of {@link Address14}.
     */
    public static class Builder {
        private String countryCode;
        private String street;
        private List<String> city;
        private String district;
        private String postCode;
        private String postBoxCode;
        private String subCountry;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String countryCode) {
            this.countryCode = countryCode;
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
         * @param  city  List of String value for city.
         * @return Builder
         */
        public Builder city(List<String> city) {
            this.city = city;
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
         * Setter for postCode.
         * @param  postCode  String value for postCode.
         * @return Builder
         */
        public Builder postCode(String postCode) {
            this.postCode = postCode;
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
         * Builds a new {@link Address14} object using the set fields.
         * @return {@link Address14}
         */
        public Address14 build() {
            return new Address14(countryCode, street, city, district, postCode, postBoxCode,
                    subCountry);
        }
    }
}
