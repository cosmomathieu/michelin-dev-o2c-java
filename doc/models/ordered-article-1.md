
# Ordered Article 1

## Structure

`OrderedArticle1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification`](../../doc/models/article-identification.md) | Required | - | ArticleIdentification getArticleIdentification() | setArticleIdentification(ArticleIdentification articleIdentification) |
| `ArticleDescription` | [`ArticleDescription`](../../doc/models/article-description.md) | Required | - | ArticleDescription getArticleDescription() | setArticleDescription(ArticleDescription articleDescription) |
| `DespatchedQuantity` | [`DespatchedQuantity`](../../doc/models/despatched-quantity.md) | Required | - | DespatchedQuantity getDespatchedQuantity() | setDespatchedQuantity(DespatchedQuantity despatchedQuantity) |
| `DeliveryOption` | `List<String>` | Optional | - | List<String> getDeliveryOption() | setDeliveryOption(List<String> deliveryOption) |
| `TracingInformation` | [`List<TracingInformation>`](../../doc/models/tracing-information.md) | Optional | - | List<TracingInformation> getTracingInformation() | setTracingInformation(List<TracingInformation> tracingInformation) |

## Example (as JSON)

```json
{
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
    "DeliveryOption3",
    "DeliveryOption4"
  ],
  "TracingInformation": [
    {
      "TracingID": "TracingID6",
      "SerialNumber": "SerialNumber8",
      "TracingURI": "TracingURI8"
    }
  ]
}
```

