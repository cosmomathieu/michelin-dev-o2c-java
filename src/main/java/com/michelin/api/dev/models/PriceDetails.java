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
 * This is a model class for PriceDetails type.
 */
public class PriceDetails {
    private NetUnitPrice netUnitPrice;

    /**
     * Default constructor.
     */
    public PriceDetails() {
    }

    /**
     * Initialization constructor.
     * @param  netUnitPrice  NetUnitPrice value for netUnitPrice.
     */
    public PriceDetails(
            NetUnitPrice netUnitPrice) {
        this.netUnitPrice = netUnitPrice;
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
     * Converts this PriceDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PriceDetails [" + "netUnitPrice=" + netUnitPrice + "]";
    }

    /**
     * Builds a new {@link PriceDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PriceDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .netUnitPrice(getNetUnitPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link PriceDetails}.
     */
    public static class Builder {
        private NetUnitPrice netUnitPrice;



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
         * Builds a new {@link PriceDetails} object using the set fields.
         * @return {@link PriceDetails}
         */
        public PriceDetails build() {
            return new PriceDetails(netUnitPrice);
        }
    }
}
