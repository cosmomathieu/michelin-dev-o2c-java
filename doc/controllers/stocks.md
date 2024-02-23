# Stocks

EDIWheel compliant services

```java
StocksController stocksController = client.getStocksController();
```

## Class Name

`StocksController`


# Inquiry Michelin S Stock for Given Products

This service will give you the Michelin's stock for a list of given products.

```java
CompletableFuture<EDIWheelC11StockInquiryResponse> inquiryMichelinSStockForGivenProductsAsync(
    final EDIWheelC11StockInquiryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EDIWheelC11StockInquiryRequest`](../../doc/models/edi-wheel-c11-stock-inquiry-request.md) | Body, Required | - |

## Response Type

[`EDIWheelC11StockInquiryResponse`](../../doc/models/edi-wheel-c11-stock-inquiry-response.md)

## Example Usage

```java
EDIWheelC11StockInquiryRequest body = new EDIWheelC11StockInquiryRequest.Builder(
    "1",
    Arrays.asList(
        new OrderLine3.Builder(
            "001",
            new OrderedArticle6.Builder(
                new RequestedQuantity1.Builder(
                    "4"
                )
                .build(),
                "2024-12-31"
            )
            .requestedDeliveryTime("23:59:59-04:00")
            .build()
        )
        .build()
    ),
    "C1",
    new Consignee9.Builder(
        "1254692",
        "91"
    )
    .build(),
    new BuyerParty8.Builder(
        "1254691",
        "91"
    )
    .build()
)
.build();

stocksController.inquiryMichelinSStockForGivenProductsAsync(body).thenAccept(result -> {
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
| 404 | Not Found | `ApiException` |
| 408 | Request Timeout | `ApiException` |
| 415 | Unsupported Media Type | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | `ApiException` |

