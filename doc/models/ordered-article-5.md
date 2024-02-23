
# Ordered Article 5

## Structure

`OrderedArticle5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification`](../../doc/models/article-identification.md) | Required | - | ArticleIdentification getArticleIdentification() | setArticleIdentification(ArticleIdentification articleIdentification) |
| `ArticleDescription` | [`ArticleDescription1`](../../doc/models/article-description-1.md) | Optional | - | ArticleDescription1 getArticleDescription() | setArticleDescription(ArticleDescription1 articleDescription) |
| `RequestedDeliveryDate` | `String` | Optional | - | String getRequestedDeliveryDate() | setRequestedDeliveryDate(String requestedDeliveryDate) |
| `RequestedDeliveryTime` | `String` | Optional | - | String getRequestedDeliveryTime() | setRequestedDeliveryTime(String requestedDeliveryTime) |
| `ArticleComment` | `String` | Optional | - | String getArticleComment() | setArticleComment(String articleComment) |
| `ScheduleDetails` | [`List<ScheduleDetail1>`](../../doc/models/schedule-detail-1.md) | Optional | - | List<ScheduleDetail1> getScheduleDetails() | setScheduleDetails(List<ScheduleDetail1> scheduleDetails) |
| `OrderedQuantity` | [`OrderedQuantity`](../../doc/models/ordered-quantity.md) | Optional | - | OrderedQuantity getOrderedQuantity() | setOrderedQuantity(OrderedQuantity orderedQuantity) |

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
  "RequestedDeliveryDate": "RequestedDeliveryDate0",
  "RequestedDeliveryTime": "RequestedDeliveryTime4",
  "ArticleComment": "ArticleComment4",
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
    },
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
    },
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
```

