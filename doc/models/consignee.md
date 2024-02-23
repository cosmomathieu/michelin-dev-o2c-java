
# Consignee

## Structure

`Consignee`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address`](../../doc/models/address.md) | Optional | - | Address getAddress() | setAddress(Address address) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID8",
  "AgencyCode": "AgencyCode2",
  "Name": [
    "Name7"
  ],
  "Address": {
    "Street": "Street6",
    "City": "City6",
    "District": "District8",
    "PostCode": "PostCode2",
    "SubCountry": "SubCountry8",
    "CountryCode": "CountryCode8"
  }
}
```

