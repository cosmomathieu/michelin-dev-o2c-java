
# Invoice

## Structure

`Invoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceIssueFromDate` | `String` | Optional | - | String getInvoiceIssueFromDate() | setInvoiceIssueFromDate(String invoiceIssueFromDate) |
| `InvoiceIssueToDate` | `String` | Optional | - | String getInvoiceIssueToDate() | setInvoiceIssueToDate(String invoiceIssueToDate) |
| `DocumentTypeCode` | `String` | Optional | - | String getDocumentTypeCode() | setDocumentTypeCode(String documentTypeCode) |
| `DocumentFunctionCode` | `String` | Optional | - | String getDocumentFunctionCode() | setDocumentFunctionCode(String documentFunctionCode) |
| `References` | [`References`](../../doc/models/references.md) | Optional | - | References getReferences() | setReferences(References references) |
| `BuyerParty` | [`BuyerParty`](../../doc/models/buyer-party.md) | Required | - | BuyerParty getBuyerParty() | setBuyerParty(BuyerParty buyerParty) |
| `InvoiceIssuerParty` | [`InvoiceIssuerParty`](../../doc/models/invoice-issuer-party.md) | Optional | - | InvoiceIssuerParty getInvoiceIssuerParty() | setInvoiceIssuerParty(InvoiceIssuerParty invoiceIssuerParty) |
| `InvoiceeParty` | [`InvoiceeParty`](../../doc/models/invoicee-party.md) | Optional | - | InvoiceeParty getInvoiceeParty() | setInvoiceeParty(InvoiceeParty invoiceeParty) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `Consignee` | [`Consignee6`](../../doc/models/consignee-6.md) | Optional | - | Consignee6 getConsignee() | setConsignee(Consignee6 consignee) |
| `SupplierParty` | [`SupplierParty`](../../doc/models/supplier-party.md) | Optional | - | SupplierParty getSupplierParty() | setSupplierParty(SupplierParty supplierParty) |
| `SellerParty` | [`SellerParty`](../../doc/models/seller-party.md) | Optional | - | SellerParty getSellerParty() | setSellerParty(SellerParty sellerParty) |
| `Contract` | [`Contract`](../../doc/models/contract.md) | Optional | - | Contract getContract() | setContract(Contract contract) |
| `Attachments` | `String` | Optional | - | String getAttachments() | setAttachments(String attachments) |

## Example (as JSON)

```json
{
  "InvoiceIssueFromDate": "InvoiceIssueFromDate4",
  "InvoiceIssueToDate": "InvoiceIssueToDate2",
  "DocumentTypeCode": "DocumentTypeCode2",
  "DocumentFunctionCode": "DocumentFunctionCode4",
  "References": {
    "ReferenceTypeCode": "ReferenceTypeCode2",
    "DocumentID": "DocumentID6"
  },
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0"
  }
}
```

