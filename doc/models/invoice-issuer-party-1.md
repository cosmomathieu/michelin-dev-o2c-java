
# Invoice Issuer Party 1

## Structure

`InvoiceIssuerParty1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `LegalName` | `String` | Optional | - | String getLegalName() | setLegalName(String legalName) |
| `Address` | [`Address14`](../../doc/models/address-14.md) | Optional | - | Address14 getAddress() | setAddress(Address14 address) |
| `TaxRegistrationID` | `String` | Optional | - | String getTaxRegistrationID() | setTaxRegistrationID(String taxRegistrationID) |
| `VATRegistrationID` | `String` | Optional | - | String getVATRegistrationID() | setVATRegistrationID(String vATRegistrationID) |
| `SIRENNumber` | `String` | Optional | - | String getSIRENNumber() | setSIRENNumber(String sIRENNumber) |
| `TribunalRegistrationNumber` | `String` | Optional | - | String getTribunalRegistrationNumber() | setTribunalRegistrationNumber(String tribunalRegistrationNumber) |
| `CompanyLegalForm` | `String` | Optional | - | String getCompanyLegalForm() | setCompanyLegalForm(String companyLegalForm) |
| `CompanyRegisteredCapital` | `String` | Optional | - | String getCompanyRegisteredCapital() | setCompanyRegisteredCapital(String companyRegisteredCapital) |

## Example (as JSON)

```json
{
  "PartyID": "PartyID2",
  "AgencyCode": "AgencyCode8",
  "Name": [
    "Name9",
    "Name0"
  ],
  "LegalName": "LegalName8",
  "Address": {
    "Street": "Street6",
    "City": [
      "City5",
      "City6"
    ],
    "District": "District8",
    "PostCode": "PostCode2",
    "PostBoxCode": "PostBoxCode0",
    "CountryCode": "CountryCode8"
  },
  "TaxRegistrationID": "TaxRegistrationID6",
  "VATRegistrationID": "VATRegistrationID2"
}
```

