
# Payment Terms 2

## Structure

`PaymentTerms2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentNet` | [`List<PaymentNet>`](../../doc/models/payment-net.md) | Required | - | List<PaymentNet> getPaymentNet() | setPaymentNet(List<PaymentNet> paymentNet) |
| `PaymentDiscount` | [`List<PaymentDiscount>`](../../doc/models/payment-discount.md) | Optional | - | List<PaymentDiscount> getPaymentDiscount() | setPaymentDiscount(List<PaymentDiscount> paymentDiscount) |

## Example (as JSON)

```json
{
  "PaymentNet": [
    {
      "PaymentDueDate": "PaymentDueDate6",
      "InstalmentAmount": {
        "AmountValue": "AmountValue6",
        "CurrencyCode": "CurrencyCode8"
      }
    }
  ],
  "PaymentDiscount": [
    {
      "DiscountPercent": 82,
      "PaymentDueDate": "PaymentDueDate0",
      "FinancialDiscount": {
        "TextLine": "TextLine8"
      },
      "DiscountAmount": {
        "AmountValue": "AmountValue6"
      }
    }
  ]
}
```

