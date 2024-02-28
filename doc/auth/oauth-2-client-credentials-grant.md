
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for oAuth2ClientCredentials.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |



**Note:** Auth credentials can be set using `oAuth2ClientCredentialsCredentials` in the client builder and accessed through `getOAuth2ClientCredentialsCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet.

```java
MichelinOrder2CashClient client = new MichelinOrder2CashClient.Builder()
    .oAuth2ClientCredentialsCredentials(new OAuth2ClientCredentialsModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .build();
```



Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps.

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

```java
try {
    OAuthToken token = client.getOAuth2ClientCredentialsCredentials().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder()
            .oAuth2ClientCredentialsCredentials(client.getOAuth2ClientCredentialsModel().toBuilder()
                    .oAuthToken(token)
                    .build())
            .build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
httpSession.setAttribute("access_token", client.getOAuth2ClientCredentialsCredentials().getOAuthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OAuthToken token = (OAuthToken) httpSession.getAttribute("access_token");

// re-instantiate the client with oauth token
client = client.newBuilder()
        .oAuth2ClientCredentialsCredentials(client.getOAuth2ClientCredentialsModel().toBuilder()
                .oAuthToken(token)
                .build())
        .build();
```

### Complete example



```java
package com.example;



public class Main {
    public Main() {
        MichelinOrder2CashClient client = new MichelinOrder2CashClient.Builder()
            .oAuth2ClientCredentialsCredentials(new OAuth2ClientCredentialsModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .build();


        try {
            OAuthToken token = client.getOAuth2ClientCredentialsCredentials().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder()
                    .oAuth2ClientCredentialsCredentials(client.getOAuth2ClientCredentialsModel().toBuilder()
                            .oAuthToken(token)
                            .build())
                    .build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```


