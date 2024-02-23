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
 * This is a model class for AuthenticationTokenResponse type.
 */
public class AuthenticationTokenResponse {
    private String accessToken;
    private String signature;
    private String scope;
    private String instanceUrl;
    private String id;
    private String tokenType;
    private String issuedAt;

    /**
     * Default constructor.
     */
    public AuthenticationTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  accessToken  String value for accessToken.
     * @param  signature  String value for signature.
     * @param  scope  String value for scope.
     * @param  instanceUrl  String value for instanceUrl.
     * @param  id  String value for id.
     * @param  tokenType  String value for tokenType.
     * @param  issuedAt  String value for issuedAt.
     */
    public AuthenticationTokenResponse(
            String accessToken,
            String signature,
            String scope,
            String instanceUrl,
            String id,
            String tokenType,
            String issuedAt) {
        this.accessToken = accessToken;
        this.signature = signature;
        this.scope = scope;
        this.instanceUrl = instanceUrl;
        this.id = id;
        this.tokenType = tokenType;
        this.issuedAt = issuedAt;
    }

    /**
     * Getter for AccessToken.
     * @return Returns the String
     */
    @JsonGetter("access_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter for AccessToken.
     * @param accessToken Value for String
     */
    @JsonSetter("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter for Signature.
     * @return Returns the String
     */
    @JsonGetter("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Getter for Scope.
     * @return Returns the String
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * @param scope Value for String
     */
    @JsonSetter("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * Getter for InstanceUrl.
     * @return Returns the String
     */
    @JsonGetter("instance_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstanceUrl() {
        return instanceUrl;
    }

    /**
     * Setter for InstanceUrl.
     * @param instanceUrl Value for String
     */
    @JsonSetter("instance_url")
    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for TokenType.
     * @return Returns the String
     */
    @JsonGetter("token_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTokenType() {
        return tokenType;
    }

    /**
     * Setter for TokenType.
     * @param tokenType Value for String
     */
    @JsonSetter("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Getter for IssuedAt.
     * @return Returns the String
     */
    @JsonGetter("issued_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssuedAt() {
        return issuedAt;
    }

    /**
     * Setter for IssuedAt.
     * @param issuedAt Value for String
     */
    @JsonSetter("issued_at")
    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * Converts this AuthenticationTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthenticationTokenResponse [" + "accessToken=" + accessToken + ", signature="
                + signature + ", scope=" + scope + ", instanceUrl=" + instanceUrl + ", id=" + id
                + ", tokenType=" + tokenType + ", issuedAt=" + issuedAt + "]";
    }

    /**
     * Builds a new {@link AuthenticationTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthenticationTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accessToken(getAccessToken())
                .signature(getSignature())
                .scope(getScope())
                .instanceUrl(getInstanceUrl())
                .id(getId())
                .tokenType(getTokenType())
                .issuedAt(getIssuedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthenticationTokenResponse}.
     */
    public static class Builder {
        private String accessToken;
        private String signature;
        private String scope;
        private String instanceUrl;
        private String id;
        private String tokenType;
        private String issuedAt;



        /**
         * Setter for accessToken.
         * @param  accessToken  String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  String value for scope.
         * @return Builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for instanceUrl.
         * @param  instanceUrl  String value for instanceUrl.
         * @return Builder
         */
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for tokenType.
         * @param  tokenType  String value for tokenType.
         * @return Builder
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Setter for issuedAt.
         * @param  issuedAt  String value for issuedAt.
         * @return Builder
         */
        public Builder issuedAt(String issuedAt) {
            this.issuedAt = issuedAt;
            return this;
        }

        /**
         * Builds a new {@link AuthenticationTokenResponse} object using the set fields.
         * @return {@link AuthenticationTokenResponse}
         */
        public AuthenticationTokenResponse build() {
            return new AuthenticationTokenResponse(accessToken, signature, scope, instanceUrl, id,
                    tokenType, issuedAt);
        }
    }
}
