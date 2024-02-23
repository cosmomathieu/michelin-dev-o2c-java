/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ScheduledArticleDespatchDetails type.
 */
public class ScheduledArticleDespatchDetails {
    private String despatchDate;
    private DespatchAdviceReference despatchAdviceReference;
    private DespatchedQuantity1 despatchedQuantity;

    /**
     * Default constructor.
     */
    public ScheduledArticleDespatchDetails() {
    }

    /**
     * Initialization constructor.
     * @param  despatchDate  String value for despatchDate.
     * @param  despatchAdviceReference  DespatchAdviceReference value for despatchAdviceReference.
     * @param  despatchedQuantity  DespatchedQuantity1 value for despatchedQuantity.
     */
    public ScheduledArticleDespatchDetails(
            String despatchDate,
            DespatchAdviceReference despatchAdviceReference,
            DespatchedQuantity1 despatchedQuantity) {
        this.despatchDate = despatchDate;
        this.despatchAdviceReference = despatchAdviceReference;
        this.despatchedQuantity = despatchedQuantity;
    }

    /**
     * Getter for DespatchDate.
     * @return Returns the String
     */
    @JsonGetter("DespatchDate")
    public String getDespatchDate() {
        return despatchDate;
    }

    /**
     * Setter for DespatchDate.
     * @param despatchDate Value for String
     */
    @JsonSetter("DespatchDate")
    public void setDespatchDate(String despatchDate) {
        this.despatchDate = despatchDate;
    }

    /**
     * Getter for DespatchAdviceReference.
     * @return Returns the DespatchAdviceReference
     */
    @JsonGetter("DespatchAdviceReference")
    public DespatchAdviceReference getDespatchAdviceReference() {
        return despatchAdviceReference;
    }

    /**
     * Setter for DespatchAdviceReference.
     * @param despatchAdviceReference Value for DespatchAdviceReference
     */
    @JsonSetter("DespatchAdviceReference")
    public void setDespatchAdviceReference(DespatchAdviceReference despatchAdviceReference) {
        this.despatchAdviceReference = despatchAdviceReference;
    }

    /**
     * Getter for DespatchedQuantity.
     * @return Returns the DespatchedQuantity1
     */
    @JsonGetter("DespatchedQuantity")
    public DespatchedQuantity1 getDespatchedQuantity() {
        return despatchedQuantity;
    }

    /**
     * Setter for DespatchedQuantity.
     * @param despatchedQuantity Value for DespatchedQuantity1
     */
    @JsonSetter("DespatchedQuantity")
    public void setDespatchedQuantity(DespatchedQuantity1 despatchedQuantity) {
        this.despatchedQuantity = despatchedQuantity;
    }

    /**
     * Converts this ScheduledArticleDespatchDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScheduledArticleDespatchDetails [" + "despatchDate=" + despatchDate
                + ", despatchAdviceReference=" + despatchAdviceReference + ", despatchedQuantity="
                + despatchedQuantity + "]";
    }

    /**
     * Builds a new {@link ScheduledArticleDespatchDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScheduledArticleDespatchDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(despatchDate, despatchAdviceReference, despatchedQuantity);
        return builder;
    }

    /**
     * Class to build instances of {@link ScheduledArticleDespatchDetails}.
     */
    public static class Builder {
        private String despatchDate;
        private DespatchAdviceReference despatchAdviceReference;
        private DespatchedQuantity1 despatchedQuantity;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  despatchDate  String value for despatchDate.
         * @param  despatchAdviceReference  DespatchAdviceReference value for
         *         despatchAdviceReference.
         * @param  despatchedQuantity  DespatchedQuantity1 value for despatchedQuantity.
         */
        public Builder(String despatchDate, DespatchAdviceReference despatchAdviceReference,
                DespatchedQuantity1 despatchedQuantity) {
            this.despatchDate = despatchDate;
            this.despatchAdviceReference = despatchAdviceReference;
            this.despatchedQuantity = despatchedQuantity;
        }

        /**
         * Setter for despatchDate.
         * @param  despatchDate  String value for despatchDate.
         * @return Builder
         */
        public Builder despatchDate(String despatchDate) {
            this.despatchDate = despatchDate;
            return this;
        }

        /**
         * Setter for despatchAdviceReference.
         * @param  despatchAdviceReference  DespatchAdviceReference value for
         *         despatchAdviceReference.
         * @return Builder
         */
        public Builder despatchAdviceReference(DespatchAdviceReference despatchAdviceReference) {
            this.despatchAdviceReference = despatchAdviceReference;
            return this;
        }

        /**
         * Setter for despatchedQuantity.
         * @param  despatchedQuantity  DespatchedQuantity1 value for despatchedQuantity.
         * @return Builder
         */
        public Builder despatchedQuantity(DespatchedQuantity1 despatchedQuantity) {
            this.despatchedQuantity = despatchedQuantity;
            return this;
        }

        /**
         * Builds a new {@link ScheduledArticleDespatchDetails} object using the set fields.
         * @return {@link ScheduledArticleDespatchDetails}
         */
        public ScheduledArticleDespatchDetails build() {
            return new ScheduledArticleDespatchDetails(despatchDate, despatchAdviceReference,
                    despatchedQuantity);
        }
    }
}
