
# Buyer Party 7

## Structure

`BuyerParty7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address2`](../../doc/models/address-2.md) | Required | - | Address2 getAddress() | setAddress(Address2 address) |
| `TaxRegistrationID` | `String` | Optional | - | String getTaxRegistrationID() | setTaxRegistrationID(String taxRegistrationID) |
| `VATRegistrationID` | `String` | Optional | - | String getVATRegistrationID() | setVATRegistrationID(String vATRegistrationID) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID4",
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
  "TaxRegistrationID": "TaxRegistrationID2",
  "VATRegistrationID": "VATRegistrationID4"
}
```

