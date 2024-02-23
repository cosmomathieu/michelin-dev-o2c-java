
# Supplier Party 1

## Structure

`SupplierParty1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `SalesContact` | [`SalesContact`](../../doc/models/sales-contact.md) | Optional | - | SalesContact getSalesContact() | setSalesContact(SalesContact salesContact) |
| `ShippingLocation` | [`ShippingLocation`](../../doc/models/shipping-location.md) | Optional | - | ShippingLocation getShippingLocation() | setShippingLocation(ShippingLocation shippingLocation) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID8",
  "AgencyCode": "AgencyCode2",
  "SalesContact": {
    "Name": "Name8"
  },
  "ShippingLocation": {
    "LocationName": "LocationName2"
  }
}
```

