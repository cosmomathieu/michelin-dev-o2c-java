/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev;

import com.michelin.api.dev.authentication.ApikeyCredentials;
import com.michelin.api.dev.authentication.ApikeyModel;
import com.michelin.api.dev.authentication.BasicAuthCredentials;
import com.michelin.api.dev.authentication.BasicAuthModel;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsCredentials;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsModel;
import com.michelin.api.dev.http.client.ReadonlyHttpClientConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * .
     * @return a copy of apikey2
     */
    String getApikey2();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The credentials to use with Apikey.
     * @return apikeyCredentials
     */
    ApikeyCredentials getApikeyCredentials();

    /**
     * The auth credential model for Apikey.
     * @return the instance of ApikeyModel
     */
    ApikeyModel getApikeyModel();

    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    BasicAuthCredentials getBasicAuthCredentials();

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    BasicAuthModel getBasicAuthModel();

    /**
     * The credentials to use with OAuth2ClientCredentials.
     * @return oAuth2ClientCredentialsCredentials
     */
    OAuth2ClientCredentialsCredentials getOAuth2ClientCredentialsCredentials();

    /**
     * The auth credential model for OAuth2ClientCredentials.
     * @return the instance of OAuth2ClientCredentialsModel
     */
    OAuth2ClientCredentialsModel getOAuth2ClientCredentialsModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
