/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AllowanceOrChargeAmount type.
 */
public class AllowanceOrChargeAmount {
    private String amountValue;

    /**
     * Default constructor.
     */
    public AllowanceOrChargeAmount() {
    }

    /**
     * Initialization constructor.
     * @param  amountValue  String value for amountValue.
     */
    public AllowanceOrChargeAmount(
            String amountValue) {
        this.amountValue = amountValue;
    }

    /**
     * Getter for AmountValue.
     * @return Returns the String
     */
    @JsonGetter("AmountValue")
    public String getAmountValue() {
        return amountValue;
    }

    /**
     * Setter for AmountValue.
     * @param amountValue Value for String
     */
    @JsonSetter("AmountValue")
    public void setAmountValue(String amountValue) {
        this.amountValue = amountValue;
    }

    /**
     * Converts this AllowanceOrChargeAmount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllowanceOrChargeAmount [" + "amountValue=" + amountValue + "]";
    }

    /**
     * Builds a new {@link AllowanceOrChargeAmount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllowanceOrChargeAmount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amountValue);
        return builder;
    }

    /**
     * Class to build instances of {@link AllowanceOrChargeAmount}.
     */
    public static class Builder {
        private String amountValue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amountValue  String value for amountValue.
         */
        public Builder(String amountValue) {
            this.amountValue = amountValue;
        }

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
         * Builds a new {@link AllowanceOrChargeAmount} object using the set fields.
         * @return {@link AllowanceOrChargeAmount}
         */
        public AllowanceOrChargeAmount build() {
            return new AllowanceOrChargeAmount(amountValue);
        }
    }
}
