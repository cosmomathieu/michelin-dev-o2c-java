
# EDI Wheel B44 Invoice List Response

## Structure

`EDIWheelB44InvoiceListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Required | - | String getVariant() | setVariant(String variant) |
| `NumberOfMessages` | `int` | Required | - | int getNumberOfMessages() | setNumberOfMessages(int numberOfMessages) |
| `ErrorHead` | [`ErrorHead3`](../../doc/models/error-head-3.md) | Optional | - | ErrorHead3 getErrorHead() | setErrorHead(ErrorHead3 errorHead) |
| `Invoice` | [`List<Invoice1>`](../../doc/models/invoice-1.md) | Required | - | List<Invoice1> getInvoice() | setInvoice(List<Invoice1> invoice) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID6",
  "Variant": "Variant0",
  "NumberOfMessages": 26,
  "invoice": [
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
  ],
  "ErrorHead": {
    "ErrorCode": "ErrorCode6"
  }
}
```

