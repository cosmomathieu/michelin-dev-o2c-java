/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OpenQuantity type.
 */
public class OpenQuantity {
    private String quantityValue;

    /**
     * Default constructor.
     */
    public OpenQuantity() {
    }

    /**
     * Initialization constructor.
     * @param  quantityValue  String value for quantityValue.
     */
    public OpenQuantity(
            String quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Getter for QuantityValue.
     * @return Returns the String
     */
    @JsonGetter("QuantityValue")
    public String getQuantityValue() {
        return quantityValue;
    }

    /**
     * Setter for QuantityValue.
     * @param quantityValue Value for String
     */
    @JsonSetter("QuantityValue")
    public void setQuantityValue(String quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Converts this OpenQuantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OpenQuantity [" + "quantityValue=" + quantityValue + "]";
    }

    /**
     * Builds a new {@link OpenQuantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OpenQuantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantityValue);
        return builder;
    }

    /**
     * Class to build instances of {@link OpenQuantity}.
     */
    public static class Builder {
        private String quantityValue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  quantityValue  String value for quantityValue.
         */
        public Builder(String quantityValue) {
            this.quantityValue = quantityValue;
        }

        /**
         * Setter for quantityValue.
         * @param  quantityValue  String value for quantityValue.
         * @return Builder
         */
        public Builder quantityValue(String quantityValue) {
            this.quantityValue = quantityValue;
            return this;
        }

        /**
         * Builds a new {@link OpenQuantity} object using the set fields.
         * @return {@link OpenQuantity}
         */
        public OpenQuantity build() {
            return new OpenQuantity(quantityValue);
        }
    }
}
