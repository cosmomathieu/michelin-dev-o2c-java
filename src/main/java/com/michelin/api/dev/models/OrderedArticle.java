/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrderedArticle type.
 */
public class OrderedArticle {
    private ArticleIdentification articleIdentification;

    /**
     * Default constructor.
     */
    public OrderedArticle() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification value for articleIdentification.
     */
    public OrderedArticle(
            ArticleIdentification articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Getter for ArticleIdentification.
     * @return Returns the ArticleIdentification
     */
    @JsonGetter("ArticleIdentification")
    public ArticleIdentification getArticleIdentification() {
        return articleIdentification;
    }

    /**
     * Setter for ArticleIdentification.
     * @param articleIdentification Value for ArticleIdentification
     */
    @JsonSetter("ArticleIdentification")
    public void setArticleIdentification(ArticleIdentification articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Converts this OrderedArticle into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderedArticle [" + "articleIdentification=" + articleIdentification + "]";
    }

    /**
     * Builds a new {@link OrderedArticle.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderedArticle.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification);
        return builder;
    }

    /**
     * Class to build instances of {@link OrderedArticle}.
     */
    public static class Builder {
        private ArticleIdentification articleIdentification;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         */
        public Builder(ArticleIdentification articleIdentification) {
            this.articleIdentification = articleIdentification;
        }

        /**
         * Setter for articleIdentification.
         * @param  articleIdentification  ArticleIdentification value for articleIdentification.
         * @return Builder
         */
        public Builder articleIdentification(ArticleIdentification articleIdentification) {
            this.articleIdentification = articleIdentification;
            return this;
        }

        /**
         * Builds a new {@link OrderedArticle} object using the set fields.
         * @return {@link OrderedArticle}
         */
        public OrderedArticle build() {
            return new OrderedArticle(articleIdentification);
        }
    }
}
