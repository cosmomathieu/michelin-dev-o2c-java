
# Supplier Party 7

## Structure

`SupplierParty7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `ShippingLocation` | [`ShippingLocation1`](../../doc/models/shipping-location-1.md) | Optional | - | ShippingLocation1 getShippingLocation() | setShippingLocation(ShippingLocation1 shippingLocation) |
| `TelephoneExtension` | `String` | Optional | - | String getTelephoneExtension() | setTelephoneExtension(String telephoneExtension) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID6",
  "AgencyCode": "AgencyCode4",
  "ShippingLocation": {
    "LocationName": "LocationName2"
  },
  "TelephoneExtension": "TelephoneExtension2"
}
```

