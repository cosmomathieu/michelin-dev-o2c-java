/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.authentication;

import com.michelin.api.dev.ApiHelper;
import io.apimatic.core.authentication.HeaderAuth;
import java.util.Collections;

/**
 * Utility class for authorization and token management.
 */
public class BasicAuthManager extends HeaderAuth implements BasicAuthCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private BasicAuthModel authModel;

    /**
     * Constructor.
     * @param authModel The data model instance for auth credentials.
     */
    public BasicAuthManager(BasicAuthModel authModel) {
        super(Collections.singletonMap("Authorization",
                ApiHelper.getBase64EncodedCredentials(
                        authModel.getUsername(),
                        authModel.getPassword())));
        this.authModel = authModel;
    }

    /**
     * String value for username.
     * @return username
     */
    public String getUsername() {
        return authModel.getUsername();
    }

    /**
     * String value for password.
     * @return password
     */
    public String getPassword() {
        return authModel.getPassword();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param username String value for credentials.
     * @param password String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String username, String password) {
        return username.equals(getUsername())
                && password.equals(getPassword());
    }

    /**
     * Converts this BasicAuthManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BasicAuthManager [" + "username=" + getUsername() + ", password=" + getPassword()
                + "]";
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

        return "BasicAuth - " + errorMessage;
     }

}
