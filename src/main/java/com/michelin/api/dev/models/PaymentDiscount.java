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
 * This is a model class for PaymentDiscount type.
 */
public class PaymentDiscount {
    private int discountPercent;
    private String paymentDueDate;
    private FinancialDiscount financialDiscount;
    private DiscountAmount discountAmount;

    /**
     * Default constructor.
     */
    public PaymentDiscount() {
    }

    /**
     * Initialization constructor.
     * @param  discountPercent  int value for discountPercent.
     * @param  paymentDueDate  String value for paymentDueDate.
     * @param  discountAmount  DiscountAmount value for discountAmount.
     * @param  financialDiscount  FinancialDiscount value for financialDiscount.
     */
    public PaymentDiscount(
            int discountPercent,
            String paymentDueDate,
            DiscountAmount discountAmount,
            FinancialDiscount financialDiscount) {
        this.discountPercent = discountPercent;
        this.paymentDueDate = paymentDueDate;
        this.financialDiscount = financialDiscount;
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for DiscountPercent.
     * @return Returns the int
     */
    @JsonGetter("DiscountPercent")
    public int getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Setter for DiscountPercent.
     * @param discountPercent Value for int
     */
    @JsonSetter("DiscountPercent")
    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    /**
     * Getter for PaymentDueDate.
     * @return Returns the String
     */
    @JsonGetter("PaymentDueDate")
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
     * Getter for FinancialDiscount.
     * @return Returns the FinancialDiscount
     */
    @JsonGetter("FinancialDiscount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FinancialDiscount getFinancialDiscount() {
        return financialDiscount;
    }

    /**
     * Setter for FinancialDiscount.
     * @param financialDiscount Value for FinancialDiscount
     */
    @JsonSetter("FinancialDiscount")
    public void setFinancialDiscount(FinancialDiscount financialDiscount) {
        this.financialDiscount = financialDiscount;
    }

    /**
     * Getter for DiscountAmount.
     * @return Returns the DiscountAmount
     */
    @JsonGetter("DiscountAmount")
    public DiscountAmount getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * @param discountAmount Value for DiscountAmount
     */
    @JsonSetter("DiscountAmount")
    public void setDiscountAmount(DiscountAmount discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Converts this PaymentDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentDiscount [" + "discountPercent=" + discountPercent + ", paymentDueDate="
                + paymentDueDate + ", discountAmount=" + discountAmount + ", financialDiscount="
                + financialDiscount + "]";
    }

    /**
     * Builds a new {@link PaymentDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(discountPercent, paymentDueDate, discountAmount)
                .financialDiscount(getFinancialDiscount());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentDiscount}.
     */
    public static class Builder {
        private int discountPercent;
        private String paymentDueDate;
        private DiscountAmount discountAmount;
        private FinancialDiscount financialDiscount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  discountPercent  int value for discountPercent.
         * @param  paymentDueDate  String value for paymentDueDate.
         * @param  discountAmount  DiscountAmount value for discountAmount.
         */
        public Builder(int discountPercent, String paymentDueDate, DiscountAmount discountAmount) {
            this.discountPercent = discountPercent;
            this.paymentDueDate = paymentDueDate;
            this.discountAmount = discountAmount;
        }

        /**
         * Setter for discountPercent.
         * @param  discountPercent  int value for discountPercent.
         * @return Builder
         */
        public Builder discountPercent(int discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

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
         * Setter for discountAmount.
         * @param  discountAmount  DiscountAmount value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(DiscountAmount discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for financialDiscount.
         * @param  financialDiscount  FinancialDiscount value for financialDiscount.
         * @return Builder
         */
        public Builder financialDiscount(FinancialDiscount financialDiscount) {
            this.financialDiscount = financialDiscount;
            return this;
        }

        /**
         * Builds a new {@link PaymentDiscount} object using the set fields.
         * @return {@link PaymentDiscount}
         */
        public PaymentDiscount build() {
            return new PaymentDiscount(discountPercent, paymentDueDate, discountAmount,
                    financialDiscount);
        }
    }
}
