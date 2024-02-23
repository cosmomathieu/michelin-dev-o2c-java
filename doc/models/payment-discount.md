
# Payment Discount

## Structure

`PaymentDiscount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DiscountPercent` | `int` | Required | - | int getDiscountPercent() | setDiscountPercent(int discountPercent) |
| `PaymentDueDate` | `String` | Required | - | String getPaymentDueDate() | setPaymentDueDate(String paymentDueDate) |
| `FinancialDiscount` | [`FinancialDiscount`](../../doc/models/financial-discount.md) | Optional | - | FinancialDiscount getFinancialDiscount() | setFinancialDiscount(FinancialDiscount financialDiscount) |
| `DiscountAmount` | [`DiscountAmount`](../../doc/models/discount-amount.md) | Required | - | DiscountAmount getDiscountAmount() | setDiscountAmount(DiscountAmount discountAmount) |

## Example (as JSON)

```json
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
```

