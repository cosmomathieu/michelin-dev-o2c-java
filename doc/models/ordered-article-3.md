
# Ordered Article 3

## Structure

`OrderedArticle3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification`](../../doc/models/article-identification.md) | Required | - | ArticleIdentification getArticleIdentification() | setArticleIdentification(ArticleIdentification articleIdentification) |
| `ArticleDescription` | [`ArticleDescription1`](../../doc/models/article-description-1.md) | Required | - | ArticleDescription1 getArticleDescription() | setArticleDescription(ArticleDescription1 articleDescription) |
| `RequestedDeliveryDate` | `String` | Optional | - | String getRequestedDeliveryDate() | setRequestedDeliveryDate(String requestedDeliveryDate) |
| `RequestedDeliveryTime` | `String` | Optional | - | String getRequestedDeliveryTime() | setRequestedDeliveryTime(String requestedDeliveryTime) |
| `Availability` | `String` | Optional | - | String getAvailability() | setAvailability(String availability) |
| `ArticleComment` | `String` | Optional | - | String getArticleComment() | setArticleComment(String articleComment) |
| `OrderReference` | [`OrderReference`](../../doc/models/order-reference.md) | Required | - | OrderReference getOrderReference() | setOrderReference(OrderReference orderReference) |
| `Error` | [`Error`](../../doc/models/error.md) | Required | - | Error getError() | setError(Error error) |
| `ScheduleDetails` | [`List<ScheduleDetail>`](../../doc/models/schedule-detail.md) | Required | - | List<ScheduleDetail> getScheduleDetails() | setScheduleDetails(List<ScheduleDetail> scheduleDetails) |
| `KilledQuantity` | [`KilledQuantity`](../../doc/models/killed-quantity.md) | Optional | - | KilledQuantity getKilledQuantity() | setKilledQuantity(KilledQuantity killedQuantity) |
| `OrderedQuantity` | [`OrderedQuantity`](../../doc/models/ordered-quantity.md) | Required | - | OrderedQuantity getOrderedQuantity() | setOrderedQuantity(OrderedQuantity orderedQuantity) |

## Example (as JSON)

```json
{
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
  "RequestedDeliveryTime": "RequestedDeliveryTime0",
  "Availability": "Availability6",
  "ArticleComment": "ArticleComment8",
  "KilledQuantity": {
    "QuantityValue": "QuantityValue4"
  }
}
```

