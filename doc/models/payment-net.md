
# Payment Net

## Structure

`PaymentNet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentDueDate` | `String` | Optional | - | String getPaymentDueDate() | setPaymentDueDate(String paymentDueDate) |
| `InstalmentAmount` | [`InstalmentAmount`](../../doc/models/instalment-amount.md) | Optional | - | InstalmentAmount getInstalmentAmount() | setInstalmentAmount(InstalmentAmount instalmentAmount) |

## Example (as JSON)

```json
{
  "PaymentDueDate": "PaymentDueDate6",
  "InstalmentAmount": {
    "AmountValue": "AmountValue6",
    "CurrencyCode": "CurrencyCode8"
  }
}
```

