
# Consignee 5

## Structure

`Consignee5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address12`](../../doc/models/address-12.md) | Optional | - | Address12 getAddress() | setAddress(Address12 address) |
| `InformationContact` | [`InformationContact`](../../doc/models/information-contact.md) | Optional | - | InformationContact getInformationContact() | setInformationContact(InformationContact informationContact) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID4",
  "AgencyCode": "AgencyCode6",
  "Name": [
    "Name3"
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

