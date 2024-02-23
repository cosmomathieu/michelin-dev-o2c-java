
# Article

## Structure

`Article`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ArticleIdentification` | [`ArticleIdentification6`](../../doc/models/article-identification-6.md) | Required | - | ArticleIdentification6 getArticleIdentification() | setArticleIdentification(ArticleIdentification6 articleIdentification) |
| `ArticleDescription` | [`List<ArticleDescription1>`](../../doc/models/article-description-1.md) | Required | - | List<ArticleDescription1> getArticleDescription() | setArticleDescription(List<ArticleDescription1> articleDescription) |
| `ArticleCharacteristics` | [`ArticleCharacteristics`](../../doc/models/article-characteristics.md) | Optional | - | ArticleCharacteristics getArticleCharacteristics() | setArticleCharacteristics(ArticleCharacteristics articleCharacteristics) |
| `InvoicedQuantity` | [`InvoicedQuantity`](../../doc/models/invoiced-quantity.md) | Optional | - | InvoicedQuantity getInvoicedQuantity() | setInvoicedQuantity(InvoicedQuantity invoicedQuantity) |
| `PriceDetails` | [`PriceDetails1`](../../doc/models/price-details-1.md) | Required | - | PriceDetails1 getPriceDetails() | setPriceDetails(PriceDetails1 priceDetails) |
| `TaxDetails` | [`TaxDetails`](../../doc/models/tax-details.md) | Optional | - | TaxDetails getTaxDetails() | setTaxDetails(TaxDetails taxDetails) |
| `AllowanceOrCharge` | [`List<AllowanceOrCharge>`](../../doc/models/allowance-or-charge.md) | Optional | - | List<AllowanceOrCharge> getAllowanceOrCharge() | setAllowanceOrCharge(List<AllowanceOrCharge> allowanceOrCharge) |
| `LineItemTotalAmount` | [`LineItemTotalAmount`](../../doc/models/line-item-total-amount.md) | Optional | - | LineItemTotalAmount getLineItemTotalAmount() | setLineItemTotalAmount(LineItemTotalAmount lineItemTotalAmount) |
| `Consignee` | [`Consignee7`](../../doc/models/consignee-7.md) | Optional | - | Consignee7 getConsignee() | setConsignee(Consignee7 consignee) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `TracingInformation` | [`List<TracingInformation1>`](../../doc/models/tracing-information-1.md) | Optional | - | List<TracingInformation1> getTracingInformation() | setTracingInformation(List<TracingInformation1> tracingInformation) |
| `LineNote` | [`LineNote`](../../doc/models/line-note.md) | Optional | - | LineNote getLineNote() | setLineNote(LineNote lineNote) |
| `CountryOfOrigin` | `String` | Optional | - | String getCountryOfOrigin() | setCountryOfOrigin(String countryOfOrigin) |

## Example (as JSON)

```json
{
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
}
```

