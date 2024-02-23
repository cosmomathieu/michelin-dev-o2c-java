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
 * This is a model class for TaxDetails1 type.
 */
public class TaxDetails1 {
    private String taxCategoryCode;
    private String taxTypeCode;
    private String taxRate;

    /**
     * Default constructor.
     */
    public TaxDetails1() {
    }

    /**
     * Initialization constructor.
     * @param  taxTypeCode  String value for taxTypeCode.
     * @param  taxRate  String value for taxRate.
     * @param  taxCategoryCode  String value for taxCategoryCode.
     */
    public TaxDetails1(
            String taxTypeCode,
            String taxRate,
            String taxCategoryCode) {
        this.taxCategoryCode = taxCategoryCode;
        this.taxTypeCode = taxTypeCode;
        this.taxRate = taxRate;
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
     * Converts this TaxDetails1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxDetails1 [" + "taxTypeCode=" + taxTypeCode + ", taxRate=" + taxRate
                + ", taxCategoryCode=" + taxCategoryCode + "]";
    }

    /**
     * Builds a new {@link TaxDetails1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxDetails1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(taxTypeCode, taxRate)
                .taxCategoryCode(getTaxCategoryCode());
        return builder;
    }

    /**
     * Class to build instances of {@link TaxDetails1}.
     */
    public static class Builder {
        private String taxTypeCode;
        private String taxRate;
        private String taxCategoryCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  taxTypeCode  String value for taxTypeCode.
         * @param  taxRate  String value for taxRate.
         */
        public Builder(String taxTypeCode, String taxRate) {
            this.taxTypeCode = taxTypeCode;
            this.taxRate = taxRate;
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
         * Builds a new {@link TaxDetails1} object using the set fields.
         * @return {@link TaxDetails1}
         */
        public TaxDetails1 build() {
            return new TaxDetails1(taxTypeCode, taxRate, taxCategoryCode);
        }
    }
}
