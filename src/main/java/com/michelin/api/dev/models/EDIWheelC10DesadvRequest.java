/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EDIWheelC10DesadvRequest type.
 */
public class EDIWheelC10DesadvRequest {
    private String documentID;
    private String variant;
    private String despatchFromDate;
    private String despatchToDate;
    private References references;
    private SellerParty sellerParty;
    private SupplierParty supplierParty;
    private BuyerParty buyerParty;
    private OrderingParty orderingParty;
    private Consignee consignee;
    private OrderedArticle orderedArticle;

    /**
     * Default constructor.
     */
    public EDIWheelC10DesadvRequest() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  buyerParty  BuyerParty value for buyerParty.
     * @param  variant  String value for variant.
     * @param  despatchFromDate  String value for despatchFromDate.
     * @param  despatchToDate  String value for despatchToDate.
     * @param  references  References value for references.
     * @param  sellerParty  SellerParty value for sellerParty.
     * @param  supplierParty  SupplierParty value for supplierParty.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  consignee  Consignee value for consignee.
     * @param  orderedArticle  OrderedArticle value for orderedArticle.
     */
    public EDIWheelC10DesadvRequest(
            String documentID,
            BuyerParty buyerParty,
            String variant,
            String despatchFromDate,
            String despatchToDate,
            References references,
            SellerParty sellerParty,
            SupplierParty supplierParty,
            OrderingParty orderingParty,
            Consignee consignee,
            OrderedArticle orderedArticle) {
        this.documentID = documentID;
        this.variant = variant;
        this.despatchFromDate = despatchFromDate;
        this.despatchToDate = despatchToDate;
        this.references = references;
        this.sellerParty = sellerParty;
        this.supplierParty = supplierParty;
        this.buyerParty = buyerParty;
        this.orderingParty = orderingParty;
        this.consignee = consignee;
        this.orderedArticle = orderedArticle;
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
     * Getter for DespatchFromDate.
     * @return Returns the String
     */
    @JsonGetter("DespatchFromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDespatchFromDate() {
        return despatchFromDate;
    }

    /**
     * Setter for DespatchFromDate.
     * @param despatchFromDate Value for String
     */
    @JsonSetter("DespatchFromDate")
    public void setDespatchFromDate(String despatchFromDate) {
        this.despatchFromDate = despatchFromDate;
    }

    /**
     * Getter for DespatchToDate.
     * @return Returns the String
     */
    @JsonGetter("DespatchToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDespatchToDate() {
        return despatchToDate;
    }

    /**
     * Setter for DespatchToDate.
     * @param despatchToDate Value for String
     */
    @JsonSetter("DespatchToDate")
    public void setDespatchToDate(String despatchToDate) {
        this.despatchToDate = despatchToDate;
    }

    /**
     * Getter for References.
     * @return Returns the References
     */
    @JsonGetter("References")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public References getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for References
     */
    @JsonSetter("References")
    public void setReferences(References references) {
        this.references = references;
    }

    /**
     * Getter for SellerParty.
     * @return Returns the SellerParty
     */
    @JsonGetter("SellerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerParty getSellerParty() {
        return sellerParty;
    }

    /**
     * Setter for SellerParty.
     * @param sellerParty Value for SellerParty
     */
    @JsonSetter("SellerParty")
    public void setSellerParty(SellerParty sellerParty) {
        this.sellerParty = sellerParty;
    }

    /**
     * Getter for SupplierParty.
     * @return Returns the SupplierParty
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty supplierParty) {
        this.supplierParty = supplierParty;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty
     */
    @JsonGetter("BuyerParty")
    public BuyerParty getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty
     */
    @JsonSetter("BuyerParty")
    public void setBuyerParty(BuyerParty buyerParty) {
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
     * @return Returns the Consignee
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for OrderedArticle.
     * @return Returns the OrderedArticle
     */
    @JsonGetter("OrderedArticle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderedArticle getOrderedArticle() {
        return orderedArticle;
    }

    /**
     * Setter for OrderedArticle.
     * @param orderedArticle Value for OrderedArticle
     */
    @JsonSetter("OrderedArticle")
    public void setOrderedArticle(OrderedArticle orderedArticle) {
        this.orderedArticle = orderedArticle;
    }

    /**
     * Converts this EDIWheelC10DesadvRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC10DesadvRequest [" + "documentID=" + documentID + ", buyerParty="
                + buyerParty + ", variant=" + variant + ", despatchFromDate=" + despatchFromDate
                + ", despatchToDate=" + despatchToDate + ", references=" + references
                + ", sellerParty=" + sellerParty + ", supplierParty=" + supplierParty
                + ", orderingParty=" + orderingParty + ", consignee=" + consignee
                + ", orderedArticle=" + orderedArticle + "]";
    }

    /**
     * Builds a new {@link EDIWheelC10DesadvRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC10DesadvRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, buyerParty)
                .variant(getVariant())
                .despatchFromDate(getDespatchFromDate())
                .despatchToDate(getDespatchToDate())
                .references(getReferences())
                .sellerParty(getSellerParty())
                .supplierParty(getSupplierParty())
                .orderingParty(getOrderingParty())
                .consignee(getConsignee())
                .orderedArticle(getOrderedArticle());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC10DesadvRequest}.
     */
    public static class Builder {
        private String documentID;
        private BuyerParty buyerParty;
        private String variant;
        private String despatchFromDate;
        private String despatchToDate;
        private References references;
        private SellerParty sellerParty;
        private SupplierParty supplierParty;
        private OrderingParty orderingParty;
        private Consignee consignee;
        private OrderedArticle orderedArticle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  buyerParty  BuyerParty value for buyerParty.
         */
        public Builder(String documentID, BuyerParty buyerParty) {
            this.documentID = documentID;
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
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty buyerParty) {
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
         * Setter for despatchFromDate.
         * @param  despatchFromDate  String value for despatchFromDate.
         * @return Builder
         */
        public Builder despatchFromDate(String despatchFromDate) {
            this.despatchFromDate = despatchFromDate;
            return this;
        }

        /**
         * Setter for despatchToDate.
         * @param  despatchToDate  String value for despatchToDate.
         * @return Builder
         */
        public Builder despatchToDate(String despatchToDate) {
            this.despatchToDate = despatchToDate;
            return this;
        }

        /**
         * Setter for references.
         * @param  references  References value for references.
         * @return Builder
         */
        public Builder references(References references) {
            this.references = references;
            return this;
        }

        /**
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty sellerParty) {
            this.sellerParty = sellerParty;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty supplierParty) {
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
         * @param  consignee  Consignee value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for orderedArticle.
         * @param  orderedArticle  OrderedArticle value for orderedArticle.
         * @return Builder
         */
        public Builder orderedArticle(OrderedArticle orderedArticle) {
            this.orderedArticle = orderedArticle;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC10DesadvRequest} object using the set fields.
         * @return {@link EDIWheelC10DesadvRequest}
         */
        public EDIWheelC10DesadvRequest build() {
            return new EDIWheelC10DesadvRequest(documentID, buyerParty, variant, despatchFromDate,
                    despatchToDate, references, sellerParty, supplierParty, orderingParty,
                    consignee, orderedArticle);
        }
    }
}
