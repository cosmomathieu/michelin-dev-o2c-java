
# Seller Party 7

## Structure

`SellerParty7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyID` | `String` | Required | - | String getPartyID() | setPartyID(String partyID) |
| `AgencyCode` | `String` | Required | - | String getAgencyCode() | setAgencyCode(String agencyCode) |
| `Name` | `List<String>` | Optional | - | List<String> getName() | setName(List<String> name) |
| `LegalName` | `String` | Optional | - | String getLegalName() | setLegalName(String legalName) |
| `Address` | [`Address2`](../../doc/models/address-2.md) | Optional | - | Address2 getAddress() | setAddress(Address2 address) |
| `InformationContact` | [`InformationContact11`](../../doc/models/information-contact-11.md) | Optional | - | InformationContact11 getInformationContact() | setInformationContact(InformationContact11 informationContact) |
| `SupplierParty` | [`SupplierParty7`](../../doc/models/supplier-party-7.md) | Optional | - | SupplierParty7 getSupplierParty() | setSupplierParty(SupplierParty7 supplierParty) |
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
    "Name": "Name6",
    "TelephoneNumber": "TelephoneNumber6",
    "TelephoneExtension": "TelephoneExtension8",
    "FaxNumber": "FaxNumber6"
  },
  "SupplierParty": {
    "PartyID": "PartyID2",
    "AgencyCode": "AgencyCode8",
    "ShippingLocation": {
      "LocationName": "LocationName2"
    },
    "TelephoneExtension": "TelephoneExtension4"
  }
}
```

