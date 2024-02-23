/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

/**
 * A data class for Custom Header Signature credentials.
 */
public class ApikeyModel {
    private String apikey;

    /**
     * A Constructor for ApikeyModel.
     */
    private ApikeyModel(String apikey) {
        this.apikey = apikey;
    }

    /**
     * Getter for apikey.
     * @return apikey The value of apikey.
     */
    public String getApikey() {
        return this.apikey;
    }

    /**
     * Builds a new {@link ApikeyModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link ApikeyModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getApikey());
    }

    /**
     * A Builder class for Custom Header Signature credentials.
     */
    public static class Builder {
        private String apikey;

        /**
         * The constructor with required auth credentials.
         * @param apikey The value of Apikey.
         */
        public Builder(String apikey) {
            if (apikey == null) {
                throw new NullPointerException("Apikey cannot be null.");
            }

            this.apikey = apikey;
        }

        /**
         * Setter for apikey.
         * @param apikey The value of apikey.
         * @return Builder The current instance of Builder.
         */
        public Builder apikey(String apikey) {
            if (apikey == null) {
                throw new NullPointerException("Apikey cannot be null.");
            }

            this.apikey = apikey;
            return this;
        }

        /**
         * Builds the instance of ApikeyModel using the provided credentials.
         * @return The instance of ApikeyModel.
         */
        public ApikeyModel build() {
            return new ApikeyModel(apikey);
        }
    }
}