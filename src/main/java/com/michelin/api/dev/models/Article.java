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
 * This is a model class for Article type.
 */
public class Article {
    private ArticleIdentification6 articleIdentification;
    private List<ArticleDescription1> articleDescription;
    private ArticleCharacteristics articleCharacteristics;
    private InvoicedQuantity invoicedQuantity;
    private PriceDetails1 priceDetails;
    private TaxDetails taxDetails;
    private List<AllowanceOrCharge> allowanceOrCharge;
    private LineItemTotalAmount lineItemTotalAmount;
    private Consignee7 consignee;
    private OrderingParty orderingParty;
    private List<TracingInformation1> tracingInformation;
    private LineNote lineNote;
    private String countryOfOrigin;

    /**
     * Default constructor.
     */
    public Article() {
    }

    /**
     * Initialization constructor.
     * @param  articleIdentification  ArticleIdentification6 value for articleIdentification.
     * @param  articleDescription  List of ArticleDescription1 value for articleDescription.
     * @param  priceDetails  PriceDetails1 value for priceDetails.
     * @param  articleCharacteristics  ArticleCharacteristics value for articleCharacteristics.
     * @param  invoicedQuantity  InvoicedQuantity value for invoicedQuantity.
     * @param  taxDetails  TaxDetails value for taxDetails.
     * @param  allowanceOrCharge  List of AllowanceOrCharge value for allowanceOrCharge.
     * @param  lineItemTotalAmount  LineItemTotalAmount value for lineItemTotalAmount.
     * @param  consignee  Consignee7 value for consignee.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  tracingInformation  List of TracingInformation1 value for tracingInformation.
     * @param  lineNote  LineNote value for lineNote.
     * @param  countryOfOrigin  String value for countryOfOrigin.
     */
    public Article(
            ArticleIdentification6 articleIdentification,
            List<ArticleDescription1> articleDescription,
            PriceDetails1 priceDetails,
            ArticleCharacteristics articleCharacteristics,
            InvoicedQuantity invoicedQuantity,
            TaxDetails taxDetails,
            List<AllowanceOrCharge> allowanceOrCharge,
            LineItemTotalAmount lineItemTotalAmount,
            Consignee7 consignee,
            OrderingParty orderingParty,
            List<TracingInformation1> tracingInformation,
            LineNote lineNote,
            String countryOfOrigin) {
        this.articleIdentification = articleIdentification;
        this.articleDescription = articleDescription;
        this.articleCharacteristics = articleCharacteristics;
        this.invoicedQuantity = invoicedQuantity;
        this.priceDetails = priceDetails;
        this.taxDetails = taxDetails;
        this.allowanceOrCharge = allowanceOrCharge;
        this.lineItemTotalAmount = lineItemTotalAmount;
        this.consignee = consignee;
        this.orderingParty = orderingParty;
        this.tracingInformation = tracingInformation;
        this.lineNote = lineNote;
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Getter for ArticleIdentification.
     * @return Returns the ArticleIdentification6
     */
    @JsonGetter("ArticleIdentification")
    public ArticleIdentification6 getArticleIdentification() {
        return articleIdentification;
    }

    /**
     * Setter for ArticleIdentification.
     * @param articleIdentification Value for ArticleIdentification6
     */
    @JsonSetter("ArticleIdentification")
    public void setArticleIdentification(ArticleIdentification6 articleIdentification) {
        this.articleIdentification = articleIdentification;
    }

    /**
     * Getter for ArticleDescription.
     * @return Returns the List of ArticleDescription1
     */
    @JsonGetter("ArticleDescription")
    public List<ArticleDescription1> getArticleDescription() {
        return articleDescription;
    }

    /**
     * Setter for ArticleDescription.
     * @param articleDescription Value for List of ArticleDescription1
     */
    @JsonSetter("ArticleDescription")
    public void setArticleDescription(List<ArticleDescription1> articleDescription) {
        this.articleDescription = articleDescription;
    }

    /**
     * Getter for ArticleCharacteristics.
     * @return Returns the ArticleCharacteristics
     */
    @JsonGetter("ArticleCharacteristics")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ArticleCharacteristics getArticleCharacteristics() {
        return articleCharacteristics;
    }

    /**
     * Setter for ArticleCharacteristics.
     * @param articleCharacteristics Value for ArticleCharacteristics
     */
    @JsonSetter("ArticleCharacteristics")
    public void setArticleCharacteristics(ArticleCharacteristics articleCharacteristics) {
        this.articleCharacteristics = articleCharacteristics;
    }

    /**
     * Getter for InvoicedQuantity.
     * @return Returns the InvoicedQuantity
     */
    @JsonGetter("InvoicedQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicedQuantity getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Setter for InvoicedQuantity.
     * @param invoicedQuantity Value for InvoicedQuantity
     */
    @JsonSetter("InvoicedQuantity")
    public void setInvoicedQuantity(InvoicedQuantity invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
    }

    /**
     * Getter for PriceDetails.
     * @return Returns the PriceDetails1
     */
    @JsonGetter("PriceDetails")
    public PriceDetails1 getPriceDetails() {
        return priceDetails;
    }

    /**
     * Setter for PriceDetails.
     * @param priceDetails Value for PriceDetails1
     */
    @JsonSetter("PriceDetails")
    public void setPriceDetails(PriceDetails1 priceDetails) {
        this.priceDetails = priceDetails;
    }

    /**
     * Getter for TaxDetails.
     * @return Returns the TaxDetails
     */
    @JsonGetter("TaxDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Setter for TaxDetails.
     * @param taxDetails Value for TaxDetails
     */
    @JsonSetter("TaxDetails")
    public void setTaxDetails(TaxDetails taxDetails) {
        this.taxDetails = taxDetails;
    }

    /**
     * Getter for AllowanceOrCharge.
     * @return Returns the List of AllowanceOrCharge
     */
    @JsonGetter("AllowanceOrCharge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AllowanceOrCharge> getAllowanceOrCharge() {
        return allowanceOrCharge;
    }

    /**
     * Setter for AllowanceOrCharge.
     * @param allowanceOrCharge Value for List of AllowanceOrCharge
     */
    @JsonSetter("AllowanceOrCharge")
    public void setAllowanceOrCharge(List<AllowanceOrCharge> allowanceOrCharge) {
        this.allowanceOrCharge = allowanceOrCharge;
    }

    /**
     * Getter for LineItemTotalAmount.
     * @return Returns the LineItemTotalAmount
     */
    @JsonGetter("LineItemTotalAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LineItemTotalAmount getLineItemTotalAmount() {
        return lineItemTotalAmount;
    }

    /**
     * Setter for LineItemTotalAmount.
     * @param lineItemTotalAmount Value for LineItemTotalAmount
     */
    @JsonSetter("LineItemTotalAmount")
    public void setLineItemTotalAmount(LineItemTotalAmount lineItemTotalAmount) {
        this.lineItemTotalAmount = lineItemTotalAmount;
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
     * Getter for TracingInformation.
     * @return Returns the List of TracingInformation1
     */
    @JsonGetter("TracingInformation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TracingInformation1> getTracingInformation() {
        return tracingInformation;
    }

    /**
     * Setter for TracingInformation.
     * @param tracingInformation Value for List of TracingInformation1
     */
    @JsonSetter("TracingInformation")
    public void setTracingInformation(List<TracingInformation1> tracingInformation) {
        this.tracingInformation = tracingInformation;
    }

    /**
     * Getter for LineNote.
     * @return Returns the LineNote
     */
    @JsonGetter("LineNote")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LineNote getLineNote() {
        return lineNote;
    }

    /**
     * Setter for LineNote.
     * @param lineNote Value for LineNote
     */
    @JsonSetter("LineNote")
    public void setLineNote(LineNote lineNote) {
        this.lineNote = lineNote;
    }

    /**
     * Getter for CountryOfOrigin.
     * @return Returns the String
     */
    @JsonGetter("CountryOfOrigin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Setter for CountryOfOrigin.
     * @param countryOfOrigin Value for String
     */
    @JsonSetter("CountryOfOrigin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Converts this Article into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Article [" + "articleIdentification=" + articleIdentification
                + ", articleDescription=" + articleDescription + ", priceDetails=" + priceDetails
                + ", articleCharacteristics=" + articleCharacteristics + ", invoicedQuantity="
                + invoicedQuantity + ", taxDetails=" + taxDetails + ", allowanceOrCharge="
                + allowanceOrCharge + ", lineItemTotalAmount=" + lineItemTotalAmount
                + ", consignee=" + consignee + ", orderingParty=" + orderingParty
                + ", tracingInformation=" + tracingInformation + ", lineNote=" + lineNote
                + ", countryOfOrigin=" + countryOfOrigin + "]";
    }

    /**
     * Builds a new {@link Article.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Article.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(articleIdentification, articleDescription, priceDetails)
                .articleCharacteristics(getArticleCharacteristics())
                .invoicedQuantity(getInvoicedQuantity())
                .taxDetails(getTaxDetails())
                .allowanceOrCharge(getAllowanceOrCharge())
                .lineItemTotalAmount(getLineItemTotalAmount())
                .consignee(getConsignee())
                .orderingParty(getOrderingParty())
                .tracingInformation(getTracingInformation())
                .lineNote(getLineNote())
                .countryOfOrigin(getCountryOfOrigin());
        return builder;
    }

    /**
     * Class to build instances of {@link Article}.
     */
    public static class Builder {
        private ArticleIdentification6 articleIdentification;
        private List<ArticleDescription1> articleDescription;
        private PriceDetails1 priceDetails;
        private ArticleCharacteristics articleCharacteristics;
        private InvoicedQuantity invoicedQuantity;
        private TaxDetails taxDetails;
        private List<AllowanceOrCharge> allowanceOrCharge;
        private LineItemTotalAmount lineItemTotalAmount;
        private Consignee7 consignee;
        private OrderingParty orderingParty;
        private List<TracingInformation1> tracingInformation;
        private LineNote lineNote;
        private String countryOfOrigin;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  articleIdentification  ArticleIdentification6 value for articleIdentification.
         * @param  articleDescription  List of ArticleDescription1 value for articleDescription.
         * @param  priceDetails  PriceDetails1 value for priceDetails.
         */
        public Builder(ArticleIdentification6 articleIdentification,
                List<ArticleDescription1> articleDescription, PriceDetails1 priceDetails) {
            this.articleIdentification = articleIdentification;
            this.articleDescription = articleDescription;
            this.priceDetails = priceDetails;
        }

        /**
         * Setter for articleIdentification.
         * @param  articleIdentification  ArticleIdentification6 value for articleIdentification.
         * @return Builder
         */
        public Builder articleIdentification(ArticleIdentification6 articleIdentification) {
            this.articleIdentification = articleIdentification;
            return this;
        }

        /**
         * Setter for articleDescription.
         * @param  articleDescription  List of ArticleDescription1 value for articleDescription.
         * @return Builder
         */
        public Builder articleDescription(List<ArticleDescription1> articleDescription) {
            this.articleDescription = articleDescription;
            return this;
        }

        /**
         * Setter for priceDetails.
         * @param  priceDetails  PriceDetails1 value for priceDetails.
         * @return Builder
         */
        public Builder priceDetails(PriceDetails1 priceDetails) {
            this.priceDetails = priceDetails;
            return this;
        }

        /**
         * Setter for articleCharacteristics.
         * @param  articleCharacteristics  ArticleCharacteristics value for articleCharacteristics.
         * @return Builder
         */
        public Builder articleCharacteristics(ArticleCharacteristics articleCharacteristics) {
            this.articleCharacteristics = articleCharacteristics;
            return this;
        }

        /**
         * Setter for invoicedQuantity.
         * @param  invoicedQuantity  InvoicedQuantity value for invoicedQuantity.
         * @return Builder
         */
        public Builder invoicedQuantity(InvoicedQuantity invoicedQuantity) {
            this.invoicedQuantity = invoicedQuantity;
            return this;
        }

        /**
         * Setter for taxDetails.
         * @param  taxDetails  TaxDetails value for taxDetails.
         * @return Builder
         */
        public Builder taxDetails(TaxDetails taxDetails) {
            this.taxDetails = taxDetails;
            return this;
        }

        /**
         * Setter for allowanceOrCharge.
         * @param  allowanceOrCharge  List of AllowanceOrCharge value for allowanceOrCharge.
         * @return Builder
         */
        public Builder allowanceOrCharge(List<AllowanceOrCharge> allowanceOrCharge) {
            this.allowanceOrCharge = allowanceOrCharge;
            return this;
        }

        /**
         * Setter for lineItemTotalAmount.
         * @param  lineItemTotalAmount  LineItemTotalAmount value for lineItemTotalAmount.
         * @return Builder
         */
        public Builder lineItemTotalAmount(LineItemTotalAmount lineItemTotalAmount) {
            this.lineItemTotalAmount = lineItemTotalAmount;
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
         * Setter for orderingParty.
         * @param  orderingParty  OrderingParty value for orderingParty.
         * @return Builder
         */
        public Builder orderingParty(OrderingParty orderingParty) {
            this.orderingParty = orderingParty;
            return this;
        }

        /**
         * Setter for tracingInformation.
         * @param  tracingInformation  List of TracingInformation1 value for tracingInformation.
         * @return Builder
         */
        public Builder tracingInformation(List<TracingInformation1> tracingInformation) {
            this.tracingInformation = tracingInformation;
            return this;
        }

        /**
         * Setter for lineNote.
         * @param  lineNote  LineNote value for lineNote.
         * @return Builder
         */
        public Builder lineNote(LineNote lineNote) {
            this.lineNote = lineNote;
            return this;
        }

        /**
         * Setter for countryOfOrigin.
         * @param  countryOfOrigin  String value for countryOfOrigin.
         * @return Builder
         */
        public Builder countryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        /**
         * Builds a new {@link Article} object using the set fields.
         * @return {@link Article}
         */
        public Article build() {
            return new Article(articleIdentification, articleDescription, priceDetails,
                    articleCharacteristics, invoicedQuantity, taxDetails, allowanceOrCharge,
                    lineItemTotalAmount, consignee, orderingParty, tracingInformation, lineNote,
                    countryOfOrigin);
        }
    }
}
