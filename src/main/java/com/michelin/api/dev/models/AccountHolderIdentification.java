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
 * This is a model class for AccountHolderIdentification type.
 */
public class AccountHolderIdentification {
    private String accountHolderIdentifier;
    private String accountHolderName;
    private String currentIdentificationCode;

    /**
     * Default constructor.
     */
    public AccountHolderIdentification() {
    }

    /**
     * Initialization constructor.
     * @param  accountHolderIdentifier  String value for accountHolderIdentifier.
     * @param  accountHolderName  String value for accountHolderName.
     * @param  currentIdentificationCode  String value for currentIdentificationCode.
     */
    public AccountHolderIdentification(
            String accountHolderIdentifier,
            String accountHolderName,
            String currentIdentificationCode) {
        this.accountHolderIdentifier = accountHolderIdentifier;
        this.accountHolderName = accountHolderName;
        this.currentIdentificationCode = currentIdentificationCode;
    }

    /**
     * Getter for AccountHolderIdentifier.
     * @return Returns the String
     */
    @JsonGetter("AccountHolderIdentifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountHolderIdentifier() {
        return accountHolderIdentifier;
    }

    /**
     * Setter for AccountHolderIdentifier.
     * @param accountHolderIdentifier Value for String
     */
    @JsonSetter("AccountHolderIdentifier")
    public void setAccountHolderIdentifier(String accountHolderIdentifier) {
        this.accountHolderIdentifier = accountHolderIdentifier;
    }

    /**
     * Getter for AccountHolderName.
     * @return Returns the String
     */
    @JsonGetter("AccountHolderName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Setter for AccountHolderName.
     * @param accountHolderName Value for String
     */
    @JsonSetter("AccountHolderName")
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    /**
     * Getter for CurrentIdentificationCode.
     * @return Returns the String
     */
    @JsonGetter("CurrentIdentificationCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentIdentificationCode() {
        return currentIdentificationCode;
    }

    /**
     * Setter for CurrentIdentificationCode.
     * @param currentIdentificationCode Value for String
     */
    @JsonSetter("CurrentIdentificationCode")
    public void setCurrentIdentificationCode(String currentIdentificationCode) {
        this.currentIdentificationCode = currentIdentificationCode;
    }

    /**
     * Converts this AccountHolderIdentification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountHolderIdentification [" + "accountHolderIdentifier="
                + accountHolderIdentifier + ", accountHolderName=" + accountHolderName
                + ", currentIdentificationCode=" + currentIdentificationCode + "]";
    }

    /**
     * Builds a new {@link AccountHolderIdentification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountHolderIdentification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountHolderIdentifier(getAccountHolderIdentifier())
                .accountHolderName(getAccountHolderName())
                .currentIdentificationCode(getCurrentIdentificationCode());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountHolderIdentification}.
     */
    public static class Builder {
        private String accountHolderIdentifier;
        private String accountHolderName;
        private String currentIdentificationCode;



        /**
         * Setter for accountHolderIdentifier.
         * @param  accountHolderIdentifier  String value for accountHolderIdentifier.
         * @return Builder
         */
        public Builder accountHolderIdentifier(String accountHolderIdentifier) {
            this.accountHolderIdentifier = accountHolderIdentifier;
            return this;
        }

        /**
         * Setter for accountHolderName.
         * @param  accountHolderName  String value for accountHolderName.
         * @return Builder
         */
        public Builder accountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            return this;
        }

        /**
         * Setter for currentIdentificationCode.
         * @param  currentIdentificationCode  String value for currentIdentificationCode.
         * @return Builder
         */
        public Builder currentIdentificationCode(String currentIdentificationCode) {
            this.currentIdentificationCode = currentIdentificationCode;
            return this;
        }

        /**
         * Builds a new {@link AccountHolderIdentification} object using the set fields.
         * @return {@link AccountHolderIdentification}
         */
        public AccountHolderIdentification build() {
            return new AccountHolderIdentification(accountHolderIdentifier, accountHolderName,
                    currentIdentificationCode);
        }
    }
}
