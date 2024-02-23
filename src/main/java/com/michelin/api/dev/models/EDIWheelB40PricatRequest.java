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
 * This is a model class for EDIWheelB40PricatRequest type.
 */
public class EDIWheelB40PricatRequest {
    private String recordType;
    private String documentID;
    private String variant;
    private String documentDate;
    private String receiverID;
    private String countryCode;
    private String ediwheelVersion;
    private String catalogueType;
    private List<PricatLine> pricatLines;

    /**
     * Default constructor.
     */
    public EDIWheelB40PricatRequest() {
    }

    /**
     * Initialization constructor.
     * @param  recordType  String value for recordType.
     * @param  documentID  String value for documentID.
     * @param  variant  String value for variant.
     * @param  documentDate  String value for documentDate.
     * @param  receiverID  String value for receiverID.
     * @param  countryCode  String value for countryCode.
     * @param  ediwheelVersion  String value for ediwheelVersion.
     * @param  catalogueType  String value for catalogueType.
     * @param  pricatLines  List of PricatLine value for pricatLines.
     */
    public EDIWheelB40PricatRequest(
            String recordType,
            String documentID,
            String variant,
            String documentDate,
            String receiverID,
            String countryCode,
            String ediwheelVersion,
            String catalogueType,
            List<PricatLine> pricatLines) {
        this.recordType = recordType;
        this.documentID = documentID;
        this.variant = variant;
        this.documentDate = documentDate;
        this.receiverID = receiverID;
        this.countryCode = countryCode;
        this.ediwheelVersion = ediwheelVersion;
        this.catalogueType = catalogueType;
        this.pricatLines = pricatLines;
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
     * Getter for DocumentID.
     * @return Returns the String
     */
    @JsonGetter("documentID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Setter for DocumentID.
     * @param documentID Value for String
     */
    @JsonSetter("documentID")
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    /**
     * Getter for Variant.
     * @return Returns the String
     */
    @JsonGetter("variant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVariant() {
        return variant;
    }

    /**
     * Setter for Variant.
     * @param variant Value for String
     */
    @JsonSetter("variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    /**
     * Getter for DocumentDate.
     * @return Returns the String
     */
    @JsonGetter("documentDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDocumentDate() {
        return documentDate;
    }

    /**
     * Setter for DocumentDate.
     * @param documentDate Value for String
     */
    @JsonSetter("documentDate")
    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    /**
     * Getter for ReceiverID.
     * @return Returns the String
     */
    @JsonGetter("receiverID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * Setter for ReceiverID.
     * @param receiverID Value for String
     */
    @JsonSetter("receiverID")
    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    /**
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("countryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for EdiwheelVersion.
     * @return Returns the String
     */
    @JsonGetter("ediwheelVersion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEdiwheelVersion() {
        return ediwheelVersion;
    }

    /**
     * Setter for EdiwheelVersion.
     * @param ediwheelVersion Value for String
     */
    @JsonSetter("ediwheelVersion")
    public void setEdiwheelVersion(String ediwheelVersion) {
        this.ediwheelVersion = ediwheelVersion;
    }

    /**
     * Getter for CatalogueType.
     * @return Returns the String
     */
    @JsonGetter("catalogueType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCatalogueType() {
        return catalogueType;
    }

    /**
     * Setter for CatalogueType.
     * @param catalogueType Value for String
     */
    @JsonSetter("catalogueType")
    public void setCatalogueType(String catalogueType) {
        this.catalogueType = catalogueType;
    }

    /**
     * Getter for PricatLines.
     * @return Returns the List of PricatLine
     */
    @JsonGetter("pricatLines")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PricatLine> getPricatLines() {
        return pricatLines;
    }

    /**
     * Setter for PricatLines.
     * @param pricatLines Value for List of PricatLine
     */
    @JsonSetter("pricatLines")
    public void setPricatLines(List<PricatLine> pricatLines) {
        this.pricatLines = pricatLines;
    }

    /**
     * Converts this EDIWheelB40PricatRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelB40PricatRequest [" + "recordType=" + recordType + ", documentID="
                + documentID + ", variant=" + variant + ", documentDate=" + documentDate
                + ", receiverID=" + receiverID + ", countryCode=" + countryCode
                + ", ediwheelVersion=" + ediwheelVersion + ", catalogueType=" + catalogueType
                + ", pricatLines=" + pricatLines + "]";
    }

    /**
     * Builds a new {@link EDIWheelB40PricatRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelB40PricatRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .recordType(getRecordType())
                .documentID(getDocumentID())
                .variant(getVariant())
                .documentDate(getDocumentDate())
                .receiverID(getReceiverID())
                .countryCode(getCountryCode())
                .ediwheelVersion(getEdiwheelVersion())
                .catalogueType(getCatalogueType())
                .pricatLines(getPricatLines());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelB40PricatRequest}.
     */
    public static class Builder {
        private String recordType;
        private String documentID;
        private String variant;
        private String documentDate;
        private String receiverID;
        private String countryCode;
        private String ediwheelVersion;
        private String catalogueType;
        private List<PricatLine> pricatLines;



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
         * Setter for documentID.
         * @param  documentID  String value for documentID.
         * @return Builder
         */
        public Builder documentID(String documentID) {
            this.documentID = documentID;
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
         * Setter for documentDate.
         * @param  documentDate  String value for documentDate.
         * @return Builder
         */
        public Builder documentDate(String documentDate) {
            this.documentDate = documentDate;
            return this;
        }

        /**
         * Setter for receiverID.
         * @param  receiverID  String value for receiverID.
         * @return Builder
         */
        public Builder receiverID(String receiverID) {
            this.receiverID = receiverID;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for ediwheelVersion.
         * @param  ediwheelVersion  String value for ediwheelVersion.
         * @return Builder
         */
        public Builder ediwheelVersion(String ediwheelVersion) {
            this.ediwheelVersion = ediwheelVersion;
            return this;
        }

        /**
         * Setter for catalogueType.
         * @param  catalogueType  String value for catalogueType.
         * @return Builder
         */
        public Builder catalogueType(String catalogueType) {
            this.catalogueType = catalogueType;
            return this;
        }

        /**
         * Setter for pricatLines.
         * @param  pricatLines  List of PricatLine value for pricatLines.
         * @return Builder
         */
        public Builder pricatLines(List<PricatLine> pricatLines) {
            this.pricatLines = pricatLines;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelB40PricatRequest} object using the set fields.
         * @return {@link EDIWheelB40PricatRequest}
         */
        public EDIWheelB40PricatRequest build() {
            return new EDIWheelB40PricatRequest(recordType, documentID, variant, documentDate,
                    receiverID, countryCode, ediwheelVersion, catalogueType, pricatLines);
        }
    }
}
