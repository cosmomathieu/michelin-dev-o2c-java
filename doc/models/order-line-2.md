
# Order Line 2

## Structure

`OrderLine2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `CustomerLineItemNumber` | `String` | Optional | - | String getCustomerLineItemNumber() | setCustomerLineItemNumber(String customerLineItemNumber) |
| `AdditionalCustomerReferenceNumber` | [`AdditionalCustomerReferenceNumber`](../../doc/models/additional-customer-reference-number.md) | Optional | - | AdditionalCustomerReferenceNumber getAdditionalCustomerReferenceNumber() | setAdditionalCustomerReferenceNumber(AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) |
| `OrderedArticle` | [`OrderedArticle5`](../../doc/models/ordered-article-5.md) | Required | - | OrderedArticle5 getOrderedArticle() | setOrderedArticle(OrderedArticle5 orderedArticle) |

## Example (as JSON)

```json
{
  "LineID": "LineID6",
  "CustomerLineItemNumber": "CustomerLineItemNumber2",
  "AdditionalCustomerReferenceNumber": {
    "DocumentID": "DocumentID4"
  },
  "OrderedArticle": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "ManufacturersArticleID": "ManufacturersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    },
    "ArticleDescription": {
      "ArticleDescriptionText": "ArticleDescriptionText6"
    },
    "RequestedDeliveryDate": "RequestedDeliveryDate4",
    "RequestedDeliveryTime": "RequestedDeliveryTime8",
    "ArticleComment": "ArticleComment0",
    "ScheduleDetails": [
      {
        "DeliveryDate": "DeliveryDate6",
        "DeliveryTime": "DeliveryTime2",
        "ConfirmedQuantity": {
          "QuantityValue": "QuantityValue8"
        },
        "CancelledQuantity": {
          "QuantityValue": "QuantityValue0"
        },
        "OpenQuantity": {
          "QuantityValue": "QuantityValue8"
        }
      }
    ]
  }
}
```

