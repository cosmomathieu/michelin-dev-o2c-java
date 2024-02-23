/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ArticleDescription type.
 */
public class ArticleDescription {
    private List<String> articleDescriptionText;

    /**
     * Default constructor.
     */
    public ArticleDescription() {
    }

    /**
     * Initialization constructor.
     * @param  articleDescriptionText  List of String value for articleDescriptionText.
     */
    public ArticleDescription(
            List<String> articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Getter for ArticleDescriptionText.
     * @return Returns the List of String
     */
    @JsonGetter("ArticleDescriptionText")
    public List<String> getArticleDescriptionText() {
        return articleDescriptionText;
    }

    /**
     * Setter for ArticleDescriptionText.
     * @param articleDescriptionText Value for List of String
     */
    @JsonSetter("ArticleDescriptionText")
    public void setArticleDescriptionText(List<String> articleDescriptionText) {
        this.articleDescriptionText = articleDescriptionText;
    }

    /**
     * Converts this ArticleDescription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleDescription [" + "articleDescriptionText=" + articleDescriptionText + "]";
    }

    /**
     * Builds a new {@link ArticleDescription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleDescription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleDescriptionText);
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleDescription}.
     */
    public static class Builder {
        private List<String> articleDescriptionText;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleDescriptionText  List of String value for articleDescriptionText.
         */
        public Builder(List<String> articleDescriptionText) {
            this.articleDescriptionText = articleDescriptionText;
        }

        /**
         * Setter for articleDescriptionText.
         * @param  articleDescriptionText  List of String value for articleDescriptionText.
         * @return Builder
         */
        public Builder articleDescriptionText(List<String> articleDescriptionText) {
            this.articleDescriptionText = articleDescriptionText;
            return this;
        }

        /**
         * Builds a new {@link ArticleDescription} object using the set fields.
         * @return {@link ArticleDescription}
         */
        public ArticleDescription build() {
            return new ArticleDescription(articleDescriptionText);
        }
    }
}
