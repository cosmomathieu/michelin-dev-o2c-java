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
 * This is a model class for SupplierParty8 type.
 */
public class SupplierParty8 {
    private String partyID;
    private String agencyCode;
    private List<String> name;
    private Address19 address;
    private InformationContact12 informationContact;

    /**
     * Default constructor.
     */
    public SupplierParty8() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  name  List of String value for name.
     * @param  address  Address19 value for address.
     * @param  informationContact  InformationContact12 value for informationContact.
     */
    public SupplierParty8(
            String partyID,
            String agencyCode,
            List<String> name,
            Address19 address,
            InformationContact12 informationContact) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
        this.name = name;
        this.address = address;
        this.informationContact = informationContact;
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
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Getter for Address.
     * @return Returns the Address19
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address19 getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for Address19
     */
    @JsonSetter("address")
    public void setAddress(Address19 address) {
        this.address = address;
    }

    /**
     * Getter for InformationContact.
     * @return Returns the InformationContact12
     */
    @JsonGetter("informationContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InformationContact12 getInformationContact() {
        return informationContact;
    }

    /**
     * Setter for InformationContact.
     * @param informationContact Value for InformationContact12
     */
    @JsonSetter("informationContact")
    public void setInformationContact(InformationContact12 informationContact) {
        this.informationContact = informationContact;
    }

    /**
     * Converts this SupplierParty8 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplierParty8 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + ", name="
                + name + ", address=" + address + ", informationContact=" + informationContact
                + "]";
    }

    /**
     * Builds a new {@link SupplierParty8.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplierParty8.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .partyID(getPartyID())
                .agencyCode(getAgencyCode())
                .name(getName())
                .address(getAddress())
                .informationContact(getInformationContact());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplierParty8}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private List<String> name;
        private Address19 address;
        private InformationContact12 informationContact;



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
         * @param  address  Address19 value for address.
         * @return Builder
         */
        public Builder address(Address19 address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for informationContact.
         * @param  informationContact  InformationContact12 value for informationContact.
         * @return Builder
         */
        public Builder informationContact(InformationContact12 informationContact) {
            this.informationContact = informationContact;
            return this;
        }

        /**
         * Builds a new {@link SupplierParty8} object using the set fields.
         * @return {@link SupplierParty8}
         */
        public SupplierParty8 build() {
            return new SupplierParty8(partyID, agencyCode, name, address, informationContact);
        }
    }
}
