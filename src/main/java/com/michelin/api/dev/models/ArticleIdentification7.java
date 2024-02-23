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
 * This is a model class for ArticleIdentification7 type.
 */
public class ArticleIdentification7 {
    private String manufacturersArticleID;
    private String buyersArticleID;

    /**
     * Default constructor.
     */
    public ArticleIdentification7() {
    }

    /**
     * Initialization constructor.
     * @param  manufacturersArticleID  String value for manufacturersArticleID.
     * @param  buyersArticleID  String value for buyersArticleID.
     */
    public ArticleIdentification7(
            String manufacturersArticleID,
            String buyersArticleID) {
        this.manufacturersArticleID = manufacturersArticleID;
        this.buyersArticleID = buyersArticleID;
    }

    /**
     * Getter for ManufacturersArticleID.
     * @return Returns the String
     */
    @JsonGetter("manufacturersArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getManufacturersArticleID() {
        return manufacturersArticleID;
    }

    /**
     * Setter for ManufacturersArticleID.
     * @param manufacturersArticleID Value for String
     */
    @JsonSetter("manufacturersArticleID")
    public void setManufacturersArticleID(String manufacturersArticleID) {
        this.manufacturersArticleID = manufacturersArticleID;
    }

    /**
     * Getter for BuyersArticleID.
     * @return Returns the String
     */
    @JsonGetter("buyersArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBuyersArticleID() {
        return buyersArticleID;
    }

    /**
     * Setter for BuyersArticleID.
     * @param buyersArticleID Value for String
     */
    @JsonSetter("buyersArticleID")
    public void setBuyersArticleID(String buyersArticleID) {
        this.buyersArticleID = buyersArticleID;
    }

    /**
     * Converts this ArticleIdentification7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleIdentification7 [" + "manufacturersArticleID=" + manufacturersArticleID
                + ", buyersArticleID=" + buyersArticleID + "]";
    }

    /**
     * Builds a new {@link ArticleIdentification7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleIdentification7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .manufacturersArticleID(getManufacturersArticleID())
                .buyersArticleID(getBuyersArticleID());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleIdentification7}.
     */
    public static class Builder {
        private String manufacturersArticleID;
        private String buyersArticleID;



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
         * Setter for buyersArticleID.
         * @param  buyersArticleID  String value for buyersArticleID.
         * @return Builder
         */
        public Builder buyersArticleID(String buyersArticleID) {
            this.buyersArticleID = buyersArticleID;
            return this;
        }

        /**
         * Builds a new {@link ArticleIdentification7} object using the set fields.
         * @return {@link ArticleIdentification7}
         */
        public ArticleIdentification7 build() {
            return new ArticleIdentification7(manufacturersArticleID, buyersArticleID);
        }
    }
}
