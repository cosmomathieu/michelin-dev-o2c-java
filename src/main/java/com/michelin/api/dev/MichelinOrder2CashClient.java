/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev;

import com.michelin.api.dev.authentication.ApikeyCredentials;
import com.michelin.api.dev.authentication.ApikeyManager;
import com.michelin.api.dev.authentication.ApikeyModel;
import com.michelin.api.dev.authentication.BasicAuthCredentials;
import com.michelin.api.dev.authentication.BasicAuthManager;
import com.michelin.api.dev.authentication.BasicAuthModel;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsCredentials;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsManager;
import com.michelin.api.dev.authentication.OAuth2ClientCredentialsModel;
import com.michelin.api.dev.controllers.AuthenticationController;
import com.michelin.api.dev.controllers.DeliveriesController;
import com.michelin.api.dev.controllers.InvoicesController;
import com.michelin.api.dev.controllers.OAuthAuthorizationController;
import com.michelin.api.dev.controllers.OrdersController;
import com.michelin.api.dev.controllers.ReferentialsController;
import com.michelin.api.dev.controllers.StocksController;
import com.michelin.api.dev.http.client.HttpCallback;
import com.michelin.api.dev.http.client.HttpClientConfiguration;
import com.michelin.api.dev.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class MichelinOrder2CashClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private AuthenticationController authentication;
    private DeliveriesController deliveries;
    private InvoicesController invoices;
    private OrdersController orders;
    private ReferentialsController referentials;
    private StocksController stocks;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * .
     */
    private final String apikey2;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * ApikeyManager.
     */
    private ApikeyManager apikeyManager;

    /**
     * The instance of ApikeyModel.
     */
    private ApikeyModel apikeyModel;

    /**
     * BasicAuthManager.
     */
    private BasicAuthManager basicAuthManager;

    /**
     * The instance of BasicAuthModel.
     */
    private BasicAuthModel basicAuthModel;

    /**
     * OAuth2ClientCredentialsManager.
     */
    private OAuth2ClientCredentialsManager oAuth2ClientCredentialsManager;

    /**
     * The instance of OAuth2ClientCredentialsModel.
     */
    private OAuth2ClientCredentialsModel oAuth2ClientCredentialsModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private MichelinOrder2CashClient(Environment environment, String apikey2, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, ApikeyModel apikeyModel,
            BasicAuthModel basicAuthModel,
            OAuth2ClientCredentialsModel oAuth2ClientCredentialsModel,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.apikey2 = apikey2;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        this.apikeyModel = apikeyModel;
        this.basicAuthModel = basicAuthModel;
        this.oAuth2ClientCredentialsModel = oAuth2ClientCredentialsModel;

        if (this.authentications.containsKey("apikey")) {
            this.apikeyManager = (ApikeyManager) this.authentications.get("apikey");
        }

        if (!this.authentications.containsKey("apikey")
                || !getApikeyCredentials().equals(apikeyModel.getApikey())) {
            this.apikeyManager = new ApikeyManager(apikeyModel);
            this.authentications.put("apikey", apikeyManager);
        }

        if (this.authentications.containsKey("basicAuth")) {
            this.basicAuthManager = (BasicAuthManager) this.authentications.get("basicAuth");
        }

        if (!this.authentications.containsKey("basicAuth")
                || !getBasicAuthCredentials().equals(basicAuthModel.getUsername(),
                        basicAuthModel.getPassword())) {
            this.basicAuthManager = new BasicAuthManager(basicAuthModel);
            this.authentications.put("basicAuth", basicAuthManager);
        }

        if (this.authentications.containsKey("oAuth2ClientCredentials")) {
            this.oAuth2ClientCredentialsManager =
                    (OAuth2ClientCredentialsManager) this.authentications.get("oAuth2ClientCredentials");
        }

        if (!this.authentications.containsKey("oAuth2ClientCredentials")
                || !getOAuth2ClientCredentialsCredentials().equals(
                        oAuth2ClientCredentialsModel.getOAuthClientId(),
                        oAuth2ClientCredentialsModel.getOAuthClientSecret(),
                        oAuth2ClientCredentialsModel.getOAuthToken())) {
            this.oAuth2ClientCredentialsManager = new OAuth2ClientCredentialsManager(
                    oAuth2ClientCredentialsModel);
            this.authentications.put("oAuth2ClientCredentials", oAuth2ClientCredentialsManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .globalHeader("apikey", apikey2)
                .build();
        this.oAuth2ClientCredentialsManager.applyGlobalConfiguration(globalConfig);

        authentication = new AuthenticationController(globalConfig);
        deliveries = new DeliveriesController(globalConfig);
        invoices = new InvoicesController(globalConfig);
        orders = new OrdersController(globalConfig);
        referentials = new ReferentialsController(globalConfig);
        stocks = new StocksController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of AuthenticationController.
     * @return authentication
     */
    public AuthenticationController getAuthenticationController() {
        return authentication;
    }

    /**
     * Get the instance of DeliveriesController.
     * @return deliveries
     */
    public DeliveriesController getDeliveriesController() {
        return deliveries;
    }

    /**
     * Get the instance of InvoicesController.
     * @return invoices
     */
    public InvoicesController getInvoicesController() {
        return invoices;
    }

    /**
     * Get the instance of OrdersController.
     * @return orders
     */
    public OrdersController getOrdersController() {
        return orders;
    }

    /**
     * Get the instance of ReferentialsController.
     * @return referentials
     */
    public ReferentialsController getReferentialsController() {
        return referentials;
    }

    /**
     * Get the instance of StocksController.
     * @return stocks
     */
    public StocksController getStocksController() {
        return stocks;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * .
     * @return apikey2
     */
    public String getApikey2() {
        return apikey2;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with Apikey.
     * @return apikeyCredentials
     */
    public ApikeyCredentials getApikeyCredentials() {
        return apikeyManager;
    }

    /**
     * The auth credential model for Apikey.
     * @return the instance of ApikeyModel
     */
    public ApikeyModel getApikeyModel() {
        return apikeyModel;
    }
    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    public BasicAuthCredentials getBasicAuthCredentials() {
        return basicAuthManager;
    }

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    public BasicAuthModel getBasicAuthModel() {
        return basicAuthModel;
    }
    /**
     * The credentials to use with OAuth2ClientCredentials.
     * @return oAuth2ClientCredentialsCredentials
     */
    public OAuth2ClientCredentialsCredentials getOAuth2ClientCredentialsCredentials() {
        return oAuth2ClientCredentialsManager;
    }

    /**
     * The auth credential model for OAuth2ClientCredentials.
     * @return the instance of OAuth2ClientCredentialsModel
     */
    public OAuth2ClientCredentialsModel getOAuth2ClientCredentialsModel() {
        return oAuth2ClientCredentialsModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://dev.api.michelin.com/";
            }
        }
        if (environment.equals(Environment.ENVIRONMENT2)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://qualif.api.michelin.com/";
            }
        }
        if (environment.equals(Environment.ENVIRONMENT3)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://indus.api.michelin.com/";
            }
        }
        if (environment.equals(Environment.ENVIRONMENT4)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api.michelin.com/";
            }
        }
        return "https://dev.api.michelin.com/";
    }

    /**
     * Configuration variables loaded from Properties.
     * @param configProperties Properties
     * @return MichelinOrder2CashClient instance.
     */
    public static MichelinOrder2CashClient loadFromProperties(Properties configProperties) {
        return new MichelinOrder2CashClient.Builder(configProperties).build();
    }

    /**
     * Converts this MichelinOrder2CashClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MichelinOrder2CashClient [" + "environment=" + environment + ", apikey2=" + apikey2
                + ", httpClientConfig=" + httpClientConfig + ", authentications=" + authentications
                + "]";
    }

    /**
     * Builds a new {@link MichelinOrder2CashClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link MichelinOrder2CashClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.apikey2 = getApikey2();
        builder.httpClient = getHttpClient();
        builder.apikeyCredentials(getApikeyModel()
                .toBuilder().build());
        builder.basicAuthCredentials(getBasicAuthModel()
                .toBuilder().build());
        builder.oAuth2ClientCredentialsCredentials(getOAuth2ClientCredentialsModel()
                .toBuilder().build());
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link MichelinOrder2CashClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String apikey2 = "TODO: Replace";
        private HttpClient httpClient;
        private ApikeyModel apikeyModel = new ApikeyModel.Builder("").build();
        private BasicAuthModel basicAuthModel = new BasicAuthModel.Builder("", "").build();
        private OAuth2ClientCredentialsModel oAuth2ClientCredentialsModel =
                new OAuth2ClientCredentialsModel.Builder("", "").build();
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        public Builder() {}

        public Builder(Properties configProperties) {
           this.environment = Environment.fromString(configProperties.getProperty("environment", Environment.PRODUCTION.toString()));
           this.apikey2 = configProperties.getProperty("apikey2", "TODO: Replace");
        }

        /**
         * Credentials setter for ApikeyCredentials.
         * @param apikeyModel The instance of ApikeyModel.
         * @return The current instance of builder.
         */
        public Builder apikeyCredentials(ApikeyModel apikeyModel) {
            this.apikeyModel = apikeyModel;
            return this;
        }

        /**
         * Credentials setter for BasicAuthCredentials.
         * @param basicAuthModel The instance of BasicAuthModel.
         * @return The current instance of builder.
         */
        public Builder basicAuthCredentials(BasicAuthModel basicAuthModel) {
            this.basicAuthModel = basicAuthModel;
            return this;
        }

        /**
         * Credentials setter for OAuth2ClientCredentialsCredentials.
         * @param oAuth2ClientCredentialsModel The instance of OAuth2ClientCredentialsModel.
         * @return The current instance of builder.
         */
        public Builder oAuth2ClientCredentialsCredentials(
                OAuth2ClientCredentialsModel oAuth2ClientCredentialsModel) {
            this.oAuth2ClientCredentialsModel = oAuth2ClientCredentialsModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * .
         * @param apikey2 The apikey2 for client.
         * @return Builder
         */
        public Builder apikey2(String apikey2) {
            if (apikey2 == null) {
                throw new NullPointerException("apikey2 cannot be null");
            }
            this.apikey2 = apikey2;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new MichelinOrder2CashClient object using the set fields.
         * @return MichelinOrder2CashClient
         */
        public MichelinOrder2CashClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new MichelinOrder2CashClient(environment, apikey2, httpClient, httpClientConfig,
                    apikeyModel, basicAuthModel, oAuth2ClientCredentialsModel, authentications,
                    httpCallback);
        }
    }
}