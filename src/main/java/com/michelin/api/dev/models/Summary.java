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
 * This is a model class for Summary type.
 */
public class Summary {
    private List<AllowanceOrCharge1> allowanceOrCharge;
    private TotalAmount totalAmount;
    private TaxableAmount taxableAmount;
    private TaxAmount taxAmount;
    private TotalLineItemsAmount totalLineItemsAmount;
    private TotalChargeAmount totalChargeAmount;
    private List<TaxDetails3> taxDetails;

    /**
     * Default constructor.
     */
    public Summary() {
    }

    /**
     * Initialization constructor.
     * @param  totalAmount  TotalAmount value for totalAmount.
     * @param  totalLineItemsAmount  TotalLineItemsAmount value for totalLineItemsAmount.
     * @param  allowanceOrCharge  List of AllowanceOrCharge1 value for allowanceOrCharge.
     * @param  taxableAmount  TaxableAmount value for taxableAmount.
     * @param  taxAmount  TaxAmount value for taxAmount.
     * @param  totalChargeAmount  TotalChargeAmount value for totalChargeAmount.
     * @param  taxDetails  List of TaxDetails3 value for taxDetails.
     */
    public Summary(
            TotalAmount totalAmount,
            TotalLineItemsAmount totalLineItemsAmount,
            List<AllowanceOrCharge1> allowanceOrCharge,
            TaxableAmount taxableAmount,
            TaxAmount taxAmount,
            TotalChargeAmount totalChargeAmount,
            List<TaxDetails3> taxDetails) {
        this.allowanceOrCharge = allowanceOrCharge;
        this.totalAmount = totalAmount;
        this.taxableAmount = taxableAmount;
        this.taxAmount = taxAmount;
        this.totalLineItemsAmount = totalLineItemsAmount;
        this.totalChargeAmount = totalChargeAmount;
        this.taxDetails = taxDetails;
    }

    /**
     * Getter for AllowanceOrCharge.
     * @return Returns the List of AllowanceOrCharge1
     */
    @JsonGetter("AllowanceOrCharge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AllowanceOrCharge1> getAllowanceOrCharge() {
        return allowanceOrCharge;
    }

    /**
     * Setter for AllowanceOrCharge.
     * @param allowanceOrCharge Value for List of AllowanceOrCharge1
     */
    @JsonSetter("AllowanceOrCharge")
    public void setAllowanceOrCharge(List<AllowanceOrCharge1> allowanceOrCharge) {
        this.allowanceOrCharge = allowanceOrCharge;
    }

    /**
     * Getter for TotalAmount.
     * @return Returns the TotalAmount
     */
    @JsonGetter("TotalAmount")
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * @param totalAmount Value for TotalAmount
     */
    @JsonSetter("TotalAmount")
    public void setTotalAmount(TotalAmount totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for TaxableAmount.
     * @return Returns the TaxableAmount
     */
    @JsonGetter("TaxableAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxableAmount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Setter for TaxableAmount.
     * @param taxableAmount Value for TaxableAmount
     */
    @JsonSetter("TaxableAmount")
    public void setTaxableAmount(TaxableAmount taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    /**
     * Getter for TaxAmount.
     * @return Returns the TaxAmount
     */
    @JsonGetter("TaxAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for TaxAmount
     */
    @JsonSetter("TaxAmount")
    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TotalLineItemsAmount.
     * @return Returns the TotalLineItemsAmount
     */
    @JsonGetter("TotalLineItemsAmount")
    public TotalLineItemsAmount getTotalLineItemsAmount() {
        return totalLineItemsAmount;
    }

    /**
     * Setter for TotalLineItemsAmount.
     * @param totalLineItemsAmount Value for TotalLineItemsAmount
     */
    @JsonSetter("TotalLineItemsAmount")
    public void setTotalLineItemsAmount(TotalLineItemsAmount totalLineItemsAmount) {
        this.totalLineItemsAmount = totalLineItemsAmount;
    }

    /**
     * Getter for TotalChargeAmount.
     * @return Returns the TotalChargeAmount
     */
    @JsonGetter("TotalChargeAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TotalChargeAmount getTotalChargeAmount() {
        return totalChargeAmount;
    }

    /**
     * Setter for TotalChargeAmount.
     * @param totalChargeAmount Value for TotalChargeAmount
     */
    @JsonSetter("TotalChargeAmount")
    public void setTotalChargeAmount(TotalChargeAmount totalChargeAmount) {
        this.totalChargeAmount = totalChargeAmount;
    }

    /**
     * Getter for TaxDetails.
     * @return Returns the List of TaxDetails3
     */
    @JsonGetter("TaxDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TaxDetails3> getTaxDetails() {
        return taxDetails;
    }

    /**
     * Setter for TaxDetails.
     * @param taxDetails Value for List of TaxDetails3
     */
    @JsonSetter("TaxDetails")
    public void setTaxDetails(List<TaxDetails3> taxDetails) {
        this.taxDetails = taxDetails;
    }

    /**
     * Converts this Summary into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Summary [" + "totalAmount=" + totalAmount + ", totalLineItemsAmount="
                + totalLineItemsAmount + ", allowanceOrCharge=" + allowanceOrCharge
                + ", taxableAmount=" + taxableAmount + ", taxAmount=" + taxAmount
                + ", totalChargeAmount=" + totalChargeAmount + ", taxDetails=" + taxDetails + "]";
    }

    /**
     * Builds a new {@link Summary.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Summary.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalAmount, totalLineItemsAmount)
                .allowanceOrCharge(getAllowanceOrCharge())
                .taxableAmount(getTaxableAmount())
                .taxAmount(getTaxAmount())
                .totalChargeAmount(getTotalChargeAmount())
                .taxDetails(getTaxDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link Summary}.
     */
    public static class Builder {
        private TotalAmount totalAmount;
        private TotalLineItemsAmount totalLineItemsAmount;
        private List<AllowanceOrCharge1> allowanceOrCharge;
        private TaxableAmount taxableAmount;
        private TaxAmount taxAmount;
        private TotalChargeAmount totalChargeAmount;
        private List<TaxDetails3> taxDetails;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalAmount  TotalAmount value for totalAmount.
         * @param  totalLineItemsAmount  TotalLineItemsAmount value for totalLineItemsAmount.
         */
        public Builder(TotalAmount totalAmount, TotalLineItemsAmount totalLineItemsAmount) {
            this.totalAmount = totalAmount;
            this.totalLineItemsAmount = totalLineItemsAmount;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  TotalAmount value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(TotalAmount totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for totalLineItemsAmount.
         * @param  totalLineItemsAmount  TotalLineItemsAmount value for totalLineItemsAmount.
         * @return Builder
         */
        public Builder totalLineItemsAmount(TotalLineItemsAmount totalLineItemsAmount) {
            this.totalLineItemsAmount = totalLineItemsAmount;
            return this;
        }

        /**
         * Setter for allowanceOrCharge.
         * @param  allowanceOrCharge  List of AllowanceOrCharge1 value for allowanceOrCharge.
         * @return Builder
         */
        public Builder allowanceOrCharge(List<AllowanceOrCharge1> allowanceOrCharge) {
            this.allowanceOrCharge = allowanceOrCharge;
            return this;
        }

        /**
         * Setter for taxableAmount.
         * @param  taxableAmount  TaxableAmount value for taxableAmount.
         * @return Builder
         */
        public Builder taxableAmount(TaxableAmount taxableAmount) {
            this.taxableAmount = taxableAmount;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  TaxAmount value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(TaxAmount taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Setter for totalChargeAmount.
         * @param  totalChargeAmount  TotalChargeAmount value for totalChargeAmount.
         * @return Builder
         */
        public Builder totalChargeAmount(TotalChargeAmount totalChargeAmount) {
            this.totalChargeAmount = totalChargeAmount;
            return this;
        }

        /**
         * Setter for taxDetails.
         * @param  taxDetails  List of TaxDetails3 value for taxDetails.
         * @return Builder
         */
        public Builder taxDetails(List<TaxDetails3> taxDetails) {
            this.taxDetails = taxDetails;
            return this;
        }

        /**
         * Builds a new {@link Summary} object using the set fields.
         * @return {@link Summary}
         */
        public Summary build() {
            return new Summary(totalAmount, totalLineItemsAmount, allowanceOrCharge, taxableAmount,
                    taxAmount, totalChargeAmount, taxDetails);
        }
    }
}
