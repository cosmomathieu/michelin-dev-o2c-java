
# Line Level 1

## Structure

`LineLevel1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineID` | `String` | Required | - | String getLineID() | setLineID(String lineID) |
| `OrderingMethod` | `String` | Optional | - | String getOrderingMethod() | setOrderingMethod(String orderingMethod) |
| `References` | [`References5`](../../doc/models/references-5.md) | Optional | - | References5 getReferences() | setReferences(References5 references) |
| `LineItemNetAmount` | [`LineItemNetAmount`](../../doc/models/line-item-net-amount.md) | Required | - | LineItemNetAmount getLineItemNetAmount() | setLineItemNetAmount(LineItemNetAmount lineItemNetAmount) |
| `Article` | [`Article`](../../doc/models/article.md) | Required | - | Article getArticle() | setArticle(Article article) |

## Example (as JSON)

```json
{
  "LineID": "LineID2",
  "LineItemNetAmount": {
    "AmountValue": "AmountValue4"
  },
  "Article": {
    "ArticleIdentification": {
      "BuyersArticleID": "BuyersArticleID4",
      "SuppliersArticleID": "SuppliersArticleID4",
      "EANUCCArticleID": "EANUCCArticleID0"
    },
    "ArticleDescription": [
      {
        "ArticleDescriptionText": "ArticleDescriptionText6"
      }
    ],
    "PriceDetails": {
      "GrossUnitPrice": {
        "PriceAmount": "PriceAmount6"
      },
      "NetUnitPrice": {
        "PriceAmount": "PriceAmount4"
      },
      "FixedPrice": {
        "PriceAmount": "PriceAmount8"
      }
    },
    "ArticleCharacteristics": {
      "NoisePerformance": "NoisePerformance2",
      "NoiseClassType": "NoiseClassType8",
      "RollingResistance": "RollingResistance2",
      "VehicleClass": "VehicleClass4",
      "WetGrip": "WetGrip4"
    },
    "InvoicedQuantity": {
      "QuantityValue": "QuantityValue4",
      "MeasureUnitCode": "MeasureUnitCode6"
    },
    "TaxDetails": {
      "TaxCategoryCode": "TaxCategoryCode6",
      "TaxTypeCode": "TaxTypeCode0",
      "TaxRate": "TaxRate2",
      "TaxAmount": {
        "AmountValue": "AmountValue2"
      }
    },
    "AllowanceOrCharge": [
      {
        "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
        "OtherChargeTypeCode": "OtherChargeTypeCode6",
        "AgencyCode": "AgencyCode6",
        "AllowanceOrChargeNumber": "AllowanceOrChargeNumber6",
        "AllowanceOrChargeName": "AllowanceOrChargeName0",
        "AllowanceOrChargeAmount": {
          "AmountValue": "AmountValue0"
        }
      },
      {
        "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
        "OtherChargeTypeCode": "OtherChargeTypeCode6",
        "AgencyCode": "AgencyCode6",
        "AllowanceOrChargeNumber": "AllowanceOrChargeNumber6",
        "AllowanceOrChargeName": "AllowanceOrChargeName0",
        "AllowanceOrChargeAmount": {
          "AmountValue": "AmountValue0"
        }
      },
      {
        "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
        "OtherChargeTypeCode": "OtherChargeTypeCode6",
        "AgencyCode": "AgencyCode6",
        "AllowanceOrChargeNumber": "AllowanceOrChargeNumber6",
        "AllowanceOrChargeName": "AllowanceOrChargeName0",
        "AllowanceOrChargeAmount": {
          "AmountValue": "AmountValue0"
        }
      }
    ],
    "LineItemTotalAmount": {
      "AmountValue": "AmountValue8"
    }
  },
  "OrderingMethod": "OrderingMethod2",
  "References": {
    "CustomerReference": {
      "DocumentID": "DocumentID6",
      "LineID": "LineID0"
    },
    "DeliveryNoteReference": {
      "DocumentID": "DocumentID2",
      "LineID": "LineID6",
      "IssueDate": "IssueDate4",
      "CompletionDate": "CompletionDate8"
    },
    "SuppliersOrderReference": {
      "DocumentID": "DocumentID8",
      "LineID": "LineID2",
      "IssueDate": "IssueDate0"
    },
    "AssociatedInvoiceReference": {
      "DocumentID": "DocumentID0",
      "LineID": "LineID4",
      "IssueDate": "IssueDate2"
    },
    "BlanketOrderReference": {
      "DocumentID": "DocumentID8",
      "LineID": "LineID2",
      "IssueDate": "IssueDate0"
    }
  }
}
```

