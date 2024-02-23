
# Ordered Article 6

## Structure

`OrderedArticle6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestedQuantity` | [`RequestedQuantity1`](../../doc/models/requested-quantity-1.md) | Required | - | RequestedQuantity1 getRequestedQuantity() | setRequestedQuantity(RequestedQuantity1 requestedQuantity) |
| `RequestedDeliveryTime` | `String` | Optional | - | String getRequestedDeliveryTime() | setRequestedDeliveryTime(String requestedDeliveryTime) |
| `RequestedDeliveryDate` | `String` | Required | - | String getRequestedDeliveryDate() | setRequestedDeliveryDate(String requestedDeliveryDate) |
| `ArticleIdentification` | [`ArticleIdentification7`](../../doc/models/article-identification-7.md) | Optional | - | ArticleIdentification7 getArticleIdentification() | setArticleIdentification(ArticleIdentification7 articleIdentification) |

## Example (as JSON)

```json
{
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
```

