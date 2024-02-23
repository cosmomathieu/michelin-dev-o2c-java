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
 * This is a model class for AllowanceOrCharge type.
 */
public class AllowanceOrCharge {
    private String allowanceOrChargeTypeCode;
    private String otherChargeTypeCode;
    private String agencyCode;
    private String allowanceOrChargeNumber;
    private String allowanceOrChargeName;
    private String allowanceOrChargePercent;
    private AllowanceOrChargeAmount allowanceOrChargeAmount;
    private List<TaxDetails1> taxDetails;

    /**
     * Default constructor.
     */
    public AllowanceOrCharge() {
    }

    /**
     * Initialization constructor.
     * @param  allowanceOrChargeAmount  AllowanceOrChargeAmount value for allowanceOrChargeAmount.
     * @param  allowanceOrChargeTypeCode  String value for allowanceOrChargeTypeCode.
     * @param  otherChargeTypeCode  String value for otherChargeTypeCode.
     * @param  agencyCode  String value for agencyCode.
     * @param  allowanceOrChargeNumber  String value for allowanceOrChargeNumber.
     * @param  allowanceOrChargeName  String value for allowanceOrChargeName.
     * @param  allowanceOrChargePercent  String value for allowanceOrChargePercent.
     * @param  taxDetails  List of TaxDetails1 value for taxDetails.
     */
    public AllowanceOrCharge(
            AllowanceOrChargeAmount allowanceOrChargeAmount,
            String allowanceOrChargeTypeCode,
            String otherChargeTypeCode,
            String agencyCode,
            String allowanceOrChargeNumber,
            String allowanceOrChargeName,
            String allowanceOrChargePercent,
            List<TaxDetails1> taxDetails) {
        this.allowanceOrChargeTypeCode = allowanceOrChargeTypeCode;
        this.otherChargeTypeCode = otherChargeTypeCode;
        this.agencyCode = agencyCode;
        this.allowanceOrChargeNumber = allowanceOrChargeNumber;
        this.allowanceOrChargeName = allowanceOrChargeName;
        this.allowanceOrChargePercent = allowanceOrChargePercent;
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
     * Getter for AllowanceOrChargeNumber.
     * @return Returns the String
     */
    @JsonGetter("AllowanceOrChargeNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllowanceOrChargeNumber() {
        return allowanceOrChargeNumber;
    }

    /**
     * Setter for AllowanceOrChargeNumber.
     * @param allowanceOrChargeNumber Value for String
     */
    @JsonSetter("AllowanceOrChargeNumber")
    public void setAllowanceOrChargeNumber(String allowanceOrChargeNumber) {
        this.allowanceOrChargeNumber = allowanceOrChargeNumber;
    }

    /**
     * Getter for AllowanceOrChargeName.
     * @return Returns the String
     */
    @JsonGetter("AllowanceOrChargeName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllowanceOrChargeName() {
        return allowanceOrChargeName;
    }

    /**
     * Setter for AllowanceOrChargeName.
     * @param allowanceOrChargeName Value for String
     */
    @JsonSetter("AllowanceOrChargeName")
    public void setAllowanceOrChargeName(String allowanceOrChargeName) {
        this.allowanceOrChargeName = allowanceOrChargeName;
    }

    /**
     * Getter for AllowanceOrChargePercent.
     * @return Returns the String
     */
    @JsonGetter("AllowanceOrChargePercent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAllowanceOrChargePercent() {
        return allowanceOrChargePercent;
    }

    /**
     * Setter for AllowanceOrChargePercent.
     * @param allowanceOrChargePercent Value for String
     */
    @JsonSetter("AllowanceOrChargePercent")
    public void setAllowanceOrChargePercent(String allowanceOrChargePercent) {
        this.allowanceOrChargePercent = allowanceOrChargePercent;
    }

    /**
     * Getter for AllowanceOrChargeAmount.
     * @return Returns the AllowanceOrChargeAmount
     */
    @JsonGetter("AllowanceOrChargeAmount")
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
     * @return Returns the List of TaxDetails1
     */
    @JsonGetter("TaxDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TaxDetails1> getTaxDetails() {
        return taxDetails;
    }

    /**
     * Setter for TaxDetails.
     * @param taxDetails Value for List of TaxDetails1
     */
    @JsonSetter("TaxDetails")
    public void setTaxDetails(List<TaxDetails1> taxDetails) {
        this.taxDetails = taxDetails;
    }

    /**
     * Converts this AllowanceOrCharge into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllowanceOrCharge [" + "allowanceOrChargeAmount=" + allowanceOrChargeAmount
                + ", allowanceOrChargeTypeCode=" + allowanceOrChargeTypeCode
                + ", otherChargeTypeCode=" + otherChargeTypeCode + ", agencyCode=" + agencyCode
                + ", allowanceOrChargeNumber=" + allowanceOrChargeNumber
                + ", allowanceOrChargeName=" + allowanceOrChargeName + ", allowanceOrChargePercent="
                + allowanceOrChargePercent + ", taxDetails=" + taxDetails + "]";
    }

    /**
     * Builds a new {@link AllowanceOrCharge.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllowanceOrCharge.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(allowanceOrChargeAmount)
                .allowanceOrChargeTypeCode(getAllowanceOrChargeTypeCode())
                .otherChargeTypeCode(getOtherChargeTypeCode())
                .agencyCode(getAgencyCode())
                .allowanceOrChargeNumber(getAllowanceOrChargeNumber())
                .allowanceOrChargeName(getAllowanceOrChargeName())
                .allowanceOrChargePercent(getAllowanceOrChargePercent())
                .taxDetails(getTaxDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link AllowanceOrCharge}.
     */
    public static class Builder {
        private AllowanceOrChargeAmount allowanceOrChargeAmount;
        private String allowanceOrChargeTypeCode;
        private String otherChargeTypeCode;
        private String agencyCode;
        private String allowanceOrChargeNumber;
        private String allowanceOrChargeName;
        private String allowanceOrChargePercent;
        private List<TaxDetails1> taxDetails;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  allowanceOrChargeAmount  AllowanceOrChargeAmount value for
         *         allowanceOrChargeAmount.
         */
        public Builder(AllowanceOrChargeAmount allowanceOrChargeAmount) {
            this.allowanceOrChargeAmount = allowanceOrChargeAmount;
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
         * Setter for allowanceOrChargeNumber.
         * @param  allowanceOrChargeNumber  String value for allowanceOrChargeNumber.
         * @return Builder
         */
        public Builder allowanceOrChargeNumber(String allowanceOrChargeNumber) {
            this.allowanceOrChargeNumber = allowanceOrChargeNumber;
            return this;
        }

        /**
         * Setter for allowanceOrChargeName.
         * @param  allowanceOrChargeName  String value for allowanceOrChargeName.
         * @return Builder
         */
        public Builder allowanceOrChargeName(String allowanceOrChargeName) {
            this.allowanceOrChargeName = allowanceOrChargeName;
            return this;
        }

        /**
         * Setter for allowanceOrChargePercent.
         * @param  allowanceOrChargePercent  String value for allowanceOrChargePercent.
         * @return Builder
         */
        public Builder allowanceOrChargePercent(String allowanceOrChargePercent) {
            this.allowanceOrChargePercent = allowanceOrChargePercent;
            return this;
        }

        /**
         * Setter for taxDetails.
         * @param  taxDetails  List of TaxDetails1 value for taxDetails.
         * @return Builder
         */
        public Builder taxDetails(List<TaxDetails1> taxDetails) {
            this.taxDetails = taxDetails;
            return this;
        }

        /**
         * Builds a new {@link AllowanceOrCharge} object using the set fields.
         * @return {@link AllowanceOrCharge}
         */
        public AllowanceOrCharge build() {
            return new AllowanceOrCharge(allowanceOrChargeAmount, allowanceOrChargeTypeCode,
                    otherChargeTypeCode, agencyCode, allowanceOrChargeNumber, allowanceOrChargeName,
                    allowanceOrChargePercent, taxDetails);
        }
    }
}
