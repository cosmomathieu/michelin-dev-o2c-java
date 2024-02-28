/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.authentication;

import io.apimatic.core.authentication.HeaderAuth;
import java.util.HashMap;

public class ApiKeyManager extends HeaderAuth implements ApiKeyCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private ApiKeyModel authModel;

    /**
     * Constructor that sets custom header parameters.
     */
    public ApiKeyManager(ApiKeyModel authModel) {

        super(new HashMap<String,String>() {
            private static final long serialVersionUID = 1L;
            {
                put("api_key", authModel.getApiKey());
            }
        });

        this.authModel = authModel;
    }

    /**
     * String value for apiKey.
     * @return apiKey
     */
    public String getApiKey() {
        return authModel.getApiKey();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param apiKey String value for credentials.
     * @return true if credentials matched.
     */
    public boolean equals(String apiKey) {
        return apiKey.equals(getApiKey());
    }

    /**
     * Converts this ApiKeyManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiKeyManager [" + "apiKey=" + getApiKey() + "]";
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

        return "ApiKey - " + errorMessage;
     }

}
