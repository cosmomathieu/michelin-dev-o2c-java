
# Summary

## Structure

`Summary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowanceOrCharge` | [`List<AllowanceOrCharge1>`](../../doc/models/allowance-or-charge-1.md) | Optional | - | List<AllowanceOrCharge1> getAllowanceOrCharge() | setAllowanceOrCharge(List<AllowanceOrCharge1> allowanceOrCharge) |
| `TotalAmount` | [`TotalAmount`](../../doc/models/total-amount.md) | Required | - | TotalAmount getTotalAmount() | setTotalAmount(TotalAmount totalAmount) |
| `TaxableAmount` | [`TaxableAmount`](../../doc/models/taxable-amount.md) | Optional | - | TaxableAmount getTaxableAmount() | setTaxableAmount(TaxableAmount taxableAmount) |
| `TaxAmount` | [`TaxAmount`](../../doc/models/tax-amount.md) | Optional | - | TaxAmount getTaxAmount() | setTaxAmount(TaxAmount taxAmount) |
| `TotalLineItemsAmount` | [`TotalLineItemsAmount`](../../doc/models/total-line-items-amount.md) | Required | - | TotalLineItemsAmount getTotalLineItemsAmount() | setTotalLineItemsAmount(TotalLineItemsAmount totalLineItemsAmount) |
| `TotalChargeAmount` | [`TotalChargeAmount`](../../doc/models/total-charge-amount.md) | Optional | - | TotalChargeAmount getTotalChargeAmount() | setTotalChargeAmount(TotalChargeAmount totalChargeAmount) |
| `TaxDetails` | [`List<TaxDetails3>`](../../doc/models/tax-details-3.md) | Optional | - | List<TaxDetails3> getTaxDetails() | setTaxDetails(List<TaxDetails3> taxDetails) |

## Example (as JSON)

```json
{
  "AllowanceOrCharge": [
    {
      "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
      "OtherChargeTypeCode": "OtherChargeTypeCode6",
      "AgencyCode": "AgencyCode6",
      "AllowanceOrChargeAmount": {
        "AmountValue": "AmountValue0"
      },
      "TaxDetails": {
        "TaxCategoryCode": "TaxCategoryCode6",
        "TaxTypeCode": "TaxTypeCode0",
        "TaxRate": "TaxRate2"
      }
    },
    {
      "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
      "OtherChargeTypeCode": "OtherChargeTypeCode6",
      "AgencyCode": "AgencyCode6",
      "AllowanceOrChargeAmount": {
        "AmountValue": "AmountValue0"
      },
      "TaxDetails": {
        "TaxCategoryCode": "TaxCategoryCode6",
        "TaxTypeCode": "TaxTypeCode0",
        "TaxRate": "TaxRate2"
      }
    }
  ],
  "TotalAmount": {
    "AmountValue": "AmountValue2"
  },
  "TaxableAmount": {
    "AmountValue": "AmountValue6"
  },
  "TaxAmount": {
    "AmountValue": "AmountValue2"
  },
  "TotalLineItemsAmount": {
    "AmountValue": "AmountValue8"
  },
  "TotalChargeAmount": {
    "AmountValue": "AmountValue0"
  },
  "TaxDetails": [
    {
      "TaxCategoryCode": "TaxCategoryCode6",
      "TaxTypeCode": "TaxTypeCode0",
      "TaxRate": "TaxRate2",
      "VATExemptionClause": "VATExemptionClause6",
      "GeneralDiscountClause": "GeneralDiscountClause6",
      "TaxAmount": {
        "AmountValue": "AmountValue2"
      },
      "TaxableAmount": {
        "AmountValue": "AmountValue6"
      }
    },
    {
      "TaxCategoryCode": "TaxCategoryCode6",
      "TaxTypeCode": "TaxTypeCode0",
      "TaxRate": "TaxRate2",
      "VATExemptionClause": "VATExemptionClause6",
      "GeneralDiscountClause": "GeneralDiscountClause6",
      "TaxAmount": {
        "AmountValue": "AmountValue2"
      },
      "TaxableAmount": {
        "AmountValue": "AmountValue6"
      }
    },
    {
      "TaxCategoryCode": "TaxCategoryCode6",
      "TaxTypeCode": "TaxTypeCode0",
      "TaxRate": "TaxRate2",
      "VATExemptionClause": "VATExemptionClause6",
      "GeneralDiscountClause": "GeneralDiscountClause6",
      "TaxAmount": {
        "AmountValue": "AmountValue2"
      },
      "TaxableAmount": {
        "AmountValue": "AmountValue6"
      }
    }
  ]
}
```

