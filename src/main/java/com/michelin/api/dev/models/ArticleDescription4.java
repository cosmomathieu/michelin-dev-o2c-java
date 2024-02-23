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
 * This is a model class for ArticleDescription4 type.
 */
public class ArticleDescription4 {
    private String articleDescriptionText;

    /**
     * Default constructor.
     */
    public ArticleDescription4() {
    }

    /**
     * Initialization constructor.
     * @param  articleDescriptionText  String value for articleDescriptionText.
     */
    public ArticleDescription4(
            String articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Getter for ArticleDescriptionText.
     * @return Returns the String
     */
    @JsonGetter("articleDescriptionText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getArticleDescriptionText() {
        return articleDescriptionText;
    }

    /**
     * Setter for ArticleDescriptionText.
     * @param articleDescriptionText Value for String
     */
    @JsonSetter("articleDescriptionText")
    public void setArticleDescriptionText(String articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Converts this ArticleDescription4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleDescription4 [" + "articleDescriptionText=" + articleDescriptionText + "]";
    }

    /**
     * Builds a new {@link ArticleDescription4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleDescription4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .articleDescriptionText(getArticleDescriptionText());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleDescription4}.
     */
    public static class Builder {
        private String articleDescriptionText;



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
         * Builds a new {@link ArticleDescription4} object using the set fields.
         * @return {@link ArticleDescription4}
         */
        public ArticleDescription4 build() {
            return new ArticleDescription4(articleDescriptionText);
        }
    }
}
