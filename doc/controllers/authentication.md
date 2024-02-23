# Authentication

```java
AuthenticationController authenticationController = client.getAuthenticationController();
```

## Class Name

`AuthenticationController`


# Obtain a Token to Consume the Other Services

This service will give you a valid authorization token to consume the other services.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<AuthenticationTokenResponse> obtainATokenToConsumeTheOtherServicesAsync(
    final AuthenticationTokenRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AuthenticationTokenRequest`](../../doc/models/authentication-token-request.md) | Body, Optional | - |

## Response Type

[`AuthenticationTokenResponse`](../../doc/models/authentication-token-response.md)

## Example Usage

```java
authenticationController.obtainATokenToConsumeTheOtherServicesAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AuthenticationErrorException`](../../doc/models/authentication-error-exception.md) |
| 401 | Authentication information is missing or invalid | `ApiException` |

