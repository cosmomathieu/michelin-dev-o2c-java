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
import com.michelin.api.dev.models.EDIWheelB44InvoiceListRequest;
import com.michelin.api.dev.models.EDIWheelB44InvoiceListResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class InvoicesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public InvoicesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you your Michelin invoices.
     * @param  body  Optional parameter: Example:
     * @return    Returns the EDIWheelB44InvoiceListResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelB44InvoiceListResponse getYourInvoicesList(
            final EDIWheelB44InvoiceListRequest body) throws ApiException, IOException {
        return prepareGetYourInvoicesListRequest(body).execute();
    }

    /**
     * This service will give you your Michelin invoices.
     * @param  body  Optional parameter: Example:
     * @return    Returns the EDIWheelB44InvoiceListResponse response from the API call
     */
    public CompletableFuture<EDIWheelB44InvoiceListResponse> getYourInvoicesListAsync(
            final EDIWheelB44InvoiceListRequest body) {
        try { 
            return prepareGetYourInvoicesListRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getYourInvoicesList.
     */
    private ApiCall<EDIWheelB44InvoiceListResponse, ApiException> prepareGetYourInvoicesListRequest(
            final EDIWheelB44InvoiceListRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EDIWheelB44InvoiceListResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoice/amn/B3_4/invoices")
                        .bodyParam(param -> param.value(body).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, EDIWheelB44InvoiceListResponse.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication information is missing or invalid",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}