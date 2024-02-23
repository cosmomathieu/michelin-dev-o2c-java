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
import com.michelin.api.dev.models.EDIWheelC11StockInquiryRequest;
import com.michelin.api.dev.models.EDIWheelC11StockInquiryResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class StocksController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public StocksController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you the Michelin's stock for a list of given products.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11StockInquiryResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelC11StockInquiryResponse inquiryMichelinSStockForGivenProducts(
            final EDIWheelC11StockInquiryRequest body) throws ApiException, IOException {
        return prepareInquiryMichelinSStockForGivenProductsRequest(body).execute();
    }

    /**
     * This service will give you the Michelin's stock for a list of given products.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11StockInquiryResponse response from the API call
     */
    public CompletableFuture<EDIWheelC11StockInquiryResponse> inquiryMichelinSStockForGivenProductsAsync(
            final EDIWheelC11StockInquiryRequest body) {
        try { 
            return prepareInquiryMichelinSStockForGivenProductsRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for inquiryMichelinSStockForGivenProducts.
     */
    private ApiCall<EDIWheelC11StockInquiryResponse, ApiException> prepareInquiryMichelinSStockForGivenProductsRequest(
            final EDIWheelC11StockInquiryRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EDIWheelC11StockInquiryResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/stock/amn/C1_1/inquiry")
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
                                response -> ApiHelper.deserialize(response, EDIWheelC11StockInquiryResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Invalid Request",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("408",
                                 ErrorCase.setReason("Request Timeout",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("415",
                                 ErrorCase.setReason("Unsupported Media Type",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too Many Requests",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}