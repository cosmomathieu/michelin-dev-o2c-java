/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DespatchedQuantity type.
 */
public class DespatchedQuantity {
    private String quantityValue;
    private String measureUnitCode;

    /**
     * Default constructor.
     */
    public DespatchedQuantity() {
    }

    /**
     * Initialization constructor.
     * @param  quantityValue  String value for quantityValue.
     * @param  measureUnitCode  String value for measureUnitCode.
     */
    public DespatchedQuantity(
            String quantityValue,
            String measureUnitCode) {
        this.quantityValue = quantityValue;
        this.measureUnitCode = measureUnitCode;
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
     * Getter for MeasureUnitCode.
     * @return Returns the String
     */
    @JsonGetter("MeasureUnitCode")
    public String getMeasureUnitCode() {
        return measureUnitCode;
    }

    /**
     * Setter for MeasureUnitCode.
     * @param measureUnitCode Value for String
     */
    @JsonSetter("MeasureUnitCode")
    public void setMeasureUnitCode(String measureUnitCode) {
        this.measureUnitCode = measureUnitCode;
    }

    /**
     * Converts this DespatchedQuantity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DespatchedQuantity [" + "quantityValue=" + quantityValue + ", measureUnitCode="
                + measureUnitCode + "]";
    }

    /**
     * Builds a new {@link DespatchedQuantity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DespatchedQuantity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(quantityValue, measureUnitCode);
        return builder;
    }

    /**
     * Class to build instances of {@link DespatchedQuantity}.
     */
    public static class Builder {
        private String quantityValue;
        private String measureUnitCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  quantityValue  String value for quantityValue.
         * @param  measureUnitCode  String value for measureUnitCode.
         */
        public Builder(String quantityValue, String measureUnitCode) {
            this.quantityValue = quantityValue;
            this.measureUnitCode = measureUnitCode;
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
         * Setter for measureUnitCode.
         * @param  measureUnitCode  String value for measureUnitCode.
         * @return Builder
         */
        public Builder measureUnitCode(String measureUnitCode) {
            this.measureUnitCode = measureUnitCode;
            return this;
        }

        /**
         * Builds a new {@link DespatchedQuantity} object using the set fields.
         * @return {@link DespatchedQuantity}
         */
        public DespatchedQuantity build() {
            return new DespatchedQuantity(quantityValue, measureUnitCode);
        }
    }
}
