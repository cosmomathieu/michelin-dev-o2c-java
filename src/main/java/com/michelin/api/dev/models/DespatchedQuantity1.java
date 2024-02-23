/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DespatchedQuantity1 type.
 */
public class DespatchedQuantity1 {
    private String quantityValue;

    /**
     * Default constructor.
     */
    public DespatchedQuantity1() {
    }

    /**
     * Initialization constructor.
     * @param  quantityValue  String value for quantityValue.
     */
    public DespatchedQuantity1(
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
     * Converts this DespatchedQuantity1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DespatchedQuantity1 [" + "quantityValue=" + quantityValue + "]";
    }

    /**
     * Builds a new {@link DespatchedQuantity1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DespatchedQuantity1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantityValue);
        return builder;
    }

    /**
     * Class to build instances of {@link DespatchedQuantity1}.
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
         * Builds a new {@link DespatchedQuantity1} object using the set fields.
         * @return {@link DespatchedQuantity1}
         */
        public DespatchedQuantity1 build() {
            return new DespatchedQuantity1(quantityValue);
        }
    }
}
