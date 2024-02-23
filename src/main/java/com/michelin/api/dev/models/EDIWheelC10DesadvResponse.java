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
 * This is a model class for EDIWheelC10DesadvResponse type.
 */
public class EDIWheelC10DesadvResponse {
    private EnvelopeHeader envelopeHeader;
    private ErrorHead errorHead;
    private List<Desadv> desadv;

    /**
     * Default constructor.
     */
    public EDIWheelC10DesadvResponse() {
    }

    /**
     * Initialization constructor.
     * @param  envelopeHeader  EnvelopeHeader value for envelopeHeader.
     * @param  errorHead  ErrorHead value for errorHead.
     * @param  desadv  List of Desadv value for desadv.
     */
    public EDIWheelC10DesadvResponse(
            EnvelopeHeader envelopeHeader,
            ErrorHead errorHead,
            List<Desadv> desadv) {
        this.envelopeHeader = envelopeHeader;
        this.errorHead = errorHead;
        this.desadv = desadv;
    }

    /**
     * Getter for EnvelopeHeader.
     * @return Returns the EnvelopeHeader
     */
    @JsonGetter("EnvelopeHeader")
    public EnvelopeHeader getEnvelopeHeader() {
        return envelopeHeader;
    }

    /**
     * Setter for EnvelopeHeader.
     * @param envelopeHeader Value for EnvelopeHeader
     */
    @JsonSetter("EnvelopeHeader")
    public void setEnvelopeHeader(EnvelopeHeader envelopeHeader) {
        this.envelopeHeader = envelopeHeader;
    }

    /**
     * Getter for ErrorHead.
     * @return Returns the ErrorHead
     */
    @JsonGetter("ErrorHead")
    public ErrorHead getErrorHead() {
        return errorHead;
    }

    /**
     * Setter for ErrorHead.
     * @param errorHead Value for ErrorHead
     */
    @JsonSetter("ErrorHead")
    public void setErrorHead(ErrorHead errorHead) {
        this.errorHead = errorHead;
    }

    /**
     * Getter for Desadv.
     * @return Returns the List of Desadv
     */
    @JsonGetter("desadv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Desadv> getDesadv() {
        return desadv;
    }

    /**
     * Setter for Desadv.
     * @param desadv Value for List of Desadv
     */
    @JsonSetter("desadv")
    public void setDesadv(List<Desadv> desadv) {
        this.desadv = desadv;
    }

    /**
     * Converts this EDIWheelC10DesadvResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EDIWheelC10DesadvResponse [" + "envelopeHeader=" + envelopeHeader + ", errorHead="
                + errorHead + ", desadv=" + desadv + "]";
    }

    /**
     * Builds a new {@link EDIWheelC10DesadvResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EDIWheelC10DesadvResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(envelopeHeader, errorHead)
                .desadv(getDesadv());
        return builder;
    }

    /**
     * Class to build instances of {@link EDIWheelC10DesadvResponse}.
     */
    public static class Builder {
        private EnvelopeHeader envelopeHeader;
        private ErrorHead errorHead;
        private List<Desadv> desadv;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  envelopeHeader  EnvelopeHeader value for envelopeHeader.
         * @param  errorHead  ErrorHead value for errorHead.
         */
        public Builder(EnvelopeHeader envelopeHeader, ErrorHead errorHead) {
            this.envelopeHeader = envelopeHeader;
            this.errorHead = errorHead;
        }

        /**
         * Setter for envelopeHeader.
         * @param  envelopeHeader  EnvelopeHeader value for envelopeHeader.
         * @return Builder
         */
        public Builder envelopeHeader(EnvelopeHeader envelopeHeader) {
            this.envelopeHeader = envelopeHeader;
            return this;
        }

        /**
         * Setter for errorHead.
         * @param  errorHead  ErrorHead value for errorHead.
         * @return Builder
         */
        public Builder errorHead(ErrorHead errorHead) {
            this.errorHead = errorHead;
            return this;
        }

        /**
         * Setter for desadv.
         * @param  desadv  List of Desadv value for desadv.
         * @return Builder
         */
        public Builder desadv(List<Desadv> desadv) {
            this.desadv = desadv;
            return this;
        }

        /**
         * Builds a new {@link EDIWheelC10DesadvResponse} object using the set fields.
         * @return {@link EDIWheelC10DesadvResponse}
         */
        public EDIWheelC10DesadvResponse build() {
            return new EDIWheelC10DesadvResponse(envelopeHeader, errorHead, desadv);
        }
    }
}
