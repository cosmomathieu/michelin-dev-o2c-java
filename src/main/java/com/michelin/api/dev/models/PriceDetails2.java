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
 * This is a model class for PriceDetails2 type.
 */
public class PriceDetails2 {
    private NetUnitPrice2 netUnitPrice;

    /**
     * Default constructor.
     */
    public PriceDetails2() {
    }

    /**
     * Initialization constructor.
     * @param  netUnitPrice  NetUnitPrice2 value for netUnitPrice.
     */
    public PriceDetails2(
            NetUnitPrice2 netUnitPrice) {
        this.netUnitPrice = netUnitPrice;
    }

    /**
     * Getter for NetUnitPrice.
     * @return Returns the NetUnitPrice2
     */
    @JsonGetter("netUnitPrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetUnitPrice2 getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Setter for NetUnitPrice.
     * @param netUnitPrice Value for NetUnitPrice2
     */
    @JsonSetter("netUnitPrice")
    public void setNetUnitPrice(NetUnitPrice2 netUnitPrice) {
        this.netUnitPrice = netUnitPrice;
    }

    /**
     * Converts this PriceDetails2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PriceDetails2 [" + "netUnitPrice=" + netUnitPrice + "]";
    }

    /**
     * Builds a new {@link PriceDetails2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PriceDetails2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .netUnitPrice(getNetUnitPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link PriceDetails2}.
     */
    public static class Builder {
        private NetUnitPrice2 netUnitPrice;



        /**
         * Setter for netUnitPrice.
         * @param  netUnitPrice  NetUnitPrice2 value for netUnitPrice.
         * @return Builder
         */
        public Builder netUnitPrice(NetUnitPrice2 netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            return this;
        }

        /**
         * Builds a new {@link PriceDetails2} object using the set fields.
         * @return {@link PriceDetails2}
         */
        public PriceDetails2 build() {
            return new PriceDetails2(netUnitPrice);
        }
    }
}
