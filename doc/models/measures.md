
# Measures

## Structure

`Measures`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrossWeight` | [`GrossWeight`](../../doc/models/gross-weight.md) | Required | - | GrossWeight getGrossWeight() | setGrossWeight(GrossWeight grossWeight) |
| `NetWeight` | [`NetWeight`](../../doc/models/net-weight.md) | Optional | - | NetWeight getNetWeight() | setNetWeight(NetWeight netWeight) |
| `Volume` | [`Volume`](../../doc/models/volume.md) | Optional | - | Volume getVolume() | setVolume(Volume volume) |

## Example (as JSON)

```json
{
  "GrossWeight": {
    "Measure": "Measure6",
    "MeasureUnitCode": "MeasureUnitCode4"
  },
  "NetWeight": {
    "Measure": "Measure0",
    "MeasureUnitCode": "MeasureUnitCode2"
  },
  "Volume": {
    "Measure": "Measure8",
    "MeasureUnitCode": "MeasureUnitCode0"
  }
}
```

