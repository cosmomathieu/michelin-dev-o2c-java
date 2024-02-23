
# Invoicee Party 1

## Structure

`InvoiceeParty1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `Address` | [`Address2`](../../doc/models/address-2.md) | Optional | - | Address2 getAddress() | setAddress(Address2 address) |
| `TaxRegistrationID` | `String` | Optional | - | String getTaxRegistrationID() | setTaxRegistrationID(String taxRegistrationID) |
| `VATRegistrationID` | `String` | Optional | - | String getVATRegistrationID() | setVATRegistrationID(String vATRegistrationID) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID6",
  "AgencyCode": "AgencyCode6",
  "Name": [
    "Name7",
    "Name8",
    "Name9"
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
  "TaxRegistrationID": "TaxRegistrationID4",
  "VATRegistrationID": "VATRegistrationID6"
}
```

