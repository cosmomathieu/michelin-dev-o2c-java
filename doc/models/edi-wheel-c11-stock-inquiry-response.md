
# EDI Wheel C11 Stock Inquiry Response

## Structure

`EDIWheelC11StockInquiryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Optional | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `ErrorHead` | [`ErrorHead4`](../../doc/models/error-head-4.md) | Optional | - | ErrorHead4 getErrorHead() | setErrorHead(ErrorHead4 errorHead) |
| `TransportPriority` | `String` | Optional | - | String getTransportPriority() | setTransportPriority(String transportPriority) |
| `OrderLine` | [`List<OrderLine4>`](../../doc/models/order-line-4.md) | Optional | - | List<OrderLine4> getOrderLine() | setOrderLine(List<OrderLine4> orderLine) |
| `CustomerReference` | [`CustomerReference4`](../../doc/models/customer-reference-4.md) | Optional | - | CustomerReference4 getCustomerReference() | setCustomerReference(CustomerReference4 customerReference) |
| `Consignee` | [`Consignee10`](../../doc/models/consignee-10.md) | Optional | - | Consignee10 getConsignee() | setConsignee(Consignee10 consignee) |
| `BuyerParty` | [`BuyerParty9`](../../doc/models/buyer-party-9.md) | Optional | - | BuyerParty9 getBuyerParty() | setBuyerParty(BuyerParty9 buyerParty) |

## Example (as JSON)

```json
{
  "documentID": "documentID0",
  "variant": "variant6",
  "errorHead": {
    "errorCode": "errorCode2"
  },
  "transportPriority": "transportPriority8",
  "orderLine": [
    {
      "lineID": "lineID2",
      "orderedArticle": {
        "articleIdentification": {
          "manufacturersArticleID": "manufacturersArticleID0",
          "eanuccArticleID": "eanuccArticleID2",
          "buyersArticleID": "buyersArticleID2"
        },
        "articleDescription": {
          "articleDescriptionText": "articleDescriptionText2"
        },
        "availability": "availability6",
        "requestedQuantity": {
          "quantityValue": "quantityValue8"
        },
        "error": {
          "errorCode": "errorCode0",
          "errorText": "errorText4"
        }
      }
    }
  ]
}
```

