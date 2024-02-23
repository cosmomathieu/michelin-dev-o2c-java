
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `apikey2` | `String` |  |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `apikeyCredentials` | [`ApikeyCredentials`](auth/custom-header-signature.md) | The Credentials Setter for Custom Header Signature |
| `basicAuthCredentials` | [`BasicAuthCredentials`](auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |
| `oAuth2ClientCredentialsCredentials` | [`OAuth2ClientCredentialsCredentials`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
MichelinOrder2CashClient client = new MichelinOrder2CashClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .apikey2("apikey")
    .apikeyCredentials(new ApikeyModel.Builder(
            "apikey"
        )
        .build())
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "Username",
            "Password"
        )
        .build())
    .oAuth2ClientCredentialsCredentials(new OAuth2ClientCredentialsModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Michelin Order-to-CashClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAuthenticationController()` | Provides access to Authentication controller. | `AuthenticationController` |
| `getDeliveriesController()` | Provides access to Deliveries controller. | `DeliveriesController` |
| `getInvoicesController()` | Provides access to Invoices controller. | `InvoicesController` |
| `getOrdersController()` | Provides access to Orders controller. | `OrdersController` |
| `getReferentialsController()` | Provides access to Referentials controller. | `ReferentialsController` |
| `getStocksController()` | Provides access to Stocks controller. | `StocksController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getApikey2()` | . | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getApikeyCredentials()` | The credentials to use with Apikey. | [`ApikeyCredentials`](auth/custom-header-signature.md) |
| `getBasicAuthCredentials()` | The credentials to use with BasicAuth. | [`BasicAuthCredentials`](auth/basic-authentication.md) |
| `getOAuth2ClientCredentialsCredentials()` | The credentials to use with OAuth2ClientCredentials. | [`OAuth2ClientCredentialsCredentials`](auth/oauth-2-client-credentials-grant.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

