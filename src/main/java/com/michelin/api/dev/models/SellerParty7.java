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
 * This is a model class for SellerParty7 type.
 */
public class SellerParty7 {
    private String partyID;
    private String agencyCode;
    private List<String> name;
    private String legalName;
    private Address2 address;
    private InformationContact11 informationContact;
    private SupplierParty7 supplierParty;
    private String taxRegistrationID;
    private String vATRegistrationID;
    private String sIRENNumber;
    private String tribunalRegistrationNumber;
    private String companyLegalForm;
    private String companyRegisteredCapital;

    /**
     * Default constructor.
     */
    public SellerParty7() {
    }

    /**
     * Initialization constructor.
     * @param  partyID  String value for partyID.
     * @param  agencyCode  String value for agencyCode.
     * @param  name  List of String value for name.
     * @param  legalName  String value for legalName.
     * @param  address  Address2 value for address.
     * @param  informationContact  InformationContact11 value for informationContact.
     * @param  supplierParty  SupplierParty7 value for supplierParty.
     * @param  taxRegistrationID  String value for taxRegistrationID.
     * @param  vATRegistrationID  String value for vATRegistrationID.
     * @param  sIRENNumber  String value for sIRENNumber.
     * @param  tribunalRegistrationNumber  String value for tribunalRegistrationNumber.
     * @param  companyLegalForm  String value for companyLegalForm.
     * @param  companyRegisteredCapital  String value for companyRegisteredCapital.
     */
    public SellerParty7(
            String partyID,
            String agencyCode,
            List<String> name,
            String legalName,
            Address2 address,
            InformationContact11 informationContact,
            SupplierParty7 supplierParty,
            String taxRegistrationID,
            String vATRegistrationID,
            String sIRENNumber,
            String tribunalRegistrationNumber,
            String companyLegalForm,
            String companyRegisteredCapital) {
        this.partyID = partyID;
        this.agencyCode = agencyCode;
        this.name = name;
        this.legalName = legalName;
        this.address = address;
        this.informationContact = informationContact;
        this.supplierParty = supplierParty;
        this.taxRegistrationID = taxRegistrationID;
        this.vATRegistrationID = vATRegistrationID;
        this.sIRENNumber = sIRENNumber;
        this.tribunalRegistrationNumber = tribunalRegistrationNumber;
        this.companyLegalForm = companyLegalForm;
        this.companyRegisteredCapital = companyRegisteredCapital;
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
     * Getter for LegalName.
     * @return Returns the String
     */
    @JsonGetter("LegalName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLegalName() {
        return legalName;
    }

    /**
     * Setter for LegalName.
     * @param legalName Value for String
     */
    @JsonSetter("LegalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
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
     * Getter for InformationContact.
     * @return Returns the InformationContact11
     */
    @JsonGetter("InformationContact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InformationContact11 getInformationContact() {
        return informationContact;
    }

    /**
     * Setter for InformationContact.
     * @param informationContact Value for InformationContact11
     */
    @JsonSetter("InformationContact")
    public void setInformationContact(InformationContact11 informationContact) {
        this.informationContact = informationContact;
    }

    /**
     * Getter for SupplierParty.
     * @return Returns the SupplierParty7
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty7 getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty7
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty7 supplierParty) {
        this.supplierParty = supplierParty;
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
     * Getter for SIRENNumber.
     * @return Returns the String
     */
    @JsonGetter("SIRENNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSIRENNumber() {
        return sIRENNumber;
    }

    /**
     * Setter for SIRENNumber.
     * @param sIRENNumber Value for String
     */
    @JsonSetter("SIRENNumber")
    public void setSIRENNumber(String sIRENNumber) {
        this.sIRENNumber = sIRENNumber;
    }

    /**
     * Getter for TribunalRegistrationNumber.
     * @return Returns the String
     */
    @JsonGetter("TribunalRegistrationNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTribunalRegistrationNumber() {
        return tribunalRegistrationNumber;
    }

    /**
     * Setter for TribunalRegistrationNumber.
     * @param tribunalRegistrationNumber Value for String
     */
    @JsonSetter("TribunalRegistrationNumber")
    public void setTribunalRegistrationNumber(String tribunalRegistrationNumber) {
        this.tribunalRegistrationNumber = tribunalRegistrationNumber;
    }

    /**
     * Getter for CompanyLegalForm.
     * @return Returns the String
     */
    @JsonGetter("CompanyLegalForm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyLegalForm() {
        return companyLegalForm;
    }

    /**
     * Setter for CompanyLegalForm.
     * @param companyLegalForm Value for String
     */
    @JsonSetter("CompanyLegalForm")
    public void setCompanyLegalForm(String companyLegalForm) {
        this.companyLegalForm = companyLegalForm;
    }

    /**
     * Getter for CompanyRegisteredCapital.
     * @return Returns the String
     */
    @JsonGetter("CompanyRegisteredCapital")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyRegisteredCapital() {
        return companyRegisteredCapital;
    }

    /**
     * Setter for CompanyRegisteredCapital.
     * @param companyRegisteredCapital Value for String
     */
    @JsonSetter("CompanyRegisteredCapital")
    public void setCompanyRegisteredCapital(String companyRegisteredCapital) {
        this.companyRegisteredCapital = companyRegisteredCapital;
    }

    /**
     * Converts this SellerParty7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SellerParty7 [" + "partyID=" + partyID + ", agencyCode=" + agencyCode + ", name="
                + name + ", legalName=" + legalName + ", address=" + address
                + ", informationContact=" + informationContact + ", supplierParty=" + supplierParty
                + ", taxRegistrationID=" + taxRegistrationID + ", vATRegistrationID="
                + vATRegistrationID + ", sIRENNumber=" + sIRENNumber
                + ", tribunalRegistrationNumber=" + tribunalRegistrationNumber
                + ", companyLegalForm=" + companyLegalForm + ", companyRegisteredCapital="
                + companyRegisteredCapital + "]";
    }

    /**
     * Builds a new {@link SellerParty7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SellerParty7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(partyID, agencyCode)
                .name(getName())
                .legalName(getLegalName())
                .address(getAddress())
                .informationContact(getInformationContact())
                .supplierParty(getSupplierParty())
                .taxRegistrationID(getTaxRegistrationID())
                .vATRegistrationID(getVATRegistrationID())
                .sIRENNumber(getSIRENNumber())
                .tribunalRegistrationNumber(getTribunalRegistrationNumber())
                .companyLegalForm(getCompanyLegalForm())
                .companyRegisteredCapital(getCompanyRegisteredCapital());
        return builder;
    }

    /**
     * Class to build instances of {@link SellerParty7}.
     */
    public static class Builder {
        private String partyID;
        private String agencyCode;
        private List<String> name;
        private String legalName;
        private Address2 address;
        private InformationContact11 informationContact;
        private SupplierParty7 supplierParty;
        private String taxRegistrationID;
        private String vATRegistrationID;
        private String sIRENNumber;
        private String tribunalRegistrationNumber;
        private String companyLegalForm;
        private String companyRegisteredCapital;

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
         * Setter for legalName.
         * @param  legalName  String value for legalName.
         * @return Builder
         */
        public Builder legalName(String legalName) {
            this.legalName = legalName;
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
         * Setter for informationContact.
         * @param  informationContact  InformationContact11 value for informationContact.
         * @return Builder
         */
        public Builder informationContact(InformationContact11 informationContact) {
            this.informationContact = informationContact;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty7 value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty7 supplierParty) {
            this.supplierParty = supplierParty;
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
         * Setter for sIRENNumber.
         * @param  sIRENNumber  String value for sIRENNumber.
         * @return Builder
         */
        public Builder sIRENNumber(String sIRENNumber) {
            this.sIRENNumber = sIRENNumber;
            return this;
        }

        /**
         * Setter for tribunalRegistrationNumber.
         * @param  tribunalRegistrationNumber  String value for tribunalRegistrationNumber.
         * @return Builder
         */
        public Builder tribunalRegistrationNumber(String tribunalRegistrationNumber) {
            this.tribunalRegistrationNumber = tribunalRegistrationNumber;
            return this;
        }

        /**
         * Setter for companyLegalForm.
         * @param  companyLegalForm  String value for companyLegalForm.
         * @return Builder
         */
        public Builder companyLegalForm(String companyLegalForm) {
            this.companyLegalForm = companyLegalForm;
            return this;
        }

        /**
         * Setter for companyRegisteredCapital.
         * @param  companyRegisteredCapital  String value for companyRegisteredCapital.
         * @return Builder
         */
        public Builder companyRegisteredCapital(String companyRegisteredCapital) {
            this.companyRegisteredCapital = companyRegisteredCapital;
            return this;
        }

        /**
         * Builds a new {@link SellerParty7} object using the set fields.
         * @return {@link SellerParty7}
         */
        public SellerParty7 build() {
            return new SellerParty7(partyID, agencyCode, name, legalName, address,
                    informationContact, supplierParty, taxRegistrationID, vATRegistrationID,
                    sIRENNumber, tribunalRegistrationNumber, companyLegalForm,
                    companyRegisteredCapital);
        }
    }
}
