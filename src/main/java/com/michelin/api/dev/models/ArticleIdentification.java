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
 * This is a model class for ArticleIdentification type.
 */
public class ArticleIdentification {
    private String buyersArticleID;
    private String manufacturersArticleID;
    private String eANUCCArticleID;

    /**
     * Default constructor.
     */
    public ArticleIdentification() {
    }

    /**
     * Initialization constructor.
     * @param  buyersArticleID  String value for buyersArticleID.
     * @param  manufacturersArticleID  String value for manufacturersArticleID.
     * @param  eANUCCArticleID  String value for eANUCCArticleID.
     */
    public ArticleIdentification(
            String buyersArticleID,
            String manufacturersArticleID,
            String eANUCCArticleID) {
        this.buyersArticleID = buyersArticleID;
        this.manufacturersArticleID = manufacturersArticleID;
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
     * Getter for ManufacturersArticleID.
     * @return Returns the String
     */
    @JsonGetter("ManufacturersArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getManufacturersArticleID() {
        return manufacturersArticleID;
    }

    /**
     * Setter for ManufacturersArticleID.
     * @param manufacturersArticleID Value for String
     */
    @JsonSetter("ManufacturersArticleID")
    public void setManufacturersArticleID(String manufacturersArticleID) {
        this.manufacturersArticleID = manufacturersArticleID;
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
     * Converts this ArticleIdentification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleIdentification [" + "buyersArticleID=" + buyersArticleID
                + ", manufacturersArticleID=" + manufacturersArticleID + ", eANUCCArticleID="
                + eANUCCArticleID + "]";
    }

    /**
     * Builds a new {@link ArticleIdentification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleIdentification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .buyersArticleID(getBuyersArticleID())
                .manufacturersArticleID(getManufacturersArticleID())
                .eANUCCArticleID(getEANUCCArticleID());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleIdentification}.
     */
    public static class Builder {
        private String buyersArticleID;
        private String manufacturersArticleID;
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
         * Setter for manufacturersArticleID.
         * @param  manufacturersArticleID  String value for manufacturersArticleID.
         * @return Builder
         */
        public Builder manufacturersArticleID(String manufacturersArticleID) {
            this.manufacturersArticleID = manufacturersArticleID;
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
         * Builds a new {@link ArticleIdentification} object using the set fields.
         * @return {@link ArticleIdentification}
         */
        public ArticleIdentification build() {
            return new ArticleIdentification(buyersArticleID, manufacturersArticleID,
                    eANUCCArticleID);
        }
    }
}
