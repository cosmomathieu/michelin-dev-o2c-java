
# EDI Wheel C11 Stock Inquiry Request

## Structure

`EDIWheelC11StockInquiryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Variant` | `String` | Required | - | String getVariant() | setVariant(String variant) |
| `OrderLine` | [`List<OrderLine3>`](../../doc/models/order-line-3.md) | Required | - | List<OrderLine3> getOrderLine() | setOrderLine(List<OrderLine3> orderLine) |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `CustomerReference` | [`CustomerReference4`](../../doc/models/customer-reference-4.md) | Optional | - | CustomerReference4 getCustomerReference() | setCustomerReference(CustomerReference4 customerReference) |
| `Consignee` | [`Consignee9`](../../doc/models/consignee-9.md) | Required | - | Consignee9 getConsignee() | setConsignee(Consignee9 consignee) |
| `BuyerParty` | [`BuyerParty8`](../../doc/models/buyer-party-8.md) | Required | - | BuyerParty8 getBuyerParty() | setBuyerParty(BuyerParty8 buyerParty) |

## Example (as JSON)

```json
{
  "variant": "1",
  "orderLine": [
    {
      "lineID": "001",
      "orderedArticle": {
        "requestedQuantity": {
          "quantityValue": "4"
        },
        "requestedDeliveryTime": "23:59:59-04:00",
        "requestedDeliveryDate": "2024-12-31",
        "articleIdentification": {
          "manufacturersArticleID": "manufacturersArticleID0",
          "buyersArticleID": "buyersArticleID2"
        }
      }
    }
  ],
  "documentID": "C1",
  "consignee": {
    "partyID": "1254692",
    "agencyCode": "91"
  },
  "buyerParty": {
    "partyID": "1254691",
    "agencyCode": "91"
  },
  "customerReference": {
    "documentID": "documentID6"
  }
}
```

