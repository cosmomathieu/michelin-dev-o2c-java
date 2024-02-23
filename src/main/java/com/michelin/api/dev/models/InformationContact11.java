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
 * This is a model class for InformationContact11 type.
 */
public class InformationContact11 {
    private String contactID;
    private String name;
    private String telephoneNumber;
    private String telephoneExtension;
    private String faxNumber;
    private String emailAddress;

    /**
     * Default constructor.
     */
    public InformationContact11() {
    }

    /**
     * Initialization constructor.
     * @param  contactID  String value for contactID.
     * @param  name  String value for name.
     * @param  telephoneNumber  String value for telephoneNumber.
     * @param  telephoneExtension  String value for telephoneExtension.
     * @param  faxNumber  String value for faxNumber.
     * @param  emailAddress  String value for emailAddress.
     */
    public InformationContact11(
            String contactID,
            String name,
            String telephoneNumber,
            String telephoneExtension,
            String faxNumber,
            String emailAddress) {
        this.contactID = contactID;
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.telephoneExtension = telephoneExtension;
        this.faxNumber = faxNumber;
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for ContactID.
     * @return Returns the String
     */
    @JsonGetter("ContactID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContactID() {
        return contactID;
    }

    /**
     * Setter for ContactID.
     * @param contactID Value for String
     */
    @JsonSetter("ContactID")
    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for TelephoneNumber.
     * @return Returns the String
     */
    @JsonGetter("TelephoneNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Setter for TelephoneNumber.
     * @param telephoneNumber Value for String
     */
    @JsonSetter("TelephoneNumber")
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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
     * Getter for FaxNumber.
     * @return Returns the String
     */
    @JsonGetter("FaxNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Setter for FaxNumber.
     * @param faxNumber Value for String
     */
    @JsonSetter("FaxNumber")
    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    /**
     * Getter for EmailAddress.
     * @return Returns the String
     */
    @JsonGetter("EmailAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * @param emailAddress Value for String
     */
    @JsonSetter("EmailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Converts this InformationContact11 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InformationContact11 [" + "contactID=" + contactID + ", name=" + name
                + ", telephoneNumber=" + telephoneNumber + ", telephoneExtension="
                + telephoneExtension + ", faxNumber=" + faxNumber + ", emailAddress=" + emailAddress
                + "]";
    }

    /**
     * Builds a new {@link InformationContact11.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InformationContact11.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .contactID(getContactID())
                .name(getName())
                .telephoneNumber(getTelephoneNumber())
                .telephoneExtension(getTelephoneExtension())
                .faxNumber(getFaxNumber())
                .emailAddress(getEmailAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link InformationContact11}.
     */
    public static class Builder {
        private String contactID;
        private String name;
        private String telephoneNumber;
        private String telephoneExtension;
        private String faxNumber;
        private String emailAddress;



        /**
         * Setter for contactID.
         * @param  contactID  String value for contactID.
         * @return Builder
         */
        public Builder contactID(String contactID) {
            this.contactID = contactID;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for telephoneNumber.
         * @param  telephoneNumber  String value for telephoneNumber.
         * @return Builder
         */
        public Builder telephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
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
         * Setter for faxNumber.
         * @param  faxNumber  String value for faxNumber.
         * @return Builder
         */
        public Builder faxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Builds a new {@link InformationContact11} object using the set fields.
         * @return {@link InformationContact11}
         */
        public InformationContact11 build() {
            return new InformationContact11(contactID, name, telephoneNumber, telephoneExtension,
                    faxNumber, emailAddress);
        }
    }
}
