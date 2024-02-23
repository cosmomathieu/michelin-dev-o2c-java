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
 * This is a model class for NetUnitPrice2 type.
 */
public class NetUnitPrice2 {
    private Double priceAmount;

    /**
     * Default constructor.
     */
    public NetUnitPrice2() {
    }

    /**
     * Initialization constructor.
     * @param  priceAmount  Double value for priceAmount.
     */
    public NetUnitPrice2(
            Double priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Getter for PriceAmount.
     * @return Returns the Double
     */
    @JsonGetter("priceAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPriceAmount() {
        return priceAmount;
    }

    /**
     * Setter for PriceAmount.
     * @param priceAmount Value for Double
     */
    @JsonSetter("priceAmount")
    public void setPriceAmount(Double priceAmount) {
        this.priceAmount = priceAmount;
    }

    /**
     * Converts this NetUnitPrice2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetUnitPrice2 [" + "priceAmount=" + priceAmount + "]";
    }

    /**
     * Builds a new {@link NetUnitPrice2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetUnitPrice2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .priceAmount(getPriceAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link NetUnitPrice2}.
     */
    public static class Builder {
        private Double priceAmount;



        /**
         * Setter for priceAmount.
         * @param  priceAmount  Double value for priceAmount.
         * @return Builder
         */
        public Builder priceAmount(Double priceAmount) {
            this.priceAmount = priceAmount;
            return this;
        }

        /**
         * Builds a new {@link NetUnitPrice2} object using the set fields.
         * @return {@link NetUnitPrice2}
         */
        public NetUnitPrice2 build() {
            return new NetUnitPrice2(priceAmount);
        }
    }
}
