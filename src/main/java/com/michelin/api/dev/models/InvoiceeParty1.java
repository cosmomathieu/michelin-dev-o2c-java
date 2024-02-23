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
 * This is a model class for InvoiceeParty1 type.
 */
public class InvoiceeParty1 {
    private String partyID;
    private String agencyCode;
    private List<String> name;
    private Address2 address;
    private String taxRegistrationID;
    private String vATRegistrationID;

    /**
     * Default constructor.
     */
    public InvoiceeParty1() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  name  List of String value for name.
     * @param  address  Address2 value for address.
     * @param  taxRegistrationID  String value for taxRegistrationID.
     * @param  vATRegistrationID  String value for vATRegistrationID.
     */
    public InvoiceeParty1(
            String partyID,
            String agencyCode,
            List<String> name,
            Address2 address,
            String taxRegistrationID,
            String vATRegistrationID) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
        this.name = name;
        this.address = address;
        this.taxRegistrationID = taxRegistrationID;
        this.vATRegistrationID = vATRegistrationID;
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
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("Name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Getter for Address.
     * @return Returns the Address2
     */
    @JsonGetter("Address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address2 getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for Address2
     */
    @JsonSetter("Address")
    public void setAddress(Address2 address) {
        this.address = address;
    }

    /**
     * Getter for TaxRegistrationID.
     * @return Returns the String
     */
    @JsonGetter("TaxRegistrationID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxRegistrationID() {
        return taxRegistrationID;
    }

    /**
     * Setter for TaxRegistrationID.
     * @param taxRegistrationID Value for String
     */
    @JsonSetter("TaxRegistrationID")
    public void setTaxRegistrationID(String taxRegistrationID) {
        this.taxRegistrationID = taxRegistrationID;
    }

    /**
     * Getter for VATRegistrationID.
     * @return Returns the String
     */
    @JsonGetter("VATRegistrationID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVATRegistrationID() {
        return vATRegistrationID;
    }

    /**
     * Setter for VATRegistrationID.
     * @param vATRegistrationID Value for String
     */
    @JsonSetter("VATRegistrationID")
    public void setVATRegistrationID(String vATRegistrationID) {
        this.vATRegistrationID = vATRegistrationID;
    }

    /**
     * Converts this InvoiceeParty1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceeParty1 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + ", name="
                + name + ", address=" + address + ", taxRegistrationID=" + taxRegistrationID
                + ", vATRegistrationID=" + vATRegistrationID + "]";
    }

    /**
     * Builds a new {@link InvoiceeParty1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceeParty1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(partyID, agencyCode)
                .name(getName())
                .address(getAddress())
                .taxRegistrationID(getTaxRegistrationID())
                .vATRegistrationID(getVATRegistrationID());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceeParty1}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private List<String> name;
        private Address2 address;
        private String taxRegistrationID;
        private String vATRegistrationID;

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
         * Setter for name.
         * @param  name  List of String value for name.
         * @return Builder
         */
        public Builder name(List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  Address2 value for address.
         * @return Builder
         */
        public Builder address(Address2 address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for taxRegistrationID.
         * @param  taxRegistrationID  String value for taxRegistrationID.
         * @return Builder
         */
        public Builder taxRegistrationID(String taxRegistrationID) {
            this.taxRegistrationID = taxRegistrationID;
            return this;
        }

        /**
         * Setter for vATRegistrationID.
         * @param  vATRegistrationID  String value for vATRegistrationID.
         * @return Builder
         */
        public Builder vATRegistrationID(String vATRegistrationID) {
            this.vATRegistrationID = vATRegistrationID;
            return this;
        }

        /**
         * Builds a new {@link InvoiceeParty1} object using the set fields.
         * @return {@link InvoiceeParty1}
         */
        public InvoiceeParty1 build() {
            return new InvoiceeParty1(partyID, agencyCode, name, address, taxRegistrationID,
                    vATRegistrationID);
        }
    }
}
