# Referentials

EDIWheel compliant services

```java
ReferentialsController referentialsController = client.getReferentialsController();
```

## Class Name

`ReferentialsController`


# Download Your Price Catalog

This service will give you your price catalog.

```java
CompletableFuture<EDIWheelB40PricatRequest> downloadYourPriceCatalogAsync(
    final String buyerParty,
    final Integer limit,
    final Integer offset,
    final String mspn,
    final AcceptEnum accept)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buyerParty` | `String` | Query, Required | - |
| `limit` | `Integer` | Query, Optional | - |
| `offset` | `Integer` | Query, Optional | - |
| `mspn` | `String` | Query, Optional | - |
| `accept` | [`AcceptEnum`](../../doc/models/accept-enum.md) | Header, Optional | Accepted content type |

## Response Type

[`EDIWheelB40PricatRequest`](../../doc/models/edi-wheel-b40-pricat-request.md)

## Example Usage

```java
String buyerParty = "buyerParty0";
AcceptEnum accept = AcceptEnum.ENUM_APPLICATIONJSON;

referentialsController.downloadYourPriceCatalogAsync(buyerParty, null, null, null, accept).thenAccept(result -> {
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
| 400 | Invalid Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | `ApiException` |

