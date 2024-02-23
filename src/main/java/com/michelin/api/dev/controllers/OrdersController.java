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
import com.michelin.api.dev.models.EDIWheelC11OrderCreationRequest;
import com.michelin.api.dev.models.EDIWheelC11OrderCreationResponse;
import com.michelin.api.dev.models.EDIWheelC11OrderStatusRequest;
import com.michelin.api.dev.models.EDIWheelC11OrderStatusResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class OrdersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public OrdersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you the status of your orders.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11OrderStatusResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelC11OrderStatusResponse obtainTheStatusOfYourOrders(
            final EDIWheelC11OrderStatusRequest body) throws ApiException, IOException {
        return prepareObtainTheStatusOfYourOrdersRequest(body).execute();
    }

    /**
     * This service will give you the status of your orders.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11OrderStatusResponse response from the API call
     */
    public CompletableFuture<EDIWheelC11OrderStatusResponse> obtainTheStatusOfYourOrdersAsync(
            final EDIWheelC11OrderStatusRequest body) {
        try { 
            return prepareObtainTheStatusOfYourOrdersRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for obtainTheStatusOfYourOrders.
     */
    private ApiCall<EDIWheelC11OrderStatusResponse, ApiException> prepareObtainTheStatusOfYourOrdersRequest(
            final EDIWheelC11OrderStatusRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EDIWheelC11OrderStatusResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/order/amn/C1_1/status")
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
                                response -> ApiHelper.deserialize(response, EDIWheelC11OrderStatusResponse.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication information is missing or invalid",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This service will create a new Michelin order.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11OrderCreationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelC11OrderCreationResponse createANewMichelinOrder(
            final EDIWheelC11OrderCreationRequest body) throws ApiException, IOException {
        return prepareCreateANewMichelinOrderRequest(body).execute();
    }

    /**
     * This service will create a new Michelin order.
     * @param  body  Required parameter: Example:
     * @return    Returns the EDIWheelC11OrderCreationResponse response from the API call
     */
    public CompletableFuture<EDIWheelC11OrderCreationResponse> createANewMichelinOrderAsync(
            final EDIWheelC11OrderCreationRequest body) {
        try { 
            return prepareCreateANewMichelinOrderRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createANewMichelinOrder.
     */
    private ApiCall<EDIWheelC11OrderCreationResponse, ApiException> prepareCreateANewMichelinOrderRequest(
            final EDIWheelC11OrderCreationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<EDIWheelC11OrderCreationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/order/amn/C1_1/create")
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
                                response -> ApiHelper.deserialize(response, EDIWheelC11OrderCreationResponse.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication information is missing or invalid",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}