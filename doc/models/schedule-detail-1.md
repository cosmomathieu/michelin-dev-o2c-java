
# Schedule Detail 1

## Structure

`ScheduleDetail1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeliveryDate` | `String` | Optional | - | String getDeliveryDate() | setDeliveryDate(String deliveryDate) |
| `DeliveryTime` | `String` | Optional | - | String getDeliveryTime() | setDeliveryTime(String deliveryTime) |
| `ConfirmedQuantity` | [`ConfirmedQuantity`](../../doc/models/confirmed-quantity.md) | Optional | - | ConfirmedQuantity getConfirmedQuantity() | setConfirmedQuantity(ConfirmedQuantity confirmedQuantity) |
| `CancelledQuantity` | [`CancelledQuantity`](../../doc/models/cancelled-quantity.md) | Optional | - | CancelledQuantity getCancelledQuantity() | setCancelledQuantity(CancelledQuantity cancelledQuantity) |
| `OpenQuantity` | [`OpenQuantity`](../../doc/models/open-quantity.md) | Optional | - | OpenQuantity getOpenQuantity() | setOpenQuantity(OpenQuantity openQuantity) |
| `ScheduledArticleDespatchDetails` | [`ScheduledArticleDespatchDetails`](../../doc/models/scheduled-article-despatch-details.md) | Optional | - | ScheduledArticleDespatchDetails getScheduledArticleDespatchDetails() | setScheduledArticleDespatchDetails(ScheduledArticleDespatchDetails scheduledArticleDespatchDetails) |

## Example (as JSON)

```json
{
  "DeliveryDate": "DeliveryDate2",
  "DeliveryTime": "DeliveryTime0",
  "ConfirmedQuantity": {
    "QuantityValue": "QuantityValue8"
  },
  "CancelledQuantity": {
    "QuantityValue": "QuantityValue0"
  },
  "OpenQuantity": {
    "QuantityValue": "QuantityValue8"
  }
}
```

