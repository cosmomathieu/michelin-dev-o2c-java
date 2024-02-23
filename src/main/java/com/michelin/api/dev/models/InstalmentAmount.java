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
 * This is a model class for InstalmentAmount type.
 */
public class InstalmentAmount {
    private String amountValue;
    private String currencyCode;

    /**
     * Default constructor.
     */
    public InstalmentAmount() {
    }

    /**
     * Initialization constructor.
     * @param  amountValue  String value for amountValue.
     * @param  currencyCode  String value for currencyCode.
     */
    public InstalmentAmount(
            String amountValue,
            String currencyCode) {
        this.amountValue = amountValue;
        this.currencyCode = currencyCode;
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
     * Getter for CurrencyCode.
     * @return Returns the String
     */
    @JsonGetter("CurrencyCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * @param currencyCode Value for String
     */
    @JsonSetter("CurrencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Converts this InstalmentAmount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InstalmentAmount [" + "amountValue=" + amountValue + ", currencyCode="
                + currencyCode + "]";
    }

    /**
     * Builds a new {@link InstalmentAmount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InstalmentAmount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amountValue)
                .currencyCode(getCurrencyCode());
        return builder;
    }

    /**
     * Class to build instances of {@link InstalmentAmount}.
     */
    public static class Builder {
        private String amountValue;
        private String currencyCode;

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
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Builds a new {@link InstalmentAmount} object using the set fields.
         * @return {@link InstalmentAmount}
         */
        public InstalmentAmount build() {
            return new InstalmentAmount(amountValue, currencyCode);
        }
    }
}
