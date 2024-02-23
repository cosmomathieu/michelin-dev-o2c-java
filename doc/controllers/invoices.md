# Invoices

EDIWheel compliant services

```java
InvoicesController invoicesController = client.getInvoicesController();
```

## Class Name

`InvoicesController`


# Get Your Invoices List

This service will give you your Michelin invoices.

```java
CompletableFuture<EDIWheelB44InvoiceListResponse> getYourInvoicesListAsync(
    final EDIWheelB44InvoiceListRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EDIWheelB44InvoiceListRequest`](../../doc/models/edi-wheel-b44-invoice-list-request.md) | Body, Optional | - |

## Response Type

[`EDIWheelB44InvoiceListResponse`](../../doc/models/edi-wheel-b44-invoice-list-response.md)

## Example Usage

```java
EDIWheelB44InvoiceListRequest body = new EDIWheelB44InvoiceListRequest.Builder(
    "DocumentID2",
    Arrays.asList(
        new Invoice.Builder(
            new BuyerParty.Builder(
                "PartyID0",
                "AgencyCode0"
            )
            .build()
        )
        .build()
    )
)
.build();

invoicesController.getYourInvoicesListAsync(body).thenAccept(result -> {
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
| 401 | Authentication information is missing or invalid | `ApiException` |

