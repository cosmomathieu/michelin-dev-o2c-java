
# Consignee 7

## Structure

`Consignee7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address2`](../../doc/models/address-2.md) | Optional | - | Address2 getAddress() | setAddress(Address2 address) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID4",
  "AgencyCode": "AgencyCode6",
  "Name": [
    "Name7",
    "Name8"
  ],
  "Address": {
    "Street": [
      "Street0"
    ],
    "City": "City6",
    "District": "District8",
    "PostCode": "PostCode2",
    "PostBoxCode": "PostBoxCode0",
    "CountryCode": "CountryCode8"
  }
}
```

