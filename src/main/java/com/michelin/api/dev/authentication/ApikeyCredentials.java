/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

/**
 * Interface for defining the behavior of CustomHeader Authentication.
 */
public interface ApikeyCredentials {

    /**
     * String value for apikey.
     * @return apikey
     */
    String getApikey();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param apikey String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String apikey);
}
