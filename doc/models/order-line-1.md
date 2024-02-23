
# Order Line 1

## Structure

`OrderLine1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `SuppliersOrderLineID` | `String` | Optional | - | String getSuppliersOrderLineID() | setSuppliersOrderLineID(String suppliersOrderLineID) |
| `AdditionalCustomerReferenceNumber` | [`AdditionalCustomerReferenceNumber`](../../doc/models/additional-customer-reference-number.md) | Optional | - | AdditionalCustomerReferenceNumber getAdditionalCustomerReferenceNumber() | setAdditionalCustomerReferenceNumber(AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) |
| `OrderedArticle` | [`OrderedArticle3`](../../doc/models/ordered-article-3.md) | Required | - | OrderedArticle3 getOrderedArticle() | setOrderedArticle(OrderedArticle3 orderedArticle) |

## Example (as JSON)

```json
{
  "LineID": "LineID8",
  "OrderedArticle": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "ManufacturersArticleID": "ManufacturersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    },
    "ArticleDescription": {
      "ArticleDescriptionText": "ArticleDescriptionText6"
    },
    "OrderReference": {
      "DocumentID": "DocumentID6"
    },
    "Error": {
      "ErrorCode": "ErrorCode6",
      "ErrorText": "ErrorText0"
    },
    "ScheduleDetails": [
      {
        "DeliveryDate": "DeliveryDate6",
        "DeliveryTime": "DeliveryTime2",
        "ConfirmedQuantity": {
          "QuantityValue": "QuantityValue8"
        },
        "TransportMode": "TransportMode2",
        "PriceDetails": {
          "NetUnitPrice": {
            "PriceAmount": "PriceAmount4"
          }
        },
        "Charge": [
          {
            "ChargeCategory": "ChargeCategory4",
            "ChargeAmount": {
              "AmountValue": "AmountValue2"
            },
            "ChargePercent": "ChargePercent0"
          },
          {
            "ChargeCategory": "ChargeCategory4",
            "ChargeAmount": {
              "AmountValue": "AmountValue2"
            },
            "ChargePercent": "ChargePercent0"
          }
        ]
      }
    ],
    "OrderedQuantity": {
      "QuantityValue": "QuantityValue2"
    },
    "RequestedDeliveryDate": "RequestedDeliveryDate4",
    "RequestedDeliveryTime": "RequestedDeliveryTime8",
    "Availability": "Availability4",
    "ArticleComment": "ArticleComment0",
    "KilledQuantity": {
      "QuantityValue": "QuantityValue4"
    }
  },
  "SuppliersOrderLineID": "SuppliersOrderLineID2",
  "AdditionalCustomerReferenceNumber": {
    "DocumentID": "DocumentID4"
  }
}
```

