
# Order Line 3

## Structure

`OrderLine3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `OrderedArticle` | [`OrderedArticle6`](../../doc/models/ordered-article-6.md) | Required | - | OrderedArticle6 getOrderedArticle() | setOrderedArticle(OrderedArticle6 orderedArticle) |

## Example (as JSON)

```json
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
```

