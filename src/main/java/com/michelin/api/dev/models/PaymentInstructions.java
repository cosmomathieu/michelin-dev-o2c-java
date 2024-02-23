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
 * This is a model class for PaymentInstructions type.
 */
public class PaymentInstructions {
    private String partyFunctionCodeQualifier;
    private AccountHolderIdentification accountHolderIdentification;
    private InstitutionIdentification institutionIdentification;

    /**
     * Default constructor.
     */
    public PaymentInstructions() {
    }

    /**
     * Initialization constructor.
     * @param  partyFunctionCodeQualifier  String value for partyFunctionCodeQualifier.
     * @param  accountHolderIdentification  AccountHolderIdentification value for
     *         accountHolderIdentification.
     * @param  institutionIdentification  InstitutionIdentification value for
     *         institutionIdentification.
     */
    public PaymentInstructions(
            String partyFunctionCodeQualifier,
            AccountHolderIdentification accountHolderIdentification,
            InstitutionIdentification institutionIdentification) {
        this.partyFunctionCodeQualifier = partyFunctionCodeQualifier;
        this.accountHolderIdentification = accountHolderIdentification;
        this.institutionIdentification = institutionIdentification;
    }

    /**
     * Getter for PartyFunctionCodeQualifier.
     * @return Returns the String
     */
    @JsonGetter("PartyFunctionCodeQualifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPartyFunctionCodeQualifier() {
        return partyFunctionCodeQualifier;
    }

    /**
     * Setter for PartyFunctionCodeQualifier.
     * @param partyFunctionCodeQualifier Value for String
     */
    @JsonSetter("PartyFunctionCodeQualifier")
    public void setPartyFunctionCodeQualifier(String partyFunctionCodeQualifier) {
        this.partyFunctionCodeQualifier = partyFunctionCodeQualifier;
    }

    /**
     * Getter for AccountHolderIdentification.
     * @return Returns the AccountHolderIdentification
     */
    @JsonGetter("AccountHolderIdentification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountHolderIdentification getAccountHolderIdentification() {
        return accountHolderIdentification;
    }

    /**
     * Setter for AccountHolderIdentification.
     * @param accountHolderIdentification Value for AccountHolderIdentification
     */
    @JsonSetter("AccountHolderIdentification")
    public void setAccountHolderIdentification(AccountHolderIdentification accountHolderIdentification) {
        this.accountHolderIdentification = accountHolderIdentification;
    }

    /**
     * Getter for InstitutionIdentification.
     * @return Returns the InstitutionIdentification
     */
    @JsonGetter("InstitutionIdentification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstitutionIdentification getInstitutionIdentification() {
        return institutionIdentification;
    }

    /**
     * Setter for InstitutionIdentification.
     * @param institutionIdentification Value for InstitutionIdentification
     */
    @JsonSetter("InstitutionIdentification")
    public void setInstitutionIdentification(InstitutionIdentification institutionIdentification) {
        this.institutionIdentification = institutionIdentification;
    }

    /**
     * Converts this PaymentInstructions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentInstructions [" + "partyFunctionCodeQualifier=" + partyFunctionCodeQualifier
                + ", accountHolderIdentification=" + accountHolderIdentification
                + ", institutionIdentification=" + institutionIdentification + "]";
    }

    /**
     * Builds a new {@link PaymentInstructions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentInstructions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .partyFunctionCodeQualifier(getPartyFunctionCodeQualifier())
                .accountHolderIdentification(getAccountHolderIdentification())
                .institutionIdentification(getInstitutionIdentification());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentInstructions}.
     */
    public static class Builder {
        private String partyFunctionCodeQualifier;
        private AccountHolderIdentification accountHolderIdentification;
        private InstitutionIdentification institutionIdentification;



        /**
         * Setter for partyFunctionCodeQualifier.
         * @param  partyFunctionCodeQualifier  String value for partyFunctionCodeQualifier.
         * @return Builder
         */
        public Builder partyFunctionCodeQualifier(String partyFunctionCodeQualifier) {
            this.partyFunctionCodeQualifier = partyFunctionCodeQualifier;
            return this;
        }

        /**
         * Setter for accountHolderIdentification.
         * @param  accountHolderIdentification  AccountHolderIdentification value for
         *         accountHolderIdentification.
         * @return Builder
         */
        public Builder accountHolderIdentification(
                AccountHolderIdentification accountHolderIdentification) {
            this.accountHolderIdentification = accountHolderIdentification;
            return this;
        }

        /**
         * Setter for institutionIdentification.
         * @param  institutionIdentification  InstitutionIdentification value for
         *         institutionIdentification.
         * @return Builder
         */
        public Builder institutionIdentification(
                InstitutionIdentification institutionIdentification) {
            this.institutionIdentification = institutionIdentification;
            return this;
        }

        /**
         * Builds a new {@link PaymentInstructions} object using the set fields.
         * @return {@link PaymentInstructions}
         */
        public PaymentInstructions build() {
            return new PaymentInstructions(partyFunctionCodeQualifier, accountHolderIdentification,
                    institutionIdentification);
        }
    }
}
