
# Schedule Detail

## Structure

`ScheduleDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeliveryDate` | `String` | Required | - | String getDeliveryDate() | setDeliveryDate(String deliveryDate) |
| `DeliveryTime` | `String` | Optional | - | String getDeliveryTime() | setDeliveryTime(String deliveryTime) |
| `ConfirmedQuantity` | [`ConfirmedQuantity`](../../doc/models/confirmed-quantity.md) | Required | - | ConfirmedQuantity getConfirmedQuantity() | setConfirmedQuantity(ConfirmedQuantity confirmedQuantity) |
| `TransportMode` | `String` | Optional | - | String getTransportMode() | setTransportMode(String transportMode) |
| `PriceDetails` | [`PriceDetails`](../../doc/models/price-details.md) | Optional | - | PriceDetails getPriceDetails() | setPriceDetails(PriceDetails priceDetails) |
| `Charge` | [`List<Charge>`](../../doc/models/charge.md) | Optional | - | List<Charge> getCharge() | setCharge(List<Charge> charge) |

## Example (as JSON)

```json
{
  "DeliveryDate": "DeliveryDate0",
  "DeliveryTime": "DeliveryTime8",
  "ConfirmedQuantity": {
    "QuantityValue": "QuantityValue8"
  },
  "TransportMode": "TransportMode8",
  "PriceDetails": {
    "NetUnitPrice": {
      "PriceAmount": "PriceAmount4"
    }
  },
  "Charge": [
    {
      "ChargeCategory": "ChargeCategory4",
      "ChargeAmount": {
        "AmountValue": "AmountValue2"
      },
      "ChargePercent": "ChargePercent0"
    },
    {
      "ChargeCategory": "ChargeCategory4",
      "ChargeAmount": {
        "AmountValue": "AmountValue2"
      },
      "ChargePercent": "ChargePercent0"
    }
  ]
}
```

