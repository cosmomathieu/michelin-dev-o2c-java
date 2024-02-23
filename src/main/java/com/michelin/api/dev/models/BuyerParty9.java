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
 * This is a model class for BuyerParty9 type.
 */
public class BuyerParty9 {
    private String partyID;
    private String agencyCode;

    /**
     * Default constructor.
     */
    public BuyerParty9() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     */
    public BuyerParty9(
            String partyID,
            String agencyCode) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
    }

    /**
     * Getter for PartyID.
     * @return Returns the String
     */
    @JsonGetter("partyID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPartyID() {
        return partyID;
    }

    /**
     * Setter for PartyID.
     * @param partyID Value for String
     */
    @JsonSetter("partyID")
    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    /**
     * Getter for AgencyCode.
     * @return Returns the String
     */
    @JsonGetter("agencyCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * Setter for AgencyCode.
     * @param agencyCode Value for String
     */
    @JsonSetter("agencyCode")
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }

    /**
     * Converts this BuyerParty9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BuyerParty9 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + "]";
    }

    /**
     * Builds a new {@link BuyerParty9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BuyerParty9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .partyID(getPartyID())
                .agencyCode(getAgencyCode());
        return builder;
    }

    /**
     * Class to build instances of {@link BuyerParty9}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;



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
         * Builds a new {@link BuyerParty9} object using the set fields.
         * @return {@link BuyerParty9}
         */
        public BuyerParty9 build() {
            return new BuyerParty9(partyID, agencyCode);
        }
    }
}
