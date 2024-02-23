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
 * This is a model class for ArticleIdentification6 type.
 */
public class ArticleIdentification6 {
    private String buyersArticleID;
    private String suppliersArticleID;
    private String eANUCCArticleID;

    /**
     * Default constructor.
     */
    public ArticleIdentification6() {
    }

    /**
     * Initialization constructor.
     * @param  buyersArticleID  String value for buyersArticleID.
     * @param  suppliersArticleID  String value for suppliersArticleID.
     * @param  eANUCCArticleID  String value for eANUCCArticleID.
     */
    public ArticleIdentification6(
            String buyersArticleID,
            String suppliersArticleID,
            String eANUCCArticleID) {
        this.buyersArticleID = buyersArticleID;
        this.suppliersArticleID = suppliersArticleID;
        this.eANUCCArticleID = eANUCCArticleID;
    }

    /**
     * Getter for BuyersArticleID.
     * @return Returns the String
     */
    @JsonGetter("BuyersArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBuyersArticleID() {
        return buyersArticleID;
    }

    /**
     * Setter for BuyersArticleID.
     * @param buyersArticleID Value for String
     */
    @JsonSetter("BuyersArticleID")
    public void setBuyersArticleID(String buyersArticleID) {
        this.buyersArticleID = buyersArticleID;
    }

    /**
     * Getter for SuppliersArticleID.
     * @return Returns the String
     */
    @JsonGetter("SuppliersArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuppliersArticleID() {
        return suppliersArticleID;
    }

    /**
     * Setter for SuppliersArticleID.
     * @param suppliersArticleID Value for String
     */
    @JsonSetter("SuppliersArticleID")
    public void setSuppliersArticleID(String suppliersArticleID) {
        this.suppliersArticleID = suppliersArticleID;
    }

    /**
     * Getter for EANUCCArticleID.
     * @return Returns the String
     */
    @JsonGetter("EANUCCArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEANUCCArticleID() {
        return eANUCCArticleID;
    }

    /**
     * Setter for EANUCCArticleID.
     * @param eANUCCArticleID Value for String
     */
    @JsonSetter("EANUCCArticleID")
    public void setEANUCCArticleID(String eANUCCArticleID) {
        this.eANUCCArticleID = eANUCCArticleID;
    }

    /**
     * Converts this ArticleIdentification6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleIdentification6 [" + "buyersArticleID=" + buyersArticleID
                + ", suppliersArticleID=" + suppliersArticleID + ", eANUCCArticleID="
                + eANUCCArticleID + "]";
    }

    /**
     * Builds a new {@link ArticleIdentification6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleIdentification6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .buyersArticleID(getBuyersArticleID())
                .suppliersArticleID(getSuppliersArticleID())
                .eANUCCArticleID(getEANUCCArticleID());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleIdentification6}.
     */
    public static class Builder {
        private String buyersArticleID;
        private String suppliersArticleID;
        private String eANUCCArticleID;



        /**
         * Setter for buyersArticleID.
         * @param  buyersArticleID  String value for buyersArticleID.
         * @return Builder
         */
        public Builder buyersArticleID(String buyersArticleID) {
            this.buyersArticleID = buyersArticleID;
            return this;
        }

        /**
         * Setter for suppliersArticleID.
         * @param  suppliersArticleID  String value for suppliersArticleID.
         * @return Builder
         */
        public Builder suppliersArticleID(String suppliersArticleID) {
            this.suppliersArticleID = suppliersArticleID;
            return this;
        }

        /**
         * Setter for eANUCCArticleID.
         * @param  eANUCCArticleID  String value for eANUCCArticleID.
         * @return Builder
         */
        public Builder eANUCCArticleID(String eANUCCArticleID) {
            this.eANUCCArticleID = eANUCCArticleID;
            return this;
        }

        /**
         * Builds a new {@link ArticleIdentification6} object using the set fields.
         * @return {@link ArticleIdentification6}
         */
        public ArticleIdentification6 build() {
            return new ArticleIdentification6(buyersArticleID, suppliersArticleID, eANUCCArticleID);
        }
    }
}
