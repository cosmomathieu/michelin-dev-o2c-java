
# Supplier Party 8

## Structure

`SupplierParty8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Optional | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Optional | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address19`](../../doc/models/address-19.md) | Optional | - | Address19 getAddress() | setAddress(Address19 address) |
| `InformationContact` | [`InformationContact12`](../../doc/models/information-contact-12.md) | Optional | - | InformationContact12 getInformationContact() | setInformationContact(InformationContact12 informationContact) |

## Example (as JSON)

```json
{
  "partyID": "partyID6",
  "agencyCode": "agencyCode2",
  "name": [
    "name2",
    "name3",
    "name4"
  ],
  "address": {
    "street": [
      "street1"
    ],
    "city": "city6",
    "postCode": "postCode0",
    "subCountry": "subCountry4",
    "countryCode": "countryCode8"
  },
  "informationContact": {
    "name": [
      "name2",
      "name3"
    ]
  }
}
```

