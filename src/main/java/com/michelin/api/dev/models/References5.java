/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for References5 type.
 */
public class References5 {
    private CustomerReference3 customerReference;
    private DeliveryNoteReference1 deliveryNoteReference;
    private SuppliersOrderReference1 suppliersOrderReference;
    private AssociatedInvoiceReference1 associatedInvoiceReference;
    private BlanketOrderReference3 blanketOrderReference;
    private BuyerOrderReference1 buyerOrderReference;
    private DeliveryListReference1 deliveryListReference;
    private SellerReference1 sellerReference;
    private ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference;
    private ReturnSalesOrderNoteReference returnSalesOrderNoteReference;
    private SupplierClaimNumber supplierClaimNumber;
    private CustomerClaimNumber customerClaimNumber;
    private WarrantyNumber warrantyNumber;
    private List<CustomsDeclarationNumber> customsDeclarationNumber;
    private List<FleetReference> fleetReference;

    /**
     * Default constructor.
     */
    public References5() {
    }

    /**
     * Initialization constructor.
     * @param  customerReference  CustomerReference3 value for customerReference.
     * @param  deliveryNoteReference  DeliveryNoteReference1 value for deliveryNoteReference.
     * @param  suppliersOrderReference  SuppliersOrderReference1 value for suppliersOrderReference.
     * @param  associatedInvoiceReference  AssociatedInvoiceReference1 value for
     *         associatedInvoiceReference.
     * @param  blanketOrderReference  BlanketOrderReference3 value for blanketOrderReference.
     * @param  buyerOrderReference  BuyerOrderReference1 value for buyerOrderReference.
     * @param  deliveryListReference  DeliveryListReference1 value for deliveryListReference.
     * @param  sellerReference  SellerReference1 value for sellerReference.
     * @param  returnDeliveryNoticeReference  ReturnDeliveryNoticeReference1 value for
     *         returnDeliveryNoticeReference.
     * @param  returnSalesOrderNoteReference  ReturnSalesOrderNoteReference value for
     *         returnSalesOrderNoteReference.
     * @param  supplierClaimNumber  SupplierClaimNumber value for supplierClaimNumber.
     * @param  customerClaimNumber  CustomerClaimNumber value for customerClaimNumber.
     * @param  warrantyNumber  WarrantyNumber value for warrantyNumber.
     * @param  customsDeclarationNumber  List of CustomsDeclarationNumber value for
     *         customsDeclarationNumber.
     * @param  fleetReference  List of FleetReference value for fleetReference.
     */
    public References5(
            CustomerReference3 customerReference,
            DeliveryNoteReference1 deliveryNoteReference,
            SuppliersOrderReference1 suppliersOrderReference,
            AssociatedInvoiceReference1 associatedInvoiceReference,
            BlanketOrderReference3 blanketOrderReference,
            BuyerOrderReference1 buyerOrderReference,
            DeliveryListReference1 deliveryListReference,
            SellerReference1 sellerReference,
            ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference,
            ReturnSalesOrderNoteReference returnSalesOrderNoteReference,
            SupplierClaimNumber supplierClaimNumber,
            CustomerClaimNumber customerClaimNumber,
            WarrantyNumber warrantyNumber,
            List<CustomsDeclarationNumber> customsDeclarationNumber,
            List<FleetReference> fleetReference) {
        this.customerReference = customerReference;
        this.deliveryNoteReference = deliveryNoteReference;
        this.suppliersOrderReference = suppliersOrderReference;
        this.associatedInvoiceReference = associatedInvoiceReference;
        this.blanketOrderReference = blanketOrderReference;
        this.buyerOrderReference = buyerOrderReference;
        this.deliveryListReference = deliveryListReference;
        this.sellerReference = sellerReference;
        this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
        this.returnSalesOrderNoteReference = returnSalesOrderNoteReference;
        this.supplierClaimNumber = supplierClaimNumber;
        this.customerClaimNumber = customerClaimNumber;
        this.warrantyNumber = warrantyNumber;
        this.customsDeclarationNumber = customsDeclarationNumber;
        this.fleetReference = fleetReference;
    }

    /**
     * Getter for CustomerReference.
     * @return Returns the CustomerReference3
     */
    @JsonGetter("CustomerReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerReference3 getCustomerReference() {
        return customerReference;
    }

    /**
     * Setter for CustomerReference.
     * @param customerReference Value for CustomerReference3
     */
    @JsonSetter("CustomerReference")
    public void setCustomerReference(CustomerReference3 customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Getter for DeliveryNoteReference.
     * @return Returns the DeliveryNoteReference1
     */
    @JsonGetter("DeliveryNoteReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeliveryNoteReference1 getDeliveryNoteReference() {
        return deliveryNoteReference;
    }

    /**
     * Setter for DeliveryNoteReference.
     * @param deliveryNoteReference Value for DeliveryNoteReference1
     */
    @JsonSetter("DeliveryNoteReference")
    public void setDeliveryNoteReference(DeliveryNoteReference1 deliveryNoteReference) {
        this.deliveryNoteReference = deliveryNoteReference;
    }

    /**
     * Getter for SuppliersOrderReference.
     * @return Returns the SuppliersOrderReference1
     */
    @JsonGetter("SuppliersOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SuppliersOrderReference1 getSuppliersOrderReference() {
        return suppliersOrderReference;
    }

    /**
     * Setter for SuppliersOrderReference.
     * @param suppliersOrderReference Value for SuppliersOrderReference1
     */
    @JsonSetter("SuppliersOrderReference")
    public void setSuppliersOrderReference(SuppliersOrderReference1 suppliersOrderReference) {
        this.suppliersOrderReference = suppliersOrderReference;
    }

    /**
     * Getter for AssociatedInvoiceReference.
     * @return Returns the AssociatedInvoiceReference1
     */
    @JsonGetter("AssociatedInvoiceReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AssociatedInvoiceReference1 getAssociatedInvoiceReference() {
        return associatedInvoiceReference;
    }

    /**
     * Setter for AssociatedInvoiceReference.
     * @param associatedInvoiceReference Value for AssociatedInvoiceReference1
     */
    @JsonSetter("AssociatedInvoiceReference")
    public void setAssociatedInvoiceReference(AssociatedInvoiceReference1 associatedInvoiceReference) {
        this.associatedInvoiceReference = associatedInvoiceReference;
    }

    /**
     * Getter for BlanketOrderReference.
     * @return Returns the BlanketOrderReference3
     */
    @JsonGetter("BlanketOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlanketOrderReference3 getBlanketOrderReference() {
        return blanketOrderReference;
    }

    /**
     * Setter for BlanketOrderReference.
     * @param blanketOrderReference Value for BlanketOrderReference3
     */
    @JsonSetter("BlanketOrderReference")
    public void setBlanketOrderReference(BlanketOrderReference3 blanketOrderReference) {
        this.blanketOrderReference = blanketOrderReference;
    }

    /**
     * Getter for BuyerOrderReference.
     * @return Returns the BuyerOrderReference1
     */
    @JsonGetter("BuyerOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BuyerOrderReference1 getBuyerOrderReference() {
        return buyerOrderReference;
    }

    /**
     * Setter for BuyerOrderReference.
     * @param buyerOrderReference Value for BuyerOrderReference1
     */
    @JsonSetter("BuyerOrderReference")
    public void setBuyerOrderReference(BuyerOrderReference1 buyerOrderReference) {
        this.buyerOrderReference = buyerOrderReference;
    }

    /**
     * Getter for DeliveryListReference.
     * @return Returns the DeliveryListReference1
     */
    @JsonGetter("DeliveryListReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeliveryListReference1 getDeliveryListReference() {
        return deliveryListReference;
    }

    /**
     * Setter for DeliveryListReference.
     * @param deliveryListReference Value for DeliveryListReference1
     */
    @JsonSetter("DeliveryListReference")
    public void setDeliveryListReference(DeliveryListReference1 deliveryListReference) {
        this.deliveryListReference = deliveryListReference;
    }

    /**
     * Getter for SellerReference.
     * @return Returns the SellerReference1
     */
    @JsonGetter("SellerReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerReference1 getSellerReference() {
        return sellerReference;
    }

    /**
     * Setter for SellerReference.
     * @param sellerReference Value for SellerReference1
     */
    @JsonSetter("SellerReference")
    public void setSellerReference(SellerReference1 sellerReference) {
        this.sellerReference = sellerReference;
    }

    /**
     * Getter for ReturnDeliveryNoticeReference.
     * @return Returns the ReturnDeliveryNoticeReference1
     */
    @JsonGetter("ReturnDeliveryNoticeReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReturnDeliveryNoticeReference1 getReturnDeliveryNoticeReference() {
        return returnDeliveryNoticeReference;
    }

    /**
     * Setter for ReturnDeliveryNoticeReference.
     * @param returnDeliveryNoticeReference Value for ReturnDeliveryNoticeReference1
     */
    @JsonSetter("ReturnDeliveryNoticeReference")
    public void setReturnDeliveryNoticeReference(ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference) {
        this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
    }

    /**
     * Getter for ReturnSalesOrderNoteReference.
     * @return Returns the ReturnSalesOrderNoteReference
     */
    @JsonGetter("ReturnSalesOrderNoteReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReturnSalesOrderNoteReference getReturnSalesOrderNoteReference() {
        return returnSalesOrderNoteReference;
    }

    /**
     * Setter for ReturnSalesOrderNoteReference.
     * @param returnSalesOrderNoteReference Value for ReturnSalesOrderNoteReference
     */
    @JsonSetter("ReturnSalesOrderNoteReference")
    public void setReturnSalesOrderNoteReference(ReturnSalesOrderNoteReference returnSalesOrderNoteReference) {
        this.returnSalesOrderNoteReference = returnSalesOrderNoteReference;
    }

    /**
     * Getter for SupplierClaimNumber.
     * @return Returns the SupplierClaimNumber
     */
    @JsonGetter("SupplierClaimNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierClaimNumber getSupplierClaimNumber() {
        return supplierClaimNumber;
    }

    /**
     * Setter for SupplierClaimNumber.
     * @param supplierClaimNumber Value for SupplierClaimNumber
     */
    @JsonSetter("SupplierClaimNumber")
    public void setSupplierClaimNumber(SupplierClaimNumber supplierClaimNumber) {
        this.supplierClaimNumber = supplierClaimNumber;
    }

    /**
     * Getter for CustomerClaimNumber.
     * @return Returns the CustomerClaimNumber
     */
    @JsonGetter("CustomerClaimNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerClaimNumber getCustomerClaimNumber() {
        return customerClaimNumber;
    }

    /**
     * Setter for CustomerClaimNumber.
     * @param customerClaimNumber Value for CustomerClaimNumber
     */
    @JsonSetter("CustomerClaimNumber")
    public void setCustomerClaimNumber(CustomerClaimNumber customerClaimNumber) {
        this.customerClaimNumber = customerClaimNumber;
    }

    /**
     * Getter for WarrantyNumber.
     * @return Returns the WarrantyNumber
     */
    @JsonGetter("WarrantyNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public WarrantyNumber getWarrantyNumber() {
        return warrantyNumber;
    }

    /**
     * Setter for WarrantyNumber.
     * @param warrantyNumber Value for WarrantyNumber
     */
    @JsonSetter("WarrantyNumber")
    public void setWarrantyNumber(WarrantyNumber warrantyNumber) {
        this.warrantyNumber = warrantyNumber;
    }

    /**
     * Getter for CustomsDeclarationNumber.
     * @return Returns the List of CustomsDeclarationNumber
     */
    @JsonGetter("CustomsDeclarationNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomsDeclarationNumber> getCustomsDeclarationNumber() {
        return customsDeclarationNumber;
    }

    /**
     * Setter for CustomsDeclarationNumber.
     * @param customsDeclarationNumber Value for List of CustomsDeclarationNumber
     */
    @JsonSetter("CustomsDeclarationNumber")
    public void setCustomsDeclarationNumber(List<CustomsDeclarationNumber> customsDeclarationNumber) {
        this.customsDeclarationNumber = customsDeclarationNumber;
    }

    /**
     * Getter for FleetReference.
     * @return Returns the List of FleetReference
     */
    @JsonGetter("FleetReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FleetReference> getFleetReference() {
        return fleetReference;
    }

    /**
     * Setter for FleetReference.
     * @param fleetReference Value for List of FleetReference
     */
    @JsonSetter("FleetReference")
    public void setFleetReference(List<FleetReference> fleetReference) {
        this.fleetReference = fleetReference;
    }

    /**
     * Converts this References5 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "References5 [" + "customerReference=" + customerReference
                + ", deliveryNoteReference=" + deliveryNoteReference + ", suppliersOrderReference="
                + suppliersOrderReference + ", associatedInvoiceReference="
                + associatedInvoiceReference + ", blanketOrderReference=" + blanketOrderReference
                + ", buyerOrderReference=" + buyerOrderReference + ", deliveryListReference="
                + deliveryListReference + ", sellerReference=" + sellerReference
                + ", returnDeliveryNoticeReference=" + returnDeliveryNoticeReference
                + ", returnSalesOrderNoteReference=" + returnSalesOrderNoteReference
                + ", supplierClaimNumber=" + supplierClaimNumber + ", customerClaimNumber="
                + customerClaimNumber + ", warrantyNumber=" + warrantyNumber
                + ", customsDeclarationNumber=" + customsDeclarationNumber + ", fleetReference="
                + fleetReference + "]";
    }

    /**
     * Builds a new {@link References5.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link References5.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerReference(getCustomerReference())
                .deliveryNoteReference(getDeliveryNoteReference())
                .suppliersOrderReference(getSuppliersOrderReference())
                .associatedInvoiceReference(getAssociatedInvoiceReference())
                .blanketOrderReference(getBlanketOrderReference())
                .buyerOrderReference(getBuyerOrderReference())
                .deliveryListReference(getDeliveryListReference())
                .sellerReference(getSellerReference())
                .returnDeliveryNoticeReference(getReturnDeliveryNoticeReference())
                .returnSalesOrderNoteReference(getReturnSalesOrderNoteReference())
                .supplierClaimNumber(getSupplierClaimNumber())
                .customerClaimNumber(getCustomerClaimNumber())
                .warrantyNumber(getWarrantyNumber())
                .customsDeclarationNumber(getCustomsDeclarationNumber())
                .fleetReference(getFleetReference());
        return builder;
    }

    /**
     * Class to build instances of {@link References5}.
     */
    public static class Builder {
        private CustomerReference3 customerReference;
        private DeliveryNoteReference1 deliveryNoteReference;
        private SuppliersOrderReference1 suppliersOrderReference;
        private AssociatedInvoiceReference1 associatedInvoiceReference;
        private BlanketOrderReference3 blanketOrderReference;
        private BuyerOrderReference1 buyerOrderReference;
        private DeliveryListReference1 deliveryListReference;
        private SellerReference1 sellerReference;
        private ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference;
        private ReturnSalesOrderNoteReference returnSalesOrderNoteReference;
        private SupplierClaimNumber supplierClaimNumber;
        private CustomerClaimNumber customerClaimNumber;
        private WarrantyNumber warrantyNumber;
        private List<CustomsDeclarationNumber> customsDeclarationNumber;
        private List<FleetReference> fleetReference;



        /**
         * Setter for customerReference.
         * @param  customerReference  CustomerReference3 value for customerReference.
         * @return Builder
         */
        public Builder customerReference(CustomerReference3 customerReference) {
            this.customerReference = customerReference;
            return this;
        }

        /**
         * Setter for deliveryNoteReference.
         * @param  deliveryNoteReference  DeliveryNoteReference1 value for deliveryNoteReference.
         * @return Builder
         */
        public Builder deliveryNoteReference(DeliveryNoteReference1 deliveryNoteReference) {
            this.deliveryNoteReference = deliveryNoteReference;
            return this;
        }

        /**
         * Setter for suppliersOrderReference.
         * @param  suppliersOrderReference  SuppliersOrderReference1 value for
         *         suppliersOrderReference.
         * @return Builder
         */
        public Builder suppliersOrderReference(SuppliersOrderReference1 suppliersOrderReference) {
            this.suppliersOrderReference = suppliersOrderReference;
            return this;
        }

        /**
         * Setter for associatedInvoiceReference.
         * @param  associatedInvoiceReference  AssociatedInvoiceReference1 value for
         *         associatedInvoiceReference.
         * @return Builder
         */
        public Builder associatedInvoiceReference(
                AssociatedInvoiceReference1 associatedInvoiceReference) {
            this.associatedInvoiceReference = associatedInvoiceReference;
            return this;
        }

        /**
         * Setter for blanketOrderReference.
         * @param  blanketOrderReference  BlanketOrderReference3 value for blanketOrderReference.
         * @return Builder
         */
        public Builder blanketOrderReference(BlanketOrderReference3 blanketOrderReference) {
            this.blanketOrderReference = blanketOrderReference;
            return this;
        }

        /**
         * Setter for buyerOrderReference.
         * @param  buyerOrderReference  BuyerOrderReference1 value for buyerOrderReference.
         * @return Builder
         */
        public Builder buyerOrderReference(BuyerOrderReference1 buyerOrderReference) {
            this.buyerOrderReference = buyerOrderReference;
            return this;
        }

        /**
         * Setter for deliveryListReference.
         * @param  deliveryListReference  DeliveryListReference1 value for deliveryListReference.
         * @return Builder
         */
        public Builder deliveryListReference(DeliveryListReference1 deliveryListReference) {
            this.deliveryListReference = deliveryListReference;
            return this;
        }

        /**
         * Setter for sellerReference.
         * @param  sellerReference  SellerReference1 value for sellerReference.
         * @return Builder
         */
        public Builder sellerReference(SellerReference1 sellerReference) {
            this.sellerReference = sellerReference;
            return this;
        }

        /**
         * Setter for returnDeliveryNoticeReference.
         * @param  returnDeliveryNoticeReference  ReturnDeliveryNoticeReference1 value for
         *         returnDeliveryNoticeReference.
         * @return Builder
         */
        public Builder returnDeliveryNoticeReference(
                ReturnDeliveryNoticeReference1 returnDeliveryNoticeReference) {
            this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
            return this;
        }

        /**
         * Setter for returnSalesOrderNoteReference.
         * @param  returnSalesOrderNoteReference  ReturnSalesOrderNoteReference value for
         *         returnSalesOrderNoteReference.
         * @return Builder
         */
        public Builder returnSalesOrderNoteReference(
                ReturnSalesOrderNoteReference returnSalesOrderNoteReference) {
            this.returnSalesOrderNoteReference = returnSalesOrderNoteReference;
            return this;
        }

        /**
         * Setter for supplierClaimNumber.
         * @param  supplierClaimNumber  SupplierClaimNumber value for supplierClaimNumber.
         * @return Builder
         */
        public Builder supplierClaimNumber(SupplierClaimNumber supplierClaimNumber) {
            this.supplierClaimNumber = supplierClaimNumber;
            return this;
        }

        /**
         * Setter for customerClaimNumber.
         * @param  customerClaimNumber  CustomerClaimNumber value for customerClaimNumber.
         * @return Builder
         */
        public Builder customerClaimNumber(CustomerClaimNumber customerClaimNumber) {
            this.customerClaimNumber = customerClaimNumber;
            return this;
        }

        /**
         * Setter for warrantyNumber.
         * @param  warrantyNumber  WarrantyNumber value for warrantyNumber.
         * @return Builder
         */
        public Builder warrantyNumber(WarrantyNumber warrantyNumber) {
            this.warrantyNumber = warrantyNumber;
            return this;
        }

        /**
         * Setter for customsDeclarationNumber.
         * @param  customsDeclarationNumber  List of CustomsDeclarationNumber value for
         *         customsDeclarationNumber.
         * @return Builder
         */
        public Builder customsDeclarationNumber(
                List<CustomsDeclarationNumber> customsDeclarationNumber) {
            this.customsDeclarationNumber = customsDeclarationNumber;
            return this;
        }

        /**
         * Setter for fleetReference.
         * @param  fleetReference  List of FleetReference value for fleetReference.
         * @return Builder
         */
        public Builder fleetReference(List<FleetReference> fleetReference) {
            this.fleetReference = fleetReference;
            return this;
        }

        /**
         * Builds a new {@link References5} object using the set fields.
         * @return {@link References5}
         */
        public References5 build() {
            return new References5(customerReference, deliveryNoteReference,
                    suppliersOrderReference, associatedInvoiceReference, blanketOrderReference,
                    buyerOrderReference, deliveryListReference, sellerReference,
                    returnDeliveryNoticeReference, returnSalesOrderNoteReference,
                    supplierClaimNumber, customerClaimNumber, warrantyNumber,
                    customsDeclarationNumber, fleetReference);
        }
    }
}
