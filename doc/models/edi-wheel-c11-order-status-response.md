
# EDI Wheel C11 Order Status Response

## Structure

`EDIWheelC11OrderStatusResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `OrderDateFrom` | `String` | Optional | - | String getOrderDateFrom() | setOrderDateFrom(String orderDateFrom) |
| `OrderDateTo` | `String` | Optional | - | String getOrderDateTo() | setOrderDateTo(String orderDateTo) |
| `OrderStatusIndicator` | `String` | Optional | - | String getOrderStatusIndicator() | setOrderStatusIndicator(String orderStatusIndicator) |
| `ErrorHead` | [`ErrorHead`](../../doc/models/error-head.md) | Required | - | ErrorHead getErrorHead() | setErrorHead(ErrorHead errorHead) |
| `BuyerParty` | [`BuyerParty2`](../../doc/models/buyer-party-2.md) | Required | - | BuyerParty2 getBuyerParty() | setBuyerParty(BuyerParty2 buyerParty) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `Consignee` | [`Consignee5`](../../doc/models/consignee-5.md) | Optional | - | Consignee5 getConsignee() | setConsignee(Consignee5 consignee) |
| `ReferencedOrder` | [`List<ReferencedOrder1>`](../../doc/models/referenced-order-1.md) | Optional | - | List<ReferencedOrder1> getReferencedOrder() | setReferencedOrder(List<ReferencedOrder1> referencedOrder) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID6",
  "Variant": "Variant0",
  "OrderDateFrom": "OrderDateFrom0",
  "OrderDateTo": "OrderDateTo6",
  "OrderStatusIndicator": "OrderStatusIndicator2",
  "ErrorHead": {
    "ErrorCode": "ErrorCode6"
  },
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0",
    "Name": [
      "Name1"
    ],
    "Address": {
      "Street": [
        "Street0"
      ],
      "City": "City6",
      "District": "District8",
      "PostCode": "PostCode2",
      "PostBoxCode": "PostBoxCode0",
      "CountryCode": "CountryCode8"
    },
    "InformationContact": {
      "ContactID": "ContactID4",
      "Name": [
        "Name1"
      ],
      "TelephoneNumber": "TelephoneNumber6",
      "TelephoneExtension": "TelephoneExtension8",
      "FaxNumber": "FaxNumber6"
    }
  },
  "OrderingParty": {
    "PartyID": "PartyID8",
    "AgencyCode": "AgencyCode8"
  }
}
```

