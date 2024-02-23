/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.michelin.api.dev.ApiHelper;
import com.michelin.api.dev.Server;
import com.michelin.api.dev.exceptions.ApiException;
import com.michelin.api.dev.exceptions.AuthenticationErrorException;
import com.michelin.api.dev.http.request.HttpMethod;
import com.michelin.api.dev.models.AuthenticationTokenRequest;
import com.michelin.api.dev.models.AuthenticationTokenResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class AuthenticationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AuthenticationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you a valid authorization token to consume the other services.
     * @param  body  Optional parameter: Example:
     * @return    Returns the AuthenticationTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AuthenticationTokenResponse obtainATokenToConsumeTheOtherServices(
            final AuthenticationTokenRequest body) throws ApiException, IOException {
        return prepareObtainATokenToConsumeTheOtherServicesRequest(body).execute();
    }

    /**
     * This service will give you a valid authorization token to consume the other services.
     * @param  body  Optional parameter: Example:
     * @return    Returns the AuthenticationTokenResponse response from the API call
     */
    public CompletableFuture<AuthenticationTokenResponse> obtainATokenToConsumeTheOtherServicesAsync(
            final AuthenticationTokenRequest body) {
        try { 
            return prepareObtainATokenToConsumeTheOtherServicesRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for obtainATokenToConsumeTheOtherServices.
     */
    private ApiCall<AuthenticationTokenResponse, ApiException> prepareObtainATokenToConsumeTheOtherServicesRequest(
            final AuthenticationTokenRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<AuthenticationTokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/idp/v2/b2b/oauth2/token")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AuthenticationTokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new AuthenticationErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication information is missing or invalid",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}