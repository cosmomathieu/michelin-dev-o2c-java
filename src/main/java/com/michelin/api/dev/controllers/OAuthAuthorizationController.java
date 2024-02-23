/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import com.michelin.api.dev.ApiHelper;
import com.michelin.api.dev.Server;
import com.michelin.api.dev.exceptions.ApiException;
import com.michelin.api.dev.exceptions.OAuthProviderException;
import com.michelin.api.dev.http.request.HttpMethod;
import com.michelin.api.dev.models.OAuthToken;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class OAuthAuthorizationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public OAuthAuthorizationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Create a new OAuth 2 token.
     * @param  authorization  Required parameter: Authorization header in Basic auth format
     * @param  scope  Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public OAuthToken requestTokenOAuth2ClientCredentials(
            final String authorization,
            final String scope,
            final Map<String, Object> fieldParameters) throws ApiException, IOException {
        return prepareRequestTokenOAuth2ClientCredentialsRequest(authorization, scope,
                fieldParameters).execute();
    }

    /**
     * Create a new OAuth 2 token.
     * @param  authorization  Required parameter: Authorization header in Basic auth format
     * @param  scope  Optional parameter: Requested scopes as a space-delimited list.
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
     * @return    Returns the OAuthToken response from the API call
     */
    public CompletableFuture<OAuthToken> requestTokenOAuth2ClientCredentialsAsync(
            final String authorization,
            final String scope,
            final Map<String, Object> fieldParameters) {
        try { 
            return prepareRequestTokenOAuth2ClientCredentialsRequest(authorization, scope,
            fieldParameters).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for requestTokenOAuth2ClientCredentials.
     */
    private ApiCall<OAuthToken, ApiException> prepareRequestTokenOAuth2ClientCredentialsRequest(
            final String authorization,
            final String scope,
            final Map<String, Object> fieldParameters) throws IOException {
        return new ApiCall.Builder<OAuthToken, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/idp/v2/b2b/oauth2/token")
                        .formParam(param -> param.key("grant_type")
                                .value("client_credentials").isRequired(false))
                        .formParam(param -> param.key("scope")
                                .value(scope).isRequired(false))
                        .formParam(fieldParameters)
                        .headerParam(param -> param.key("Authorization")
                                .value(authorization).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, OAuthToken.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("OAuth 2 provider returned an error.",
                                (reason, context) -> new OAuthProviderException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("OAuth 2 provider says client authentication failed.",
                                (reason, context) -> new OAuthProviderException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}