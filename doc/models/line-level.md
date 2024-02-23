
# Line Level

## Structure

`LineLevel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `OrderingMethod` | `String` | Optional | - | String getOrderingMethod() | setOrderingMethod(String orderingMethod) |
| `References` | [`List<References2>`](../../doc/models/references-2.md) | Optional | - | List<References2> getReferences() | setReferences(List<References2> references) |
| `OrderedArticle` | [`OrderedArticle1`](../../doc/models/ordered-article-1.md) | Required | - | OrderedArticle1 getOrderedArticle() | setOrderedArticle(OrderedArticle1 orderedArticle) |

## Example (as JSON)

```json
{
  "LineID": "LineID6",
  "OrderingMethod": "OrderingMethod6",
  "References": [
    {
      "ReferenceTypeCode": "ReferenceTypeCode2",
      "DocumentID": "DocumentID6",
      "LineID": "LineID0",
      "IssueDate": "IssueDate8"
    }
  ],
  "OrderedArticle": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "ManufacturersArticleID": "ManufacturersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    },
    "ArticleDescription": {
      "ArticleDescriptionText": [
        "ArticleDescriptionText3"
      ]
    },
    "DespatchedQuantity": {
      "QuantityValue": "QuantityValue0",
      "MeasureUnitCode": "MeasureUnitCode8"
    },
    "DeliveryOption": [
      "DeliveryOption1",
      "DeliveryOption2",
      "DeliveryOption3"
    ],
    "TracingInformation": [
      {
        "TracingID": "TracingID6",
        "SerialNumber": "SerialNumber8",
        "TracingURI": "TracingURI8"
      },
      {
        "TracingID": "TracingID6",
        "SerialNumber": "SerialNumber8",
        "TracingURI": "TracingURI8"
      }
    ]
  }
}
```

