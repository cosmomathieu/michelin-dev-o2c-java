
# Scheduled Article Despatch Details

## Structure

`ScheduledArticleDespatchDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DespatchDate` | `String` | Required | - | String getDespatchDate() | setDespatchDate(String despatchDate) |
| `DespatchAdviceReference` | [`DespatchAdviceReference`](../../doc/models/despatch-advice-reference.md) | Required | - | DespatchAdviceReference getDespatchAdviceReference() | setDespatchAdviceReference(DespatchAdviceReference despatchAdviceReference) |
| `DespatchedQuantity` | [`DespatchedQuantity1`](../../doc/models/despatched-quantity-1.md) | Required | - | DespatchedQuantity1 getDespatchedQuantity() | setDespatchedQuantity(DespatchedQuantity1 despatchedQuantity) |

## Example (as JSON)

```json
{
  "DespatchDate": "DespatchDate6",
  "DespatchAdviceReference": {
    "DocumentID": "DocumentID6",
    "LineID": "LineID0"
  },
  "DespatchedQuantity": {
    "QuantityValue": "QuantityValue0"
  }
}
```

