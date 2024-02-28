/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import static org.junit.Assert.assertNotNull;

import com.michelin.api.dev.MichelinOrder2CashClient;
import com.michelin.api.dev.exceptions.ApiException;
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

}
