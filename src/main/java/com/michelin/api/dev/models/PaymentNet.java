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
 * This is a model class for PaymentNet type.
 */
public class PaymentNet {
    private String paymentDueDate;
    private InstalmentAmount instalmentAmount;

    /**
     * Default constructor.
     */
    public PaymentNet() {
    }

    /**
     * Initialization constructor.
     * @param  paymentDueDate  String value for paymentDueDate.
     * @param  instalmentAmount  InstalmentAmount value for instalmentAmount.
     */
    public PaymentNet(
            String paymentDueDate,
            InstalmentAmount instalmentAmount) {
        this.paymentDueDate = paymentDueDate;
        this.instalmentAmount = instalmentAmount;
    }

    /**
     * Getter for PaymentDueDate.
     * @return Returns the String
     */
    @JsonGetter("PaymentDueDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Setter for PaymentDueDate.
     * @param paymentDueDate Value for String
     */
    @JsonSetter("PaymentDueDate")
    public void setPaymentDueDate(String paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    /**
     * Getter for InstalmentAmount.
     * @return Returns the InstalmentAmount
     */
    @JsonGetter("InstalmentAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstalmentAmount getInstalmentAmount() {
        return instalmentAmount;
    }

    /**
     * Setter for InstalmentAmount.
     * @param instalmentAmount Value for InstalmentAmount
     */
    @JsonSetter("InstalmentAmount")
    public void setInstalmentAmount(InstalmentAmount instalmentAmount) {
        this.instalmentAmount = instalmentAmount;
    }

    /**
     * Converts this PaymentNet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentNet [" + "paymentDueDate=" + paymentDueDate + ", instalmentAmount="
                + instalmentAmount + "]";
    }

    /**
     * Builds a new {@link PaymentNet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentNet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paymentDueDate(getPaymentDueDate())
                .instalmentAmount(getInstalmentAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentNet}.
     */
    public static class Builder {
        private String paymentDueDate;
        private InstalmentAmount instalmentAmount;



        /**
         * Setter for paymentDueDate.
         * @param  paymentDueDate  String value for paymentDueDate.
         * @return Builder
         */
        public Builder paymentDueDate(String paymentDueDate) {
            this.paymentDueDate = paymentDueDate;
            return this;
        }

        /**
         * Setter for instalmentAmount.
         * @param  instalmentAmount  InstalmentAmount value for instalmentAmount.
         * @return Builder
         */
        public Builder instalmentAmount(InstalmentAmount instalmentAmount) {
            this.instalmentAmount = instalmentAmount;
            return this;
        }

        /**
         * Builds a new {@link PaymentNet} object using the set fields.
         * @return {@link PaymentNet}
         */
        public PaymentNet build() {
            return new PaymentNet(paymentDueDate, instalmentAmount);
        }
    }
}
