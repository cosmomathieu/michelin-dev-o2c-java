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
 * This is a model class for Desadv type.
 */
public class Desadv {
    private String issueDate;
    private String documentNumber;
    private String documentTypeCode;
    private Measures measures;
    private String despatchDate;
    private String arrivalDate;
    private String arrivalTime;
    private List<String> deliveryOption;
    private TotalQuantity totalQuantity;
    private List<References1> references;
    private BuyerParty buyerParty;
    private SupplierParty1 supplierParty;
    private OrderingParty orderingParty;
    private Consignee1 consignee;
    private SellerParty sellerParty;
    private CarrierParty carrierParty;
    private List<LineLevel> lineLevel;

    /**
     * Default constructor.
     */
    public Desadv() {
    }

    /**
     * Initialization constructor.
     * @param  issueDate  String value for issueDate.
     * @param  documentNumber  String value for documentNumber.
     * @param  documentTypeCode  String value for documentTypeCode.
     * @param  despatchDate  String value for despatchDate.
     * @param  arrivalDate  String value for arrivalDate.
     * @param  references  List of References1 value for references.
     * @param  buyerParty  BuyerParty value for buyerParty.
     * @param  consignee  Consignee1 value for consignee.
     * @param  measures  Measures value for measures.
     * @param  arrivalTime  String value for arrivalTime.
     * @param  deliveryOption  List of String value for deliveryOption.
     * @param  totalQuantity  TotalQuantity value for totalQuantity.
     * @param  supplierParty  SupplierParty1 value for supplierParty.
     * @param  orderingParty  OrderingParty value for orderingParty.
     * @param  sellerParty  SellerParty value for sellerParty.
     * @param  carrierParty  CarrierParty value for carrierParty.
     * @param  lineLevel  List of LineLevel value for lineLevel.
     */
    public Desadv(
            String issueDate,
            String documentNumber,
            String documentTypeCode,
            String despatchDate,
            String arrivalDate,
            List<References1> references,
            BuyerParty buyerParty,
            Consignee1 consignee,
            Measures measures,
            String arrivalTime,
            List<String> deliveryOption,
            TotalQuantity totalQuantity,
            SupplierParty1 supplierParty,
            OrderingParty orderingParty,
            SellerParty sellerParty,
            CarrierParty carrierParty,
            List<LineLevel> lineLevel) {
        this.issueDate = issueDate;
        this.documentNumber = documentNumber;
        this.documentTypeCode = documentTypeCode;
        this.measures = measures;
        this.despatchDate = despatchDate;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.deliveryOption = deliveryOption;
        this.totalQuantity = totalQuantity;
        this.references = references;
        this.buyerParty = buyerParty;
        this.supplierParty = supplierParty;
        this.orderingParty = orderingParty;
        this.consignee = consignee;
        this.sellerParty = sellerParty;
        this.carrierParty = carrierParty;
        this.lineLevel = lineLevel;
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
     * Getter for Measures.
     * @return Returns the Measures
     */
    @JsonGetter("Measures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Measures getMeasures() {
        return measures;
    }

    /**
     * Setter for Measures.
     * @param measures Value for Measures
     */
    @JsonSetter("Measures")
    public void setMeasures(Measures measures) {
        this.measures = measures;
    }

    /**
     * Getter for DespatchDate.
     * @return Returns the String
     */
    @JsonGetter("DespatchDate")
    public String getDespatchDate() {
        return despatchDate;
    }

    /**
     * Setter for DespatchDate.
     * @param despatchDate Value for String
     */
    @JsonSetter("DespatchDate")
    public void setDespatchDate(String despatchDate) {
        this.despatchDate = despatchDate;
    }

    /**
     * Getter for ArrivalDate.
     * @return Returns the String
     */
    @JsonGetter("ArrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Setter for ArrivalDate.
     * @param arrivalDate Value for String
     */
    @JsonSetter("ArrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * Getter for ArrivalTime.
     * @return Returns the String
     */
    @JsonGetter("ArrivalTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Setter for ArrivalTime.
     * @param arrivalTime Value for String
     */
    @JsonSetter("ArrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Getter for DeliveryOption.
     * @return Returns the List of String
     */
    @JsonGetter("DeliveryOption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Setter for DeliveryOption.
     * @param deliveryOption Value for List of String
     */
    @JsonSetter("DeliveryOption")
    public void setDeliveryOption(List<String> deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    /**
     * Getter for TotalQuantity.
     * @return Returns the TotalQuantity
     */
    @JsonGetter("TotalQuantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TotalQuantity getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Setter for TotalQuantity.
     * @param totalQuantity Value for TotalQuantity
     */
    @JsonSetter("TotalQuantity")
    public void setTotalQuantity(TotalQuantity totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    /**
     * Getter for References.
     * @return Returns the List of References1
     */
    @JsonGetter("References")
    public List<References1> getReferences() {
        return references;
    }

    /**
     * Setter for References.
     * @param references Value for List of References1
     */
    @JsonSetter("References")
    public void setReferences(List<References1> references) {
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
     * Getter for SupplierParty.
     * @return Returns the SupplierParty1
     */
    @JsonGetter("SupplierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SupplierParty1 getSupplierParty() {
        return supplierParty;
    }

    /**
     * Setter for SupplierParty.
     * @param supplierParty Value for SupplierParty1
     */
    @JsonSetter("SupplierParty")
    public void setSupplierParty(SupplierParty1 supplierParty) {
        this.supplierParty = supplierParty;
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
     * @return Returns the Consignee1
     */
    @JsonGetter("Consignee")
    public Consignee1 getConsignee() {
        return consignee;
    }

    /**
     * Setter for Consignee.
     * @param consignee Value for Consignee1
     */
    @JsonSetter("Consignee")
    public void setConsignee(Consignee1 consignee) {
        this.consignee = consignee;
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
     * Getter for CarrierParty.
     * @return Returns the CarrierParty
     */
    @JsonGetter("CarrierParty")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CarrierParty getCarrierParty() {
        return carrierParty;
    }

    /**
     * Setter for CarrierParty.
     * @param carrierParty Value for CarrierParty
     */
    @JsonSetter("CarrierParty")
    public void setCarrierParty(CarrierParty carrierParty) {
        this.carrierParty = carrierParty;
    }

    /**
     * Getter for LineLevel.
     * @return Returns the List of LineLevel
     */
    @JsonGetter("LineLevel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LineLevel> getLineLevel() {
        return lineLevel;
    }

    /**
     * Setter for LineLevel.
     * @param lineLevel Value for List of LineLevel
     */
    @JsonSetter("LineLevel")
    public void setLineLevel(List<LineLevel> lineLevel) {
        this.lineLevel = lineLevel;
    }

    /**
     * Converts this Desadv into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Desadv [" + "issueDate=" + issueDate + ", documentNumber=" + documentNumber
                + ", documentTypeCode=" + documentTypeCode + ", despatchDate=" + despatchDate
                + ", arrivalDate=" + arrivalDate + ", references=" + references + ", buyerParty="
                + buyerParty + ", consignee=" + consignee + ", measures=" + measures
                + ", arrivalTime=" + arrivalTime + ", deliveryOption=" + deliveryOption
                + ", totalQuantity=" + totalQuantity + ", supplierParty=" + supplierParty
                + ", orderingParty=" + orderingParty + ", sellerParty=" + sellerParty
                + ", carrierParty=" + carrierParty + ", lineLevel=" + lineLevel + "]";
    }

    /**
     * Builds a new {@link Desadv.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Desadv.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issueDate, documentNumber, documentTypeCode, despatchDate,
                arrivalDate, references, buyerParty, consignee)
                .measures(getMeasures())
                .arrivalTime(getArrivalTime())
                .deliveryOption(getDeliveryOption())
                .totalQuantity(getTotalQuantity())
                .supplierParty(getSupplierParty())
                .orderingParty(getOrderingParty())
                .sellerParty(getSellerParty())
                .carrierParty(getCarrierParty())
                .lineLevel(getLineLevel());
        return builder;
    }

    /**
     * Class to build instances of {@link Desadv}.
     */
    public static class Builder {
        private String issueDate;
        private String documentNumber;
        private String documentTypeCode;
        private String despatchDate;
        private String arrivalDate;
        private List<References1> references;
        private BuyerParty buyerParty;
        private Consignee1 consignee;
        private Measures measures;
        private String arrivalTime;
        private List<String> deliveryOption;
        private TotalQuantity totalQuantity;
        private SupplierParty1 supplierParty;
        private OrderingParty orderingParty;
        private SellerParty sellerParty;
        private CarrierParty carrierParty;
        private List<LineLevel> lineLevel;

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
         * @param  despatchDate  String value for despatchDate.
         * @param  arrivalDate  String value for arrivalDate.
         * @param  references  List of References1 value for references.
         * @param  buyerParty  BuyerParty value for buyerParty.
         * @param  consignee  Consignee1 value for consignee.
         */
        public Builder(String issueDate, String documentNumber, String documentTypeCode,
                String despatchDate, String arrivalDate, List<References1> references,
                BuyerParty buyerParty, Consignee1 consignee) {
            this.issueDate = issueDate;
            this.documentNumber = documentNumber;
            this.documentTypeCode = documentTypeCode;
            this.despatchDate = despatchDate;
            this.arrivalDate = arrivalDate;
            this.references = references;
            this.buyerParty = buyerParty;
            this.consignee = consignee;
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
         * Setter for despatchDate.
         * @param  despatchDate  String value for despatchDate.
         * @return Builder
         */
        public Builder despatchDate(String despatchDate) {
            this.despatchDate = despatchDate;
            return this;
        }

        /**
         * Setter for arrivalDate.
         * @param  arrivalDate  String value for arrivalDate.
         * @return Builder
         */
        public Builder arrivalDate(String arrivalDate) {
            this.arrivalDate = arrivalDate;
            return this;
        }

        /**
         * Setter for references.
         * @param  references  List of References1 value for references.
         * @return Builder
         */
        public Builder references(List<References1> references) {
            this.references = references;
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
         * Setter for consignee.
         * @param  consignee  Consignee1 value for consignee.
         * @return Builder
         */
        public Builder consignee(Consignee1 consignee) {
            this.consignee = consignee;
            return this;
        }

        /**
         * Setter for measures.
         * @param  measures  Measures value for measures.
         * @return Builder
         */
        public Builder measures(Measures measures) {
            this.measures = measures;
            return this;
        }

        /**
         * Setter for arrivalTime.
         * @param  arrivalTime  String value for arrivalTime.
         * @return Builder
         */
        public Builder arrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        /**
         * Setter for deliveryOption.
         * @param  deliveryOption  List of String value for deliveryOption.
         * @return Builder
         */
        public Builder deliveryOption(List<String> deliveryOption) {
            this.deliveryOption = deliveryOption;
            return this;
        }

        /**
         * Setter for totalQuantity.
         * @param  totalQuantity  TotalQuantity value for totalQuantity.
         * @return Builder
         */
        public Builder totalQuantity(TotalQuantity totalQuantity) {
            this.totalQuantity = totalQuantity;
            return this;
        }

        /**
         * Setter for supplierParty.
         * @param  supplierParty  SupplierParty1 value for supplierParty.
         * @return Builder
         */
        public Builder supplierParty(SupplierParty1 supplierParty) {
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
         * Setter for sellerParty.
         * @param  sellerParty  SellerParty value for sellerParty.
         * @return Builder
         */
        public Builder sellerParty(SellerParty sellerParty) {
            this.sellerParty = sellerParty;
            return this;
        }

        /**
         * Setter for carrierParty.
         * @param  carrierParty  CarrierParty value for carrierParty.
         * @return Builder
         */
        public Builder carrierParty(CarrierParty carrierParty) {
            this.carrierParty = carrierParty;
            return this;
        }

        /**
         * Setter for lineLevel.
         * @param  lineLevel  List of LineLevel value for lineLevel.
         * @return Builder
         */
        public Builder lineLevel(List<LineLevel> lineLevel) {
            this.lineLevel = lineLevel;
            return this;
        }

        /**
         * Builds a new {@link Desadv} object using the set fields.
         * @return {@link Desadv}
         */
        public Desadv build() {
            return new Desadv(issueDate, documentNumber, documentTypeCode, despatchDate,
                    arrivalDate, references, buyerParty, consignee, measures, arrivalTime,
                    deliveryOption, totalQuantity, supplierParty, orderingParty, sellerParty,
                    carrierParty, lineLevel);
        }
    }
}
