/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PaymentTerms2 type.
 */
public class PaymentTerms2 {
    private List<PaymentNet> paymentNet;
    private List<PaymentDiscount> paymentDiscount;

    /**
     * Default constructor.
     */
    public PaymentTerms2() {
    }

    /**
     * Initialization constructor.
     * @param  paymentNet  List of PaymentNet value for paymentNet.
     * @param  paymentDiscount  List of PaymentDiscount value for paymentDiscount.
     */
    public PaymentTerms2(
            List<PaymentNet> paymentNet,
            List<PaymentDiscount> paymentDiscount) {
        this.paymentNet = paymentNet;
        this.paymentDiscount = paymentDiscount;
    }

    /**
     * Getter for PaymentNet.
     * @return Returns the List of PaymentNet
     */
    @JsonGetter("PaymentNet")
    public List<PaymentNet> getPaymentNet() {
        return paymentNet;
    }

    /**
     * Setter for PaymentNet.
     * @param paymentNet Value for List of PaymentNet
     */
    @JsonSetter("PaymentNet")
    public void setPaymentNet(List<PaymentNet> paymentNet) {
        this.paymentNet = paymentNet;
    }

    /**
     * Getter for PaymentDiscount.
     * @return Returns the List of PaymentDiscount
     */
    @JsonGetter("PaymentDiscount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PaymentDiscount> getPaymentDiscount() {
        return paymentDiscount;
    }

    /**
     * Setter for PaymentDiscount.
     * @param paymentDiscount Value for List of PaymentDiscount
     */
    @JsonSetter("PaymentDiscount")
    public void setPaymentDiscount(List<PaymentDiscount> paymentDiscount) {
        this.paymentDiscount = paymentDiscount;
    }

    /**
     * Converts this PaymentTerms2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTerms2 [" + "paymentNet=" + paymentNet + ", paymentDiscount="
                + paymentDiscount + "]";
    }

    /**
     * Builds a new {@link PaymentTerms2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTerms2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentNet)
                .paymentDiscount(getPaymentDiscount());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTerms2}.
     */
    public static class Builder {
        private List<PaymentNet> paymentNet;
        private List<PaymentDiscount> paymentDiscount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentNet  List of PaymentNet value for paymentNet.
         */
        public Builder(List<PaymentNet> paymentNet) {
            this.paymentNet = paymentNet;
        }

        /**
         * Setter for paymentNet.
         * @param  paymentNet  List of PaymentNet value for paymentNet.
         * @return Builder
         */
        public Builder paymentNet(List<PaymentNet> paymentNet) {
            this.paymentNet = paymentNet;
            return this;
        }

        /**
         * Setter for paymentDiscount.
         * @param  paymentDiscount  List of PaymentDiscount value for paymentDiscount.
         * @return Builder
         */
        public Builder paymentDiscount(List<PaymentDiscount> paymentDiscount) {
            this.paymentDiscount = paymentDiscount;
            return this;
        }

        /**
         * Builds a new {@link PaymentTerms2} object using the set fields.
         * @return {@link PaymentTerms2}
         */
        public PaymentTerms2 build() {
            return new PaymentTerms2(paymentNet, paymentDiscount);
        }
    }
}
