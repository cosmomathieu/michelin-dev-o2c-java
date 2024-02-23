
# Referenced Order

## Structure

`ReferencedOrder`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SupplierOrderNumber` | [`SupplierOrderNumber`](../../doc/models/supplier-order-number.md) | Optional | - | SupplierOrderNumber getSupplierOrderNumber() | setSupplierOrderNumber(SupplierOrderNumber supplierOrderNumber) |
| `OrderReference` | [`OrderReference1`](../../doc/models/order-reference-1.md) | Optional | - | OrderReference1 getOrderReference() | setOrderReference(OrderReference1 orderReference) |
| `Contract` | [`Contract2`](../../doc/models/contract-2.md) | Optional | - | Contract2 getContract() | setContract(Contract2 contract) |
| `OrderedArticle` | [`OrderedArticle`](../../doc/models/ordered-article.md) | Optional | - | OrderedArticle getOrderedArticle() | setOrderedArticle(OrderedArticle orderedArticle) |

## Example (as JSON)

```json
{
  "SupplierOrderNumber": {
    "documentID": "documentID4"
  },
  "OrderReference": {
    "documentID": "documentID8"
  },
  "Contract": {
    "documentID": "documentID6"
  },
  "OrderedArticle": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "ManufacturersArticleID": "ManufacturersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    }
  }
}
```

