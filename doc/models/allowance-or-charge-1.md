
# Allowance or Charge 1

## Structure

`AllowanceOrCharge1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowanceOrChargeTypeCode` | `String` | Optional | - | String getAllowanceOrChargeTypeCode() | setAllowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) |
| `OtherChargeTypeCode` | `String` | Optional | - | String getOtherChargeTypeCode() | setOtherChargeTypeCode(String otherChargeTypeCode) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `AllowanceOrChargeAmount` | [`AllowanceOrChargeAmount`](../../doc/models/allowance-or-charge-amount.md) | Optional | - | AllowanceOrChargeAmount getAllowanceOrChargeAmount() | setAllowanceOrChargeAmount(AllowanceOrChargeAmount allowanceOrChargeAmount) |
| `TaxDetails` | [`TaxDetails1`](../../doc/models/tax-details-1.md) | Optional | - | TaxDetails1 getTaxDetails() | setTaxDetails(TaxDetails1 taxDetails) |

## Example (as JSON)

```json
{
  "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode8",
  "OtherChargeTypeCode": "OtherChargeTypeCode8",
  "AgencyCode": "AgencyCode8",
  "AllowanceOrChargeAmount": {
    "AmountValue": "AmountValue0"
  },
  "TaxDetails": {
    "TaxCategoryCode": "TaxCategoryCode6",
    "TaxTypeCode": "TaxTypeCode0",
    "TaxRate": "TaxRate2"
  }
}
```

