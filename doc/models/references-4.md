
# References 4

## Structure

`References4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerReference` | [`CustomerReference`](../../doc/models/customer-reference.md) | Optional | - | CustomerReference getCustomerReference() | setCustomerReference(CustomerReference customerReference) |
| `DeliveryNoteReference` | [`DeliveryNoteReference`](../../doc/models/delivery-note-reference.md) | Optional | - | DeliveryNoteReference getDeliveryNoteReference() | setDeliveryNoteReference(DeliveryNoteReference deliveryNoteReference) |
| `SuppliersOrderReference` | [`SuppliersOrderReference`](../../doc/models/suppliers-order-reference.md) | Optional | - | SuppliersOrderReference getSuppliersOrderReference() | setSuppliersOrderReference(SuppliersOrderReference suppliersOrderReference) |
| `AssociatedInvoiceReference` | [`AssociatedInvoiceReference`](../../doc/models/associated-invoice-reference.md) | Optional | - | AssociatedInvoiceReference getAssociatedInvoiceReference() | setAssociatedInvoiceReference(AssociatedInvoiceReference associatedInvoiceReference) |
| `AssociatedExternalnvoiceReference` | [`AssociatedExternalnvoiceReference`](../../doc/models/associated-externalnvoice-reference.md) | Optional | - | AssociatedExternalnvoiceReference getAssociatedExternalnvoiceReference() | setAssociatedExternalnvoiceReference(AssociatedExternalnvoiceReference associatedExternalnvoiceReference) |
| `ExternalnvoiceReference` | [`ExternalnvoiceReference`](../../doc/models/externalnvoice-reference.md) | Optional | - | ExternalnvoiceReference getExternalnvoiceReference() | setExternalnvoiceReference(ExternalnvoiceReference externalnvoiceReference) |
| `BlanketOrderReference` | [`BlanketOrderReference2`](../../doc/models/blanket-order-reference-2.md) | Optional | - | BlanketOrderReference2 getBlanketOrderReference() | setBlanketOrderReference(BlanketOrderReference2 blanketOrderReference) |
| `BuyerOrderReference` | [`BuyerOrderReference`](../../doc/models/buyer-order-reference.md) | Optional | - | BuyerOrderReference getBuyerOrderReference() | setBuyerOrderReference(BuyerOrderReference buyerOrderReference) |
| `DeliveryListReference` | [`DeliveryListReference`](../../doc/models/delivery-list-reference.md) | Optional | - | DeliveryListReference getDeliveryListReference() | setDeliveryListReference(DeliveryListReference deliveryListReference) |
| `SellerReference` | [`SellerReference`](../../doc/models/seller-reference.md) | Optional | - | SellerReference getSellerReference() | setSellerReference(SellerReference sellerReference) |
| `ReturnDeliveryNoticeReference` | [`ReturnDeliveryNoticeReference`](../../doc/models/return-delivery-notice-reference.md) | Optional | - | ReturnDeliveryNoticeReference getReturnDeliveryNoticeReference() | setReturnDeliveryNoticeReference(ReturnDeliveryNoticeReference returnDeliveryNoticeReference) |
| `SEPACreditorReference` | [`SEPACreditorReference`](../../doc/models/sepa-creditor-reference.md) | Optional | - | SEPACreditorReference getSEPACreditorReference() | setSEPACreditorReference(SEPACreditorReference sEPACreditorReference) |
| `SupplierClaimNumber` | [`SupplierClaimNumber`](../../doc/models/supplier-claim-number.md) | Optional | - | SupplierClaimNumber getSupplierClaimNumber() | setSupplierClaimNumber(SupplierClaimNumber supplierClaimNumber) |
| `CustomerClaimNumber` | [`CustomerClaimNumber`](../../doc/models/customer-claim-number.md) | Optional | - | CustomerClaimNumber getCustomerClaimNumber() | setCustomerClaimNumber(CustomerClaimNumber customerClaimNumber) |
| `WarrantyNumber` | [`WarrantyNumber`](../../doc/models/warranty-number.md) | Optional | - | WarrantyNumber getWarrantyNumber() | setWarrantyNumber(WarrantyNumber warrantyNumber) |
| `FleetReference` | [`List<FleetReference>`](../../doc/models/fleet-reference.md) | Optional | - | List<FleetReference> getFleetReference() | setFleetReference(List<FleetReference> fleetReference) |

## Example (as JSON)

```json
{
  "CustomerReference": {
    "DocumentID": "DocumentID6"
  },
  "DeliveryNoteReference": {
    "DocumentID": "DocumentID2",
    "IssueDate": "IssueDate4",
    "CompletionDate": "CompletionDate8"
  },
  "SuppliersOrderReference": {
    "DocumentID": "DocumentID8",
    "IssueDate": "IssueDate0"
  },
  "AssociatedInvoiceReference": {
    "DocumentID": "DocumentID0",
    "IssueDate": "IssueDate2"
  },
  "AssociatedExternalnvoiceReference": {
    "DocumentID": "DocumentID6",
    "IssueDate": "IssueDate8"
  }
}
```

