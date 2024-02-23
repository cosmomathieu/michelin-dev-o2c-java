
# References 5

## Structure

`References5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerReference` | [`CustomerReference3`](../../doc/models/customer-reference-3.md) | Optional | - | CustomerReference3 getCustomerReference() | setCustomerReference(CustomerReference3 customerReference) |
| `DeliveryNoteReference` | [`DeliveryNoteReference1`](../../doc/models/delivery-note-reference-1.md) | Optional | - | DeliveryNoteReference1 getDeliveryNoteReference() | setDeliveryNoteReference(DeliveryNoteReference1 deliveryNoteReference) |
| `SuppliersOrderReference` | [`SuppliersOrderReference1`](../../doc/models/suppliers-order-reference-1.md) | Optional | - | SuppliersOrderReference1 getSuppliersOrderReference() | setSuppliersOrderReference(SuppliersOrderReference1 suppliersOrderReference) |
| `AssociatedInvoiceReference` | [`AssociatedInvoiceReference1`](../../doc/models/associated-invoice-reference-1.md) | Optional | - | AssociatedInvoiceReference1 getAssociatedInvoiceReference() | setAssociatedInvoiceReference(AssociatedInvoiceReference1 associatedInvoiceReference) |
| `BlanketOrderReference` | [`BlanketOrderReference3`](../../doc/models/blanket-order-reference-3.md) | Optional | - | BlanketOrderReference3 getBlanketOrderReference() | setBlanketOrderReference(BlanketOrderReference3 blanketOrderReference) |
| `BuyerOrderReference` | [`BuyerOrderReference1`](../../doc/models/buyer-order-reference-1.md) | Optional | - | BuyerOrderReference1 getBuyerOrderReference() | setBuyerOrderReference(BuyerOrderReference1 buyerOrderReference) |
| `DeliveryListReference` | [`DeliveryListReference1`](../../doc/models/delivery-list-reference-1.md) | Optional | - | DeliveryListReference1 getDeliveryListReference() | setDeliveryListReference(DeliveryListReference1 deliveryListReference) |
| `SellerReference` | [`SellerReference1`](../../doc/models/seller-reference-1.md) | Optional | - | SellerReference1 getSellerReference() | setSellerReference(SellerReference1 sellerReference) |
| `ReturnDeliveryNoticeReference` | [`ReturnDeliveryNoticeReference1`](../../doc/models/return-delivery-notice-reference-1.md) | Optional | - | ReturnDeliveryNoticeReference1 getReturnDeliveryNoticeReference() | setReturnDeliveryNoticeReference(ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference) |
| `ReturnSalesOrderNoteReference` | [`ReturnSalesOrderNoteReference`](../../doc/models/return-sales-order-note-reference.md) | Optional | - | ReturnSalesOrderNoteReference getReturnSalesOrderNoteReference() | setReturnSalesOrderNoteReference(ReturnSalesOrderNoteReference returnSalesOrderNoteReference) |
| `SupplierClaimNumber` | [`SupplierClaimNumber`](../../doc/models/supplier-claim-number.md) | Optional | - | SupplierClaimNumber getSupplierClaimNumber() | setSupplierClaimNumber(SupplierClaimNumber supplierClaimNumber) |
| `CustomerClaimNumber` | [`CustomerClaimNumber`](../../doc/models/customer-claim-number.md) | Optional | - | CustomerClaimNumber getCustomerClaimNumber() | setCustomerClaimNumber(CustomerClaimNumber customerClaimNumber) |
| `WarrantyNumber` | [`WarrantyNumber`](../../doc/models/warranty-number.md) | Optional | - | WarrantyNumber getWarrantyNumber() | setWarrantyNumber(WarrantyNumber warrantyNumber) |
| `CustomsDeclarationNumber` | [`List<CustomsDeclarationNumber>`](../../doc/models/customs-declaration-number.md) | Optional | - | List<CustomsDeclarationNumber> getCustomsDeclarationNumber() | setCustomsDeclarationNumber(List<CustomsDeclarationNumber> customsDeclarationNumber) |
| `FleetReference` | [`List<FleetReference>`](../../doc/models/fleet-reference.md) | Optional | - | List<FleetReference> getFleetReference() | setFleetReference(List<FleetReference> fleetReference) |

## Example (as JSON)

```json
{
  "CustomerReference": {
    "DocumentID": "DocumentID6",
    "LineID": "LineID0"
  },
  "DeliveryNoteReference": {
    "DocumentID": "DocumentID2",
    "LineID": "LineID6",
    "IssueDate": "IssueDate4",
    "CompletionDate": "CompletionDate8"
  },
  "SuppliersOrderReference": {
    "DocumentID": "DocumentID8",
    "LineID": "LineID2",
    "IssueDate": "IssueDate0"
  },
  "AssociatedInvoiceReference": {
    "DocumentID": "DocumentID0",
    "LineID": "LineID4",
    "IssueDate": "IssueDate2"
  },
  "BlanketOrderReference": {
    "DocumentID": "DocumentID8",
    "LineID": "LineID2",
    "IssueDate": "IssueDate0"
  }
}
```

