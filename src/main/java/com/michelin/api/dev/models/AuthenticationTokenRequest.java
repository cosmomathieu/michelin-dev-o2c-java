/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AuthenticationTokenRequest type.
 */
public class AuthenticationTokenRequest {
    private String grantType;
    private String clientId;
    private String clientSecret;

    /**
     * Default constructor.
     */
    public AuthenticationTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  grantType  String value for grantType.
     * @param  clientId  String value for clientId.
     * @param  clientSecret  String value for clientSecret.
     */
    public AuthenticationTokenRequest(
            String grantType,
            String clientId,
            String clientSecret) {
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Getter for GrantType.
     * @return Returns the String
     */
    @JsonGetter("grant_type")
    public String getGrantType() {
        return grantType;
    }

    /**
     * Setter for GrantType.
     * @param grantType Value for String
     */
    @JsonSetter("grant_type")
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * Getter for ClientId.
     * @return Returns the String
     */
    @JsonGetter("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * Setter for ClientId.
     * @param clientId Value for String
     */
    @JsonSetter("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter for ClientSecret.
     * @return Returns the String
     */
    @JsonGetter("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Setter for ClientSecret.
     * @param clientSecret Value for String
     */
    @JsonSetter("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * Converts this AuthenticationTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthenticationTokenRequest [" + "grantType=" + grantType + ", clientId=" + clientId
                + ", clientSecret=" + clientSecret + "]";
    }

    /**
     * Builds a new {@link AuthenticationTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthenticationTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(grantType, clientId, clientSecret);
        return builder;
    }

    /**
     * Class to build instances of {@link AuthenticationTokenRequest}.
     */
    public static class Builder {
        private String grantType;
        private String clientId;
        private String clientSecret;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  grantType  String value for grantType.
         * @param  clientId  String value for clientId.
         * @param  clientSecret  String value for clientSecret.
         */
        public Builder(String grantType, String clientId, String clientSecret) {
            this.grantType = grantType;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Setter for grantType.
         * @param  grantType  String value for grantType.
         * @return Builder
         */
        public Builder grantType(String grantType) {
            this.grantType = grantType;
            return this;
        }

        /**
         * Setter for clientId.
         * @param  clientId  String value for clientId.
         * @return Builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Setter for clientSecret.
         * @param  clientSecret  String value for clientSecret.
         * @return Builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Builds a new {@link AuthenticationTokenRequest} object using the set fields.
         * @return {@link AuthenticationTokenRequest}
         */
        public AuthenticationTokenRequest build() {
            return new AuthenticationTokenRequest(grantType, clientId, clientSecret);
        }
    }
}
