
# Consignee 1

## Structure

`Consignee1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address1`](../../doc/models/address-1.md) | Optional | - | Address1 getAddress() | setAddress(Address1 address) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID6",
  "AgencyCode": "AgencyCode4",
  "Name": [
    "Name5",
    "Name6",
    "Name7"
  ],
  "Address": {
    "Street": [
      "Street0"
    ],
    "City": "City6",
    "District": "District8",
    "PostCode": "PostCode2",
    "PostBoxCode": "PostBoxCode0",
    "SubCountry": "SubCountry8",
    "CountryCode": "CountryCode8"
  }
}
```

