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
 * This is a model class for Invoice1 type.
 */
public class Invoice1 {
    private String issueDate;
    private String documentNumber;
    private String documentTypeCode;
    private String documentFunctionCode;
    private String documentFunctionText;
    private List<EInvoicingID> eInvoicingID;
    private String environmentRegisterID;
    private String goodsServiceIDCode;
    private String goodsServiceIndication;
    private String documentCurrency;
    private References4 references;
    private BuyerParty7 buyerParty;
    private InvoiceIssuerParty1 invoiceIssuerParty;
    private InvoiceeParty1 invoiceeParty;
    private Consignee7 consignee;
    private SellerParty7 sellerParty;
    private List<PaymentTerms2> paymentTerms;
    private PaymentInstructions paymentInstructions;
    private HeaderNote headerNote;
    private List<LineLevel1> lineLevel;
    private Controls controls;
    private Summary summary;
    private List<Attachment> attachments;

    /**
     * Default constructor.
     */
    public Invoice1() {
    }

    /**
     * Initialization constructor.
     * @param  issueDate  String value for issueDate.
     * @param  documentNumber  String value for documentNumber.
     * @param  documentTypeCode  String value for documentTypeCode.
     * @param  documentCurrency  String value for documentCurrency.
     * @param  buyerParty  BuyerParty7 value for buyerParty.
     * @param  summary  Summary value for summary.
     * @param  documentFunctionCode  String value for documentFunctionCode.
     * @param  documentFunctionText  String value for documentFunctionText.
     * @param  eInvoicingID  List of EInvoicingID value for eInvoicingID.
     * @param  environmentRegisterID  String value for environmentRegisterID.
     * @param  goodsServiceIDCode  String value for goodsServiceIDCode.
     * @param  goodsServiceIndication  String value for goodsServiceIndication.
     * @param  references  References4 value for references.
     * @param  invoiceIssuerParty  InvoiceIssuerParty1 value for invoiceIssuerParty.
     * @param  invoiceeParty  InvoiceeParty1 value for invoiceeParty.
     * @param  consignee  Consignee7 value for consignee.
     * @param  sellerParty  SellerParty7 value for sellerParty.
     * @param  paymentTerms  List of PaymentTerms2 value for paymentTerms.
     * @param  paymentInstructions  PaymentInstructions value for paymentInstructions.
     * @param  headerNote  HeaderNote value for headerNote.
     * @param  lineLevel  List of LineLevel1 value for lineLevel.
     * @param  controls  Controls value for controls.
     * @param  attachments  List of Attachment value for attachments.
     */
    public Invoice1(
            String issueDate,
            String documentNumber,
            String documentTypeCode,
            String documentCurrency,
            BuyerParty7 buyerParty,
            Summary summary,
            String documentFunctionCode,
            String documentFunctionText,
            List<EInvoicingID> eInvoicingID,
            String environmentRegisterID,
            String goodsServiceIDCode,
            String goodsServiceIndication,
            References4 references,
            InvoiceIssuerParty1 invoiceIssuerParty,
            InvoiceeParty1 invoiceeParty,
            Consignee7 consignee,
            SellerParty7 sellerParty,
            List<PaymentTerms2> paymentTerms,
            PaymentInstructions paymentInstructions,
            HeaderNote headerNote,
            List<LineLevel1> lineLevel,
            Controls controls,
            List<Attachment> attachments) {
        this.issueDate = issueDate;
        this.documentNumber = documentNumber;
        this.documentTypeCode = documentTypeCode;
        this.documentFunctionCode = documentFunctionCode;
        this.documentFunctionText = documentFunctionText;
        this.eInvoicingID = eInvoicingID;
        this.environmentRegisterID = environmentRegisterID;
        this.goodsServiceIDCode = goodsServiceIDCode;
        this.goodsServiceIndication = goodsServiceIndication;
        this.documentCurrency = documentCurrency;
        this.references = references;
        this.buyerParty = buyerParty;
        this.invoiceIssuerParty = invoiceIssuerParty;
        this.invoiceeParty = invoiceeParty;
        this.consignee = consignee;
        this.sellerParty = sellerParty;
        this.paymentTerms = paymentTerms;
        this.paymentInstructions = paymentInstructions;
        this.headerNote = headerNote;
        this.lineLevel = lineLevel;
        this.controls = controls;
        this.summary = summary;
        this.attachments = attachments;
    }

    /**
     * Getter for IssueDate.
     * @return Returns the String
     */
    @JsonGetter("IssueDate")
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * @param issueDate Value for String
     */
    @JsonSetter("IssueDate")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for DocumentNumber.
     * @return Returns the String
     */
    @JsonGetter("DocumentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Setter for DocumentNumber.
     * @param documentNumber Value for String
     */
    @JsonSetter("DocumentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Getter for DocumentTypeCode.
     * @return Returns the String
     */
    @JsonGetter("DocumentTypeCode")
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
     * Getter for DocumentFunctionText.
     * @return Returns the String
     */
    @JsonGetter("DocumentFunctionText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentFunctionText() {
        return documentFunctionText;
    }

    /**
     * Setter for DocumentFunctionText.
     * @param documentFunctionText Value for String
     */
    @JsonSetter("DocumentFunctionText")
    public void setDocumentFunctionText(String documentFunctionText) {
        this.documentFunctionText = documentFunctionText;
    }

    /**
     * Getter for EInvoicingID.
     * @return Returns the List of EInvoicingID
     */
    @JsonGetter("eInvoicingID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EInvoicingID> getEInvoicingID() {
        return eInvoicingID;
    }

    /**
     * Setter for EInvoicingID.
     * @param eInvoicingID Value for List of EInvoicingID
     */
    @JsonSetter("eInvoicingID")
    public void setEInvoicingID(List<EInvoicingID> eInvoicingID) {
        this.eInvoicingID = eInvoicingID;
    }

    /**
     * Getter for EnvironmentRegisterID.
     * @return Returns the String
     */
    @JsonGetter("EnvironmentRegisterID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironmentRegisterID() {
        return environmentRegisterID;
    }

    /**
     * Setter for EnvironmentRegisterID.
     * @param environmentRegisterID Value for String
     */
    @JsonSetter("EnvironmentRegisterID")
    public void setEnvironmentRegisterID(String environmentRegisterID) {
        this.environmentRegisterID = environmentRegisterID;
    }

    /**
     * Getter for GoodsServiceIDCode.
     * @return Returns the String
     */
    @JsonGetter("GoodsServiceIDCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGoodsServiceIDCode() {
        return goodsServiceIDCode;
    }

    /**
     * Setter for GoodsServiceIDCode.
     * @param goodsServiceIDCode Value for String
     */
    @JsonSetter("GoodsServiceIDCode")
    public void setGoodsServiceIDCode(String goodsServiceIDCode) {
        this.goodsServiceIDCode = goodsServiceIDCode;
    }

    /**
     * Getter for GoodsServiceIndication.
     * @return Returns the String
     */
    @JsonGetter("GoodsServiceIndication")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGoodsServiceIndication() {
        return goodsServiceIndication;
    }

    /**
     * Setter for GoodsServiceIndication.
     * @param goodsServiceIndication Value for String
     */
    @JsonSetter("GoodsServiceIndication")
    public void setGoodsServiceIndication(String goodsServiceIndication) {
        this.goodsServiceIndication = goodsServiceIndication;
    }

    /**
     * Getter for DocumentCurrency.
     * @return Returns the String
     */
    @JsonGetter("DocumentCurrency")
    public String getDocumentCurrency() {
        return documentCurrency;
    }

    /**
     * Setter for DocumentCurrency.
     * @param documentCurrency Value for String
     */
    @JsonSetter("DocumentCurrency")
    public void setDocumentCurrency(String documentCurrency) {
        this.documentCurrency = documentCurrency;
    }

    /**
     * Getter for References.
     * @return Returns the References4
     */
    @JsonGetter("References")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public References4 getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for References4
     */
    @JsonSetter("References")
    public void setReferences(References4 references) {
        this.references = references;
    }

    /**
     * Getter for BuyerParty.
     * @return Returns the BuyerParty7
     */
    @JsonGetter("BuyerParty")
    public BuyerParty7 getBuyerParty() {
        return buyerParty;
    }

    /**
     * Setter for BuyerParty.
     * @param buyerParty Value for BuyerParty7
     */
    @JsonSetter("BuyerParty")
    public void setBuyerParty(BuyerParty7 buyerParty) {
        this.buyerParty = buyerParty;
    }

    /**
     * Getter for InvoiceIssuerParty.
     * @return Returns the InvoiceIssuerParty1
     */
    @JsonGetter("InvoiceIssuerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceIssuerParty1 getInvoiceIssuerParty() {
        return invoiceIssuerParty;
    }

    /**
     * Setter for InvoiceIssuerParty.
     * @param invoiceIssuerParty Value for InvoiceIssuerParty1
     */
    @JsonSetter("InvoiceIssuerParty")
    public void setInvoiceIssuerParty(InvoiceIssuerParty1 invoiceIssuerParty) {
        this.invoiceIssuerParty = invoiceIssuerParty;
    }

    /**
     * Getter for InvoiceeParty.
     * @return Returns the InvoiceeParty1
     */
    @JsonGetter("InvoiceeParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceeParty1 getInvoiceeParty() {
        return invoiceeParty;
    }

    /**
     * Setter for InvoiceeParty.
     * @param invoiceeParty Value for InvoiceeParty1
     */
    @JsonSetter("InvoiceeParty")
    public void setInvoiceeParty(InvoiceeParty1 invoiceeParty) {
        this.invoiceeParty = invoiceeParty;
    }

    /**
     * Getter for Consignee.
     * @return Returns the Consignee7
     */
    @JsonGetter("Consignee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Consignee7 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee7
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee7 consignee) {
        this.consignee = consignee;
    }

    /**
     * Getter for SellerParty.
     * @return Returns the SellerParty7
     */
    @JsonGetter("SellerParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerParty7 getSellerParty() {
        return sellerParty;
    }

    /**
     * Setter for SellerParty.
     * @param sellerParty Value for SellerParty7
     */
    @JsonSetter("SellerParty")
    public void setSellerParty(SellerParty7 sellerParty) {
        this.sellerParty = sellerParty;
    }

    /**
     * Getter for PaymentTerms.
     * @return Returns the List of PaymentTerms2
     */
    @JsonGetter("PaymentTerms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PaymentTerms2> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Setter for PaymentTerms.
     * @param paymentTerms Value for List of PaymentTerms2
     */
    @JsonSetter("PaymentTerms")
    public void setPaymentTerms(List<PaymentTerms2> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * Getter for PaymentInstructions.
     * @return Returns the PaymentInstructions
     */
    @JsonGetter("PaymentInstructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentInstructions getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * @param paymentInstructions Value for PaymentInstructions
     */
    @JsonSetter("PaymentInstructions")
    public void setPaymentInstructions(PaymentInstructions paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for HeaderNote.
     * @return Returns the HeaderNote
     */
    @JsonGetter("HeaderNote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HeaderNote getHeaderNote() {
        return headerNote;
    }

    /**
     * Setter for HeaderNote.
     * @param headerNote Value for HeaderNote
     */
    @JsonSetter("HeaderNote")
    public void setHeaderNote(HeaderNote headerNote) {
        this.headerNote = headerNote;
    }

    /**
     * Getter for LineLevel.
     * @return Returns the List of LineLevel1
     */
    @JsonGetter("LineLevel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LineLevel1> getLineLevel() {
        return lineLevel;
    }

    /**
     * Setter for LineLevel.
     * @param lineLevel Value for List of LineLevel1
     */
    @JsonSetter("LineLevel")
    public void setLineLevel(List<LineLevel1> lineLevel) {
        this.lineLevel = lineLevel;
    }

    /**
     * Getter for Controls.
     * @return Returns the Controls
     */
    @JsonGetter("Controls")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Controls getControls() {
        return controls;
    }

    /**
     * Setter for Controls.
     * @param controls Value for Controls
     */
    @JsonSetter("Controls")
    public void setControls(Controls controls) {
        this.controls = controls;
    }

    /**
     * Getter for Summary.
     * @return Returns the Summary
     */
    @JsonGetter("Summary")
    public Summary getSummary() {
        return summary;
    }

    /**
     * Setter for Summary.
     * @param summary Value for Summary
     */
    @JsonSetter("Summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * Getter for Attachments.
     * @return Returns the List of Attachment
     */
    @JsonGetter("Attachments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * Setter for Attachments.
     * @param attachments Value for List of Attachment
     */
    @JsonSetter("Attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * Converts this Invoice1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Invoice1 [" + "issueDate=" + issueDate + ", documentNumber=" + documentNumber
                + ", documentTypeCode=" + documentTypeCode + ", documentCurrency="
                + documentCurrency + ", buyerParty=" + buyerParty + ", summary=" + summary
                + ", documentFunctionCode=" + documentFunctionCode + ", documentFunctionText="
                + documentFunctionText + ", eInvoicingID=" + eInvoicingID
                + ", environmentRegisterID=" + environmentRegisterID + ", goodsServiceIDCode="
                + goodsServiceIDCode + ", goodsServiceIndication=" + goodsServiceIndication
                + ", references=" + references + ", invoiceIssuerParty=" + invoiceIssuerParty
                + ", invoiceeParty=" + invoiceeParty + ", consignee=" + consignee + ", sellerParty="
                + sellerParty + ", paymentTerms=" + paymentTerms + ", paymentInstructions="
                + paymentInstructions + ", headerNote=" + headerNote + ", lineLevel=" + lineLevel
                + ", controls=" + controls + ", attachments=" + attachments + "]";
    }

    /**
     * Builds a new {@link Invoice1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Invoice1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issueDate, documentNumber, documentTypeCode, documentCurrency,
                buyerParty, summary)
                .documentFunctionCode(getDocumentFunctionCode())
                .documentFunctionText(getDocumentFunctionText())
                .eInvoicingID(getEInvoicingID())
                .environmentRegisterID(getEnvironmentRegisterID())
                .goodsServiceIDCode(getGoodsServiceIDCode())
                .goodsServiceIndication(getGoodsServiceIndication())
                .references(getReferences())
                .invoiceIssuerParty(getInvoiceIssuerParty())
                .invoiceeParty(getInvoiceeParty())
                .consignee(getConsignee())
                .sellerParty(getSellerParty())
                .paymentTerms(getPaymentTerms())
                .paymentInstructions(getPaymentInstructions())
                .headerNote(getHeaderNote())
                .lineLevel(getLineLevel())
                .controls(getControls())
                .attachments(getAttachments());
        return builder;
    }

    /**
     * Class to build instances of {@link Invoice1}.
     */
    public static class Builder {
        private String issueDate;
        private String documentNumber;
        private String documentTypeCode;
        private String documentCurrency;
        private BuyerParty7 buyerParty;
        private Summary summary;
        private String documentFunctionCode;
        private String documentFunctionText;
        private List<EInvoicingID> eInvoicingID;
        private String environmentRegisterID;
        private String goodsServiceIDCode;
        private String goodsServiceIndication;
        private References4 references;
        private InvoiceIssuerParty1 invoiceIssuerParty;
        private InvoiceeParty1 invoiceeParty;
        private Consignee7 consignee;
        private SellerParty7 sellerParty;
        private List<PaymentTerms2> paymentTerms;
        private PaymentInstructions paymentInstructions;
        private HeaderNote headerNote;
        private List<LineLevel1> lineLevel;
        private Controls controls;
        private List<Attachment> attachments;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  issueDate  String value for issueDate.
         * @param  documentNumber  String value for documentNumber.
         * @param  documentTypeCode  String value for documentTypeCode.
         * @param  documentCurrency  String value for documentCurrency.
         * @param  buyerParty  BuyerParty7 value for buyerParty.
         * @param  summary  Summary value for summary.
         */
        public Builder(String issueDate, String documentNumber, String documentTypeCode,
                String documentCurrency, BuyerParty7 buyerParty, Summary summary) {
            this.issueDate = issueDate;
            this.documentNumber = documentNumber;
            this.documentTypeCode = documentTypeCode;
            this.documentCurrency = documentCurrency;
            this.buyerParty = buyerParty;
            this.summary = summary;
        }

        /**
         * Setter for issueDate.
         * @param  issueDate  String value for issueDate.
         * @return Builder
         */
        public Builder issueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Setter for documentNumber.
         * @param  documentNumber  String value for documentNumber.
         * @return Builder
         */
        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
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
         * Setter for documentCurrency.
         * @param  documentCurrency  String value for documentCurrency.
         * @return Builder
         */
        public Builder documentCurrency(String documentCurrency) {
            this.documentCurrency = documentCurrency;
            return this;
        }

        /**
         * Setter for buyerParty.
         * @param  buyerParty  BuyerParty7 value for buyerParty.
         * @return Builder
         */
        public Builder buyerParty(BuyerParty7 buyerParty) {
            this.buyerParty = buyerParty;
            return this;
        }

        /**
         * Setter for summary.
         * @param  summary  Summary value for summary.
         * @return Builder
         */
        public Builder summary(Summary summary) {
            this.summary = summary;
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
         * Setter for documentFunctionText.
         * @param  documentFunctionText  String value for documentFunctionText.
         * @return Builder
         */
        public Builder documentFunctionText(String documentFunctionText) {
            this.documentFunctionText = documentFunctionText;
            return this;
        }

        /**
         * Setter for eInvoicingID.
         * @param  eInvoicingID  List of EInvoicingID value for eInvoicingID.
         * @return Builder
         */
        public Builder eInvoicingID(List<EInvoicingID> eInvoicingID) {
            this.eInvoicingID = eInvoicingID;
            return this;
        }

        /**
         * Setter for environmentRegisterID.
         * @param  environmentRegisterID  String value for environmentRegisterID.
         * @return Builder
         */
        public Builder environmentRegisterID(String environmentRegisterID) {
            this.environmentRegisterID = environmentRegisterID;
            return this;
        }

        /**
         * Setter for goodsServiceIDCode.
         * @param  goodsServiceIDCode  String value for goodsServiceIDCode.
         * @return Builder
         */
        public Builder goodsServiceIDCode(String goodsServiceIDCode) {
            this.goodsServiceIDCode = goodsServiceIDCode;
            return this;
        }

        /**
         * Setter for goodsServiceIndication.
         * @param  goodsServiceIndication  String value for goodsServiceIndication.
         * @return Builder
         */
        public Builder goodsServiceIndication(String goodsServiceIndication) {
            this.goodsServiceIndication = goodsServiceIndication;
            return this;
        }

        /**
         * Setter for references.
         * @param  references  References4 value for references.
         * @return Builder
         */
        public Builder references(References4 references) {
            this.references = references;
            return this;
        }

        /**
         * Setter for invoiceIssuerParty.
         * @param  invoiceIssuerParty  InvoiceIssuerParty1 value for invoiceIssuerParty.
         * @return Builder
         */
        public Builder invoiceIssuerParty(InvoiceIssuerParty1 invoiceIssuerParty) {
            this.invoiceIssuerParty = invoiceIssuerParty;
            return this;
        }

        /**
         * Setter for invoiceeParty.
         * @param  invoiceeParty  InvoiceeParty1 value for invoiceeParty.
         * @return Builder
         */
        public Builder invoiceeParty(InvoiceeParty1 invoiceeParty) {
            this.invoiceeParty = invoiceeParty;
            return this;
        }

        /**
         * Setter for consignee.
         * @param  consignee  Consignee7 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee7 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty7 value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty7 sellerParty) {
            this.sellerParty = sellerParty;
            return this;
        }

        /**
         * Setter for paymentTerms.
         * @param  paymentTerms  List of PaymentTerms2 value for paymentTerms.
         * @return Builder
         */
        public Builder paymentTerms(List<PaymentTerms2> paymentTerms) {
            this.paymentTerms = paymentTerms;
            return this;
        }

        /**
         * Setter for paymentInstructions.
         * @param  paymentInstructions  PaymentInstructions value for paymentInstructions.
         * @return Builder
         */
        public Builder paymentInstructions(PaymentInstructions paymentInstructions) {
            this.paymentInstructions = paymentInstructions;
            return this;
        }

        /**
         * Setter for headerNote.
         * @param  headerNote  HeaderNote value for headerNote.
         * @return Builder
         */
        public Builder headerNote(HeaderNote headerNote) {
            this.headerNote = headerNote;
            return this;
        }

        /**
         * Setter for lineLevel.
         * @param  lineLevel  List of LineLevel1 value for lineLevel.
         * @return Builder
         */
        public Builder lineLevel(List<LineLevel1> lineLevel) {
            this.lineLevel = lineLevel;
            return this;
        }

        /**
         * Setter for controls.
         * @param  controls  Controls value for controls.
         * @return Builder
         */
        public Builder controls(Controls controls) {
            this.controls = controls;
            return this;
        }

        /**
         * Setter for attachments.
         * @param  attachments  List of Attachment value for attachments.
         * @return Builder
         */
        public Builder attachments(List<Attachment> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * Builds a new {@link Invoice1} object using the set fields.
         * @return {@link Invoice1}
         */
        public Invoice1 build() {
            return new Invoice1(issueDate, documentNumber, documentTypeCode, documentCurrency,
                    buyerParty, summary, documentFunctionCode, documentFunctionText, eInvoicingID,
                    environmentRegisterID, goodsServiceIDCode, goodsServiceIndication, references,
                    invoiceIssuerParty, invoiceeParty, consignee, sellerParty, paymentTerms,
                    paymentInstructions, headerNote, lineLevel, controls, attachments);
        }
    }
}
