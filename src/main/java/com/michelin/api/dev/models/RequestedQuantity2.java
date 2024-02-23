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
 * This is a model class for RequestedQuantity2 type.
 */
public class RequestedQuantity2 {
    private String quantityValue;

    /**
     * Default constructor.
     */
    public RequestedQuantity2() {
    }

    /**
     * Initialization constructor.
     * @param  quantityValue  String value for quantityValue.
     */
    public RequestedQuantity2(
            String quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Getter for QuantityValue.
     * @return Returns the String
     */
    @JsonGetter("quantityValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantityValue() {
        return quantityValue;
    }

    /**
     * Setter for QuantityValue.
     * @param quantityValue Value for String
     */
    @JsonSetter("quantityValue")
    public void setQuantityValue(String quantityValue) {
        this.quantityValue = quantityValue;
    }

    /**
     * Converts this RequestedQuantity2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequestedQuantity2 [" + "quantityValue=" + quantityValue + "]";
    }

    /**
     * Builds a new {@link RequestedQuantity2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequestedQuantity2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .quantityValue(getQuantityValue());
        return builder;
    }

    /**
     * Class to build instances of {@link RequestedQuantity2}.
     */
    public static class Builder {
        private String quantityValue;



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
         * Builds a new {@link RequestedQuantity2} object using the set fields.
         * @return {@link RequestedQuantity2}
         */
        public RequestedQuantity2 build() {
            return new RequestedQuantity2(quantityValue);
        }
    }
}
