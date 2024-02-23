/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ArticleDescription1 type.
 */
public class ArticleDescription1 {
    private String articleDescriptionText;

    /**
     * Default constructor.
     */
    public ArticleDescription1() {
    }

    /**
     * Initialization constructor.
     * @param  articleDescriptionText  String value for articleDescriptionText.
     */
    public ArticleDescription1(
            String articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Getter for ArticleDescriptionText.
     * @return Returns the String
     */
    @JsonGetter("ArticleDescriptionText")
    public String getArticleDescriptionText() {
        return articleDescriptionText;
    }

    /**
     * Setter for ArticleDescriptionText.
     * @param articleDescriptionText Value for String
     */
    @JsonSetter("ArticleDescriptionText")
    public void setArticleDescriptionText(String articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Converts this ArticleDescription1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleDescription1 [" + "articleDescriptionText=" + articleDescriptionText + "]";
    }

    /**
     * Builds a new {@link ArticleDescription1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleDescription1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleDescriptionText);
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleDescription1}.
     */
    public static class Builder {
        private String articleDescriptionText;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleDescriptionText  String value for articleDescriptionText.
         */
        public Builder(String articleDescriptionText) {
            this.articleDescriptionText = articleDescriptionText;
        }

        /**
         * Setter for articleDescriptionText.
         * @param  articleDescriptionText  String value for articleDescriptionText.
         * @return Builder
         */
        public Builder articleDescriptionText(String articleDescriptionText) {
            this.articleDescriptionText = articleDescriptionText;
            return this;
        }

        /**
         * Builds a new {@link ArticleDescription1} object using the set fields.
         * @return {@link ArticleDescription1}
         */
        public ArticleDescription1 build() {
            return new ArticleDescription1(articleDescriptionText);
        }
    }
}
