/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FixedPrice type.
 */
public class FixedPrice {
    private String priceAmount;

    /**
     * Default constructor.
     */
    public FixedPrice() {
    }

    /**
     * Initialization constructor.
     * @param  priceAmount  String value for priceAmount.
     */
    public FixedPrice(
            String priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Getter for PriceAmount.
     * @return Returns the String
     */
    @JsonGetter("PriceAmount")
    public String getPriceAmount() {
        return priceAmount;
    }

    /**
     * Setter for PriceAmount.
     * @param priceAmount Value for String
     */
    @JsonSetter("PriceAmount")
    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Converts this FixedPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FixedPrice [" + "priceAmount=" + priceAmount + "]";
    }

    /**
     * Builds a new {@link FixedPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FixedPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(priceAmount);
        return builder;
    }

    /**
     * Class to build instances of {@link FixedPrice}.
     */
    public static class Builder {
        private String priceAmount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  priceAmount  String value for priceAmount.
         */
        public Builder(String priceAmount) {
            this.priceAmount = priceAmount;
        }

        /**
         * Setter for priceAmount.
         * @param  priceAmount  String value for priceAmount.
         * @return Builder
         */
        public Builder priceAmount(String priceAmount) {
            this.priceAmount = priceAmount;
            return this;
        }

        /**
         * Builds a new {@link FixedPrice} object using the set fields.
         * @return {@link FixedPrice}
         */
        public FixedPrice build() {
            return new FixedPrice(priceAmount);
        }
    }
}
