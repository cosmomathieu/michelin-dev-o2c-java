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
 * This is a model class for Invoice type.
 */
public class Invoice {
    private String invoiceIssueFromDate;
    private String invoiceIssueToDate;
    private String documentTypeCode;
    private String documentFunctionCode;
    private References references;
    private BuyerParty buyerParty;
    private InvoiceIssuerParty invoiceIssuerParty;
    private InvoiceeParty invoiceeParty;
    private OrderingParty orderingParty;
    private Consignee6 consignee;
    private SupplierParty supplierParty;
    private SellerParty sellerParty;
    private Contract contract;
    private String attachments;

    /**
     * Default constructor.
     */
    public Invoice() {
    }

    /**
     * Initialization constructor.
     * @param  buyerParty  BuyerParty value for buyerParty.
     * @param  invoiceIssueFromDate  String value for invoiceIssueFromDate.
     * @param  invoiceIssueToDate  String value for invoiceIssueToDate.
     * @param  documentTypeCode  String value for documentTypeCode.
     * @param  documentFunctionCode  String value for documentFunctionCode.
     * @param  references  References value for references.
     * @param  invoiceIssuerParty  InvoiceIssuerParty value for invoiceIssuerParty.
     * @param  invoiceeParty  InvoiceeParty value for invoiceeParty.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  consignee  Consignee6 value for consignee.
     * @param  supplierParty  SupplierParty value for supplierParty.
     * @param  sellerParty  SellerParty value for sellerParty.
     * @param  contract  Contract value for contract.
     * @param  attachments  String value for attachments.
     */
    public Invoice(
            BuyerParty buyerParty,
            String invoiceIssueFromDate,
            String invoiceIssueToDate,
            String documentTypeCode,
            String documentFunctionCode,
            References references,
            InvoiceIssuerParty invoiceIssuerParty,
            InvoiceeParty invoiceeParty,
            OrderingParty orderingParty,
            Consignee6 consignee,
            SupplierParty supplierParty,
            SellerParty sellerParty,
            Contract contract,
            String attachments) {
        this.invoiceIssueFromDate = invoiceIssueFromDate;
        this.invoiceIssueToDate = invoiceIssueToDate;
        this.documentTypeCode = documentTypeCode;
        this.documentFunctionCode = documentFunctionCode;
        this.references = references;
        this.buyerParty = buyerParty;
        this.invoiceIssuerParty = invoiceIssuerParty;
        this.invoiceeParty = invoiceeParty;
        this.orderingParty = orderingParty;
        this.consignee = consignee;
        this.supplierParty = supplierParty;
        this.sellerParty = sellerParty;
        this.contract = contract;
        this.attachments = attachments;
    }

    /**
     * Getter for InvoiceIssueFromDate.
     * @return Returns the String
     */
    @JsonGetter("InvoiceIssueFromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceIssueFromDate() {
        return invoiceIssueFromDate;
    }

    /**
     * Setter for InvoiceIssueFromDate.
     * @param invoiceIssueFromDate Value for String
     */
    @JsonSetter("InvoiceIssueFromDate")
    public void setInvoiceIssueFromDate(String invoiceIssueFromDate) {
        this.invoiceIssueFromDate = invoiceIssueFromDate;
    }

    /**
     * Getter for InvoiceIssueToDate.
     * @return Returns the String
     */
    @JsonGetter("InvoiceIssueToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceIssueToDate() {
        return invoiceIssueToDate;
    }

    /**
     * Setter for InvoiceIssueToDate.
     * @param invoiceIssueToDate Value for String
     */
    @JsonSetter("InvoiceIssueToDate")
    public void setInvoiceIssueToDate(String invoiceIssueToDate) {
        this.invoiceIssueToDate = invoiceIssueToDate;
    }

    /**
     * Getter for DocumentTypeCode.
     * @return Returns the String
     */
    @JsonGetter("DocumentTypeCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Setter for DocumentTypeCode.
     * @param documentTypeCode Value for String
     */
    @JsonSetter("DocumentTypeCode")
    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    /**
     * Getter for DocumentFunctionCode.
     * @return Returns the String
     */
    @JsonGetter("DocumentFunctionCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentFunctionCode() {
        return documentFunctionCode;
    }

    /**
     * Setter for DocumentFunctionCode.
     * @param documentFunctionCode Value for String
     */
    @JsonSetter("DocumentFunctionCode")
    public void setDocumentFunctionCode(String documentFunctionCode) {
        this.documentFunctionCode = documentFunctionCode;
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
     * Getter for InvoiceIssuerParty.
     * @return Returns the InvoiceIssuerParty
     */
    @JsonGetter("InvoiceIssuerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceIssuerParty getInvoiceIssuerParty() {
        return invoiceIssuerParty;
    }

    /**
     * Setter for InvoiceIssuerParty.
     * @param invoiceIssuerParty Value for InvoiceIssuerParty
     */
    @JsonSetter("InvoiceIssuerParty")
    public void setInvoiceIssuerParty(InvoiceIssuerParty invoiceIssuerParty) {
        this.invoiceIssuerParty = invoiceIssuerParty;
    }

    /**
     * Getter for InvoiceeParty.
     * @return Returns the InvoiceeParty
     */
    @JsonGetter("InvoiceeParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceeParty getInvoiceeParty() {
        return invoiceeParty;
    }

    /**
     * Setter for InvoiceeParty.
     * @param invoiceeParty Value for InvoiceeParty
     */
    @JsonSetter("InvoiceeParty")
    public void setInvoiceeParty(InvoiceeParty invoiceeParty) {
        this.invoiceeParty = invoiceeParty;
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
     * @return Returns the Consignee6
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee6 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee6
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee6 consignee) {
        this.consignee = consignee;
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
     * Getter for Attachments.
     * @return Returns the String
     */
    @JsonGetter("Attachments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAttachments() {
        return attachments;
    }

    /**
     * Setter for Attachments.
     * @param attachments Value for String
     */
    @JsonSetter("Attachments")
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    /**
     * Converts this Invoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Invoice [" + "buyerParty=" + buyerParty + ", invoiceIssueFromDate="
                + invoiceIssueFromDate + ", invoiceIssueToDate=" + invoiceIssueToDate
                + ", documentTypeCode=" + documentTypeCode + ", documentFunctionCode="
                + documentFunctionCode + ", references=" + references + ", invoiceIssuerParty="
                + invoiceIssuerParty + ", invoiceeParty=" + invoiceeParty + ", orderingParty="
                + orderingParty + ", consignee=" + consignee + ", supplierParty=" + supplierParty
                + ", sellerParty=" + sellerParty + ", contract=" + contract + ", attachments="
                + attachments + "]";
    }

    /**
     * Builds a new {@link Invoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Invoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(buyerParty)
                .invoiceIssueFromDate(getInvoiceIssueFromDate())
                .invoiceIssueToDate(getInvoiceIssueToDate())
                .documentTypeCode(getDocumentTypeCode())
                .documentFunctionCode(getDocumentFunctionCode())
                .references(getReferences())
                .invoiceIssuerParty(getInvoiceIssuerParty())
                .invoiceeParty(getInvoiceeParty())
                .orderingParty(getOrderingParty())
                .consignee(getConsignee())
                .supplierParty(getSupplierParty())
                .sellerParty(getSellerParty())
                .contract(getContract())
                .attachments(getAttachments());
        return builder;
    }

    /**
     * Class to build instances of {@link Invoice}.
     */
    public static class Builder {
        private BuyerParty buyerParty;
        private String invoiceIssueFromDate;
        private String invoiceIssueToDate;
        private String documentTypeCode;
        private String documentFunctionCode;
        private References references;
        private InvoiceIssuerParty invoiceIssuerParty;
        private InvoiceeParty invoiceeParty;
        private OrderingParty orderingParty;
        private Consignee6 consignee;
        private SupplierParty supplierParty;
        private SellerParty sellerParty;
        private Contract contract;
        private String attachments;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  buyerParty  BuyerParty value for buyerParty.
         */
        public Builder(BuyerParty buyerParty) {
            this.buyerParty = buyerParty;
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
         * Setter for invoiceIssueFromDate.
         * @param  invoiceIssueFromDate  String value for invoiceIssueFromDate.
         * @return Builder
         */
        public Builder invoiceIssueFromDate(String invoiceIssueFromDate) {
            this.invoiceIssueFromDate = invoiceIssueFromDate;
            return this;
        }

        /**
         * Setter for invoiceIssueToDate.
         * @param  invoiceIssueToDate  String value for invoiceIssueToDate.
         * @return Builder
         */
        public Builder invoiceIssueToDate(String invoiceIssueToDate) {
            this.invoiceIssueToDate = invoiceIssueToDate;
            return this;
        }

        /**
         * Setter for documentTypeCode.
         * @param  documentTypeCode  String value for documentTypeCode.
         * @return Builder
         */
        public Builder documentTypeCode(String documentTypeCode) {
            this.documentTypeCode = documentTypeCode;
            return this;
        }

        /**
         * Setter for documentFunctionCode.
         * @param  documentFunctionCode  String value for documentFunctionCode.
         * @return Builder
         */
        public Builder documentFunctionCode(String documentFunctionCode) {
            this.documentFunctionCode = documentFunctionCode;
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
         * Setter for invoiceIssuerParty.
         * @param  invoiceIssuerParty  InvoiceIssuerParty value for invoiceIssuerParty.
         * @return Builder
         */
        public Builder invoiceIssuerParty(InvoiceIssuerParty invoiceIssuerParty) {
            this.invoiceIssuerParty = invoiceIssuerParty;
            return this;
        }

        /**
         * Setter for invoiceeParty.
         * @param  invoiceeParty  InvoiceeParty value for invoiceeParty.
         * @return Builder
         */
        public Builder invoiceeParty(InvoiceeParty invoiceeParty) {
            this.invoiceeParty = invoiceeParty;
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
         * @param  consignee  Consignee6 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee6 consignee) {
            this.consignee = consignee;
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
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty sellerParty) {
            this.sellerParty = sellerParty;
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
         * Setter for attachments.
         * @param  attachments  String value for attachments.
         * @return Builder
         */
        public Builder attachments(String attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * Builds a new {@link Invoice} object using the set fields.
         * @return {@link Invoice}
         */
        public Invoice build() {
            return new Invoice(buyerParty, invoiceIssueFromDate, invoiceIssueToDate,
                    documentTypeCode, documentFunctionCode, references, invoiceIssuerParty,
                    invoiceeParty, orderingParty, consignee, supplierParty, sellerParty, contract,
                    attachments);
        }
    }
}
