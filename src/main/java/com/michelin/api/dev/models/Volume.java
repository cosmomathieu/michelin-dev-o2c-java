/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Volume type.
 */
public class Volume {
    private String measure;
    private String measureUnitCode;

    /**
     * Default constructor.
     */
    public Volume() {
    }

    /**
     * Initialization constructor.
     * @param  measure  String value for measure.
     * @param  measureUnitCode  String value for measureUnitCode.
     */
    public Volume(
            String measure,
            String measureUnitCode) {
        this.measure = measure;
        this.measureUnitCode = measureUnitCode;
    }

    /**
     * Getter for Measure.
     * @return Returns the String
     */
    @JsonGetter("Measure")
    public String getMeasure() {
        return measure;
    }

    /**
     * Setter for Measure.
     * @param measure Value for String
     */
    @JsonSetter("Measure")
    public void setMeasure(String measure) {
        this.measure = measure;
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
     * Converts this Volume into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Volume [" + "measure=" + measure + ", measureUnitCode=" + measureUnitCode + "]";
    }

    /**
     * Builds a new {@link Volume.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Volume.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(measure, measureUnitCode);
        return builder;
    }

    /**
     * Class to build instances of {@link Volume}.
     */
    public static class Builder {
        private String measure;
        private String measureUnitCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  measure  String value for measure.
         * @param  measureUnitCode  String value for measureUnitCode.
         */
        public Builder(String measure, String measureUnitCode) {
            this.measure = measure;
            this.measureUnitCode = measureUnitCode;
        }

        /**
         * Setter for measure.
         * @param  measure  String value for measure.
         * @return Builder
         */
        public Builder measure(String measure) {
            this.measure = measure;
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
         * Builds a new {@link Volume} object using the set fields.
         * @return {@link Volume}
         */
        public Volume build() {
            return new Volume(measure, measureUnitCode);
        }
    }
}
