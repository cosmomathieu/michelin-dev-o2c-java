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
 * This is a model class for ChargeAmount2 type.
 */
public class ChargeAmount2 {
    private String amountValue;

    /**
     * Default constructor.
     */
    public ChargeAmount2() {
    }

    /**
     * Initialization constructor.
     * @param  amountValue  String value for amountValue.
     */
    public ChargeAmount2(
            String amountValue) {
        this.amountValue = amountValue;
    }

    /**
     * Getter for AmountValue.
     * @return Returns the String
     */
    @JsonGetter("amountValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmountValue() {
        return amountValue;
    }

    /**
     * Setter for AmountValue.
     * @param amountValue Value for String
     */
    @JsonSetter("amountValue")
    public void setAmountValue(String amountValue) {
        this.amountValue = amountValue;
    }

    /**
     * Converts this ChargeAmount2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeAmount2 [" + "amountValue=" + amountValue + "]";
    }

    /**
     * Builds a new {@link ChargeAmount2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeAmount2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amountValue(getAmountValue());
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeAmount2}.
     */
    public static class Builder {
        private String amountValue;



        /**
         * Setter for amountValue.
         * @param  amountValue  String value for amountValue.
         * @return Builder
         */
        public Builder amountValue(String amountValue) {
            this.amountValue = amountValue;
            return this;
        }

        /**
         * Builds a new {@link ChargeAmount2} object using the set fields.
         * @return {@link ChargeAmount2}
         */
        public ChargeAmount2 build() {
            return new ChargeAmount2(amountValue);
        }
    }
}
