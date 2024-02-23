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
import com.michelin.api.dev.models.EDIWheelB44InvoiceListRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvoicesControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static MichelinOrder2CashClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static InvoicesController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getInvoicesController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This service will give you your Michelin invoices.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetYourInvoicesList() throws Exception {
        // Parameters for the API call
        EDIWheelB44InvoiceListRequest body = null;

        // Set callback and perform API call
        try {
            controller.getYourInvoicesList(body);
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
