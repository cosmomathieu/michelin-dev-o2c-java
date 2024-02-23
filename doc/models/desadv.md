
# Desadv

## Structure

`Desadv`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssueDate` | `String` | Required | - | String getIssueDate() | setIssueDate(String issueDate) |
| `DocumentNumber` | `String` | Required | - | String getDocumentNumber() | setDocumentNumber(String documentNumber) |
| `DocumentTypeCode` | `String` | Required | - | String getDocumentTypeCode() | setDocumentTypeCode(String documentTypeCode) |
| `Measures` | [`Measures`](../../doc/models/measures.md) | Optional | - | Measures getMeasures() | setMeasures(Measures measures) |
| `DespatchDate` | `String` | Required | - | String getDespatchDate() | setDespatchDate(String despatchDate) |
| `ArrivalDate` | `String` | Required | - | String getArrivalDate() | setArrivalDate(String arrivalDate) |
| `ArrivalTime` | `String` | Optional | - | String getArrivalTime() | setArrivalTime(String arrivalTime) |
| `DeliveryOption` | `List<String>` | Optional | - | List<String> getDeliveryOption() | setDeliveryOption(List<String> deliveryOption) |
| `TotalQuantity` | [`TotalQuantity`](../../doc/models/total-quantity.md) | Optional | - | TotalQuantity getTotalQuantity() | setTotalQuantity(TotalQuantity totalQuantity) |
| `References` | [`List<References1>`](../../doc/models/references-1.md) | Required | - | List<References1> getReferences() | setReferences(List<References1> references) |
| `BuyerParty` | [`BuyerParty`](../../doc/models/buyer-party.md) | Required | - | BuyerParty getBuyerParty() | setBuyerParty(BuyerParty buyerParty) |
| `SupplierParty` | [`SupplierParty1`](../../doc/models/supplier-party-1.md) | Optional | - | SupplierParty1 getSupplierParty() | setSupplierParty(SupplierParty1 supplierParty) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `Consignee` | [`Consignee1`](../../doc/models/consignee-1.md) | Required | - | Consignee1 getConsignee() | setConsignee(Consignee1 consignee) |
| `SellerParty` | [`SellerParty`](../../doc/models/seller-party.md) | Optional | - | SellerParty getSellerParty() | setSellerParty(SellerParty sellerParty) |
| `CarrierParty` | [`CarrierParty`](../../doc/models/carrier-party.md) | Optional | - | CarrierParty getCarrierParty() | setCarrierParty(CarrierParty carrierParty) |
| `LineLevel` | [`List<LineLevel>`](../../doc/models/line-level.md) | Optional | - | List<LineLevel> getLineLevel() | setLineLevel(List<LineLevel> lineLevel) |

## Example (as JSON)

```json
{
  "IssueDate": "IssueDate6",
  "DocumentNumber": "DocumentNumber8",
  "DocumentTypeCode": "DocumentTypeCode6",
  "DespatchDate": "DespatchDate0",
  "ArrivalDate": "ArrivalDate6",
  "References": [
    {
      "ReferenceTypeCode": "ReferenceTypeCode2",
      "DocumentID": "DocumentID6",
      "IssueDate": "IssueDate8"
    }
  ],
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0"
  },
  "Consignee": {
    "PartyID": "PartyID8",
    "AgencyCode": "AgencyCode2",
    "Name": [
      "Name7"
    ],
    "Address": {
      "Street": [
        "Street0"
      ],
      "City": "City6",
      "District": "District8",
      "PostCode": "PostCode2",
      "PostBoxCode": "PostBoxCode0",
      "SubCountry": "SubCountry8",
      "CountryCode": "CountryCode8"
    }
  },
  "Measures": {
    "GrossWeight": {
      "Measure": "Measure6",
      "MeasureUnitCode": "MeasureUnitCode4"
    },
    "NetWeight": {
      "Measure": "Measure0",
      "MeasureUnitCode": "MeasureUnitCode2"
    },
    "Volume": {
      "Measure": "Measure8",
      "MeasureUnitCode": "MeasureUnitCode0"
    }
  },
  "ArrivalTime": "ArrivalTime8",
  "DeliveryOption": [
    "DeliveryOption1",
    "DeliveryOption2",
    "DeliveryOption3"
  ],
  "TotalQuantity": {
    "QuantityValue": "QuantityValue2",
    "MeasureUnitCode": "MeasureUnitCode4"
  },
  "SupplierParty": {
    "PartyID": "PartyID2",
    "AgencyCode": "AgencyCode8",
    "SalesContact": {
      "Name": "Name8"
    },
    "ShippingLocation": {
      "LocationName": "LocationName2"
    }
  }
}
```

