
# Buyer Party 2

## Structure

`BuyerParty2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address2`](../../doc/models/address-2.md) | Optional | - | Address2 getAddress() | setAddress(Address2 address) |
| `InformationContact` | [`InformationContact`](../../doc/models/information-contact.md) | Optional | - | InformationContact getInformationContact() | setInformationContact(InformationContact informationContact) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID2",
  "AgencyCode": "AgencyCode2",
  "Name": [
    "Name3",
    "Name4",
    "Name5"
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

