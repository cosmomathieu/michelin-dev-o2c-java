/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GrossUnitPrice type.
 */
public class GrossUnitPrice {
    private String priceAmount;

    /**
     * Default constructor.
     */
    public GrossUnitPrice() {
    }

    /**
     * Initialization constructor.
     * @param  priceAmount  String value for priceAmount.
     */
    public GrossUnitPrice(
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
     * Converts this GrossUnitPrice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GrossUnitPrice [" + "priceAmount=" + priceAmount + "]";
    }

    /**
     * Builds a new {@link GrossUnitPrice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GrossUnitPrice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(priceAmount);
        return builder;
    }

    /**
     * Class to build instances of {@link GrossUnitPrice}.
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
         * Builds a new {@link GrossUnitPrice} object using the set fields.
         * @return {@link GrossUnitPrice}
         */
        public GrossUnitPrice build() {
            return new GrossUnitPrice(priceAmount);
        }
    }
}
