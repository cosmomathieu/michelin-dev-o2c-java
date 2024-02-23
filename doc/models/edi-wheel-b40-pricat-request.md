
# EDI Wheel B40 Pricat Request

## Structure

`EDIWheelB40PricatRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | - | String getRecordType() | setRecordType(String recordType) |
| `DocumentID` | `String` | Optional | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `DocumentDate` | `String` | Optional | - | String getDocumentDate() | setDocumentDate(String documentDate) |
| `ReceiverID` | `String` | Optional | - | String getReceiverID() | setReceiverID(String receiverID) |
| `CountryCode` | `String` | Optional | - | String getCountryCode() | setCountryCode(String countryCode) |
| `EdiwheelVersion` | `String` | Optional | - | String getEdiwheelVersion() | setEdiwheelVersion(String ediwheelVersion) |
| `CatalogueType` | `String` | Optional | - | String getCatalogueType() | setCatalogueType(String catalogueType) |
| `PricatLines` | [`List<PricatLine>`](../../doc/models/pricat-line.md) | Optional | - | List<PricatLine> getPricatLines() | setPricatLines(List<PricatLine> pricatLines) |

## Example (as JSON)

```json
{
  "recordType": "recordType8",
  "documentID": "documentID2",
  "variant": "variant8",
  "documentDate": "documentDate6",
  "receiverID": "receiverID0"
}
```

