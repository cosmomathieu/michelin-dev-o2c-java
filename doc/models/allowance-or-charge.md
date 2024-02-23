
# Allowance or Charge

## Structure

`AllowanceOrCharge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllowanceOrChargeTypeCode` | `String` | Optional | - | String getAllowanceOrChargeTypeCode() | setAllowanceOrChargeTypeCode(String allowanceOrChargeTypeCode) |
| `OtherChargeTypeCode` | `String` | Optional | - | String getOtherChargeTypeCode() | setOtherChargeTypeCode(String otherChargeTypeCode) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `AllowanceOrChargeNumber` | `String` | Optional | - | String getAllowanceOrChargeNumber() | setAllowanceOrChargeNumber(String allowanceOrChargeNumber) |
| `AllowanceOrChargeName` | `String` | Optional | - | String getAllowanceOrChargeName() | setAllowanceOrChargeName(String allowanceOrChargeName) |
| `AllowanceOrChargePercent` | `String` | Optional | - | String getAllowanceOrChargePercent() | setAllowanceOrChargePercent(String allowanceOrChargePercent) |
| `AllowanceOrChargeAmount` | [`AllowanceOrChargeAmount`](../../doc/models/allowance-or-charge-amount.md) | Required | - | AllowanceOrChargeAmount getAllowanceOrChargeAmount() | setAllowanceOrChargeAmount(AllowanceOrChargeAmount allowanceOrChargeAmount) |
| `TaxDetails` | [`List<TaxDetails1>`](../../doc/models/tax-details-1.md) | Optional | - | List<TaxDetails1> getTaxDetails() | setTaxDetails(List<TaxDetails1> taxDetails) |

## Example (as JSON)

```json
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
```

