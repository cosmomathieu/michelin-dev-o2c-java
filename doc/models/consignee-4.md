
# Consignee 4

## Structure

`Consignee4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address10`](../../doc/models/address-10.md) | Optional | - | Address10 getAddress() | setAddress(Address10 address) |
| `InformationContact` | [`InformationContact`](../../doc/models/information-contact.md) | Optional | - | InformationContact getInformationContact() | setInformationContact(InformationContact informationContact) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID2",
  "AgencyCode": "AgencyCode2",
  "Name": [
    "Name3",
    "Name4"
  ],
  "Address": {
    "Street": "Street6",
    "City": "City6",
    "District": "District8",
    "PostCode": "PostCode2",
    "PostBoxCode": "PostBoxCode0",
    "SubCountry": "SubCountry8",
    "CountryCode": "CountryCode8",
    "Geolocation": {
      "Latitude": "Latitude8",
      "Longitude": "Longitude6"
    }
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

