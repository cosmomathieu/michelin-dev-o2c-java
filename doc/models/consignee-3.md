
# Consignee 3

## Structure

`Consignee3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address5`](../../doc/models/address-5.md) | Optional | - | Address5 getAddress() | setAddress(Address5 address) |
| `InformationContact` | [`InformationContact`](../../doc/models/information-contact.md) | Optional | - | InformationContact getInformationContact() | setInformationContact(InformationContact informationContact) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID6",
  "AgencyCode": "AgencyCode4",
  "Name": [
    "Name5",
    "Name6"
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
  },
  "InformationContact": {
    "ContactID": "ContactID4",
    "Name": [
      "Name1"
    ],
    "TelephoneNumber": "TelephoneNumber6",
    "TelephoneExtension": "TelephoneExtension8",
    "FaxNumber": "FaxNumber6"
  }
}
```

