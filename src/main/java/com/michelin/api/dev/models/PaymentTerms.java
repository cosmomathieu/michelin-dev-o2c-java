/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentTerms type.
 */
public class PaymentTerms {
    private String paymentMethod;

    /**
     * Default constructor.
     */
    public PaymentTerms() {
    }

    /**
     * Initialization constructor.
     * @param  paymentMethod  String value for paymentMethod.
     */
    public PaymentTerms(
            String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the String
     */
    @JsonGetter("PaymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for String
     */
    @JsonSetter("PaymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Converts this PaymentTerms into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTerms [" + "paymentMethod=" + paymentMethod + "]";
    }

    /**
     * Builds a new {@link PaymentTerms.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTerms.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentMethod);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTerms}.
     */
    public static class Builder {
        private String paymentMethod;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentMethod  String value for paymentMethod.
         */
        public Builder(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Builds a new {@link PaymentTerms} object using the set fields.
         * @return {@link PaymentTerms}
         */
        public PaymentTerms build() {
            return new PaymentTerms(paymentMethod);
        }
    }
}
