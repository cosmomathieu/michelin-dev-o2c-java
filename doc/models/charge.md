
# Charge

## Structure

`Charge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargeCategory` | `String` | Required | - | String getChargeCategory() | setChargeCategory(String chargeCategory) |
| `ChargeAmount` | [`ChargeAmount`](../../doc/models/charge-amount.md) | Optional | - | ChargeAmount getChargeAmount() | setChargeAmount(ChargeAmount chargeAmount) |
| `ChargePercent` | `String` | Optional | - | String getChargePercent() | setChargePercent(String chargePercent) |

## Example (as JSON)

```json
{
  "ChargeCategory": "ChargeCategory4",
  "ChargeAmount": {
    "AmountValue": "AmountValue2"
  },
  "ChargePercent": "ChargePercent0"
}
```

