
# Invoice 1

## Structure

`Invoice1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssueDate` | `String` | Required | - | String getIssueDate() | setIssueDate(String issueDate) |
| `DocumentNumber` | `String` | Required | - | String getDocumentNumber() | setDocumentNumber(String documentNumber) |
| `DocumentTypeCode` | `String` | Required | - | String getDocumentTypeCode() | setDocumentTypeCode(String documentTypeCode) |
| `DocumentFunctionCode` | `String` | Optional | - | String getDocumentFunctionCode() | setDocumentFunctionCode(String documentFunctionCode) |
| `DocumentFunctionText` | `String` | Optional | - | String getDocumentFunctionText() | setDocumentFunctionText(String documentFunctionText) |
| `EInvoicingID` | [`List<EInvoicingID>`](../../doc/models/e-invoicing-id.md) | Optional | - | List<EInvoicingID> getEInvoicingID() | setEInvoicingID(List<EInvoicingID> eInvoicingID) |
| `EnvironmentRegisterID` | `String` | Optional | - | String getEnvironmentRegisterID() | setEnvironmentRegisterID(String environmentRegisterID) |
| `GoodsServiceIDCode` | `String` | Optional | - | String getGoodsServiceIDCode() | setGoodsServiceIDCode(String goodsServiceIDCode) |
| `GoodsServiceIndication` | `String` | Optional | - | String getGoodsServiceIndication() | setGoodsServiceIndication(String goodsServiceIndication) |
| `DocumentCurrency` | `String` | Required | - | String getDocumentCurrency() | setDocumentCurrency(String documentCurrency) |
| `References` | [`References4`](../../doc/models/references-4.md) | Optional | - | References4 getReferences() | setReferences(References4 references) |
| `BuyerParty` | [`BuyerParty7`](../../doc/models/buyer-party-7.md) | Required | - | BuyerParty7 getBuyerParty() | setBuyerParty(BuyerParty7 buyerParty) |
| `InvoiceIssuerParty` | [`InvoiceIssuerParty1`](../../doc/models/invoice-issuer-party-1.md) | Optional | - | InvoiceIssuerParty1 getInvoiceIssuerParty() | setInvoiceIssuerParty(InvoiceIssuerParty1 invoiceIssuerParty) |
| `InvoiceeParty` | [`InvoiceeParty1`](../../doc/models/invoicee-party-1.md) | Optional | - | InvoiceeParty1 getInvoiceeParty() | setInvoiceeParty(InvoiceeParty1 invoiceeParty) |
| `Consignee` | [`Consignee7`](../../doc/models/consignee-7.md) | Optional | - | Consignee7 getConsignee() | setConsignee(Consignee7 consignee) |
| `SellerParty` | [`SellerParty7`](../../doc/models/seller-party-7.md) | Optional | - | SellerParty7 getSellerParty() | setSellerParty(SellerParty7 sellerParty) |
| `PaymentTerms` | [`List<PaymentTerms2>`](../../doc/models/payment-terms-2.md) | Optional | - | List<PaymentTerms2> getPaymentTerms() | setPaymentTerms(List<PaymentTerms2> paymentTerms) |
| `PaymentInstructions` | [`PaymentInstructions`](../../doc/models/payment-instructions.md) | Optional | - | PaymentInstructions getPaymentInstructions() | setPaymentInstructions(PaymentInstructions paymentInstructions) |
| `HeaderNote` | [`HeaderNote`](../../doc/models/header-note.md) | Optional | - | HeaderNote getHeaderNote() | setHeaderNote(HeaderNote headerNote) |
| `LineLevel` | [`List<LineLevel1>`](../../doc/models/line-level-1.md) | Optional | - | List<LineLevel1> getLineLevel() | setLineLevel(List<LineLevel1> lineLevel) |
| `Controls` | [`Controls`](../../doc/models/controls.md) | Optional | - | Controls getControls() | setControls(Controls controls) |
| `Summary` | [`Summary`](../../doc/models/summary.md) | Required | - | Summary getSummary() | setSummary(Summary summary) |
| `Attachments` | [`List<Attachment>`](../../doc/models/attachment.md) | Optional | - | List<Attachment> getAttachments() | setAttachments(List<Attachment> attachments) |

## Example (as JSON)

```json
{
  "IssueDate": "IssueDate4",
  "DocumentNumber": "DocumentNumber6",
  "DocumentTypeCode": "DocumentTypeCode6",
  "DocumentFunctionCode": "DocumentFunctionCode0",
  "DocumentFunctionText": "DocumentFunctionText4",
  "eInvoicingID": [
    {
      "eInvoicingIDQualifier": "eInvoicingIDQualifier6",
      "ID": "ID0"
    },
    {
      "eInvoicingIDQualifier": "eInvoicingIDQualifier6",
      "ID": "ID0"
    },
    {
      "eInvoicingIDQualifier": "eInvoicingIDQualifier6",
      "ID": "ID0"
    }
  ],
  "EnvironmentRegisterID": "EnvironmentRegisterID0",
  "GoodsServiceIDCode": "GoodsServiceIDCode6",
  "DocumentCurrency": "DocumentCurrency0",
  "BuyerParty": {
    "PartyID": "PartyID0",
    "AgencyCode": "AgencyCode0",
    "Name": [
      "Name1"
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
    "TaxRegistrationID": "TaxRegistrationID8",
    "VATRegistrationID": "VATRegistrationID0"
  },
  "Summary": {
    "AllowanceOrCharge": [
      {
        "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
        "OtherChargeTypeCode": "OtherChargeTypeCode6",
        "AgencyCode": "AgencyCode6",
        "AllowanceOrChargeAmount": {
          "AmountValue": "AmountValue0"
        },
        "TaxDetails": {
          "TaxCategoryCode": "TaxCategoryCode6",
          "TaxTypeCode": "TaxTypeCode0",
          "TaxRate": "TaxRate2"
        }
      },
      {
        "AllowanceOrChargeTypeCode": "AllowanceOrChargeTypeCode0",
        "OtherChargeTypeCode": "OtherChargeTypeCode6",
        "AgencyCode": "AgencyCode6",
        "AllowanceOrChargeAmount": {
          "AmountValue": "AmountValue0"
        },
        "TaxDetails": {
          "TaxCategoryCode": "TaxCategoryCode6",
          "TaxTypeCode": "TaxTypeCode0",
          "TaxRate": "TaxRate2"
        }
      }
    ],
    "TotalAmount": {
      "AmountValue": "AmountValue2"
    },
    "TaxableAmount": {
      "AmountValue": "AmountValue6"
    },
    "TaxAmount": {
      "AmountValue": "AmountValue2"
    },
    "TotalLineItemsAmount": {
      "AmountValue": "AmountValue8"
    },
    "TotalChargeAmount": {
      "AmountValue": "AmountValue0"
    },
    "TaxDetails": [
      {
        "TaxCategoryCode": "TaxCategoryCode6",
        "TaxTypeCode": "TaxTypeCode0",
        "TaxRate": "TaxRate2",
        "VATExemptionClause": "VATExemptionClause6",
        "GeneralDiscountClause": "GeneralDiscountClause6",
        "TaxAmount": {
          "AmountValue": "AmountValue2"
        },
        "TaxableAmount": {
          "AmountValue": "AmountValue6"
        }
      },
      {
        "TaxCategoryCode": "TaxCategoryCode6",
        "TaxTypeCode": "TaxTypeCode0",
        "TaxRate": "TaxRate2",
        "VATExemptionClause": "VATExemptionClause6",
        "GeneralDiscountClause": "GeneralDiscountClause6",
        "TaxAmount": {
          "AmountValue": "AmountValue2"
        },
        "TaxableAmount": {
          "AmountValue": "AmountValue6"
        }
      },
      {
        "TaxCategoryCode": "TaxCategoryCode6",
        "TaxTypeCode": "TaxTypeCode0",
        "TaxRate": "TaxRate2",
        "VATExemptionClause": "VATExemptionClause6",
        "GeneralDiscountClause": "GeneralDiscountClause6",
        "TaxAmount": {
          "AmountValue": "AmountValue2"
        },
        "TaxableAmount": {
          "AmountValue": "AmountValue6"
        }
      }
    ]
  }
}
```

