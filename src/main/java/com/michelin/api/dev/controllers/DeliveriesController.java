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
import com.michelin.api.dev.http.request.HttpMethod;
import com.michelin.api.dev.models.EDIWheelC10DesadvRequest;
import com.michelin.api.dev.models.EDIWheelC10DesadvResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DeliveriesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeliveriesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you your Despatch Advices information.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC10DesadvResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelC10DesadvResponse obtainYourDespatchAdvicesInformation(
            final EDIWheelC10DesadvRequest body) throws ApiException, IOException {
        return prepareObtainYourDespatchAdvicesInformationRequest(body).execute();
    }

    /**
     * This service will give you your Despatch Advices information.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC10DesadvResponse response from the API call
     */
    public CompletableFuture<EDIWheelC10DesadvResponse> obtainYourDespatchAdvicesInformationAsync(
            final EDIWheelC10DesadvRequest body) {
        try { 
            return prepareObtainYourDespatchAdvicesInformationRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for obtainYourDespatchAdvicesInformation.
     */
    private ApiCall<EDIWheelC10DesadvResponse, ApiException> prepareObtainYourDespatchAdvicesInformationRequest(
            final EDIWheelC10DesadvRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EDIWheelC10DesadvResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/desadv/amn/C1_0/desadv")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .or(orAuth -> orAuth
                                        .and(andAuth -> andAuth
                                                .add("basicAuth")
                                                .add("apikey"))
                                        .add("oAuth2ClientCredentials")))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EDIWheelC10DesadvResponse.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication information is missing or invalid",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}