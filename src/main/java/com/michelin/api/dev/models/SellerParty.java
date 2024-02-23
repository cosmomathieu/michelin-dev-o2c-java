/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SellerParty type.
 */
public class SellerParty {
    private String partyID;
    private String agencyCode;

    /**
     * Default constructor.
     */
    public SellerParty() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     */
    public SellerParty(
            String partyID,
            String agencyCode) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
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
     * Converts this SellerParty into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SellerParty [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + "]";
    }

    /**
     * Builds a new {@link SellerParty.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SellerParty.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(partyID, agencyCode);
        return builder;
    }

    /**
     * Class to build instances of {@link SellerParty}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;

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
         * Builds a new {@link SellerParty} object using the set fields.
         * @return {@link SellerParty}
         */
        public SellerParty build() {
            return new SellerParty(partyID, agencyCode);
        }
    }
}
