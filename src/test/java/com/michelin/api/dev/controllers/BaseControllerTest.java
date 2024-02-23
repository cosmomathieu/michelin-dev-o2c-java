/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import com.michelin.api.dev.Environment;
import com.michelin.api.dev.MichelinOrder2CashClient;
import com.michelin.api.dev.authentication.ApikeyModel;
import com.michelin.api.dev.authentication.BasicAuthModel;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsModel;
import com.michelin.api.dev.models.OAuthToken;
import com.michelin.api.dev.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static MichelinOrder2CashClient createConfigurationFromEnvironment() {
        MichelinOrder2CashClient.Builder builder = new MichelinOrder2CashClient.Builder();

        final String environment = System.getenv("MICHELIN_ORDER_2_CASH_ENVIRONMENT");
        final String apikey2 = System.getenv("MICHELIN_ORDER_2_CASH_APIKEY_2");
        final String timeout = System.getenv("MICHELIN_ORDER_2_CASH_TIMEOUT");
        final String apikey = System.getenv("MICHELIN_ORDER_2_CASH_APIKEY");
        final String username = System.getenv("MICHELIN_ORDER_2_CASH_USERNAME");
        final String password = System.getenv("MICHELIN_ORDER_2_CASH_PASSWORD");
        final String oAuthClientId = System.getenv("MICHELIN_ORDER_2_CASH_O_AUTH_CLIENT_ID");
        final String oAuthClientSecret =
                System.getenv("MICHELIN_ORDER_2_CASH_O_AUTH_CLIENT_SECRET");

        if (apikey != null) {
            builder.apikeyCredentials(new ApikeyModel
                    .Builder(apikey)
                    .build());
        }
        if (username != null && password != null) {
            builder.basicAuthCredentials(new BasicAuthModel
                    .Builder(username, password)
                    .build());
        }
        if (oAuthClientId != null && oAuthClientSecret != null) {
            builder.oAuth2ClientCredentialsCredentials(new OAuth2ClientCredentialsModel
                    .Builder(oAuthClientId, oAuthClientSecret)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (apikey2 != null) {
            builder.apikey2(apikey2);
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static MichelinOrder2CashClient createConfiguration() {
        // Set Configuration parameters for test execution
        MichelinOrder2CashClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();

        try {
            OAuthToken token = config.getOAuth2ClientCredentialsCredentials().fetchToken();
            config = config.newBuilder()
                .oAuth2ClientCredentialsCredentials(config.getOAuth2ClientCredentialsModel()
                        .toBuilder()
                        .oAuthToken(token)
                        .build())
                .build();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return config;
    }
}
