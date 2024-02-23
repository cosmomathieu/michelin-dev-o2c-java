/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.controllers;

import com.michelin.api.dev.ApiHelper;
import com.michelin.api.dev.Server;
import com.michelin.api.dev.exceptions.ApiException;
import com.michelin.api.dev.http.request.HttpMethod;
import com.michelin.api.dev.models.AcceptEnum;
import com.michelin.api.dev.models.EDIWheelB40PricatRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ReferentialsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ReferentialsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This service will give you your price catalog.
     * @param  buyerParty  Required parameter: Example:
     * @param  limit  Optional parameter: Example:
     * @param  offset  Optional parameter: Example:
     * @param  mspn  Optional parameter: Example:
     * @param  accept  Optional parameter: Accepted content type
     * @return    Returns the EDIWheelB40PricatRequest response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public EDIWheelB40PricatRequest downloadYourPriceCatalog(
            final String buyerParty,
            final Integer limit,
            final Integer offset,
            final String mspn,
            final AcceptEnum accept) throws ApiException, IOException {
        return prepareDownloadYourPriceCatalogRequest(buyerParty, limit, offset, mspn,
                accept).execute();
    }

    /**
     * This service will give you your price catalog.
     * @param  buyerParty  Required parameter: Example:
     * @param  limit  Optional parameter: Example:
     * @param  offset  Optional parameter: Example:
     * @param  mspn  Optional parameter: Example:
     * @param  accept  Optional parameter: Accepted content type
     * @return    Returns the EDIWheelB40PricatRequest response from the API call
     */
    public CompletableFuture<EDIWheelB40PricatRequest> downloadYourPriceCatalogAsync(
            final String buyerParty,
            final Integer limit,
            final Integer offset,
            final String mspn,
            final AcceptEnum accept) {
        try { 
            return prepareDownloadYourPriceCatalogRequest(buyerParty, limit, offset, mspn,
            accept).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for downloadYourPriceCatalog.
     */
    private ApiCall<EDIWheelB40PricatRequest, ApiException> prepareDownloadYourPriceCatalogRequest(
            final String buyerParty,
            final Integer limit,
            final Integer offset,
            final String mspn,
            final AcceptEnum accept) throws IOException {
        return new ApiCall.Builder<EDIWheelB40PricatRequest, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/pricat/amn/B4_0/pricat")
                        .queryParam(param -> param.key("buyerParty")
                                .value(buyerParty))
                        .queryParam(param -> param.key("limit")
                                .value(limit).isRequired(false))
                        .queryParam(param -> param.key("offset")
                                .value(offset).isRequired(false))
                        .queryParam(param -> param.key("mspn")
                                .value(mspn).isRequired(false))
                        .headerParam(param -> param.key("Accept")
                                .value((accept != null) ? accept.value() : "application/json").isRequired(false))
                        .withAuth(auth -> auth
                                .or(orAuth -> orAuth
                                        .and(andAuth -> andAuth
                                                .add("basicAuth")
                                                .add("apikey"))
                                        .add("oAuth2ClientCredentials")))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, EDIWheelB40PricatRequest.class))
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