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
 * This is a model class for Charge2 type.
 */
public class Charge2 {
    private String chargeCategory;
    private ChargeAmount2 chargeAmount;

    /**
     * Default constructor.
     */
    public Charge2() {
    }

    /**
     * Initialization constructor.
     * @param  chargeCategory  String value for chargeCategory.
     * @param  chargeAmount  ChargeAmount2 value for chargeAmount.
     */
    public Charge2(
            String chargeCategory,
            ChargeAmount2 chargeAmount) {
        this.chargeCategory = chargeCategory;
        this.chargeAmount = chargeAmount;
    }

    /**
     * Getter for ChargeCategory.
     * @return Returns the String
     */
    @JsonGetter("chargeCategory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChargeCategory() {
        return chargeCategory;
    }

    /**
     * Setter for ChargeCategory.
     * @param chargeCategory Value for String
     */
    @JsonSetter("chargeCategory")
    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

    /**
     * Getter for ChargeAmount.
     * @return Returns the ChargeAmount2
     */
    @JsonGetter("chargeAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeAmount2 getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Setter for ChargeAmount.
     * @param chargeAmount Value for ChargeAmount2
     */
    @JsonSetter("chargeAmount")
    public void setChargeAmount(ChargeAmount2 chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * Converts this Charge2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Charge2 [" + "chargeCategory=" + chargeCategory + ", chargeAmount=" + chargeAmount
                + "]";
    }

    /**
     * Builds a new {@link Charge2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Charge2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargeCategory(getChargeCategory())
                .chargeAmount(getChargeAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link Charge2}.
     */
    public static class Builder {
        private String chargeCategory;
        private ChargeAmount2 chargeAmount;



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
         * @param  chargeAmount  ChargeAmount2 value for chargeAmount.
         * @return Builder
         */
        public Builder chargeAmount(ChargeAmount2 chargeAmount) {
            this.chargeAmount = chargeAmount;
            return this;
        }

        /**
         * Builds a new {@link Charge2} object using the set fields.
         * @return {@link Charge2}
         */
        public Charge2 build() {
            return new Charge2(chargeCategory, chargeAmount);
        }
    }
}
