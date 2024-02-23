
# Order Line

## Structure

`OrderLine`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `PortalReference` | `String` | Optional | - | String getPortalReference() | setPortalReference(String portalReference) |
| `AdditionalCustomerReferenceNumber` | [`AdditionalCustomerReferenceNumber`](../../doc/models/additional-customer-reference-number.md) | Optional | - | AdditionalCustomerReferenceNumber getAdditionalCustomerReferenceNumber() | setAdditionalCustomerReferenceNumber(AdditionalCustomerReferenceNumber additionalCustomerReferenceNumber) |
| `OrderedArticle` | [`OrderedArticle2`](../../doc/models/ordered-article-2.md) | Required | - | OrderedArticle2 getOrderedArticle() | setOrderedArticle(OrderedArticle2 orderedArticle) |

## Example (as JSON)

```json
{
  "LineID": "LineID2",
  "PortalReference": "PortalReference4",
  "AdditionalCustomerReferenceNumber": {
    "DocumentID": "DocumentID4"
  },
  "OrderedArticle": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "ManufacturersArticleID": "ManufacturersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    },
    "RequestedDeliveryDate": "RequestedDeliveryDate4",
    "RequestedDeliveryTime": "RequestedDeliveryTime8",
    "RequestedQuantity": {
      "QuantityValue": "QuantityValue0"
    }
  }
}
```

