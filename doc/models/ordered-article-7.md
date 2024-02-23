
# Ordered Article 7

## Structure

`OrderedArticle7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification8`](../../doc/models/article-identification-8.md) | Optional | - | ArticleIdentification8 getArticleIdentification() | setArticleIdentification(ArticleIdentification8 articleIdentification) |
| `ArticleDescription` | [`ArticleDescription4`](../../doc/models/article-description-4.md) | Optional | - | ArticleDescription4 getArticleDescription() | setArticleDescription(ArticleDescription4 articleDescription) |
| `Availability` | `String` | Optional | - | String getAvailability() | setAvailability(String availability) |
| `RequestedQuantity` | [`RequestedQuantity2`](../../doc/models/requested-quantity-2.md) | Optional | - | RequestedQuantity2 getRequestedQuantity() | setRequestedQuantity(RequestedQuantity2 requestedQuantity) |
| `Error` | [`Error2`](../../doc/models/error-2.md) | Optional | - | Error2 getError() | setError(Error2 error) |
| `RequestedDeliveryTime` | `String` | Optional | - | String getRequestedDeliveryTime() | setRequestedDeliveryTime(String requestedDeliveryTime) |
| `RequestedDeliveryDate` | `String` | Optional | - | String getRequestedDeliveryDate() | setRequestedDeliveryDate(String requestedDeliveryDate) |
| `ScheduleDetails` | [`List<ScheduleDetail2>`](../../doc/models/schedule-detail-2.md) | Optional | - | List<ScheduleDetail2> getScheduleDetails() | setScheduleDetails(List<ScheduleDetail2> scheduleDetails) |

## Example (as JSON)

```json
{
  "articleIdentification": {
    "manufacturersArticleID": "manufacturersArticleID0",
    "eanuccArticleID": "eanuccArticleID2",
    "buyersArticleID": "buyersArticleID2"
  },
  "articleDescription": {
    "articleDescriptionText": "articleDescriptionText2"
  },
  "availability": "availability4",
  "requestedQuantity": {
    "quantityValue": "quantityValue8"
  },
  "error": {
    "errorCode": "errorCode0",
    "errorText": "errorText4"
  }
}
```

