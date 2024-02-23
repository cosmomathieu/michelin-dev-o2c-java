/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EInvoicingID type.
 */
public class EInvoicingID {
    private String eInvoicingIDQualifier;
    private String iD;

    /**
     * Default constructor.
     */
    public EInvoicingID() {
    }

    /**
     * Initialization constructor.
     * @param  eInvoicingIDQualifier  String value for eInvoicingIDQualifier.
     * @param  iD  String value for iD.
     */
    public EInvoicingID(
            String eInvoicingIDQualifier,
            String iD) {
        this.eInvoicingIDQualifier = eInvoicingIDQualifier;
        this.iD = iD;
    }

    /**
     * Getter for EInvoicingIDQualifier.
     * @return Returns the String
     */
    @JsonGetter("eInvoicingIDQualifier")
    public String getEInvoicingIDQualifier() {
        return eInvoicingIDQualifier;
    }

    /**
     * Setter for EInvoicingIDQualifier.
     * @param eInvoicingIDQualifier Value for String
     */
    @JsonSetter("eInvoicingIDQualifier")
    public void setEInvoicingIDQualifier(String eInvoicingIDQualifier) {
        this.eInvoicingIDQualifier = eInvoicingIDQualifier;
    }

    /**
     * Getter for ID.
     * @return Returns the String
     */
    @JsonGetter("ID")
    public String getID() {
        return iD;
    }

    /**
     * Setter for ID.
     * @param iD Value for String
     */
    @JsonSetter("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * Converts this EInvoicingID into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EInvoicingID [" + "eInvoicingIDQualifier=" + eInvoicingIDQualifier + ", iD=" + iD
                + "]";
    }

    /**
     * Builds a new {@link EInvoicingID.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EInvoicingID.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(eInvoicingIDQualifier, iD);
        return builder;
    }

    /**
     * Class to build instances of {@link EInvoicingID}.
     */
    public static class Builder {
        private String eInvoicingIDQualifier;
        private String iD;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  eInvoicingIDQualifier  String value for eInvoicingIDQualifier.
         * @param  iD  String value for iD.
         */
        public Builder(String eInvoicingIDQualifier, String iD) {
            this.eInvoicingIDQualifier = eInvoicingIDQualifier;
            this.iD = iD;
        }

        /**
         * Setter for eInvoicingIDQualifier.
         * @param  eInvoicingIDQualifier  String value for eInvoicingIDQualifier.
         * @return Builder
         */
        public Builder eInvoicingIDQualifier(String eInvoicingIDQualifier) {
            this.eInvoicingIDQualifier = eInvoicingIDQualifier;
            return this;
        }

        /**
         * Setter for iD.
         * @param  iD  String value for iD.
         * @return Builder
         */
        public Builder iD(String iD) {
            this.iD = iD;
            return this;
        }

        /**
         * Builds a new {@link EInvoicingID} object using the set fields.
         * @return {@link EInvoicingID}
         */
        public EInvoicingID build() {
            return new EInvoicingID(eInvoicingIDQualifier, iD);
        }
    }
}
