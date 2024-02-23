# Deliveries

EDIWheel compliant services

```java
DeliveriesController deliveriesController = client.getDeliveriesController();
```

## Class Name

`DeliveriesController`


# Obtain Your Despatch Advices Information

This service will give you your Despatch Advices information.

```java
CompletableFuture<EDIWheelC10DesadvResponse> obtainYourDespatchAdvicesInformationAsync(
    final EDIWheelC10DesadvRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EDIWheelC10DesadvRequest`](../../doc/models/edi-wheel-c10-desadv-request.md) | Body, Required | - |

## Response Type

[`EDIWheelC10DesadvResponse`](../../doc/models/edi-wheel-c10-desadv-response.md)

## Example Usage

```java
EDIWheelC10DesadvRequest body = new EDIWheelC10DesadvRequest.Builder(
    "DocumentID2",
    new BuyerParty.Builder(
        "PartyID0",
        "AgencyCode0"
    )
    .build()
)
.build();

deliveriesController.obtainYourDespatchAdvicesInformationAsync(body).thenAccept(result -> {
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

