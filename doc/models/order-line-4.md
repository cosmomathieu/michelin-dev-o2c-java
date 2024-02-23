
# Order Line 4

## Structure

`OrderLine4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Optional | - | String getLineID() | setLineID(String lineID) |
| `OrderedArticle` | [`OrderedArticle7`](../../doc/models/ordered-article-7.md) | Optional | - | OrderedArticle7 getOrderedArticle() | setOrderedArticle(OrderedArticle7 orderedArticle) |

## Example (as JSON)

```json
{
  "lineID": "lineID6",
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
```

