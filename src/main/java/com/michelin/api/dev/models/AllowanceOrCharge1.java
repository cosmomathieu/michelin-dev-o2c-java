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
 * This is a model class for AllowanceOrCharge1 type.
 */
public class AllowanceOrCharge1 {
    private String allowanceOrChargeTypeCode;
    private String otherChargeTypeCode;
    private String agencyCode;
    private AllowanceOrChargeAmount allowanceOrChargeAmount;
    private TaxDetails1 taxDetails;

    /**
     * Default constructor.
     */
    public AllowanceOrCharge1() {
    }

    /**
     * Initialization constructor.
     * @param  allowanceOrChargeTypeCode  String value for allowanceOrChargeTypeCode.
     * @param  otherChargeTypeCode  String value for otherChargeTypeCode.
     * @param  agencyCode  String value for agencyCode.
     * @param  allowanceOrChargeAmount  AllowanceOrChargeAmount value for allowanceOrChargeAmount.
     * @param  taxDetails  TaxDetails1 value for taxDetails.
     */
    public AllowanceOrCharge1(
            String allowanceOrChargeTypeCode,
            String otherChargeTypeCode,
            String agencyCode,
            AllowanceOrChargeAmount allowanceOrChargeAmount,
            TaxDetails1 taxDetails) {
        this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
        this.otherChargeTypeCode = otherChargeTypeCode;
        this.agencyCode = agencyCode;
        this.allowanceOrChargeAmount = allowanceOrChargeAmount;
        this.taxDetails = taxDetails;
    }

    /**
     * Getter for AllowanceOrChargeTypeCode.
     * @return Returns the String
     */
    @JsonGetter("AllowanceOrChargeTypeCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllowanceOrChargeTypeCode() {
        return allowanceOrChargeTypeCode;
    }

    /**
     * Setter for AllowanceOrChargeTypeCode.
     * @param allowanceOrChargeTypeCode Value for String
     */
    @JsonSetter("AllowanceOrChargeTypeCode")
    public void setAllowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) {
        this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
    }

    /**
     * Getter for OtherChargeTypeCode.
     * @return Returns the String
     */
    @JsonGetter("OtherChargeTypeCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOtherChargeTypeCode() {
        return otherChargeTypeCode;
    }

    /**
     * Setter for OtherChargeTypeCode.
     * @param otherChargeTypeCode Value for String
     */
    @JsonSetter("OtherChargeTypeCode")
    public void setOtherChargeTypeCode(String otherChargeTypeCode) {
        this.otherChargeTypeCode = otherChargeTypeCode;
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
     * Getter for AllowanceOrChargeAmount.
     * @return Returns the AllowanceOrChargeAmount
     */
    @JsonGetter("AllowanceOrChargeAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowanceOrChargeAmount getAllowanceOrChargeAmount() {
        return allowanceOrChargeAmount;
    }

    /**
     * Setter for AllowanceOrChargeAmount.
     * @param allowanceOrChargeAmount Value for AllowanceOrChargeAmount
     */
    @JsonSetter("AllowanceOrChargeAmount")
    public void setAllowanceOrChargeAmount(AllowanceOrChargeAmount allowanceOrChargeAmount) {
        this.allowanceOrChargeAmount = allowanceOrChargeAmount;
    }

    /**
     * Getter for TaxDetails.
     * @return Returns the TaxDetails1
     */
    @JsonGetter("TaxDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxDetails1 getTaxDetails() {
        return taxDetails;
    }

    /**
     * Setter for TaxDetails.
     * @param taxDetails Value for TaxDetails1
     */
    @JsonSetter("TaxDetails")
    public void setTaxDetails(TaxDetails1 taxDetails) {
        this.taxDetails = taxDetails;
    }

    /**
     * Converts this AllowanceOrCharge1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllowanceOrCharge1 [" + "allowanceOrChargeTypeCode=" + allowanceOrChargeTypeCode
                + ", otherChargeTypeCode=" + otherChargeTypeCode + ", agencyCode=" + agencyCode
                + ", allowanceOrChargeAmount=" + allowanceOrChargeAmount + ", taxDetails="
                + taxDetails + "]";
    }

    /**
     * Builds a new {@link AllowanceOrCharge1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllowanceOrCharge1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allowanceOrChargeTypeCode(getAllowanceOrChargeTypeCode())
                .otherChargeTypeCode(getOtherChargeTypeCode())
                .agencyCode(getAgencyCode())
                .allowanceOrChargeAmount(getAllowanceOrChargeAmount())
                .taxDetails(getTaxDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link AllowanceOrCharge1}.
     */
    public static class Builder {
        private String allowanceOrChargeTypeCode;
        private String otherChargeTypeCode;
        private String agencyCode;
        private AllowanceOrChargeAmount allowanceOrChargeAmount;
        private TaxDetails1 taxDetails;



        /**
         * Setter for allowanceOrChargeTypeCode.
         * @param  allowanceOrChargeTypeCode  String value for allowanceOrChargeTypeCode.
         * @return Builder
         */
        public Builder allowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) {
            this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
            return this;
        }

        /**
         * Setter for otherChargeTypeCode.
         * @param  otherChargeTypeCode  String value for otherChargeTypeCode.
         * @return Builder
         */
        public Builder otherChargeTypeCode(String otherChargeTypeCode) {
            this.otherChargeTypeCode = otherChargeTypeCode;
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
         * Setter for allowanceOrChargeAmount.
         * @param  allowanceOrChargeAmount  AllowanceOrChargeAmount value for
         *         allowanceOrChargeAmount.
         * @return Builder
         */
        public Builder allowanceOrChargeAmount(AllowanceOrChargeAmount allowanceOrChargeAmount) {
            this.allowanceOrChargeAmount = allowanceOrChargeAmount;
            return this;
        }

        /**
         * Setter for taxDetails.
         * @param  taxDetails  TaxDetails1 value for taxDetails.
         * @return Builder
         */
        public Builder taxDetails(TaxDetails1 taxDetails) {
            this.taxDetails = taxDetails;
            return this;
        }

        /**
         * Builds a new {@link AllowanceOrCharge1} object using the set fields.
         * @return {@link AllowanceOrCharge1}
         */
        public AllowanceOrCharge1 build() {
            return new AllowanceOrCharge1(allowanceOrChargeTypeCode, otherChargeTypeCode,
                    agencyCode, allowanceOrChargeAmount, taxDetails);
        }
    }
}
