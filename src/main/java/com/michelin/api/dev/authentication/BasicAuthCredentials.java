/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

/**
 * Interface for defining the behavior of Basic Authentication.
 */
public interface BasicAuthCredentials {

    /**
     * String value for username.
     * @return username
     */
    String getUsername();

    /**
     * String value for password.
     * @return password
     */
    String getPassword();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param username String value for credentials.
     * @param password String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String username, String password);
}