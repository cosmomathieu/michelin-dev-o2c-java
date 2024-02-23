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
 * This is a model class for Controls type.
 */
public class Controls {
    private Integer numberOfLineItems;
    private Integer totalQuantityValues;

    /**
     * Default constructor.
     */
    public Controls() {
    }

    /**
     * Initialization constructor.
     * @param  numberOfLineItems  Integer value for numberOfLineItems.
     * @param  totalQuantityValues  Integer value for totalQuantityValues.
     */
    public Controls(
            Integer numberOfLineItems,
            Integer totalQuantityValues) {
        this.numberOfLineItems = numberOfLineItems;
        this.totalQuantityValues = totalQuantityValues;
    }

    /**
     * Getter for NumberOfLineItems.
     * @return Returns the Integer
     */
    @JsonGetter("NumberOfLineItems")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberOfLineItems() {
        return numberOfLineItems;
    }

    /**
     * Setter for NumberOfLineItems.
     * @param numberOfLineItems Value for Integer
     */
    @JsonSetter("NumberOfLineItems")
    public void setNumberOfLineItems(Integer numberOfLineItems) {
        this.numberOfLineItems = numberOfLineItems;
    }

    /**
     * Getter for TotalQuantityValues.
     * @return Returns the Integer
     */
    @JsonGetter("TotalQuantityValues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalQuantityValues() {
        return totalQuantityValues;
    }

    /**
     * Setter for TotalQuantityValues.
     * @param totalQuantityValues Value for Integer
     */
    @JsonSetter("TotalQuantityValues")
    public void setTotalQuantityValues(Integer totalQuantityValues) {
        this.totalQuantityValues = totalQuantityValues;
    }

    /**
     * Converts this Controls into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Controls [" + "numberOfLineItems=" + numberOfLineItems + ", totalQuantityValues="
                + totalQuantityValues + "]";
    }

    /**
     * Builds a new {@link Controls.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Controls.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .numberOfLineItems(getNumberOfLineItems())
                .totalQuantityValues(getTotalQuantityValues());
        return builder;
    }

    /**
     * Class to build instances of {@link Controls}.
     */
    public static class Builder {
        private Integer numberOfLineItems;
        private Integer totalQuantityValues;



        /**
         * Setter for numberOfLineItems.
         * @param  numberOfLineItems  Integer value for numberOfLineItems.
         * @return Builder
         */
        public Builder numberOfLineItems(Integer numberOfLineItems) {
            this.numberOfLineItems = numberOfLineItems;
            return this;
        }

        /**
         * Setter for totalQuantityValues.
         * @param  totalQuantityValues  Integer value for totalQuantityValues.
         * @return Builder
         */
        public Builder totalQuantityValues(Integer totalQuantityValues) {
            this.totalQuantityValues = totalQuantityValues;
            return this;
        }

        /**
         * Builds a new {@link Controls} object using the set fields.
         * @return {@link Controls}
         */
        public Controls build() {
            return new Controls(numberOfLineItems, totalQuantityValues);
        }
    }
}
