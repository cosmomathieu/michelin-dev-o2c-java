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
 * This is a model class for PriceDetails1 type.
 */
public class PriceDetails1 {
    private GrossUnitPrice grossUnitPrice;
    private NetUnitPrice netUnitPrice;
    private FixedPrice fixedPrice;

    /**
     * Default constructor.
     */
    public PriceDetails1() {
    }

    /**
     * Initialization constructor.
     * @param  grossUnitPrice  GrossUnitPrice value for grossUnitPrice.
     * @param  netUnitPrice  NetUnitPrice value for netUnitPrice.
     * @param  fixedPrice  FixedPrice value for fixedPrice.
     */
    public PriceDetails1(
            GrossUnitPrice grossUnitPrice,
            NetUnitPrice netUnitPrice,
            FixedPrice fixedPrice) {
        this.grossUnitPrice = grossUnitPrice;
        this.netUnitPrice = netUnitPrice;
        this.fixedPrice = fixedPrice;
    }

    /**
     * Getter for GrossUnitPrice.
     * @return Returns the GrossUnitPrice
     */
    @JsonGetter("GrossUnitPrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GrossUnitPrice getGrossUnitPrice() {
        return grossUnitPrice;
    }

    /**
     * Setter for GrossUnitPrice.
     * @param grossUnitPrice Value for GrossUnitPrice
     */
    @JsonSetter("GrossUnitPrice")
    public void setGrossUnitPrice(GrossUnitPrice grossUnitPrice) {
        this.grossUnitPrice = grossUnitPrice;
    }

    /**
     * Getter for NetUnitPrice.
     * @return Returns the NetUnitPrice
     */
    @JsonGetter("NetUnitPrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetUnitPrice getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Setter for NetUnitPrice.
     * @param netUnitPrice Value for NetUnitPrice
     */
    @JsonSetter("NetUnitPrice")
    public void setNetUnitPrice(NetUnitPrice netUnitPrice) {
        this.netUnitPrice = netUnitPrice;
    }

    /**
     * Getter for FixedPrice.
     * @return Returns the FixedPrice
     */
    @JsonGetter("FixedPrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FixedPrice getFixedPrice() {
        return fixedPrice;
    }

    /**
     * Setter for FixedPrice.
     * @param fixedPrice Value for FixedPrice
     */
    @JsonSetter("FixedPrice")
    public void setFixedPrice(FixedPrice fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * Converts this PriceDetails1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PriceDetails1 [" + "grossUnitPrice=" + grossUnitPrice + ", netUnitPrice="
                + netUnitPrice + ", fixedPrice=" + fixedPrice + "]";
    }

    /**
     * Builds a new {@link PriceDetails1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PriceDetails1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .grossUnitPrice(getGrossUnitPrice())
                .netUnitPrice(getNetUnitPrice())
                .fixedPrice(getFixedPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link PriceDetails1}.
     */
    public static class Builder {
        private GrossUnitPrice grossUnitPrice;
        private NetUnitPrice netUnitPrice;
        private FixedPrice fixedPrice;



        /**
         * Setter for grossUnitPrice.
         * @param  grossUnitPrice  GrossUnitPrice value for grossUnitPrice.
         * @return Builder
         */
        public Builder grossUnitPrice(GrossUnitPrice grossUnitPrice) {
            this.grossUnitPrice = grossUnitPrice;
            return this;
        }

        /**
         * Setter for netUnitPrice.
         * @param  netUnitPrice  NetUnitPrice value for netUnitPrice.
         * @return Builder
         */
        public Builder netUnitPrice(NetUnitPrice netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            return this;
        }

        /**
         * Setter for fixedPrice.
         * @param  fixedPrice  FixedPrice value for fixedPrice.
         * @return Builder
         */
        public Builder fixedPrice(FixedPrice fixedPrice) {
            this.fixedPrice = fixedPrice;
            return this;
        }

        /**
         * Builds a new {@link PriceDetails1} object using the set fields.
         * @return {@link PriceDetails1}
         */
        public PriceDetails1 build() {
            return new PriceDetails1(grossUnitPrice, netUnitPrice, fixedPrice);
        }
    }
}
