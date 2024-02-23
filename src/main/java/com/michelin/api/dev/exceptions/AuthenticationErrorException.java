/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for AuthenticationErrorException type.
 */
public class AuthenticationErrorException extends ApiException {
    private static final long serialVersionUID = 8694478190472970287L;
    private String error;
    private String errorDescription;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AuthenticationErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Error.
     * @return Returns the String
     */
    @JsonGetter("error")
    public String getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * @param error Value for String
     */
    @JsonSetter("error")
    private void setError(String error) {
        this.error = error;
    }

    /**
     * Getter for ErrorDescription.
     * @return Returns the String
     */
    @JsonGetter("error_description")
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * Setter for ErrorDescription.
     * @param errorDescription Value for String
     */
    @JsonSetter("error_description")
    private void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
