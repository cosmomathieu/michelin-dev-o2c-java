
# EDI Wheel C10 Desadv Response

## Structure

`EDIWheelC10DesadvResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnvelopeHeader` | [`EnvelopeHeader`](../../doc/models/envelope-header.md) | Required | - | EnvelopeHeader getEnvelopeHeader() | setEnvelopeHeader(EnvelopeHeader envelopeHeader) |
| `ErrorHead` | [`ErrorHead`](../../doc/models/error-head.md) | Required | - | ErrorHead getErrorHead() | setErrorHead(ErrorHead errorHead) |
| `Desadv` | [`List<Desadv>`](../../doc/models/desadv.md) | Optional | - | List<Desadv> getDesadv() | setDesadv(List<Desadv> desadv) |

## Example (as JSON)

```json
{
  "EnvelopeHeader": {
    "DocumentID": "DocumentID6",
    "Variant": "Variant0",
    "ReceiverID": "ReceiverID0",
    "SenderID": "SenderID4",
    "MessageType": "MessageType4",
    "InterchangeID": "InterchangeID2",
    "Timestamp": "Timestamp0",
    "NumberOfMessages": "NumberOfMessages4"
  },
  "ErrorHead": {
    "ErrorCode": "ErrorCode6"
  },
  "desadv": [
    {
      "IssueDate": "IssueDate4",
      "DocumentNumber": "DocumentNumber6",
      "DocumentTypeCode": "DocumentTypeCode6",
      "Measures": {
        "GrossWeight": {
          "Measure": "Measure6",
          "MeasureUnitCode": "MeasureUnitCode4"
        },
        "NetWeight": {
          "Measure": "Measure0",
          "MeasureUnitCode": "MeasureUnitCode2"
        },
        "Volume": {
          "Measure": "Measure8",
          "MeasureUnitCode": "MeasureUnitCode0"
        }
      },
      "DespatchDate": "DespatchDate2",
      "ArrivalDate": "ArrivalDate4",
      "ArrivalTime": "ArrivalTime6",
      "DeliveryOption": [
        "DeliveryOption9",
        "DeliveryOption0"
      ],
      "TotalQuantity": {
        "QuantityValue": "QuantityValue2",
        "MeasureUnitCode": "MeasureUnitCode4"
      },
      "References": [
        {
          "ReferenceTypeCode": "ReferenceTypeCode2",
          "DocumentID": "DocumentID6",
          "IssueDate": "IssueDate8"
        },
        {
          "ReferenceTypeCode": "ReferenceTypeCode2",
          "DocumentID": "DocumentID6",
          "IssueDate": "IssueDate8"
        }
      ],
      "BuyerParty": {
        "PartyID": "PartyID0",
        "AgencyCode": "AgencyCode0"
      },
      "SupplierParty": {
        "PartyID": "PartyID2",
        "AgencyCode": "AgencyCode8",
        "SalesContact": {
          "Name": "Name8"
        },
        "ShippingLocation": {
          "LocationName": "LocationName2"
        }
      },
      "Consignee": {
        "PartyID": "PartyID8",
        "AgencyCode": "AgencyCode2",
        "Name": [
          "Name7"
        ],
        "Address": {
          "Street": [
            "Street0"
          ],
          "City": "City6",
          "District": "District8",
          "PostCode": "PostCode2",
          "PostBoxCode": "PostBoxCode0",
          "SubCountry": "SubCountry8",
          "CountryCode": "CountryCode8"
        }
      }
    },
    {
      "IssueDate": "IssueDate4",
      "DocumentNumber": "DocumentNumber6",
      "DocumentTypeCode": "DocumentTypeCode6",
      "Measures": {
        "GrossWeight": {
          "Measure": "Measure6",
          "MeasureUnitCode": "MeasureUnitCode4"
        },
        "NetWeight": {
          "Measure": "Measure0",
          "MeasureUnitCode": "MeasureUnitCode2"
        },
        "Volume": {
          "Measure": "Measure8",
          "MeasureUnitCode": "MeasureUnitCode0"
        }
      },
      "DespatchDate": "DespatchDate2",
      "ArrivalDate": "ArrivalDate4",
      "ArrivalTime": "ArrivalTime6",
      "DeliveryOption": [
        "DeliveryOption9",
        "DeliveryOption0"
      ],
      "TotalQuantity": {
        "QuantityValue": "QuantityValue2",
        "MeasureUnitCode": "MeasureUnitCode4"
      },
      "References": [
        {
          "ReferenceTypeCode": "ReferenceTypeCode2",
          "DocumentID": "DocumentID6",
          "IssueDate": "IssueDate8"
        },
        {
          "ReferenceTypeCode": "ReferenceTypeCode2",
          "DocumentID": "DocumentID6",
          "IssueDate": "IssueDate8"
        }
      ],
      "BuyerParty": {
        "PartyID": "PartyID0",
        "AgencyCode": "AgencyCode0"
      },
      "SupplierParty": {
        "PartyID": "PartyID2",
        "AgencyCode": "AgencyCode8",
        "SalesContact": {
          "Name": "Name8"
        },
        "ShippingLocation": {
          "LocationName": "LocationName2"
        }
      },
      "Consignee": {
        "PartyID": "PartyID8",
        "AgencyCode": "AgencyCode2",
        "Name": [
          "Name7"
        ],
        "Address": {
          "Street": [
            "Street0"
          ],
          "City": "City6",
          "District": "District8",
          "PostCode": "PostCode2",
          "PostBoxCode": "PostBoxCode0",
          "SubCountry": "SubCountry8",
          "CountryCode": "CountryCode8"
        }
      }
    }
  ]
}
```

