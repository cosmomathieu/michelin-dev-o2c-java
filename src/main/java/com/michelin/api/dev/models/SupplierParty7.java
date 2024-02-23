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
 * This is a model class for SupplierParty7 type.
 */
public class SupplierParty7 {
    private String partyID;
    private String agencyCode;
    private ShippingLocation1 shippingLocation;
    private String telephoneExtension;

    /**
     * Default constructor.
     */
    public SupplierParty7() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  shippingLocation  ShippingLocation1 value for shippingLocation.
     * @param  telephoneExtension  String value for telephoneExtension.
     */
    public SupplierParty7(
            String partyID,
            String agencyCode,
            ShippingLocation1 shippingLocation,
            String telephoneExtension) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
        this.shippingLocation = shippingLocation;
        this.telephoneExtension = telephoneExtension;
    }

    /**
     * Getter for PartyID.
     * @return Returns the String
     */
    @JsonGetter("PartyID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPartyID() {
        return partyID;
    }

    /**
     * Setter for PartyID.
     * @param partyID Value for String
     */
    @JsonSetter("PartyID")
    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    /**
     * Getter for AgencyCode.
     * @return Returns the String
     */
    @JsonGetter("AgencyCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Setter for AgencyCode.
     * @param agencyCode Value for String
     */
    @JsonSetter("AgencyCode")
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    /**
     * Getter for ShippingLocation.
     * @return Returns the ShippingLocation1
     */
    @JsonGetter("ShippingLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingLocation1 getShippingLocation() {
        return shippingLocation;
    }

    /**
     * Setter for ShippingLocation.
     * @param shippingLocation Value for ShippingLocation1
     */
    @JsonSetter("ShippingLocation")
    public void setShippingLocation(ShippingLocation1 shippingLocation) {
        this.shippingLocation = shippingLocation;
    }

    /**
     * Getter for TelephoneExtension.
     * @return Returns the String
     */
    @JsonGetter("TelephoneExtension")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTelephoneExtension() {
        return telephoneExtension;
    }

    /**
     * Setter for TelephoneExtension.
     * @param telephoneExtension Value for String
     */
    @JsonSetter("TelephoneExtension")
    public void setTelephoneExtension(String telephoneExtension) {
        this.telephoneExtension = telephoneExtension;
    }

    /**
     * Converts this SupplierParty7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplierParty7 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode
                + ", shippingLocation=" + shippingLocation + ", telephoneExtension="
                + telephoneExtension + "]";
    }

    /**
     * Builds a new {@link SupplierParty7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplierParty7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .partyID(getPartyID())
                .agencyCode(getAgencyCode())
                .shippingLocation(getShippingLocation())
                .telephoneExtension(getTelephoneExtension());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplierParty7}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private ShippingLocation1 shippingLocation;
        private String telephoneExtension;



        /**
         * Setter for partyID.
         * @param  partyID  String value for partyID.
         * @return Builder
         */
        public Builder partyID(String partyID) {
            this.partyID = partyID;
            return this;
        }

        /**
         * Setter for agencyCode.
         * @param  agencyCode  String value for agencyCode.
         * @return Builder
         */
        public Builder agencyCode(String agencyCode) {
            this.agencyCode = agencyCode;
            return this;
        }

        /**
         * Setter for shippingLocation.
         * @param  shippingLocation  ShippingLocation1 value for shippingLocation.
         * @return Builder
         */
        public Builder shippingLocation(ShippingLocation1 shippingLocation) {
            this.shippingLocation = shippingLocation;
            return this;
        }

        /**
         * Setter for telephoneExtension.
         * @param  telephoneExtension  String value for telephoneExtension.
         * @return Builder
         */
        public Builder telephoneExtension(String telephoneExtension) {
            this.telephoneExtension = telephoneExtension;
            return this;
        }

        /**
         * Builds a new {@link SupplierParty7} object using the set fields.
         * @return {@link SupplierParty7}
         */
        public SupplierParty7 build() {
            return new SupplierParty7(partyID, agencyCode, shippingLocation, telephoneExtension);
        }
    }
}
