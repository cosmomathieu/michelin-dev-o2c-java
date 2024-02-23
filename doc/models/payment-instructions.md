
# Payment Instructions

## Structure

`PaymentInstructions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyFunctionCodeQualifier` | `String` | Optional | - | String getPartyFunctionCodeQualifier() | setPartyFunctionCodeQualifier(String partyFunctionCodeQualifier) |
| `AccountHolderIdentification` | [`AccountHolderIdentification`](../../doc/models/account-holder-identification.md) | Optional | - | AccountHolderIdentification getAccountHolderIdentification() | setAccountHolderIdentification(AccountHolderIdentification accountHolderIdentification) |
| `InstitutionIdentification` | [`InstitutionIdentification`](../../doc/models/institution-identification.md) | Optional | - | InstitutionIdentification getInstitutionIdentification() | setInstitutionIdentification(InstitutionIdentification institutionIdentification) |

## Example (as JSON)

```json
{
  "PartyFunctionCodeQualifier": "PartyFunctionCodeQualifier8",
  "AccountHolderIdentification": {
    "AccountHolderIdentifier": "AccountHolderIdentifier4",
    "AccountHolderName": "AccountHolderName6",
    "CurrentIdentificationCode": "CurrentIdentificationCode4"
  },
  "InstitutionIdentification": {
    "InstitutionNameCode": "InstitutionNameCode6",
    "InstitutionName": "InstitutionName0",
    "CodeListResponsibleAgencyCode": "CodeListResponsibleAgencyCode0",
    "InstitutionBranchPlace": "InstitutionBranchPlace0"
  }
}
```

