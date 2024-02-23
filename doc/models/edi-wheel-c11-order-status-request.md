
# EDI Wheel C11 Order Status Request

## Structure

`EDIWheelC11OrderStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `OrderDateFrom` | `String` | Optional | - | String getOrderDateFrom() | setOrderDateFrom(String orderDateFrom) |
| `OrderDateTo` | `String` | Optional | - | String getOrderDateTo() | setOrderDateTo(String orderDateTo) |
| `OrderingMethod` | `String` | Optional | - | String getOrderingMethod() | setOrderingMethod(String orderingMethod) |
| `OrderStatusIndicator` | `String` | Optional | - | String getOrderStatusIndicator() | setOrderStatusIndicator(String orderStatusIndicator) |
| `BuyerParty` | [`BuyerParty`](../../doc/models/buyer-party.md) | Required | - | BuyerParty getBuyerParty() | setBuyerParty(BuyerParty buyerParty) |
| `SellerParty` | [`SellerParty`](../../doc/models/seller-party.md) | Optional | - | SellerParty getSellerParty() | setSellerParty(SellerParty sellerParty) |
| `Consignee` | [`Consignee4`](../../doc/models/consignee-4.md) | Optional | - | Consignee4 getConsignee() | setConsignee(Consignee4 consignee) |
| `SupplierParty` | [`SupplierParty`](../../doc/models/supplier-party.md) | Optional | - | SupplierParty getSupplierParty() | setSupplierParty(SupplierParty supplierParty) |
| `ReferencedOrder` | [`List<ReferencedOrder>`](../../doc/models/referenced-order.md) | Optional | - | List<ReferencedOrder> getReferencedOrder() | setReferencedOrder(List<ReferencedOrder> referencedOrder) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID0",
  "Variant": "Variant4",
  "OrderDateFrom": "OrderDateFrom4",
  "OrderDateTo": "OrderDateTo2",
  "OrderingMethod": "OrderingMethod4",
  "OrderStatusIndicator": "OrderStatusIndicator6",
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0"
  }
}
```

