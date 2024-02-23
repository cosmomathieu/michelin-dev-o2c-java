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
 * This is a model class for ArticleIdentification8 type.
 */
public class ArticleIdentification8 {
    private String manufacturersArticleID;
    private String eanuccArticleID;
    private String buyersArticleID;

    /**
     * Default constructor.
     */
    public ArticleIdentification8() {
    }

    /**
     * Initialization constructor.
     * @param  manufacturersArticleID  String value for manufacturersArticleID.
     * @param  eanuccArticleID  String value for eanuccArticleID.
     * @param  buyersArticleID  String value for buyersArticleID.
     */
    public ArticleIdentification8(
            String manufacturersArticleID,
            String eanuccArticleID,
            String buyersArticleID) {
        this.manufacturersArticleID = manufacturersArticleID;
        this.eanuccArticleID = eanuccArticleID;
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
     * Getter for EanuccArticleID.
     * @return Returns the String
     */
    @JsonGetter("eanuccArticleID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEanuccArticleID() {
        return eanuccArticleID;
    }

    /**
     * Setter for EanuccArticleID.
     * @param eanuccArticleID Value for String
     */
    @JsonSetter("eanuccArticleID")
    public void setEanuccArticleID(String eanuccArticleID) {
        this.eanuccArticleID = eanuccArticleID;
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
     * Converts this ArticleIdentification8 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleIdentification8 [" + "manufacturersArticleID=" + manufacturersArticleID
                + ", eanuccArticleID=" + eanuccArticleID + ", buyersArticleID=" + buyersArticleID
                + "]";
    }

    /**
     * Builds a new {@link ArticleIdentification8.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleIdentification8.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .manufacturersArticleID(getManufacturersArticleID())
                .eanuccArticleID(getEanuccArticleID())
                .buyersArticleID(getBuyersArticleID());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleIdentification8}.
     */
    public static class Builder {
        private String manufacturersArticleID;
        private String eanuccArticleID;
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
         * Setter for eanuccArticleID.
         * @param  eanuccArticleID  String value for eanuccArticleID.
         * @return Builder
         */
        public Builder eanuccArticleID(String eanuccArticleID) {
            this.eanuccArticleID = eanuccArticleID;
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
         * Builds a new {@link ArticleIdentification8} object using the set fields.
         * @return {@link ArticleIdentification8}
         */
        public ArticleIdentification8 build() {
            return new ArticleIdentification8(manufacturersArticleID, eanuccArticleID,
                    buyersArticleID);
        }
    }
}
