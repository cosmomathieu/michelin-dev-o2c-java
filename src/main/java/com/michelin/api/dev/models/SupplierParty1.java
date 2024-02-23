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
 * This is a model class for SupplierParty1 type.
 */
public class SupplierParty1 {
    private String partyID;
    private String agencyCode;
    private SalesContact salesContact;
    private ShippingLocation shippingLocation;

    /**
     * Default constructor.
     */
    public SupplierParty1() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  salesContact  SalesContact value for salesContact.
     * @param  shippingLocation  ShippingLocation value for shippingLocation.
     */
    public SupplierParty1(
            String partyID,
            String agencyCode,
            SalesContact salesContact,
            ShippingLocation shippingLocation) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
        this.salesContact = salesContact;
        this.shippingLocation = shippingLocation;
    }

    /**
     * Getter for PartyID.
     * @return Returns the String
     */
    @JsonGetter("PartyID")
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
     * Getter for SalesContact.
     * @return Returns the SalesContact
     */
    @JsonGetter("SalesContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SalesContact getSalesContact() {
        return salesContact;
    }

    /**
     * Setter for SalesContact.
     * @param salesContact Value for SalesContact
     */
    @JsonSetter("SalesContact")
    public void setSalesContact(SalesContact salesContact) {
        this.salesContact = salesContact;
    }

    /**
     * Getter for ShippingLocation.
     * @return Returns the ShippingLocation
     */
    @JsonGetter("ShippingLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingLocation getShippingLocation() {
        return shippingLocation;
    }

    /**
     * Setter for ShippingLocation.
     * @param shippingLocation Value for ShippingLocation
     */
    @JsonSetter("ShippingLocation")
    public void setShippingLocation(ShippingLocation shippingLocation) {
        this.shippingLocation = shippingLocation;
    }

    /**
     * Converts this SupplierParty1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplierParty1 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode
                + ", salesContact=" + salesContact + ", shippingLocation=" + shippingLocation + "]";
    }

    /**
     * Builds a new {@link SupplierParty1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplierParty1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(partyID, agencyCode)
                .salesContact(getSalesContact())
                .shippingLocation(getShippingLocation());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplierParty1}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private SalesContact salesContact;
        private ShippingLocation shippingLocation;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  partyID  String value for partyID.
         * @param  agencyCode  String value for agencyCode.
         */
        public Builder(String partyID, String agencyCode) {
            this.partyID = partyID;
            this.agencyCode = agencyCode;
        }

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
         * Setter for salesContact.
         * @param  salesContact  SalesContact value for salesContact.
         * @return Builder
         */
        public Builder salesContact(SalesContact salesContact) {
            this.salesContact = salesContact;
            return this;
        }

        /**
         * Setter for shippingLocation.
         * @param  shippingLocation  ShippingLocation value for shippingLocation.
         * @return Builder
         */
        public Builder shippingLocation(ShippingLocation shippingLocation) {
            this.shippingLocation = shippingLocation;
            return this;
        }

        /**
         * Builds a new {@link SupplierParty1} object using the set fields.
         * @return {@link SupplierParty1}
         */
        public SupplierParty1 build() {
            return new SupplierParty1(partyID, agencyCode, salesContact, shippingLocation);
        }
    }
}
