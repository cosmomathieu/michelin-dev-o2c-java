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
 * This is a model class for OrderLine type.
 */
public class OrderLine {
    private String lineID;
    private String portalReference;
    private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;
    private OrderedArticle2 orderedArticle;

    /**
     * Default constructor.
     */
    public OrderLine() {
    }

    /**
     * Initialization constructor.
     * @param  lineID  String value for lineID.
     * @param  orderedArticle  OrderedArticle2 value for orderedArticle.
     * @param  portalReference  String value for portalReference.
     * @param  additionalCustomerReferenceNumber  AdditionalCustomerReferenceNumber value for
     *         additionalCustomerReferenceNumber.
     */
    public OrderLine(
            String lineID,
            OrderedArticle2 orderedArticle,
            String portalReference,
            AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
        this.lineID = lineID;
        this.portalReference = portalReference;
        this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
        this.orderedArticle = orderedArticle;
    }

    /**
     * Getter for LineID.
     * @return Returns the String
     */
    @JsonGetter("LineID")
    public String getLineID() {
        return lineID;
    }

    /**
     * Setter for LineID.
     * @param lineID Value for String
     */
    @JsonSetter("LineID")
    public void setLineID(String lineID) {
        this.lineID = lineID;
    }

    /**
     * Getter for PortalReference.
     * @return Returns the String
     */
    @JsonGetter("PortalReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPortalReference() {
        return portalReference;
    }

    /**
     * Setter for PortalReference.
     * @param portalReference Value for String
     */
    @JsonSetter("PortalReference")
    public void setPortalReference(String portalReference) {
        this.portalReference = portalReference;
    }

    /**
     * Getter for AdditionalCustomerReferenceNumber.
     * @return Returns the AdditionalCustomerReferenceNumber
     */
    @JsonGetter("AdditionalCustomerReferenceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AdditionalCustomerReferenceNumber getAdditionalCustomerReferenceNumber() {
        return additionalCustomerReferenceNumber;
    }

    /**
     * Setter for AdditionalCustomerReferenceNumber.
     * @param additionalCustomerReferenceNumber Value for AdditionalCustomerReferenceNumber
     */
    @JsonSetter("AdditionalCustomerReferenceNumber")
    public void setAdditionalCustomerReferenceNumber(AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
        this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle2
     */
    @JsonGetter("OrderedArticle")
    public OrderedArticle2 getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle2
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle2 orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this OrderLine into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderLine [" + "lineID=" + lineID + ", orderedArticle=" + orderedArticle
                + ", portalReference=" + portalReference + ", additionalCustomerReferenceNumber="
                + additionalCustomerReferenceNumber + "]";
    }

    /**
     * Builds a new {@link OrderLine.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderLine.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(lineID, orderedArticle)
                .portalReference(getPortalReference())
                .additionalCustomerReferenceNumber(getAdditionalCustomerReferenceNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderLine}.
     */
    public static class Builder {
        private String lineID;
        private OrderedArticle2 orderedArticle;
        private String portalReference;
        private AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  lineID  String value for lineID.
         * @param  orderedArticle  OrderedArticle2 value for orderedArticle.
         */
        public Builder(String lineID, OrderedArticle2 orderedArticle) {
            this.lineID = lineID;
            this.orderedArticle = orderedArticle;
        }

        /**
         * Setter for lineID.
         * @param  lineID  String value for lineID.
         * @return Builder
         */
        public Builder lineID(String lineID) {
            this.lineID = lineID;
            return this;
        }

        /**
         * Setter for orderedArticle.
         * @param  orderedArticle  OrderedArticle2 value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle2 orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Setter for portalReference.
         * @param  portalReference  String value for portalReference.
         * @return Builder
         */
        public Builder portalReference(String portalReference) {
            this.portalReference = portalReference;
            return this;
        }

        /**
         * Setter for additionalCustomerReferenceNumber.
         * @param  additionalCustomerReferenceNumber  AdditionalCustomerReferenceNumber value for
         *         additionalCustomerReferenceNumber.
         * @return Builder
         */
        public Builder additionalCustomerReferenceNumber(
                AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) {
            this.additionalCustomerReferenceNumber = additionalCustomerReferenceNumber;
            return this;
        }

        /**
         * Builds a new {@link OrderLine} object using the set fields.
         * @return {@link OrderLine}
         */
        public OrderLine build() {
            return new OrderLine(lineID, orderedArticle, portalReference,
                    additionalCustomerReferenceNumber);
        }
    }
}
