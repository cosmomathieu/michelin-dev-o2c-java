
# EDI Wheel C11 Order Creation Response

## Structure

`EDIWheelC11OrderCreationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentID` | `String` | Required | - | String getDocumentID() | setDocumentID(String documentID) |
| `Variant` | `String` | Optional | - | String getVariant() | setVariant(String variant) |
| `EarliestDeliveryDate` | `String` | Optional | - | String getEarliestDeliveryDate() | setEarliestDeliveryDate(String earliestDeliveryDate) |
| `TransportPriority` | `String` | Optional | - | String getTransportPriority() | setTransportPriority(String transportPriority) |
| `Campaign` | `String` | Optional | - | String getCampaign() | setCampaign(String campaign) |
| `PickUp` | `String` | Optional | - | String getPickUp() | setPickUp(String pickUp) |
| `DeliveryOption` | `String` | Optional | - | String getDeliveryOption() | setDeliveryOption(String deliveryOption) |
| `DeliveryRemarks` | `String` | Optional | - | String getDeliveryRemarks() | setDeliveryRemarks(String deliveryRemarks) |
| `ErrorHead` | [`ErrorHead`](../../doc/models/error-head.md) | Required | - | ErrorHead getErrorHead() | setErrorHead(ErrorHead errorHead) |
| `BlanketOrderReference` | [`BlanketOrderReference`](../../doc/models/blanket-order-reference.md) | Optional | - | BlanketOrderReference getBlanketOrderReference() | setBlanketOrderReference(BlanketOrderReference blanketOrderReference) |
| `CustomerReference` | [`CustomerReference`](../../doc/models/customer-reference.md) | Required | - | CustomerReference getCustomerReference() | setCustomerReference(CustomerReference customerReference) |
| `SellerParty` | [`SellerParty2`](../../doc/models/seller-party-2.md) | Optional | - | SellerParty2 getSellerParty() | setSellerParty(SellerParty2 sellerParty) |
| `SupplierParty` | [`SupplierParty2`](../../doc/models/supplier-party-2.md) | Optional | - | SupplierParty2 getSupplierParty() | setSupplierParty(SupplierParty2 supplierParty) |
| `BuyerParty` | [`BuyerParty2`](../../doc/models/buyer-party-2.md) | Required | - | BuyerParty2 getBuyerParty() | setBuyerParty(BuyerParty2 buyerParty) |
| `OrderingParty` | [`OrderingParty`](../../doc/models/ordering-party.md) | Optional | - | OrderingParty getOrderingParty() | setOrderingParty(OrderingParty orderingParty) |
| `Consignee` | [`Consignee3`](../../doc/models/consignee-3.md) | Optional | - | Consignee3 getConsignee() | setConsignee(Consignee3 consignee) |
| `Contract` | [`Contract`](../../doc/models/contract.md) | Optional | - | Contract getContract() | setContract(Contract contract) |
| `PaymentTerms` | [`PaymentTerms`](../../doc/models/payment-terms.md) | Optional | - | PaymentTerms getPaymentTerms() | setPaymentTerms(PaymentTerms paymentTerms) |
| `CurrencyCode` | `String` | Optional | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `Charge` | [`Charge`](../../doc/models/charge.md) | Optional | - | Charge getCharge() | setCharge(Charge charge) |
| `OrderLine` | [`List<OrderLine1>`](../../doc/models/order-line-1.md) | Optional | - | List<OrderLine1> getOrderLine() | setOrderLine(List<OrderLine1> orderLine) |

## Example (as JSON)

```json
{
  "DocumentID": "DocumentID4",
  "Variant": "Variant8",
  "EarliestDeliveryDate": "EarliestDeliveryDate4",
  "TransportPriority": "TransportPriority0",
  "Campaign": "Campaign8",
  "PickUp": "PickUp6",
  "ErrorHead": {
    "ErrorCode": "ErrorCode6"
  },
  "CustomerReference": {
    "DocumentID": "DocumentID6"
  },
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
    "InformationContact": {
      "ContactID": "ContactID4",
      "Name": [
        "Name1"
      ],
      "TelephoneNumber": "TelephoneNumber6",
      "TelephoneExtension": "TelephoneExtension8",
      "FaxNumber": "FaxNumber6"
    }
  }
}
```

