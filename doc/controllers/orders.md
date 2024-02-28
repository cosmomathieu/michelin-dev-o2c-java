# Orders

EDIWheel compliant services

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Create a New Michelin Order](../../doc/controllers/orders.md#create-a-new-michelin-order)
* [Obtain the Status of Your Orders](../../doc/controllers/orders.md#obtain-the-status-of-your-orders)


# Create a New Michelin Order

This service will create a new Michelin order

```java
CompletableFuture<EDIWheelC11OrderCreationResponse> createANewMichelinOrderAsync(
    final EDIWheelC11OrderCreationRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EDIWheelC11OrderCreationRequest`](../../doc/models/edi-wheel-c11-order-creation-request.md) | Body, Required | - |

## Response Type

[`EDIWheelC11OrderCreationResponse`](../../doc/models/edi-wheel-c11-order-creation-response.md)

## Example Usage

```java
EDIWheelC11OrderCreationRequest body = new EDIWheelC11OrderCreationRequest.Builder(
    "DocumentID2",
    new CustomerReference.Builder(
        "DocumentID6"
    )
    .build(),
    new BuyerParty2.Builder(
        "PartyID0",
        "AgencyCode0"
    )
    .build()
)
.build();

ordersController.createANewMichelinOrderAsync(body).thenAccept(result -> {
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


# Obtain the Status of Your Orders

This service will give you the status of your orders.

```java
CompletableFuture<EDIWheelC11OrderStatusResponse> obtainTheStatusOfYourOrdersAsync(
    final EDIWheelC11OrderStatusRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`EDIWheelC11OrderStatusRequest`](../../doc/models/edi-wheel-c11-order-status-request.md) | Body, Required | - |

## Response Type

[`EDIWheelC11OrderStatusResponse`](../../doc/models/edi-wheel-c11-order-status-response.md)

## Example Usage

```java
EDIWheelC11OrderStatusRequest body = new EDIWheelC11OrderStatusRequest.Builder(
    "DocumentID2",
    new BuyerParty.Builder(
        "PartyID0",
        "AgencyCode0"
    )
    .build()
)
.build();

ordersController.obtainTheStatusOfYourOrdersAsync(body).thenAccept(result -> {
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

