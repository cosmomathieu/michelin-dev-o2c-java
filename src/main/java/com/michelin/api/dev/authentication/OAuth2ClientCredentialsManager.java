/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

import com.michelin.api.dev.controllers.OAuthAuthorizationController;
import com.michelin.api.dev.exceptions.ApiException;
import com.michelin.api.dev.models.OAuthToken;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.core.authentication.HeaderAuth;
import java.io.IOException;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Utility class for OAuth 2 authorization and token management.
 */
public class OAuth2ClientCredentialsManager extends HeaderAuth implements OAuth2ClientCredentialsCredentials {

    /**
     * Private instance of OAuth 2 API controller.
     */
    private OAuthAuthorizationController oAuthApi;

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private OAuth2ClientCredentialsModel authModel;

    /**
     * Constructor.
     */
    public OAuth2ClientCredentialsManager(OAuth2ClientCredentialsModel authModel) {
        super(Collections.singletonMap("Authorization",
                getAuthorizationHeader(authModel.getOAuthToken())));
        this.authModel = authModel;
    }

    /**
    * Apply GlobalConfiguration for token management.
    * @param config GlobalConfiguration instance
    */
    public void applyGlobalConfiguration(GlobalConfiguration config) {
        this.oAuthApi = new OAuthAuthorizationController(config);
    }


    /**
     * String value for oAuthClientId.
     * @return oAuthClientId
     */
    public String getOAuthClientId() {
        return authModel.getOAuthClientId();
    }

    /**
     * String value for oAuthClientSecret.
     * @return oAuthClientSecret
     */
    public String getOAuthClientSecret() {
        return authModel.getOAuthClientSecret();
    }

    /**
     * OAuthToken value for oAuthToken.
     * @return oAuthToken
     */
    public OAuthToken getOAuthToken() {
        return authModel.getOAuthToken();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oAuthClientId String value for credentials.
     * @param oAuthClientSecret String value for credentials.
     * @param oAuthToken OAuthToken value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String oAuthClientId, String oAuthClientSecret, OAuthToken oAuthToken) {
        return oAuthClientId.equals(getOAuthClientId())
                && oAuthClientSecret.equals(getOAuthClientSecret())
                && ((getOAuthToken() == null && oAuthToken == null)
                        || (getOAuthToken() != null && oAuthToken != null
                                && oAuthToken.toString().equals(getOAuthToken().toString())));
    }

    /**
     * Converts this OAuth2ClientCredentialsManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OAuth2ClientCredentialsManager [" + "oAuthClientId=" + getOAuthClientId()
                + ", oAuthClientSecret=" + getOAuthClientSecret() + ", oAuthToken="
                + getOAuthToken() + "]";
    }

    /**
     * Fetch the OAuth token asynchronously.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public CompletableFuture<OAuthToken> fetchTokenAsync(
            final Map<String, Object> additionalParameters) {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        return oAuthApi.requestTokenOAuth2ClientCredentialsAsync(
            getBasicAuthForClient(),
            null,
            aparams).thenApply(token -> {
                return token;
            });
    }

    /**
     * Fetch the OAuth token asynchronously.
     */
    public CompletableFuture<OAuthToken> fetchTokenAsync() {
        return fetchTokenAsync(null);
    }

    /**
     * Fetch the OAuth token.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    public OAuthToken fetchToken(Map<String, Object> additionalParameters)
            throws ApiException, IOException {
        final Map<String, Object> aparams =
                additionalParameters == null ? new HashMap<String, Object>()
                : additionalParameters;

        OAuthToken token = oAuthApi.requestTokenOAuth2ClientCredentials(
            getBasicAuthForClient(),
            null,
            aparams);

        if (token.getExpiresIn() != null && token.getExpiresIn() != 0) {
            token.setExpiry((System.currentTimeMillis() / 1000L) + token.getExpiresIn());
        }

        return token;
    }

    /**
     * Fetch the OAuth token.
     */
    public OAuthToken fetchToken() throws ApiException, IOException {
        return fetchToken(null);
    }

    /**
     * Build authorization header value for basic auth.
     * @return Authorization header value for this client.
     */
    private String getBasicAuthForClient() {
        String val = getOAuthClientId() + ":" + getOAuthClientSecret();
        return "Basic " + new String(Base64.getEncoder().encodeToString(val.getBytes()));
    }


    /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    public boolean isTokenExpired() {
        if (getOAuthToken() == null) { 
            throw new IllegalStateException("OAuth token is missing.");
        }

        return getOAuthToken().getExpiry() != null 
            && getOAuthToken().getExpiry() < (System.currentTimeMillis() / 1000L); 
    }

    /**
    * Create authorization header for API calls.
    * @param token OAuth token
    * @return Authorization header
    */
    private static String getAuthorizationHeader(OAuthToken token) {
        if (token == null) {
            return null;
        }
        return "Bearer " + token.getAccessToken();
    }

    /**
    * Validate the authentication on the httpRequest
    */
    @Override
    public void validate() {
        if (getOAuthToken() == null) {
            setErrorMessage("Client is not authorized."
                + " An OAuth token is needed to make API calls.");
            setValidity(false);
        } else if (isTokenExpired()) {
            setErrorMessage("The oAuth token is expired."
                + " A valid token is needed to make API calls.");
            setValidity(false);
        } else {
            setValidity(true);
        }
     }

    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "OAuth2ClientCredentials - " + errorMessage;
     }

}
