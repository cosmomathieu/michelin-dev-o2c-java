/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

import com.michelin.api.dev.models.OAuthToken;

/**
 * A data class for OAuth 2 Client Credentials Grant credentials.
 */
public class OAuth2ClientCredentialsModel {
    private String oAuthClientId;
    private String oAuthClientSecret;
    private OAuthToken oAuthToken;

    /**
     * A Constructor for OAuth2ClientCredentialsModel.
     */
    private OAuth2ClientCredentialsModel(String oAuthClientId, String oAuthClientSecret,
            OAuthToken oAuthToken) {
        this.oAuthClientId = oAuthClientId;
        this.oAuthClientSecret = oAuthClientSecret;
        this.oAuthToken = oAuthToken;
    }

    /**
     * Getter for oAuthClientId.
     * @return oAuthClientId The value of OAuthClientId.
     */
    public String getOAuthClientId() {
        return this.oAuthClientId;
    }

    /**
     * Getter for oAuthClientSecret.
     * @return oAuthClientSecret The value of OAuthClientSecret.
     */
    public String getOAuthClientSecret() {
        return this.oAuthClientSecret;
    }

    /**
     * Getter for oAuthToken.
     * @return oAuthToken The value of OAuthToken.
     */
    public OAuthToken getOAuthToken() {
        return this.oAuthToken;
    }

    /**
     * Builds a new {@link OAuth2ClientCredentialsModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link OAuth2ClientCredentialsModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getOAuthClientId(), getOAuthClientSecret())
            .oAuthToken(getOAuthToken());
    }

    /**
     * A Builder class for OAuth 2 Client Credentials Grant credentials.
     */
    public static class Builder {
        private String oAuthClientId;
        private String oAuthClientSecret;
        private OAuthToken oAuthToken;

        /**
         * The constructor with required auth credentials.
         * @param oAuthClientId The value of OAuthClientId.
         * @param oAuthClientSecret The value of OAuthClientSecret.
         */
        public Builder(String oAuthClientId, String oAuthClientSecret) {
            if (oAuthClientId == null) {
                throw new NullPointerException("OAuthClientId cannot be null.");
            }

            if (oAuthClientSecret == null) {
                throw new NullPointerException("OAuthClientSecret cannot be null.");
            }

            this.oAuthClientId = oAuthClientId;
            this.oAuthClientSecret = oAuthClientSecret;
        }

        /**
         * Setter for oAuthClientId.
         * @param oAuthClientId The value of OAuthClientId.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthClientId(String oAuthClientId) {
            if (oAuthClientId == null) {
                throw new NullPointerException("OAuthClientId cannot be null.");
            }

            this.oAuthClientId = oAuthClientId;
            return this;
        }

        /**
         * Setter for oAuthClientSecret.
         * @param oAuthClientSecret The value of OAuthClientSecret.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthClientSecret(String oAuthClientSecret) {
            if (oAuthClientSecret == null) {
                throw new NullPointerException("OAuthClientSecret cannot be null.");
            }

            this.oAuthClientSecret = oAuthClientSecret;
            return this;
        }

        /**
         * Setter for oAuthToken.
         * @param oAuthToken The value of OAuthToken.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthToken(OAuthToken oAuthToken) {
            this.oAuthToken = oAuthToken;
            return this;
        }

        /**
         * Builds the instance of OAuth2ClientCredentialsModel using the provided credentials.
         * @return The instance of OAuth2ClientCredentialsModel.
         */
        public OAuth2ClientCredentialsModel build() {
            return new OAuth2ClientCredentialsModel(oAuthClientId, oAuthClientSecret, oAuthToken);
        }
    }
}