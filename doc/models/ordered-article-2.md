
# Ordered Article 2

## Structure

`OrderedArticle2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification`](../../doc/models/article-identification.md) | Required | - | ArticleIdentification getArticleIdentification() | setArticleIdentification(ArticleIdentification articleIdentification) |
| `RequestedDeliveryDate` | `String` | Optional | - | String getRequestedDeliveryDate() | setRequestedDeliveryDate(String requestedDeliveryDate) |
| `RequestedDeliveryTime` | `String` | Optional | - | String getRequestedDeliveryTime() | setRequestedDeliveryTime(String requestedDeliveryTime) |
| `RequestedQuantity` | [`RequestedQuantity`](../../doc/models/requested-quantity.md) | Required | - | RequestedQuantity getRequestedQuantity() | setRequestedQuantity(RequestedQuantity requestedQuantity) |

## Example (as JSON)

```json
{
  "ArticleIdentification": {
    "BuyersArticleID": "BuyersArticleID4",
    "ManufacturersArticleID": "ManufacturersArticleID4",
    "EANUCCArticleID": "EANUCCArticleID0"
  },
  "RequestedDeliveryDate": "RequestedDeliveryDate2",
  "RequestedDeliveryTime": "RequestedDeliveryTime8",
  "RequestedQuantity": {
    "QuantityValue": "QuantityValue0"
  }
}
```

