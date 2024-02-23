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
 * This is a model class for References4 type.
 */
public class References4 {
    private CustomerReference customerReference;
    private DeliveryNoteReference deliveryNoteReference;
    private SuppliersOrderReference suppliersOrderReference;
    private AssociatedInvoiceReference associatedInvoiceReference;
    private AssociatedExternalnvoiceReference associatedExternalnvoiceReference;
    private ExternalnvoiceReference externalnvoiceReference;
    private BlanketOrderReference2 blanketOrderReference;
    private BuyerOrderReference buyerOrderReference;
    private DeliveryListReference deliveryListReference;
    private SellerReference sellerReference;
    private ReturnDeliveryNoticeReference returnDeliveryNoticeReference;
    private SEPACreditorReference sEPACreditorReference;
    private SupplierClaimNumber supplierClaimNumber;
    private CustomerClaimNumber customerClaimNumber;
    private WarrantyNumber warrantyNumber;
    private List<FleetReference> fleetReference;

    /**
     * Default constructor.
     */
    public References4() {
    }

    /**
     * Initialization constructor.
     * @param  customerReference  CustomerReference value for customerReference.
     * @param  deliveryNoteReference  DeliveryNoteReference value for deliveryNoteReference.
     * @param  suppliersOrderReference  SuppliersOrderReference value for suppliersOrderReference.
     * @param  associatedInvoiceReference  AssociatedInvoiceReference value for
     *         associatedInvoiceReference.
     * @param  associatedExternalnvoiceReference  AssociatedExternalnvoiceReference value for
     *         associatedExternalnvoiceReference.
     * @param  externalnvoiceReference  ExternalnvoiceReference value for externalnvoiceReference.
     * @param  blanketOrderReference  BlanketOrderReference2 value for blanketOrderReference.
     * @param  buyerOrderReference  BuyerOrderReference value for buyerOrderReference.
     * @param  deliveryListReference  DeliveryListReference value for deliveryListReference.
     * @param  sellerReference  SellerReference value for sellerReference.
     * @param  returnDeliveryNoticeReference  ReturnDeliveryNoticeReference value for
     *         returnDeliveryNoticeReference.
     * @param  sEPACreditorReference  SEPACreditorReference value for sEPACreditorReference.
     * @param  supplierClaimNumber  SupplierClaimNumber value for supplierClaimNumber.
     * @param  customerClaimNumber  CustomerClaimNumber value for customerClaimNumber.
     * @param  warrantyNumber  WarrantyNumber value for warrantyNumber.
     * @param  fleetReference  List of FleetReference value for fleetReference.
     */
    public References4(
            CustomerReference customerReference,
            DeliveryNoteReference deliveryNoteReference,
            SuppliersOrderReference suppliersOrderReference,
            AssociatedInvoiceReference associatedInvoiceReference,
            AssociatedExternalnvoiceReference associatedExternalnvoiceReference,
            ExternalnvoiceReference externalnvoiceReference,
            BlanketOrderReference2 blanketOrderReference,
            BuyerOrderReference buyerOrderReference,
            DeliveryListReference deliveryListReference,
            SellerReference sellerReference,
            ReturnDeliveryNoticeReference returnDeliveryNoticeReference,
            SEPACreditorReference sEPACreditorReference,
            SupplierClaimNumber supplierClaimNumber,
            CustomerClaimNumber customerClaimNumber,
            WarrantyNumber warrantyNumber,
            List<FleetReference> fleetReference) {
        this.customerReference = customerReference;
        this.deliveryNoteReference = deliveryNoteReference;
        this.suppliersOrderReference = suppliersOrderReference;
        this.associatedInvoiceReference = associatedInvoiceReference;
        this.associatedExternalnvoiceReference = associatedExternalnvoiceReference;
        this.externalnvoiceReference = externalnvoiceReference;
        this.blanketOrderReference = blanketOrderReference;
        this.buyerOrderReference = buyerOrderReference;
        this.deliveryListReference = deliveryListReference;
        this.sellerReference = sellerReference;
        this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
        this.sEPACreditorReference = sEPACreditorReference;
        this.supplierClaimNumber = supplierClaimNumber;
        this.customerClaimNumber = customerClaimNumber;
        this.warrantyNumber = warrantyNumber;
        this.fleetReference = fleetReference;
    }

    /**
     * Getter for CustomerReference.
     * @return Returns the CustomerReference
     */
    @JsonGetter("CustomerReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerReference getCustomerReference() {
        return customerReference;
    }

    /**
     * Setter for CustomerReference.
     * @param customerReference Value for CustomerReference
     */
    @JsonSetter("CustomerReference")
    public void setCustomerReference(CustomerReference customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Getter for DeliveryNoteReference.
     * @return Returns the DeliveryNoteReference
     */
    @JsonGetter("DeliveryNoteReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeliveryNoteReference getDeliveryNoteReference() {
        return deliveryNoteReference;
    }

    /**
     * Setter for DeliveryNoteReference.
     * @param deliveryNoteReference Value for DeliveryNoteReference
     */
    @JsonSetter("DeliveryNoteReference")
    public void setDeliveryNoteReference(DeliveryNoteReference deliveryNoteReference) {
        this.deliveryNoteReference = deliveryNoteReference;
    }

    /**
     * Getter for SuppliersOrderReference.
     * @return Returns the SuppliersOrderReference
     */
    @JsonGetter("SuppliersOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SuppliersOrderReference getSuppliersOrderReference() {
        return suppliersOrderReference;
    }

    /**
     * Setter for SuppliersOrderReference.
     * @param suppliersOrderReference Value for SuppliersOrderReference
     */
    @JsonSetter("SuppliersOrderReference")
    public void setSuppliersOrderReference(SuppliersOrderReference suppliersOrderReference) {
        this.suppliersOrderReference = suppliersOrderReference;
    }

    /**
     * Getter for AssociatedInvoiceReference.
     * @return Returns the AssociatedInvoiceReference
     */
    @JsonGetter("AssociatedInvoiceReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AssociatedInvoiceReference getAssociatedInvoiceReference() {
        return associatedInvoiceReference;
    }

    /**
     * Setter for AssociatedInvoiceReference.
     * @param associatedInvoiceReference Value for AssociatedInvoiceReference
     */
    @JsonSetter("AssociatedInvoiceReference")
    public void setAssociatedInvoiceReference(AssociatedInvoiceReference associatedInvoiceReference) {
        this.associatedInvoiceReference = associatedInvoiceReference;
    }

    /**
     * Getter for AssociatedExternalnvoiceReference.
     * @return Returns the AssociatedExternalnvoiceReference
     */
    @JsonGetter("AssociatedExternalnvoiceReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AssociatedExternalnvoiceReference getAssociatedExternalnvoiceReference() {
        return associatedExternalnvoiceReference;
    }

    /**
     * Setter for AssociatedExternalnvoiceReference.
     * @param associatedExternalnvoiceReference Value for AssociatedExternalnvoiceReference
     */
    @JsonSetter("AssociatedExternalnvoiceReference")
    public void setAssociatedExternalnvoiceReference(AssociatedExternalnvoiceReference associatedExternalnvoiceReference) {
        this.associatedExternalnvoiceReference = associatedExternalnvoiceReference;
    }

    /**
     * Getter for ExternalnvoiceReference.
     * @return Returns the ExternalnvoiceReference
     */
    @JsonGetter("ExternalnvoiceReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExternalnvoiceReference getExternalnvoiceReference() {
        return externalnvoiceReference;
    }

    /**
     * Setter for ExternalnvoiceReference.
     * @param externalnvoiceReference Value for ExternalnvoiceReference
     */
    @JsonSetter("ExternalnvoiceReference")
    public void setExternalnvoiceReference(ExternalnvoiceReference externalnvoiceReference) {
        this.externalnvoiceReference = externalnvoiceReference;
    }

    /**
     * Getter for BlanketOrderReference.
     * @return Returns the BlanketOrderReference2
     */
    @JsonGetter("BlanketOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlanketOrderReference2 getBlanketOrderReference() {
        return blanketOrderReference;
    }

    /**
     * Setter for BlanketOrderReference.
     * @param blanketOrderReference Value for BlanketOrderReference2
     */
    @JsonSetter("BlanketOrderReference")
    public void setBlanketOrderReference(BlanketOrderReference2 blanketOrderReference) {
        this.blanketOrderReference = blanketOrderReference;
    }

    /**
     * Getter for BuyerOrderReference.
     * @return Returns the BuyerOrderReference
     */
    @JsonGetter("BuyerOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BuyerOrderReference getBuyerOrderReference() {
        return buyerOrderReference;
    }

    /**
     * Setter for BuyerOrderReference.
     * @param buyerOrderReference Value for BuyerOrderReference
     */
    @JsonSetter("BuyerOrderReference")
    public void setBuyerOrderReference(BuyerOrderReference buyerOrderReference) {
        this.buyerOrderReference = buyerOrderReference;
    }

    /**
     * Getter for DeliveryListReference.
     * @return Returns the DeliveryListReference
     */
    @JsonGetter("DeliveryListReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DeliveryListReference getDeliveryListReference() {
        return deliveryListReference;
    }

    /**
     * Setter for DeliveryListReference.
     * @param deliveryListReference Value for DeliveryListReference
     */
    @JsonSetter("DeliveryListReference")
    public void setDeliveryListReference(DeliveryListReference deliveryListReference) {
        this.deliveryListReference = deliveryListReference;
    }

    /**
     * Getter for SellerReference.
     * @return Returns the SellerReference
     */
    @JsonGetter("SellerReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerReference getSellerReference() {
        return sellerReference;
    }

    /**
     * Setter for SellerReference.
     * @param sellerReference Value for SellerReference
     */
    @JsonSetter("SellerReference")
    public void setSellerReference(SellerReference sellerReference) {
        this.sellerReference = sellerReference;
    }

    /**
     * Getter for ReturnDeliveryNoticeReference.
     * @return Returns the ReturnDeliveryNoticeReference
     */
    @JsonGetter("ReturnDeliveryNoticeReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReturnDeliveryNoticeReference getReturnDeliveryNoticeReference() {
        return returnDeliveryNoticeReference;
    }

    /**
     * Setter for ReturnDeliveryNoticeReference.
     * @param returnDeliveryNoticeReference Value for ReturnDeliveryNoticeReference
     */
    @JsonSetter("ReturnDeliveryNoticeReference")
    public void setReturnDeliveryNoticeReference(ReturnDeliveryNoticeReference returnDeliveryNoticeReference) {
        this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
    }

    /**
     * Getter for SEPACreditorReference.
     * @return Returns the SEPACreditorReference
     */
    @JsonGetter("SEPACreditorReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SEPACreditorReference getSEPACreditorReference() {
        return sEPACreditorReference;
    }

    /**
     * Setter for SEPACreditorReference.
     * @param sEPACreditorReference Value for SEPACreditorReference
     */
    @JsonSetter("SEPACreditorReference")
    public void setSEPACreditorReference(SEPACreditorReference sEPACreditorReference) {
        this.sEPACreditorReference = sEPACreditorReference;
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
     * Converts this References4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "References4 [" + "customerReference=" + customerReference
                + ", deliveryNoteReference=" + deliveryNoteReference + ", suppliersOrderReference="
                + suppliersOrderReference + ", associatedInvoiceReference="
                + associatedInvoiceReference + ", associatedExternalnvoiceReference="
                + associatedExternalnvoiceReference + ", externalnvoiceReference="
                + externalnvoiceReference + ", blanketOrderReference=" + blanketOrderReference
                + ", buyerOrderReference=" + buyerOrderReference + ", deliveryListReference="
                + deliveryListReference + ", sellerReference=" + sellerReference
                + ", returnDeliveryNoticeReference=" + returnDeliveryNoticeReference
                + ", sEPACreditorReference=" + sEPACreditorReference + ", supplierClaimNumber="
                + supplierClaimNumber + ", customerClaimNumber=" + customerClaimNumber
                + ", warrantyNumber=" + warrantyNumber + ", fleetReference=" + fleetReference + "]";
    }

    /**
     * Builds a new {@link References4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link References4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerReference(getCustomerReference())
                .deliveryNoteReference(getDeliveryNoteReference())
                .suppliersOrderReference(getSuppliersOrderReference())
                .associatedInvoiceReference(getAssociatedInvoiceReference())
                .associatedExternalnvoiceReference(getAssociatedExternalnvoiceReference())
                .externalnvoiceReference(getExternalnvoiceReference())
                .blanketOrderReference(getBlanketOrderReference())
                .buyerOrderReference(getBuyerOrderReference())
                .deliveryListReference(getDeliveryListReference())
                .sellerReference(getSellerReference())
                .returnDeliveryNoticeReference(getReturnDeliveryNoticeReference())
                .sEPACreditorReference(getSEPACreditorReference())
                .supplierClaimNumber(getSupplierClaimNumber())
                .customerClaimNumber(getCustomerClaimNumber())
                .warrantyNumber(getWarrantyNumber())
                .fleetReference(getFleetReference());
        return builder;
    }

    /**
     * Class to build instances of {@link References4}.
     */
    public static class Builder {
        private CustomerReference customerReference;
        private DeliveryNoteReference deliveryNoteReference;
        private SuppliersOrderReference suppliersOrderReference;
        private AssociatedInvoiceReference associatedInvoiceReference;
        private AssociatedExternalnvoiceReference associatedExternalnvoiceReference;
        private ExternalnvoiceReference externalnvoiceReference;
        private BlanketOrderReference2 blanketOrderReference;
        private BuyerOrderReference buyerOrderReference;
        private DeliveryListReference deliveryListReference;
        private SellerReference sellerReference;
        private ReturnDeliveryNoticeReference returnDeliveryNoticeReference;
        private SEPACreditorReference sEPACreditorReference;
        private SupplierClaimNumber supplierClaimNumber;
        private CustomerClaimNumber customerClaimNumber;
        private WarrantyNumber warrantyNumber;
        private List<FleetReference> fleetReference;



        /**
         * Setter for customerReference.
         * @param  customerReference  CustomerReference value for customerReference.
         * @return Builder
         */
        public Builder customerReference(CustomerReference customerReference) {
            this.customerReference = customerReference;
            return this;
        }

        /**
         * Setter for deliveryNoteReference.
         * @param  deliveryNoteReference  DeliveryNoteReference value for deliveryNoteReference.
         * @return Builder
         */
        public Builder deliveryNoteReference(DeliveryNoteReference deliveryNoteReference) {
            this.deliveryNoteReference = deliveryNoteReference;
            return this;
        }

        /**
         * Setter for suppliersOrderReference.
         * @param  suppliersOrderReference  SuppliersOrderReference value for
         *         suppliersOrderReference.
         * @return Builder
         */
        public Builder suppliersOrderReference(SuppliersOrderReference suppliersOrderReference) {
            this.suppliersOrderReference = suppliersOrderReference;
            return this;
        }

        /**
         * Setter for associatedInvoiceReference.
         * @param  associatedInvoiceReference  AssociatedInvoiceReference value for
         *         associatedInvoiceReference.
         * @return Builder
         */
        public Builder associatedInvoiceReference(
                AssociatedInvoiceReference associatedInvoiceReference) {
            this.associatedInvoiceReference = associatedInvoiceReference;
            return this;
        }

        /**
         * Setter for associatedExternalnvoiceReference.
         * @param  associatedExternalnvoiceReference  AssociatedExternalnvoiceReference value for
         *         associatedExternalnvoiceReference.
         * @return Builder
         */
        public Builder associatedExternalnvoiceReference(
                AssociatedExternalnvoiceReference associatedExternalnvoiceReference) {
            this.associatedExternalnvoiceReference = associatedExternalnvoiceReference;
            return this;
        }

        /**
         * Setter for externalnvoiceReference.
         * @param  externalnvoiceReference  ExternalnvoiceReference value for
         *         externalnvoiceReference.
         * @return Builder
         */
        public Builder externalnvoiceReference(ExternalnvoiceReference externalnvoiceReference) {
            this.externalnvoiceReference = externalnvoiceReference;
            return this;
        }

        /**
         * Setter for blanketOrderReference.
         * @param  blanketOrderReference  BlanketOrderReference2 value for blanketOrderReference.
         * @return Builder
         */
        public Builder blanketOrderReference(BlanketOrderReference2 blanketOrderReference) {
            this.blanketOrderReference = blanketOrderReference;
            return this;
        }

        /**
         * Setter for buyerOrderReference.
         * @param  buyerOrderReference  BuyerOrderReference value for buyerOrderReference.
         * @return Builder
         */
        public Builder buyerOrderReference(BuyerOrderReference buyerOrderReference) {
            this.buyerOrderReference = buyerOrderReference;
            return this;
        }

        /**
         * Setter for deliveryListReference.
         * @param  deliveryListReference  DeliveryListReference value for deliveryListReference.
         * @return Builder
         */
        public Builder deliveryListReference(DeliveryListReference deliveryListReference) {
            this.deliveryListReference = deliveryListReference;
            return this;
        }

        /**
         * Setter for sellerReference.
         * @param  sellerReference  SellerReference value for sellerReference.
         * @return Builder
         */
        public Builder sellerReference(SellerReference sellerReference) {
            this.sellerReference = sellerReference;
            return this;
        }

        /**
         * Setter for returnDeliveryNoticeReference.
         * @param  returnDeliveryNoticeReference  ReturnDeliveryNoticeReference value for
         *         returnDeliveryNoticeReference.
         * @return Builder
         */
        public Builder returnDeliveryNoticeReference(
                ReturnDeliveryNoticeReference returnDeliveryNoticeReference) {
            this.returnDeliveryNoticeReference = returnDeliveryNoticeReference;
            return this;
        }

        /**
         * Setter for sEPACreditorReference.
         * @param  sEPACreditorReference  SEPACreditorReference value for sEPACreditorReference.
         * @return Builder
         */
        public Builder sEPACreditorReference(SEPACreditorReference sEPACreditorReference) {
            this.sEPACreditorReference = sEPACreditorReference;
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
         * Setter for fleetReference.
         * @param  fleetReference  List of FleetReference value for fleetReference.
         * @return Builder
         */
        public Builder fleetReference(List<FleetReference> fleetReference) {
            this.fleetReference = fleetReference;
            return this;
        }

        /**
         * Builds a new {@link References4} object using the set fields.
         * @return {@link References4}
         */
        public References4 build() {
            return new References4(customerReference, deliveryNoteReference,
                    suppliersOrderReference, associatedInvoiceReference,
                    associatedExternalnvoiceReference, externalnvoiceReference,
                    blanketOrderReference, buyerOrderReference, deliveryListReference,
                    sellerReference, returnDeliveryNoticeReference, sEPACreditorReference,
                    supplierClaimNumber, customerClaimNumber, warrantyNumber, fleetReference);
        }
    }
}
