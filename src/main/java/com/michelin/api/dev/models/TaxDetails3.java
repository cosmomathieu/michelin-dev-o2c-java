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
 * This is a model class for TaxDetails3 type.
 */
public class TaxDetails3 {
    private String taxCategoryCode;
    private String taxTypeCode;
    private String taxRate;
    private String vATExemptionClause;
    private String generalDiscountClause;
    private TaxAmount taxAmount;
    private TaxableAmount taxableAmount;

    /**
     * Default constructor.
     */
    public TaxDetails3() {
    }

    /**
     * Initialization constructor.
     * @param  taxTypeCode  String value for taxTypeCode.
     * @param  taxRate  String value for taxRate.
     * @param  taxCategoryCode  String value for taxCategoryCode.
     * @param  vATExemptionClause  String value for vATExemptionClause.
     * @param  generalDiscountClause  String value for generalDiscountClause.
     * @param  taxAmount  TaxAmount value for taxAmount.
     * @param  taxableAmount  TaxableAmount value for taxableAmount.
     */
    public TaxDetails3(
            String taxTypeCode,
            String taxRate,
            String taxCategoryCode,
            String vATExemptionClause,
            String generalDiscountClause,
            TaxAmount taxAmount,
            TaxableAmount taxableAmount) {
        this.taxCategoryCode = taxCategoryCode;
        this.taxTypeCode = taxTypeCode;
        this.taxRate = taxRate;
        this.vATExemptionClause = vATExemptionClause;
        this.generalDiscountClause = generalDiscountClause;
        this.taxAmount = taxAmount;
        this.taxableAmount = taxableAmount;
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
     * Getter for VATExemptionClause.
     * @return Returns the String
     */
    @JsonGetter("VATExemptionClause")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVATExemptionClause() {
        return vATExemptionClause;
    }

    /**
     * Setter for VATExemptionClause.
     * @param vATExemptionClause Value for String
     */
    @JsonSetter("VATExemptionClause")
    public void setVATExemptionClause(String vATExemptionClause) {
        this.vATExemptionClause = vATExemptionClause;
    }

    /**
     * Getter for GeneralDiscountClause.
     * @return Returns the String
     */
    @JsonGetter("GeneralDiscountClause")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGeneralDiscountClause() {
        return generalDiscountClause;
    }

    /**
     * Setter for GeneralDiscountClause.
     * @param generalDiscountClause Value for String
     */
    @JsonSetter("GeneralDiscountClause")
    public void setGeneralDiscountClause(String generalDiscountClause) {
        this.generalDiscountClause = generalDiscountClause;
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
     * Getter for TaxableAmount.
     * @return Returns the TaxableAmount
     */
    @JsonGetter("TaxableAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxableAmount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Setter for TaxableAmount.
     * @param taxableAmount Value for TaxableAmount
     */
    @JsonSetter("TaxableAmount")
    public void setTaxableAmount(TaxableAmount taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    /**
     * Converts this TaxDetails3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxDetails3 [" + "taxTypeCode=" + taxTypeCode + ", taxRate=" + taxRate
                + ", taxCategoryCode=" + taxCategoryCode + ", vATExemptionClause="
                + vATExemptionClause + ", generalDiscountClause=" + generalDiscountClause
                + ", taxAmount=" + taxAmount + ", taxableAmount=" + taxableAmount + "]";
    }

    /**
     * Builds a new {@link TaxDetails3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxDetails3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(taxTypeCode, taxRate)
                .taxCategoryCode(getTaxCategoryCode())
                .vATExemptionClause(getVATExemptionClause())
                .generalDiscountClause(getGeneralDiscountClause())
                .taxAmount(getTaxAmount())
                .taxableAmount(getTaxableAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link TaxDetails3}.
     */
    public static class Builder {
        private String taxTypeCode;
        private String taxRate;
        private String taxCategoryCode;
        private String vATExemptionClause;
        private String generalDiscountClause;
        private TaxAmount taxAmount;
        private TaxableAmount taxableAmount;

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
         * Setter for vATExemptionClause.
         * @param  vATExemptionClause  String value for vATExemptionClause.
         * @return Builder
         */
        public Builder vATExemptionClause(String vATExemptionClause) {
            this.vATExemptionClause = vATExemptionClause;
            return this;
        }

        /**
         * Setter for generalDiscountClause.
         * @param  generalDiscountClause  String value for generalDiscountClause.
         * @return Builder
         */
        public Builder generalDiscountClause(String generalDiscountClause) {
            this.generalDiscountClause = generalDiscountClause;
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
         * Setter for taxableAmount.
         * @param  taxableAmount  TaxableAmount value for taxableAmount.
         * @return Builder
         */
        public Builder taxableAmount(TaxableAmount taxableAmount) {
            this.taxableAmount = taxableAmount;
            return this;
        }

        /**
         * Builds a new {@link TaxDetails3} object using the set fields.
         * @return {@link TaxDetails3}
         */
        public TaxDetails3 build() {
            return new TaxDetails3(taxTypeCode, taxRate, taxCategoryCode, vATExemptionClause,
                    generalDiscountClause, taxAmount, taxableAmount);
        }
    }
}
