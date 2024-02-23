
# Referenced Order 1

## Structure

`ReferencedOrder1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | [`Error1`](../../doc/models/error-1.md) | Required | - | Error1 getError() | setError(Error1 error) |
| `OrderDate` | `String` | Optional | - | String getOrderDate() | setOrderDate(String orderDate) |
| `SupplierOrderNumber` | [`SupplierOrderNumber1`](../../doc/models/supplier-order-number-1.md) | Optional | - | SupplierOrderNumber1 getSupplierOrderNumber() | setSupplierOrderNumber(SupplierOrderNumber1 supplierOrderNumber) |
| `OrderingMethod` | `String` | Optional | - | String getOrderingMethod() | setOrderingMethod(String orderingMethod) |
| `OrderReference` | [`OrderReference`](../../doc/models/order-reference.md) | Optional | - | OrderReference getOrderReference() | setOrderReference(OrderReference orderReference) |
| `PickUp` | `String` | Optional | - | String getPickUp() | setPickUp(String pickUp) |
| `DeliveryOption` | `String` | Optional | - | String getDeliveryOption() | setDeliveryOption(String deliveryOption) |
| `SellerParty` | [`SellerParty`](../../doc/models/seller-party.md) | Optional | - | SellerParty getSellerParty() | setSellerParty(SellerParty sellerParty) |
| `SupplierParty` | [`SupplierParty5`](../../doc/models/supplier-party-5.md) | Optional | - | SupplierParty5 getSupplierParty() | setSupplierParty(SupplierParty5 supplierParty) |
| `Contract` | [`Contract`](../../doc/models/contract.md) | Optional | - | Contract getContract() | setContract(Contract contract) |
| `OrderLine` | [`List<OrderLine2>`](../../doc/models/order-line-2.md) | Optional | - | List<OrderLine2> getOrderLine() | setOrderLine(List<OrderLine2> orderLine) |

## Example (as JSON)

```json
{
  "Error": {
    "errorCode": "errorCode0",
    "ErrorText": "ErrorText0"
  },
  "OrderDate": "OrderDate6",
  "SupplierOrderNumber": {
    "DocumentID": "DocumentID2"
  },
  "OrderingMethod": "OrderingMethod0",
  "OrderReference": {
    "DocumentID": "DocumentID6"
  },
  "PickUp": "PickUp8"
}
```

