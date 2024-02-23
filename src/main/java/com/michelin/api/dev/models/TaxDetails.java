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
 * This is a model class for TaxDetails type.
 */
public class TaxDetails {
    private String taxCategoryCode;
    private String taxTypeCode;
    private String taxRate;
    private TaxAmount taxAmount;

    /**
     * Default constructor.
     */
    public TaxDetails() {
    }

    /**
     * Initialization constructor.
     * @param  taxRate  String value for taxRate.
     * @param  taxCategoryCode  String value for taxCategoryCode.
     * @param  taxTypeCode  String value for taxTypeCode.
     * @param  taxAmount  TaxAmount value for taxAmount.
     */
    public TaxDetails(
            String taxRate,
            String taxCategoryCode,
            String taxTypeCode,
            TaxAmount taxAmount) {
        this.taxCategoryCode = taxCategoryCode;
        this.taxTypeCode = taxTypeCode;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TaxCategoryCode.
     * @return Returns the String
     */
    @JsonGetter("TaxCategoryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCategoryCode() {
        return taxCategoryCode;
    }

    /**
     * Setter for TaxCategoryCode.
     * @param taxCategoryCode Value for String
     */
    @JsonSetter("TaxCategoryCode")
    public void setTaxCategoryCode(String taxCategoryCode) {
        this.taxCategoryCode = taxCategoryCode;
    }

    /**
     * Getter for TaxTypeCode.
     * @return Returns the String
     */
    @JsonGetter("TaxTypeCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Setter for TaxTypeCode.
     * @param taxTypeCode Value for String
     */
    @JsonSetter("TaxTypeCode")
    public void setTaxTypeCode(String taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
    }

    /**
     * Getter for TaxRate.
     * @return Returns the String
     */
    @JsonGetter("TaxRate")
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Setter for TaxRate.
     * @param taxRate Value for String
     */
    @JsonSetter("TaxRate")
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Getter for TaxAmount.
     * @return Returns the TaxAmount
     */
    @JsonGetter("TaxAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for TaxAmount
     */
    @JsonSetter("TaxAmount")
    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Converts this TaxDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxDetails [" + "taxRate=" + taxRate + ", taxCategoryCode=" + taxCategoryCode
                + ", taxTypeCode=" + taxTypeCode + ", taxAmount=" + taxAmount + "]";
    }

    /**
     * Builds a new {@link TaxDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(taxRate)
                .taxCategoryCode(getTaxCategoryCode())
                .taxTypeCode(getTaxTypeCode())
                .taxAmount(getTaxAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link TaxDetails}.
     */
    public static class Builder {
        private String taxRate;
        private String taxCategoryCode;
        private String taxTypeCode;
        private TaxAmount taxAmount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  taxRate  String value for taxRate.
         */
        public Builder(String taxRate) {
            this.taxRate = taxRate;
        }

        /**
         * Setter for taxRate.
         * @param  taxRate  String value for taxRate.
         * @return Builder
         */
        public Builder taxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        /**
         * Setter for taxCategoryCode.
         * @param  taxCategoryCode  String value for taxCategoryCode.
         * @return Builder
         */
        public Builder taxCategoryCode(String taxCategoryCode) {
            this.taxCategoryCode = taxCategoryCode;
            return this;
        }

        /**
         * Setter for taxTypeCode.
         * @param  taxTypeCode  String value for taxTypeCode.
         * @return Builder
         */
        public Builder taxTypeCode(String taxTypeCode) {
            this.taxTypeCode = taxTypeCode;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  TaxAmount value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(TaxAmount taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Builds a new {@link TaxDetails} object using the set fields.
         * @return {@link TaxDetails}
         */
        public TaxDetails build() {
            return new TaxDetails(taxRate, taxCategoryCode, taxTypeCode, taxAmount);
        }
    }
}
