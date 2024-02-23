
# EDI Wheel B44 Invoice List Request

## Structure

`EDIWheelB44InvoiceListRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `Invoice` | [`List<Invoice>`](../../doc/models/invoice.md) | Required | - | List<Invoice> getInvoice() | setInvoice(List<Invoice> invoice) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID2",
  "invoice": [
    {
      "InvoiceIssueFromDate": "InvoiceIssueFromDate0",
      "InvoiceIssueToDate": "InvoiceIssueToDate8",
      "DocumentTypeCode": "DocumentTypeCode6",
      "DocumentFunctionCode": "DocumentFunctionCode0",
      "References": {
        "ReferenceTypeCode": "ReferenceTypeCode2",
        "DocumentID": "DocumentID6"
      },
      "BuyerParty": {
        "PartyID": "PartyID0",
        "AgencyCode": "AgencyCode0"
      }
    }
  ],
  "Variant": "Variant6"
}
```

