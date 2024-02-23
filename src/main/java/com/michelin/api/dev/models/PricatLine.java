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
 * This is a model class for PricatLine type.
 */
public class PricatLine {
    private String recordType;
    private String pos;
    private String upc;
    private String supplierProductCode;
    private String productDescription1;
    private String tradeMarkCode;
    private String productGroup2Text;
    private String weight;
    private String rimDiameterInInch;
    private String sectionWidthInMm;
    private String aspectRatio;
    private String loadIndex1;
    private String speedSymbol1;
    private String treadDesign1;
    private String grossPrice;
    private String grossPriceValidFrom;
    private String netValue;
    private String xReferenceCode;

    /**
     * Default constructor.
     */
    public PricatLine() {
    }

    /**
     * Initialization constructor.
     * @param  recordType  String value for recordType.
     * @param  pos  String value for pos.
     * @param  upc  String value for upc.
     * @param  supplierProductCode  String value for supplierProductCode.
     * @param  productDescription1  String value for productDescription1.
     * @param  tradeMarkCode  String value for tradeMarkCode.
     * @param  productGroup2Text  String value for productGroup2Text.
     * @param  weight  String value for weight.
     * @param  rimDiameterInInch  String value for rimDiameterInInch.
     * @param  sectionWidthInMm  String value for sectionWidthInMm.
     * @param  aspectRatio  String value for aspectRatio.
     * @param  loadIndex1  String value for loadIndex1.
     * @param  speedSymbol1  String value for speedSymbol1.
     * @param  treadDesign1  String value for treadDesign1.
     * @param  grossPrice  String value for grossPrice.
     * @param  grossPriceValidFrom  String value for grossPriceValidFrom.
     * @param  netValue  String value for netValue.
     * @param  xReferenceCode  String value for xReferenceCode.
     */
    public PricatLine(
            String recordType,
            String pos,
            String upc,
            String supplierProductCode,
            String productDescription1,
            String tradeMarkCode,
            String productGroup2Text,
            String weight,
            String rimDiameterInInch,
            String sectionWidthInMm,
            String aspectRatio,
            String loadIndex1,
            String speedSymbol1,
            String treadDesign1,
            String grossPrice,
            String grossPriceValidFrom,
            String netValue,
            String xReferenceCode) {
        this.recordType = recordType;
        this.pos = pos;
        this.upc = upc;
        this.supplierProductCode = supplierProductCode;
        this.productDescription1 = productDescription1;
        this.tradeMarkCode = tradeMarkCode;
        this.productGroup2Text = productGroup2Text;
        this.weight = weight;
        this.rimDiameterInInch = rimDiameterInInch;
        this.sectionWidthInMm = sectionWidthInMm;
        this.aspectRatio = aspectRatio;
        this.loadIndex1 = loadIndex1;
        this.speedSymbol1 = speedSymbol1;
        this.treadDesign1 = treadDesign1;
        this.grossPrice = grossPrice;
        this.grossPriceValidFrom = grossPriceValidFrom;
        this.netValue = netValue;
        this.xReferenceCode = xReferenceCode;
    }

    /**
     * Getter for RecordType.
     * @return Returns the String
     */
    @JsonGetter("recordType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Setter for RecordType.
     * @param recordType Value for String
     */
    @JsonSetter("recordType")
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * Getter for Pos.
     * @return Returns the String
     */
    @JsonGetter("pos")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPos() {
        return pos;
    }

    /**
     * Setter for Pos.
     * @param pos Value for String
     */
    @JsonSetter("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    /**
     * Getter for Upc.
     * @return Returns the String
     */
    @JsonGetter("upc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpc() {
        return upc;
    }

    /**
     * Setter for Upc.
     * @param upc Value for String
     */
    @JsonSetter("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * Getter for SupplierProductCode.
     * @return Returns the String
     */
    @JsonGetter("supplierProductCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSupplierProductCode() {
        return supplierProductCode;
    }

    /**
     * Setter for SupplierProductCode.
     * @param supplierProductCode Value for String
     */
    @JsonSetter("supplierProductCode")
    public void setSupplierProductCode(String supplierProductCode) {
        this.supplierProductCode = supplierProductCode;
    }

    /**
     * Getter for ProductDescription1.
     * @return Returns the String
     */
    @JsonGetter("productDescription1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductDescription1() {
        return productDescription1;
    }

    /**
     * Setter for ProductDescription1.
     * @param productDescription1 Value for String
     */
    @JsonSetter("productDescription1")
    public void setProductDescription1(String productDescription1) {
        this.productDescription1 = productDescription1;
    }

    /**
     * Getter for TradeMarkCode.
     * @return Returns the String
     */
    @JsonGetter("tradeMarkCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTradeMarkCode() {
        return tradeMarkCode;
    }

    /**
     * Setter for TradeMarkCode.
     * @param tradeMarkCode Value for String
     */
    @JsonSetter("tradeMarkCode")
    public void setTradeMarkCode(String tradeMarkCode) {
        this.tradeMarkCode = tradeMarkCode;
    }

    /**
     * Getter for ProductGroup2Text.
     * @return Returns the String
     */
    @JsonGetter("productGroup2Text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductGroup2Text() {
        return productGroup2Text;
    }

    /**
     * Setter for ProductGroup2Text.
     * @param productGroup2Text Value for String
     */
    @JsonSetter("productGroup2Text")
    public void setProductGroup2Text(String productGroup2Text) {
        this.productGroup2Text = productGroup2Text;
    }

    /**
     * Getter for Weight.
     * @return Returns the String
     */
    @JsonGetter("weight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWeight() {
        return weight;
    }

    /**
     * Setter for Weight.
     * @param weight Value for String
     */
    @JsonSetter("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * Getter for RimDiameterInInch.
     * @return Returns the String
     */
    @JsonGetter("rimDiameterInInch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRimDiameterInInch() {
        return rimDiameterInInch;
    }

    /**
     * Setter for RimDiameterInInch.
     * @param rimDiameterInInch Value for String
     */
    @JsonSetter("rimDiameterInInch")
    public void setRimDiameterInInch(String rimDiameterInInch) {
        this.rimDiameterInInch = rimDiameterInInch;
    }

    /**
     * Getter for SectionWidthInMm.
     * @return Returns the String
     */
    @JsonGetter("sectionWidthInMm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSectionWidthInMm() {
        return sectionWidthInMm;
    }

    /**
     * Setter for SectionWidthInMm.
     * @param sectionWidthInMm Value for String
     */
    @JsonSetter("sectionWidthInMm")
    public void setSectionWidthInMm(String sectionWidthInMm) {
        this.sectionWidthInMm = sectionWidthInMm;
    }

    /**
     * Getter for AspectRatio.
     * @return Returns the String
     */
    @JsonGetter("aspectRatio")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Setter for AspectRatio.
     * @param aspectRatio Value for String
     */
    @JsonSetter("aspectRatio")
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * Getter for LoadIndex1.
     * @return Returns the String
     */
    @JsonGetter("loadIndex1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLoadIndex1() {
        return loadIndex1;
    }

    /**
     * Setter for LoadIndex1.
     * @param loadIndex1 Value for String
     */
    @JsonSetter("loadIndex1")
    public void setLoadIndex1(String loadIndex1) {
        this.loadIndex1 = loadIndex1;
    }

    /**
     * Getter for SpeedSymbol1.
     * @return Returns the String
     */
    @JsonGetter("speedSymbol1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSpeedSymbol1() {
        return speedSymbol1;
    }

    /**
     * Setter for SpeedSymbol1.
     * @param speedSymbol1 Value for String
     */
    @JsonSetter("speedSymbol1")
    public void setSpeedSymbol1(String speedSymbol1) {
        this.speedSymbol1 = speedSymbol1;
    }

    /**
     * Getter for TreadDesign1.
     * @return Returns the String
     */
    @JsonGetter("treadDesign1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTreadDesign1() {
        return treadDesign1;
    }

    /**
     * Setter for TreadDesign1.
     * @param treadDesign1 Value for String
     */
    @JsonSetter("treadDesign1")
    public void setTreadDesign1(String treadDesign1) {
        this.treadDesign1 = treadDesign1;
    }

    /**
     * Getter for GrossPrice.
     * @return Returns the String
     */
    @JsonGetter("grossPrice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGrossPrice() {
        return grossPrice;
    }

    /**
     * Setter for GrossPrice.
     * @param grossPrice Value for String
     */
    @JsonSetter("grossPrice")
    public void setGrossPrice(String grossPrice) {
        this.grossPrice = grossPrice;
    }

    /**
     * Getter for GrossPriceValidFrom.
     * @return Returns the String
     */
    @JsonGetter("grossPriceValidFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGrossPriceValidFrom() {
        return grossPriceValidFrom;
    }

    /**
     * Setter for GrossPriceValidFrom.
     * @param grossPriceValidFrom Value for String
     */
    @JsonSetter("grossPriceValidFrom")
    public void setGrossPriceValidFrom(String grossPriceValidFrom) {
        this.grossPriceValidFrom = grossPriceValidFrom;
    }

    /**
     * Getter for NetValue.
     * @return Returns the String
     */
    @JsonGetter("netValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNetValue() {
        return netValue;
    }

    /**
     * Setter for NetValue.
     * @param netValue Value for String
     */
    @JsonSetter("netValue")
    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }

    /**
     * Getter for XReferenceCode.
     * @return Returns the String
     */
    @JsonGetter("xReferenceCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getXReferenceCode() {
        return xReferenceCode;
    }

    /**
     * Setter for XReferenceCode.
     * @param xReferenceCode Value for String
     */
    @JsonSetter("xReferenceCode")
    public void setXReferenceCode(String xReferenceCode) {
        this.xReferenceCode = xReferenceCode;
    }

    /**
     * Converts this PricatLine into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PricatLine [" + "recordType=" + recordType + ", pos=" + pos + ", upc=" + upc
                + ", supplierProductCode=" + supplierProductCode + ", productDescription1="
                + productDescription1 + ", tradeMarkCode=" + tradeMarkCode + ", productGroup2Text="
                + productGroup2Text + ", weight=" + weight + ", rimDiameterInInch="
                + rimDiameterInInch + ", sectionWidthInMm=" + sectionWidthInMm + ", aspectRatio="
                + aspectRatio + ", loadIndex1=" + loadIndex1 + ", speedSymbol1=" + speedSymbol1
                + ", treadDesign1=" + treadDesign1 + ", grossPrice=" + grossPrice
                + ", grossPriceValidFrom=" + grossPriceValidFrom + ", netValue=" + netValue
                + ", xReferenceCode=" + xReferenceCode + "]";
    }

    /**
     * Builds a new {@link PricatLine.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PricatLine.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .recordType(getRecordType())
                .pos(getPos())
                .upc(getUpc())
                .supplierProductCode(getSupplierProductCode())
                .productDescription1(getProductDescription1())
                .tradeMarkCode(getTradeMarkCode())
                .productGroup2Text(getProductGroup2Text())
                .weight(getWeight())
                .rimDiameterInInch(getRimDiameterInInch())
                .sectionWidthInMm(getSectionWidthInMm())
                .aspectRatio(getAspectRatio())
                .loadIndex1(getLoadIndex1())
                .speedSymbol1(getSpeedSymbol1())
                .treadDesign1(getTreadDesign1())
                .grossPrice(getGrossPrice())
                .grossPriceValidFrom(getGrossPriceValidFrom())
                .netValue(getNetValue())
                .xReferenceCode(getXReferenceCode());
        return builder;
    }

    /**
     * Class to build instances of {@link PricatLine}.
     */
    public static class Builder {
        private String recordType;
        private String pos;
        private String upc;
        private String supplierProductCode;
        private String productDescription1;
        private String tradeMarkCode;
        private String productGroup2Text;
        private String weight;
        private String rimDiameterInInch;
        private String sectionWidthInMm;
        private String aspectRatio;
        private String loadIndex1;
        private String speedSymbol1;
        private String treadDesign1;
        private String grossPrice;
        private String grossPriceValidFrom;
        private String netValue;
        private String xReferenceCode;



        /**
         * Setter for recordType.
         * @param  recordType  String value for recordType.
         * @return Builder
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * Setter for pos.
         * @param  pos  String value for pos.
         * @return Builder
         */
        public Builder pos(String pos) {
            this.pos = pos;
            return this;
        }

        /**
         * Setter for upc.
         * @param  upc  String value for upc.
         * @return Builder
         */
        public Builder upc(String upc) {
            this.upc = upc;
            return this;
        }

        /**
         * Setter for supplierProductCode.
         * @param  supplierProductCode  String value for supplierProductCode.
         * @return Builder
         */
        public Builder supplierProductCode(String supplierProductCode) {
            this.supplierProductCode = supplierProductCode;
            return this;
        }

        /**
         * Setter for productDescription1.
         * @param  productDescription1  String value for productDescription1.
         * @return Builder
         */
        public Builder productDescription1(String productDescription1) {
            this.productDescription1 = productDescription1;
            return this;
        }

        /**
         * Setter for tradeMarkCode.
         * @param  tradeMarkCode  String value for tradeMarkCode.
         * @return Builder
         */
        public Builder tradeMarkCode(String tradeMarkCode) {
            this.tradeMarkCode = tradeMarkCode;
            return this;
        }

        /**
         * Setter for productGroup2Text.
         * @param  productGroup2Text  String value for productGroup2Text.
         * @return Builder
         */
        public Builder productGroup2Text(String productGroup2Text) {
            this.productGroup2Text = productGroup2Text;
            return this;
        }

        /**
         * Setter for weight.
         * @param  weight  String value for weight.
         * @return Builder
         */
        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Setter for rimDiameterInInch.
         * @param  rimDiameterInInch  String value for rimDiameterInInch.
         * @return Builder
         */
        public Builder rimDiameterInInch(String rimDiameterInInch) {
            this.rimDiameterInInch = rimDiameterInInch;
            return this;
        }

        /**
         * Setter for sectionWidthInMm.
         * @param  sectionWidthInMm  String value for sectionWidthInMm.
         * @return Builder
         */
        public Builder sectionWidthInMm(String sectionWidthInMm) {
            this.sectionWidthInMm = sectionWidthInMm;
            return this;
        }

        /**
         * Setter for aspectRatio.
         * @param  aspectRatio  String value for aspectRatio.
         * @return Builder
         */
        public Builder aspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * Setter for loadIndex1.
         * @param  loadIndex1  String value for loadIndex1.
         * @return Builder
         */
        public Builder loadIndex1(String loadIndex1) {
            this.loadIndex1 = loadIndex1;
            return this;
        }

        /**
         * Setter for speedSymbol1.
         * @param  speedSymbol1  String value for speedSymbol1.
         * @return Builder
         */
        public Builder speedSymbol1(String speedSymbol1) {
            this.speedSymbol1 = speedSymbol1;
            return this;
        }

        /**
         * Setter for treadDesign1.
         * @param  treadDesign1  String value for treadDesign1.
         * @return Builder
         */
        public Builder treadDesign1(String treadDesign1) {
            this.treadDesign1 = treadDesign1;
            return this;
        }

        /**
         * Setter for grossPrice.
         * @param  grossPrice  String value for grossPrice.
         * @return Builder
         */
        public Builder grossPrice(String grossPrice) {
            this.grossPrice = grossPrice;
            return this;
        }

        /**
         * Setter for grossPriceValidFrom.
         * @param  grossPriceValidFrom  String value for grossPriceValidFrom.
         * @return Builder
         */
        public Builder grossPriceValidFrom(String grossPriceValidFrom) {
            this.grossPriceValidFrom = grossPriceValidFrom;
            return this;
        }

        /**
         * Setter for netValue.
         * @param  netValue  String value for netValue.
         * @return Builder
         */
        public Builder netValue(String netValue) {
            this.netValue = netValue;
            return this;
        }

        /**
         * Setter for xReferenceCode.
         * @param  xReferenceCode  String value for xReferenceCode.
         * @return Builder
         */
        public Builder xReferenceCode(String xReferenceCode) {
            this.xReferenceCode = xReferenceCode;
            return this;
        }

        /**
         * Builds a new {@link PricatLine} object using the set fields.
         * @return {@link PricatLine}
         */
        public PricatLine build() {
            return new PricatLine(recordType, pos, upc, supplierProductCode, productDescription1,
                    tradeMarkCode, productGroup2Text, weight, rimDiameterInInch, sectionWidthInMm,
                    aspectRatio, loadIndex1, speedSymbol1, treadDesign1, grossPrice,
                    grossPriceValidFrom, netValue, xReferenceCode);
        }
    }
}
