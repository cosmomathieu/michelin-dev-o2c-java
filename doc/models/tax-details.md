
# Tax Details

## Structure

`TaxDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxCategoryCode` | `String` | Optional | - | String getTaxCategoryCode() | setTaxCategoryCode(String taxCategoryCode) |
| `TaxTypeCode` | `String` | Optional | - | String getTaxTypeCode() | setTaxTypeCode(String taxTypeCode) |
| `TaxRate` | `String` | Required | - | String getTaxRate() | setTaxRate(String taxRate) |
| `TaxAmount` | [`TaxAmount`](../../doc/models/tax-amount.md) | Optional | - | TaxAmount getTaxAmount() | setTaxAmount(TaxAmount taxAmount) |

## Example (as JSON)

```json
{
  "TaxCategoryCode": "TaxCategoryCode6",
  "TaxTypeCode": "TaxTypeCode0",
  "TaxRate": "TaxRate2",
  "TaxAmount": {
    "AmountValue": "AmountValue2"
  }
}
```

