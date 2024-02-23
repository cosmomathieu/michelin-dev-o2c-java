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
 * This is a model class for EnvelopeHeader type.
 */
public class EnvelopeHeader {
    private String documentID;
    private String variant;
    private String receiverID;
    private String senderID;
    private String messageType;
    private String interchangeID;
    private String timestamp;
    private String numberOfMessages;

    /**
     * Default constructor.
     */
    public EnvelopeHeader() {
    }

    /**
     * Initialization constructor.
     * @param  documentID  String value for documentID.
     * @param  variant  String value for variant.
     * @param  receiverID  String value for receiverID.
     * @param  senderID  String value for senderID.
     * @param  messageType  String value for messageType.
     * @param  timestamp  String value for timestamp.
     * @param  numberOfMessages  String value for numberOfMessages.
     * @param  interchangeID  String value for interchangeID.
     */
    public EnvelopeHeader(
            String documentID,
            String variant,
            String receiverID,
            String senderID,
            String messageType,
            String timestamp,
            String numberOfMessages,
            String interchangeID) {
        this.documentID = documentID;
        this.variant = variant;
        this.receiverID = receiverID;
        this.senderID = senderID;
        this.messageType = messageType;
        this.interchangeID = interchangeID;
        this.timestamp = timestamp;
        this.numberOfMessages = numberOfMessages;
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
     * Getter for ReceiverID.
     * @return Returns the String
     */
    @JsonGetter("ReceiverID")
    public String getReceiverID() {
        return receiverID;
    }

    /**
     * Setter for ReceiverID.
     * @param receiverID Value for String
     */
    @JsonSetter("ReceiverID")
    public void setReceiverID(String receiverID) {
        this.receiverID = receiverID;
    }

    /**
     * Getter for SenderID.
     * @return Returns the String
     */
    @JsonGetter("SenderID")
    public String getSenderID() {
        return senderID;
    }

    /**
     * Setter for SenderID.
     * @param senderID Value for String
     */
    @JsonSetter("SenderID")
    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    /**
     * Getter for MessageType.
     * @return Returns the String
     */
    @JsonGetter("MessageType")
    public String getMessageType() {
        return messageType;
    }

    /**
     * Setter for MessageType.
     * @param messageType Value for String
     */
    @JsonSetter("MessageType")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * Getter for InterchangeID.
     * @return Returns the String
     */
    @JsonGetter("InterchangeID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInterchangeID() {
        return interchangeID;
    }

    /**
     * Setter for InterchangeID.
     * @param interchangeID Value for String
     */
    @JsonSetter("InterchangeID")
    public void setInterchangeID(String interchangeID) {
        this.interchangeID = interchangeID;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the String
     */
    @JsonGetter("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for String
     */
    @JsonSetter("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for NumberOfMessages.
     * @return Returns the String
     */
    @JsonGetter("NumberOfMessages")
    public String getNumberOfMessages() {
        return numberOfMessages;
    }

    /**
     * Setter for NumberOfMessages.
     * @param numberOfMessages Value for String
     */
    @JsonSetter("NumberOfMessages")
    public void setNumberOfMessages(String numberOfMessages) {
        this.numberOfMessages = numberOfMessages;
    }

    /**
     * Converts this EnvelopeHeader into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EnvelopeHeader [" + "documentID=" + documentID + ", variant=" + variant
                + ", receiverID=" + receiverID + ", senderID=" + senderID + ", messageType="
                + messageType + ", timestamp=" + timestamp + ", numberOfMessages="
                + numberOfMessages + ", interchangeID=" + interchangeID + "]";
    }

    /**
     * Builds a new {@link EnvelopeHeader.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EnvelopeHeader.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(documentID, variant, receiverID, senderID, messageType,
                timestamp, numberOfMessages)
                .interchangeID(getInterchangeID());
        return builder;
    }

    /**
     * Class to build instances of {@link EnvelopeHeader}.
     */
    public static class Builder {
        private String documentID;
        private String variant;
        private String receiverID;
        private String senderID;
        private String messageType;
        private String timestamp;
        private String numberOfMessages;
        private String interchangeID;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  documentID  String value for documentID.
         * @param  variant  String value for variant.
         * @param  receiverID  String value for receiverID.
         * @param  senderID  String value for senderID.
         * @param  messageType  String value for messageType.
         * @param  timestamp  String value for timestamp.
         * @param  numberOfMessages  String value for numberOfMessages.
         */
        public Builder(String documentID, String variant, String receiverID, String senderID,
                String messageType, String timestamp, String numberOfMessages) {
            this.documentID = documentID;
            this.variant = variant;
            this.receiverID = receiverID;
            this.senderID = senderID;
            this.messageType = messageType;
            this.timestamp = timestamp;
            this.numberOfMessages = numberOfMessages;
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
         * Setter for receiverID.
         * @param  receiverID  String value for receiverID.
         * @return Builder
         */
        public Builder receiverID(String receiverID) {
            this.receiverID = receiverID;
            return this;
        }

        /**
         * Setter for senderID.
         * @param  senderID  String value for senderID.
         * @return Builder
         */
        public Builder senderID(String senderID) {
            this.senderID = senderID;
            return this;
        }

        /**
         * Setter for messageType.
         * @param  messageType  String value for messageType.
         * @return Builder
         */
        public Builder messageType(String messageType) {
            this.messageType = messageType;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for numberOfMessages.
         * @param  numberOfMessages  String value for numberOfMessages.
         * @return Builder
         */
        public Builder numberOfMessages(String numberOfMessages) {
            this.numberOfMessages = numberOfMessages;
            return this;
        }

        /**
         * Setter for interchangeID.
         * @param  interchangeID  String value for interchangeID.
         * @return Builder
         */
        public Builder interchangeID(String interchangeID) {
            this.interchangeID = interchangeID;
            return this;
        }

        /**
         * Builds a new {@link EnvelopeHeader} object using the set fields.
         * @return {@link EnvelopeHeader}
         */
        public EnvelopeHeader build() {
            return new EnvelopeHeader(documentID, variant, receiverID, senderID, messageType,
                    timestamp, numberOfMessages, interchangeID);
        }
    }
}
