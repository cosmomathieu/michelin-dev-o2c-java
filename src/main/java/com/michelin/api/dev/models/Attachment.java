/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Attachment type.
 */
public class Attachment {
    private String documentNumber;
    private String encodingScheme;
    private String mimeType;
    private String data;

    /**
     * Default constructor.
     */
    public Attachment() {
    }

    /**
     * Initialization constructor.
     * @param  documentNumber  String value for documentNumber.
     * @param  encodingScheme  String value for encodingScheme.
     * @param  mimeType  String value for mimeType.
     * @param  data  String value for data.
     */
    public Attachment(
            String documentNumber,
            String encodingScheme,
            String mimeType,
            String data) {
        this.documentNumber = documentNumber;
        this.encodingScheme = encodingScheme;
        this.mimeType = mimeType;
        this.data = data;
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
     * Getter for EncodingScheme.
     * @return Returns the String
     */
    @JsonGetter("EncodingScheme")
    public String getEncodingScheme() {
        return encodingScheme;
    }

    /**
     * Setter for EncodingScheme.
     * @param encodingScheme Value for String
     */
    @JsonSetter("EncodingScheme")
    public void setEncodingScheme(String encodingScheme) {
        this.encodingScheme = encodingScheme;
    }

    /**
     * Getter for MimeType.
     * @return Returns the String
     */
    @JsonGetter("MimeType")
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Setter for MimeType.
     * @param mimeType Value for String
     */
    @JsonSetter("MimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Getter for Data.
     * @return Returns the String
     */
    @JsonGetter("Data")
    public String getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for String
     */
    @JsonSetter("Data")
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Converts this Attachment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Attachment [" + "documentNumber=" + documentNumber + ", encodingScheme="
                + encodingScheme + ", mimeType=" + mimeType + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link Attachment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Attachment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentNumber, encodingScheme, mimeType, data);
        return builder;
    }

    /**
     * Class to build instances of {@link Attachment}.
     */
    public static class Builder {
        private String documentNumber;
        private String encodingScheme;
        private String mimeType;
        private String data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentNumber  String value for documentNumber.
         * @param  encodingScheme  String value for encodingScheme.
         * @param  mimeType  String value for mimeType.
         * @param  data  String value for data.
         */
        public Builder(String documentNumber, String encodingScheme, String mimeType, String data) {
            this.documentNumber = documentNumber;
            this.encodingScheme = encodingScheme;
            this.mimeType = mimeType;
            this.data = data;
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
         * Setter for encodingScheme.
         * @param  encodingScheme  String value for encodingScheme.
         * @return Builder
         */
        public Builder encodingScheme(String encodingScheme) {
            this.encodingScheme = encodingScheme;
            return this;
        }

        /**
         * Setter for mimeType.
         * @param  mimeType  String value for mimeType.
         * @return Builder
         */
        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  String value for data.
         * @return Builder
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Attachment} object using the set fields.
         * @return {@link Attachment}
         */
        public Attachment build() {
            return new Attachment(documentNumber, encodingScheme, mimeType, data);
        }
    }
}
