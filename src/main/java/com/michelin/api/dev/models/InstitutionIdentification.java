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
 * This is a model class for InstitutionIdentification type.
 */
public class InstitutionIdentification {
    private String institutionNameCode;
    private String institutionName;
    private String codeListResponsibleAgencyCode;
    private String institutionBranchPlace;

    /**
     * Default constructor.
     */
    public InstitutionIdentification() {
    }

    /**
     * Initialization constructor.
     * @param  institutionNameCode  String value for institutionNameCode.
     * @param  institutionName  String value for institutionName.
     * @param  codeListResponsibleAgencyCode  String value for codeListResponsibleAgencyCode.
     * @param  institutionBranchPlace  String value for institutionBranchPlace.
     */
    public InstitutionIdentification(
            String institutionNameCode,
            String institutionName,
            String codeListResponsibleAgencyCode,
            String institutionBranchPlace) {
        this.institutionNameCode = institutionNameCode;
        this.institutionName = institutionName;
        this.codeListResponsibleAgencyCode = codeListResponsibleAgencyCode;
        this.institutionBranchPlace = institutionBranchPlace;
    }

    /**
     * Getter for InstitutionNameCode.
     * @return Returns the String
     */
    @JsonGetter("InstitutionNameCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstitutionNameCode() {
        return institutionNameCode;
    }

    /**
     * Setter for InstitutionNameCode.
     * @param institutionNameCode Value for String
     */
    @JsonSetter("InstitutionNameCode")
    public void setInstitutionNameCode(String institutionNameCode) {
        this.institutionNameCode = institutionNameCode;
    }

    /**
     * Getter for InstitutionName.
     * @return Returns the String
     */
    @JsonGetter("InstitutionName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Setter for InstitutionName.
     * @param institutionName Value for String
     */
    @JsonSetter("InstitutionName")
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    /**
     * Getter for CodeListResponsibleAgencyCode.
     * @return Returns the String
     */
    @JsonGetter("CodeListResponsibleAgencyCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCodeListResponsibleAgencyCode() {
        return codeListResponsibleAgencyCode;
    }

    /**
     * Setter for CodeListResponsibleAgencyCode.
     * @param codeListResponsibleAgencyCode Value for String
     */
    @JsonSetter("CodeListResponsibleAgencyCode")
    public void setCodeListResponsibleAgencyCode(String codeListResponsibleAgencyCode) {
        this.codeListResponsibleAgencyCode = codeListResponsibleAgencyCode;
    }

    /**
     * Getter for InstitutionBranchPlace.
     * @return Returns the String
     */
    @JsonGetter("InstitutionBranchPlace")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstitutionBranchPlace() {
        return institutionBranchPlace;
    }

    /**
     * Setter for InstitutionBranchPlace.
     * @param institutionBranchPlace Value for String
     */
    @JsonSetter("InstitutionBranchPlace")
    public void setInstitutionBranchPlace(String institutionBranchPlace) {
        this.institutionBranchPlace = institutionBranchPlace;
    }

    /**
     * Converts this InstitutionIdentification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InstitutionIdentification [" + "institutionNameCode=" + institutionNameCode
                + ", institutionName=" + institutionName + ", codeListResponsibleAgencyCode="
                + codeListResponsibleAgencyCode + ", institutionBranchPlace="
                + institutionBranchPlace + "]";
    }

    /**
     * Builds a new {@link InstitutionIdentification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InstitutionIdentification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .institutionNameCode(getInstitutionNameCode())
                .institutionName(getInstitutionName())
                .codeListResponsibleAgencyCode(getCodeListResponsibleAgencyCode())
                .institutionBranchPlace(getInstitutionBranchPlace());
        return builder;
    }

    /**
     * Class to build instances of {@link InstitutionIdentification}.
     */
    public static class Builder {
        private String institutionNameCode;
        private String institutionName;
        private String codeListResponsibleAgencyCode;
        private String institutionBranchPlace;



        /**
         * Setter for institutionNameCode.
         * @param  institutionNameCode  String value for institutionNameCode.
         * @return Builder
         */
        public Builder institutionNameCode(String institutionNameCode) {
            this.institutionNameCode = institutionNameCode;
            return this;
        }

        /**
         * Setter for institutionName.
         * @param  institutionName  String value for institutionName.
         * @return Builder
         */
        public Builder institutionName(String institutionName) {
            this.institutionName = institutionName;
            return this;
        }

        /**
         * Setter for codeListResponsibleAgencyCode.
         * @param  codeListResponsibleAgencyCode  String value for codeListResponsibleAgencyCode.
         * @return Builder
         */
        public Builder codeListResponsibleAgencyCode(String codeListResponsibleAgencyCode) {
            this.codeListResponsibleAgencyCode = codeListResponsibleAgencyCode;
            return this;
        }

        /**
         * Setter for institutionBranchPlace.
         * @param  institutionBranchPlace  String value for institutionBranchPlace.
         * @return Builder
         */
        public Builder institutionBranchPlace(String institutionBranchPlace) {
            this.institutionBranchPlace = institutionBranchPlace;
            return this;
        }

        /**
         * Builds a new {@link InstitutionIdentification} object using the set fields.
         * @return {@link InstitutionIdentification}
         */
        public InstitutionIdentification build() {
            return new InstitutionIdentification(institutionNameCode, institutionName,
                    codeListResponsibleAgencyCode, institutionBranchPlace);
        }
    }
}
