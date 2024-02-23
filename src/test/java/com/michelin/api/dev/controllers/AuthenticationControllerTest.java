/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.michelin.api.dev.ApiHelper;
import com.michelin.api.dev.MichelinOrder2CashClient;
import com.michelin.api.dev.exceptions.ApiException;
import com.michelin.api.dev.models.AuthenticationTokenRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthenticationControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static MichelinOrder2CashClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AuthenticationController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAuthenticationController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This service will give you a valid authorization token to consume the other services.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestObtainATokenToConsumeTheOtherServices() throws Exception {
        // Parameters for the API call
        AuthenticationTokenRequest body = null;

        // Set callback and perform API call
        try {
            controller.obtainATokenToConsumeTheOtherServices(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
