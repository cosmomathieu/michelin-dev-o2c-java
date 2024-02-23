
# Tax Details 3

## Structure

`TaxDetails3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxCategoryCode` | `String` | Optional | - | String getTaxCategoryCode() | setTaxCategoryCode(String taxCategoryCode) |
| `TaxTypeCode` | `String` | Required | - | String getTaxTypeCode() | setTaxTypeCode(String taxTypeCode) |
| `TaxRate` | `String` | Required | - | String getTaxRate() | setTaxRate(String taxRate) |
| `VATExemptionClause` | `String` | Optional | - | String getVATExemptionClause() | setVATExemptionClause(String vATExemptionClause) |
| `GeneralDiscountClause` | `String` | Optional | - | String getGeneralDiscountClause() | setGeneralDiscountClause(String generalDiscountClause) |
| `TaxAmount` | [`TaxAmount`](../../doc/models/tax-amount.md) | Optional | - | TaxAmount getTaxAmount() | setTaxAmount(TaxAmount taxAmount) |
| `TaxableAmount` | [`TaxableAmount`](../../doc/models/taxable-amount.md) | Optional | - | TaxableAmount getTaxableAmount() | setTaxableAmount(TaxableAmount taxableAmount) |

## Example (as JSON)

```json
{
  "TaxCategoryCode": "TaxCategoryCode4",
  "TaxTypeCode": "TaxTypeCode8",
  "TaxRate": "TaxRate0",
  "VATExemptionClause": "VATExemptionClause4",
  "GeneralDiscountClause": "GeneralDiscountClause4",
  "TaxAmount": {
    "AmountValue": "AmountValue2"
  },
  "TaxableAmount": {
    "AmountValue": "AmountValue6"
  }
}
```

