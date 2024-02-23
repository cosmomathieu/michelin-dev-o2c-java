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
 * This is a model class for Consignee4 type.
 */
public class Consignee4 {
    private String partyID;
    private String agencyCode;
    private List<String> name;
    private Address10 address;
    private InformationContact informationContact;

    /**
     * Default constructor.
     */
    public Consignee4() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  name  List of String value for name.
     * @param  address  Address10 value for address.
     * @param  informationContact  InformationContact value for informationContact.
     */
    public Consignee4(
            String partyID,
            String agencyCode,
            List<String> name,
            Address10 address,
            InformationContact informationContact) {
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
     * @return Returns the Address10
     */
    @JsonGetter("Address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address10 getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for Address10
     */
    @JsonSetter("Address")
    public void setAddress(Address10 address) {
        this.address = address;
    }

    /**
     * Getter for InformationContact.
     * @return Returns the InformationContact
     */
    @JsonGetter("InformationContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InformationContact getInformationContact() {
        return informationContact;
    }

    /**
     * Setter for InformationContact.
     * @param informationContact Value for InformationContact
     */
    @JsonSetter("InformationContact")
    public void setInformationContact(InformationContact informationContact) {
        this.informationContact = informationContact;
    }

    /**
     * Converts this Consignee4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Consignee4 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + ", name="
                + name + ", address=" + address + ", informationContact=" + informationContact
                + "]";
    }

    /**
     * Builds a new {@link Consignee4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Consignee4.Builder} object
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
     * Class to build instances of {@link Consignee4}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private List<String> name;
        private Address10 address;
        private InformationContact informationContact;



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
         * @param  address  Address10 value for address.
         * @return Builder
         */
        public Builder address(Address10 address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for informationContact.
         * @param  informationContact  InformationContact value for informationContact.
         * @return Builder
         */
        public Builder informationContact(InformationContact informationContact) {
            this.informationContact = informationContact;
            return this;
        }

        /**
         * Builds a new {@link Consignee4} object using the set fields.
         * @return {@link Consignee4}
         */
        public Consignee4 build() {
            return new Consignee4(partyID, agencyCode, name, address, informationContact);
        }
    }
}
