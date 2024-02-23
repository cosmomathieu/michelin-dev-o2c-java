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
 * This is a model class for AvailableQuantity type.
 */
public class AvailableQuantity {
    private Integer quantityValue;

    /**
     * Default constructor.
     */
    public AvailableQuantity() {
    }

    /**
     * Initialization constructor.
     * @param  quantityValue  Integer value for quantityValue.
     */
    public AvailableQuantity(
            Integer quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Getter for QuantityValue.
     * @return Returns the Integer
     */
    @JsonGetter("quantityValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantityValue() {
        return quantityValue;
    }

    /**
     * Setter for QuantityValue.
     * @param quantityValue Value for Integer
     */
    @JsonSetter("quantityValue")
    public void setQuantityValue(Integer quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Converts this AvailableQuantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AvailableQuantity [" + "quantityValue=" + quantityValue + "]";
    }

    /**
     * Builds a new {@link AvailableQuantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AvailableQuantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .quantityValue(getQuantityValue());
        return builder;
    }

    /**
     * Class to build instances of {@link AvailableQuantity}.
     */
    public static class Builder {
        private Integer quantityValue;



        /**
         * Setter for quantityValue.
         * @param  quantityValue  Integer value for quantityValue.
         * @return Builder
         */
        public Builder quantityValue(Integer quantityValue) {
            this.quantityValue = quantityValue;
            return this;
        }

        /**
         * Builds a new {@link AvailableQuantity} object using the set fields.
         * @return {@link AvailableQuantity}
         */
        public AvailableQuantity build() {
            return new AvailableQuantity(quantityValue);
        }
    }
}
