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
 * This is a model class for EDIWheelC11OrderCreationRequest type.
 */
public class EDIWheelC11OrderCreationRequest {
    private String documentID;
    private String variant;
    private String earliestDeliveryDate;
    private String transportPriority;
    private String campaign;
    private String pickUp;
    private String deliveryOption;
    private String deliveryRemarks;
    private BlanketOrderReference blanketOrderReference;
    private CustomerReference customerReference;
    private SellerParty2 sellerParty;
    private SupplierParty2 supplierParty;
    private BuyerParty2 buyerParty;
    private OrderingParty orderingParty;
    private Consignee2 consignee;
    private Contract contract;
    private PaymentTerms paymentTerms;
    private List<OrderLine> orderLine;

    /**
     * Default constructor.
     */
    public EDIWheelC11OrderCreationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  customerReference  CustomerReference value for customerReference.
     * @param  buyerParty  BuyerParty2 value for buyerParty.
     * @param  variant  String value for variant.
     * @param  earliestDeliveryDate  String value for earliestDeliveryDate.
     * @param  transportPriority  String value for transportPriority.
     * @param  campaign  String value for campaign.
     * @param  pickUp  String value for pickUp.
     * @param  deliveryOption  String value for deliveryOption.
     * @param  deliveryRemarks  String value for deliveryRemarks.
     * @param  blanketOrderReference  BlanketOrderReference value for blanketOrderReference.
     * @param  sellerParty  SellerParty2 value for sellerParty.
     * @param  supplierParty  SupplierParty2 value for supplierParty.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  consignee  Consignee2 value for consignee.
     * @param  contract  Contract value for contract.
     * @param  paymentTerms  PaymentTerms value for paymentTerms.
     * @param  orderLine  List of OrderLine value for orderLine.
     */
    public EDIWheelC11OrderCreationRequest(
            String documentID,
            CustomerReference customerReference,
            BuyerParty2 buyerParty,
            String variant,
            String earliestDeliveryDate,
            String transportPriority,
            String campaign,
            String pickUp,
            String deliveryOption,
            String deliveryRemarks,
            BlanketOrderReference blanketOrderReference,
            SellerParty2 sellerParty,
            SupplierParty2 supplierParty,
            OrderingParty orderingParty,
            Consignee2 consignee,
            Contract contract,
            PaymentTerms paymentTerms,
            List<OrderLine> orderLine) {
        this.documentID = documentID;
        this.variant = variant;
        this.earliestDeliveryDate = earliestDeliveryDate;
        this.transportPriority = transportPriority;
        this.campaign = campaign;
        this.pickUp = pickUp;
        this.deliveryOption = deliveryOption;
        this.deliveryRemarks = deliveryRemarks;
        this.blanketOrderReference = blanketOrderReference;
        this.customerReference = customerReference;
        this.sellerParty = sellerParty;
        this.supplierParty = supplierParty;
        this.buyerParty = buyerParty;
        this.orderingParty = orderingParty;
        this.consignee = consignee;
        this.contract = contract;
        this.paymentTerms = paymentTerms;
        this.orderLine = orderLine;
    }

    /**
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("DocumentID")
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Setter for DocumentID.
     * @param documentID Value for String
     */
    @JsonSetter("DocumentID")
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /**
     * Getter for Variant.
     * @return Returns the String
     */
    @JsonGetter("Variant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVariant() {
        return variant;
    }

    /**
     * Setter for Variant.
     * @param variant Value for String
     */
    @JsonSetter("Variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Getter for EarliestDeliveryDate.
     * @return Returns the String
     */
    @JsonGetter("EarliestDeliveryDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    /**
     * Setter for EarliestDeliveryDate.
     * @param earliestDeliveryDate Value for String
     */
    @JsonSetter("EarliestDeliveryDate")
    public void setEarliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    /**
     * Getter for TransportPriority.
     * @return Returns the String
     */
    @JsonGetter("TransportPriority")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransportPriority() {
        return transportPriority;
    }

    /**
     * Setter for TransportPriority.
     * @param transportPriority Value for String
     */
    @JsonSetter("TransportPriority")
    public void setTransportPriority(String transportPriority) {
        this.transportPriority = transportPriority;
    }

    /**
     * Getter for Campaign.
     * @return Returns the String
     */
    @JsonGetter("Campaign")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCampaign() {
        return campaign;
    }

    /**
     * Setter for Campaign.
     * @param campaign Value for String
     */
    @JsonSetter("Campaign")
    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    /**
     * Getter for PickUp.
     * @return Returns the String
     */
    @JsonGetter("PickUp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPickUp() {
        return pickUp;
    }

    /**
     * Setter for PickUp.
     * @param pickUp Value for String
     */
    @JsonSetter("PickUp")
    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    /**
     * Getter for DeliveryOption.
     * @return Returns the String
     */
    @JsonGetter("DeliveryOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Setter for DeliveryOption.
     * @param deliveryOption Value for String
     */
    @JsonSetter("DeliveryOption")
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    /**
     * Getter for DeliveryRemarks.
     * @return Returns the String
     */
    @JsonGetter("DeliveryRemarks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveryRemarks() {
        return deliveryRemarks;
    }

    /**
     * Setter for DeliveryRemarks.
     * @param deliveryRemarks Value for String
     */
    @JsonSetter("DeliveryRemarks")
    public void setDeliveryRemarks(String deliveryRemarks) {
        this.deliveryRemarks = deliveryRemarks;
    }

    /**
     * Getter for BlanketOrderReference.
     * @return Returns the BlanketOrderReference
     */
    @JsonGetter("BlanketOrderReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlanketOrderReference getBlanketOrderReference() {
        return blanketOrderReference;
    }

    /**
     * Setter for BlanketOrderReference.
     * @param blanketOrderReference Value for BlanketOrderReference
     */
    @JsonSetter("BlanketOrderReference")
    public void setBlanketOrderReference(BlanketOrderReference blanketOrderReference) {
        this.blanketOrderReference = blanketOrderReference;
    }

    /**
     * Getter for CustomerReference.
     * @return Returns the CustomerReference
     */
    @JsonGetter("CustomerReference")
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
     * Getter for SellerParty.
     * @return Returns the SellerParty2
     */
    @JsonGetter("SellerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerParty2 getSellerParty() {
        return sellerParty;
    }

    /**
     * Setter for SellerParty.
     * @param sellerParty Value for SellerParty2
     */
    @JsonSetter("SellerParty")
    public void setSellerParty(SellerParty2 sellerParty) {
        this.sellerParty = sellerParty;
    }

    /**
     * Getter for SupplierParty.
     * @return Returns the SupplierParty2
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty2 getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty2
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty2 supplierParty) {
        this.supplierParty = supplierParty;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty2
     */
    @JsonGetter("BuyerParty")
    public BuyerParty2 getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty2
     */
    @JsonSetter("BuyerParty")
    public void setBuyerParty(BuyerParty2 buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Getter for OrderingParty.
     * @return Returns the OrderingParty
     */
    @JsonGetter("OrderingParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderingParty getOrderingParty() {
        return orderingParty;
    }

    /**
     * Setter for OrderingParty.
     * @param orderingParty Value for OrderingParty
     */
    @JsonSetter("OrderingParty")
    public void setOrderingParty(OrderingParty orderingParty) {
        this.orderingParty = orderingParty;
    }

    /**
     * Getter for Consignee.
     * @return Returns the Consignee2
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee2 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee2
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee2 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for Contract.
     * @return Returns the Contract
     */
    @JsonGetter("Contract")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Contract getContract() {
        return contract;
    }

    /**
     * Setter for Contract.
     * @param contract Value for Contract
     */
    @JsonSetter("Contract")
    public void setContract(Contract contract) {
        this.contract = contract;
    }

    /**
     * Getter for PaymentTerms.
     * @return Returns the PaymentTerms
     */
    @JsonGetter("PaymentTerms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Setter for PaymentTerms.
     * @param paymentTerms Value for PaymentTerms
     */
    @JsonSetter("PaymentTerms")
    public void setPaymentTerms(PaymentTerms paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * Getter for OrderLine.
     * @return Returns the List of OrderLine
     */
    @JsonGetter("OrderLine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderLine> getOrderLine() {
        return orderLine;
    }

    /**
     * Setter for OrderLine.
     * @param orderLine Value for List of OrderLine
     */
    @JsonSetter("OrderLine")
    public void setOrderLine(List<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

    /**
     * Converts this EDIWheelC11OrderCreationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC11OrderCreationRequest [" + "documentID=" + documentID
                + ", customerReference=" + customerReference + ", buyerParty=" + buyerParty
                + ", variant=" + variant + ", earliestDeliveryDate=" + earliestDeliveryDate
                + ", transportPriority=" + transportPriority + ", campaign=" + campaign
                + ", pickUp=" + pickUp + ", deliveryOption=" + deliveryOption + ", deliveryRemarks="
                + deliveryRemarks + ", blanketOrderReference=" + blanketOrderReference
                + ", sellerParty=" + sellerParty + ", supplierParty=" + supplierParty
                + ", orderingParty=" + orderingParty + ", consignee=" + consignee + ", contract="
                + contract + ", paymentTerms=" + paymentTerms + ", orderLine=" + orderLine + "]";
    }

    /**
     * Builds a new {@link EDIWheelC11OrderCreationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC11OrderCreationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, customerReference, buyerParty)
                .variant(getVariant())
                .earliestDeliveryDate(getEarliestDeliveryDate())
                .transportPriority(getTransportPriority())
                .campaign(getCampaign())
                .pickUp(getPickUp())
                .deliveryOption(getDeliveryOption())
                .deliveryRemarks(getDeliveryRemarks())
                .blanketOrderReference(getBlanketOrderReference())
                .sellerParty(getSellerParty())
                .supplierParty(getSupplierParty())
                .orderingParty(getOrderingParty())
                .consignee(getConsignee())
                .contract(getContract())
                .paymentTerms(getPaymentTerms())
                .orderLine(getOrderLine());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC11OrderCreationRequest}.
     */
    public static class Builder {
        private String documentID;
        private CustomerReference customerReference;
        private BuyerParty2 buyerParty;
        private String variant;
        private String earliestDeliveryDate;
        private String transportPriority;
        private String campaign;
        private String pickUp;
        private String deliveryOption;
        private String deliveryRemarks;
        private BlanketOrderReference blanketOrderReference;
        private SellerParty2 sellerParty;
        private SupplierParty2 supplierParty;
        private OrderingParty orderingParty;
        private Consignee2 consignee;
        private Contract contract;
        private PaymentTerms paymentTerms;
        private List<OrderLine> orderLine;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  customerReference  CustomerReference value for customerReference.
         * @param  buyerParty  BuyerParty2 value for buyerParty.
         */
        public Builder(String documentID, CustomerReference customerReference,
                BuyerParty2 buyerParty) {
            this.documentID = documentID;
            this.customerReference = customerReference;
            this.buyerParty = buyerParty;
        }

        /**
         * Setter for documentID.
         * @param  documentID  String value for documentID.
         * @return Builder
         */
        public Builder documentID(String documentID) {
            this.documentID = documentID;
            return this;
        }

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
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty2 value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty2 buyerParty) {
            this.buyerParty = buyerParty;
            return this;
        }

        /**
         * Setter for variant.
         * @param  variant  String value for variant.
         * @return Builder
         */
        public Builder variant(String variant) {
            this.variant = variant;
            return this;
        }

        /**
         * Setter for earliestDeliveryDate.
         * @param  earliestDeliveryDate  String value for earliestDeliveryDate.
         * @return Builder
         */
        public Builder earliestDeliveryDate(String earliestDeliveryDate) {
            this.earliestDeliveryDate = earliestDeliveryDate;
            return this;
        }

        /**
         * Setter for transportPriority.
         * @param  transportPriority  String value for transportPriority.
         * @return Builder
         */
        public Builder transportPriority(String transportPriority) {
            this.transportPriority = transportPriority;
            return this;
        }

        /**
         * Setter for campaign.
         * @param  campaign  String value for campaign.
         * @return Builder
         */
        public Builder campaign(String campaign) {
            this.campaign = campaign;
            return this;
        }

        /**
         * Setter for pickUp.
         * @param  pickUp  String value for pickUp.
         * @return Builder
         */
        public Builder pickUp(String pickUp) {
            this.pickUp = pickUp;
            return this;
        }

        /**
         * Setter for deliveryOption.
         * @param  deliveryOption  String value for deliveryOption.
         * @return Builder
         */
        public Builder deliveryOption(String deliveryOption) {
            this.deliveryOption = deliveryOption;
            return this;
        }

        /**
         * Setter for deliveryRemarks.
         * @param  deliveryRemarks  String value for deliveryRemarks.
         * @return Builder
         */
        public Builder deliveryRemarks(String deliveryRemarks) {
            this.deliveryRemarks = deliveryRemarks;
            return this;
        }

        /**
         * Setter for blanketOrderReference.
         * @param  blanketOrderReference  BlanketOrderReference value for blanketOrderReference.
         * @return Builder
         */
        public Builder blanketOrderReference(BlanketOrderReference blanketOrderReference) {
            this.blanketOrderReference = blanketOrderReference;
            return this;
        }

        /**
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty2 value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty2 sellerParty) {
            this.sellerParty = sellerParty;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty2 value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty2 supplierParty) {
            this.supplierParty = supplierParty;
            return this;
        }

        /**
         * Setter for orderingParty.
         * @param  orderingParty  OrderingParty value for orderingParty.
         * @return Builder
         */
        public Builder orderingParty(OrderingParty orderingParty) {
            this.orderingParty = orderingParty;
            return this;
        }

        /**
         * Setter for consignee.
         * @param  consignee  Consignee2 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee2 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for contract.
         * @param  contract  Contract value for contract.
         * @return Builder
         */
        public Builder contract(Contract contract) {
            this.contract = contract;
            return this;
        }

        /**
         * Setter for paymentTerms.
         * @param  paymentTerms  PaymentTerms value for paymentTerms.
         * @return Builder
         */
        public Builder paymentTerms(PaymentTerms paymentTerms) {
            this.paymentTerms = paymentTerms;
            return this;
        }

        /**
         * Setter for orderLine.
         * @param  orderLine  List of OrderLine value for orderLine.
         * @return Builder
         */
        public Builder orderLine(List<OrderLine> orderLine) {
            this.orderLine = orderLine;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC11OrderCreationRequest} object using the set fields.
         * @return {@link EDIWheelC11OrderCreationRequest}
         */
        public EDIWheelC11OrderCreationRequest build() {
            return new EDIWheelC11OrderCreationRequest(documentID, customerReference, buyerParty,
                    variant, earliestDeliveryDate, transportPriority, campaign, pickUp,
                    deliveryOption, deliveryRemarks, blanketOrderReference, sellerParty,
                    supplierParty, orderingParty, consignee, contract, paymentTerms, orderLine);
        }
    }
}
