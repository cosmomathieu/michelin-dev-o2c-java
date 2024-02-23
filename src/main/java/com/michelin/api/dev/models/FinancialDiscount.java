/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for FinancialDiscount type.
 */
public class FinancialDiscount {
    private String textLine;

    /**
     * Default constructor.
     */
    public FinancialDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  textLine  String value for textLine.
     */
    public FinancialDiscount(
            String textLine) {
        this.textLine = textLine;
    }

    /**
     * Getter for TextLine.
     * @return Returns the String
     */
    @JsonGetter("TextLine")
    public String getTextLine() {
        return textLine;
    }

    /**
     * Setter for TextLine.
     * @param textLine Value for String
     */
    @JsonSetter("TextLine")
    public void setTextLine(String textLine) {
        this.textLine = textLine;
    }

    /**
     * Converts this FinancialDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FinancialDiscount [" + "textLine=" + textLine + "]";
    }

    /**
     * Builds a new {@link FinancialDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FinancialDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(textLine);
        return builder;
    }

    /**
     * Class to build instances of {@link FinancialDiscount}.
     */
    public static class Builder {
        private String textLine;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  textLine  String value for textLine.
         */
        public Builder(String textLine) {
            this.textLine = textLine;
        }

        /**
         * Setter for textLine.
         * @param  textLine  String value for textLine.
         * @return Builder
         */
        public Builder textLine(String textLine) {
            this.textLine = textLine;
            return this;
        }

        /**
         * Builds a new {@link FinancialDiscount} object using the set fields.
         * @return {@link FinancialDiscount}
         */
        public FinancialDiscount build() {
            return new FinancialDiscount(textLine);
        }
    }
}
