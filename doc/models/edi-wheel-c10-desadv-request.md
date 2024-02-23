
# EDI Wheel C10 Desadv Request

## Structure

`EDIWheelC10DesadvRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `DespatchFromDate` | `String` | Optional | - | String getDespatchFromDate() | setDespatchFromDate(String despatchFromDate) |
| `DespatchToDate` | `String` | Optional | - | String getDespatchToDate() | setDespatchToDate(String despatchToDate) |
| `References` | [`References`](../../doc/models/references.md) | Optional | - | References getReferences() | setReferences(References references) |
| `SellerParty` | [`SellerParty`](../../doc/models/seller-party.md) | Optional | - | SellerParty getSellerParty() | setSellerParty(SellerParty sellerParty) |
| `SupplierParty` | [`SupplierParty`](../../doc/models/supplier-party.md) | Optional | - | SupplierParty getSupplierParty() | setSupplierParty(SupplierParty supplierParty) |
| `BuyerParty` | [`BuyerParty`](../../doc/models/buyer-party.md) | Required | - | BuyerParty getBuyerParty() | setBuyerParty(BuyerParty buyerParty) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `Consignee` | [`Consignee`](../../doc/models/consignee.md) | Optional | - | Consignee getConsignee() | setConsignee(Consignee consignee) |
| `OrderedArticle` | [`OrderedArticle`](../../doc/models/ordered-article.md) | Optional | - | OrderedArticle getOrderedArticle() | setOrderedArticle(OrderedArticle orderedArticle) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID4",
  "Variant": "Variant8",
  "DespatchFromDate": "DespatchFromDate0",
  "DespatchToDate": "DespatchToDate2",
  "References": {
    "ReferenceTypeCode": "ReferenceTypeCode2",
    "DocumentID": "DocumentID6"
  },
  "SellerParty": {
    "PartyID": "PartyID6",
    "AgencyCode": "AgencyCode6"
  },
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0"
  }
}
```

