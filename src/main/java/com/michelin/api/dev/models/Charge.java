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
 * This is a model class for Charge type.
 */
public class Charge {
    private String chargeCategory;
    private ChargeAmount chargeAmount;
    private String chargePercent;

    /**
     * Default constructor.
     */
    public Charge() {
    }

    /**
     * Initialization constructor.
     * @param  chargeCategory  String value for chargeCategory.
     * @param  chargeAmount  ChargeAmount value for chargeAmount.
     * @param  chargePercent  String value for chargePercent.
     */
    public Charge(
            String chargeCategory,
            ChargeAmount chargeAmount,
            String chargePercent) {
        this.chargeCategory = chargeCategory;
        this.chargeAmount = chargeAmount;
        this.chargePercent = chargePercent;
    }

    /**
     * Getter for ChargeCategory.
     * @return Returns the String
     */
    @JsonGetter("ChargeCategory")
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * Setter for ChargeCategory.
     * @param chargeCategory Value for String
     */
    @JsonSetter("ChargeCategory")
    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

    /**
     * Getter for ChargeAmount.
     * @return Returns the ChargeAmount
     */
    @JsonGetter("ChargeAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeAmount getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Setter for ChargeAmount.
     * @param chargeAmount Value for ChargeAmount
     */
    @JsonSetter("ChargeAmount")
    public void setChargeAmount(ChargeAmount chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * Getter for ChargePercent.
     * @return Returns the String
     */
    @JsonGetter("ChargePercent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChargePercent() {
        return chargePercent;
    }

    /**
     * Setter for ChargePercent.
     * @param chargePercent Value for String
     */
    @JsonSetter("ChargePercent")
    public void setChargePercent(String chargePercent) {
        this.chargePercent = chargePercent;
    }

    /**
     * Converts this Charge into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Charge [" + "chargeCategory=" + chargeCategory + ", chargeAmount=" + chargeAmount
                + ", chargePercent=" + chargePercent + "]";
    }

    /**
     * Builds a new {@link Charge.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Charge.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(chargeCategory)
                .chargeAmount(getChargeAmount())
                .chargePercent(getChargePercent());
        return builder;
    }

    /**
     * Class to build instances of {@link Charge}.
     */
    public static class Builder {
        private String chargeCategory;
        private ChargeAmount chargeAmount;
        private String chargePercent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  chargeCategory  String value for chargeCategory.
         */
        public Builder(String chargeCategory) {
            this.chargeCategory = chargeCategory;
        }

        /**
         * Setter for chargeCategory.
         * @param  chargeCategory  String value for chargeCategory.
         * @return Builder
         */
        public Builder chargeCategory(String chargeCategory) {
            this.chargeCategory = chargeCategory;
            return this;
        }

        /**
         * Setter for chargeAmount.
         * @param  chargeAmount  ChargeAmount value for chargeAmount.
         * @return Builder
         */
        public Builder chargeAmount(ChargeAmount chargeAmount) {
            this.chargeAmount = chargeAmount;
            return this;
        }

        /**
         * Setter for chargePercent.
         * @param  chargePercent  String value for chargePercent.
         * @return Builder
         */
        public Builder chargePercent(String chargePercent) {
            this.chargePercent = chargePercent;
            return this;
        }

        /**
         * Builds a new {@link Charge} object using the set fields.
         * @return {@link Charge}
         */
        public Charge build() {
            return new Charge(chargeCategory, chargeAmount, chargePercent);
        }
    }
}
