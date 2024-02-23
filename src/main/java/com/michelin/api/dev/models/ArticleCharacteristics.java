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
 * This is a model class for ArticleCharacteristics type.
 */
public class ArticleCharacteristics {
    private String noisePerformance;
    private String noiseClassType;
    private String rollingResistance;
    private String vehicleClass;
    private String wetGrip;
    private String eUDirectiveNumber;
    private String threePMSFMark;
    private String iceGripPICT;
    private String uRL5;

    /**
     * Default constructor.
     */
    public ArticleCharacteristics() {
    }

    /**
     * Initialization constructor.
     * @param  noisePerformance  String value for noisePerformance.
     * @param  noiseClassType  String value for noiseClassType.
     * @param  rollingResistance  String value for rollingResistance.
     * @param  vehicleClass  String value for vehicleClass.
     * @param  wetGrip  String value for wetGrip.
     * @param  eUDirectiveNumber  String value for eUDirectiveNumber.
     * @param  threePMSFMark  String value for threePMSFMark.
     * @param  iceGripPICT  String value for iceGripPICT.
     * @param  uRL5  String value for uRL5.
     */
    public ArticleCharacteristics(
            String noisePerformance,
            String noiseClassType,
            String rollingResistance,
            String vehicleClass,
            String wetGrip,
            String eUDirectiveNumber,
            String threePMSFMark,
            String iceGripPICT,
            String uRL5) {
        this.noisePerformance = noisePerformance;
        this.noiseClassType = noiseClassType;
        this.rollingResistance = rollingResistance;
        this.vehicleClass = vehicleClass;
        this.wetGrip = wetGrip;
        this.eUDirectiveNumber = eUDirectiveNumber;
        this.threePMSFMark = threePMSFMark;
        this.iceGripPICT = iceGripPICT;
        this.uRL5 = uRL5;
    }

    /**
     * Getter for NoisePerformance.
     * @return Returns the String
     */
    @JsonGetter("NoisePerformance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoisePerformance() {
        return noisePerformance;
    }

    /**
     * Setter for NoisePerformance.
     * @param noisePerformance Value for String
     */
    @JsonSetter("NoisePerformance")
    public void setNoisePerformance(String noisePerformance) {
        this.noisePerformance = noisePerformance;
    }

    /**
     * Getter for NoiseClassType.
     * @return Returns the String
     */
    @JsonGetter("NoiseClassType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoiseClassType() {
        return noiseClassType;
    }

    /**
     * Setter for NoiseClassType.
     * @param noiseClassType Value for String
     */
    @JsonSetter("NoiseClassType")
    public void setNoiseClassType(String noiseClassType) {
        this.noiseClassType = noiseClassType;
    }

    /**
     * Getter for RollingResistance.
     * @return Returns the String
     */
    @JsonGetter("RollingResistance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRollingResistance() {
        return rollingResistance;
    }

    /**
     * Setter for RollingResistance.
     * @param rollingResistance Value for String
     */
    @JsonSetter("RollingResistance")
    public void setRollingResistance(String rollingResistance) {
        this.rollingResistance = rollingResistance;
    }

    /**
     * Getter for VehicleClass.
     * @return Returns the String
     */
    @JsonGetter("VehicleClass")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Setter for VehicleClass.
     * @param vehicleClass Value for String
     */
    @JsonSetter("VehicleClass")
    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    /**
     * Getter for WetGrip.
     * @return Returns the String
     */
    @JsonGetter("WetGrip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWetGrip() {
        return wetGrip;
    }

    /**
     * Setter for WetGrip.
     * @param wetGrip Value for String
     */
    @JsonSetter("WetGrip")
    public void setWetGrip(String wetGrip) {
        this.wetGrip = wetGrip;
    }

    /**
     * Getter for EUDirectiveNumber.
     * @return Returns the String
     */
    @JsonGetter("EUDirectiveNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEUDirectiveNumber() {
        return eUDirectiveNumber;
    }

    /**
     * Setter for EUDirectiveNumber.
     * @param eUDirectiveNumber Value for String
     */
    @JsonSetter("EUDirectiveNumber")
    public void setEUDirectiveNumber(String eUDirectiveNumber) {
        this.eUDirectiveNumber = eUDirectiveNumber;
    }

    /**
     * Getter for ThreePMSFMark.
     * @return Returns the String
     */
    @JsonGetter("ThreePMSFMark")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getThreePMSFMark() {
        return threePMSFMark;
    }

    /**
     * Setter for ThreePMSFMark.
     * @param threePMSFMark Value for String
     */
    @JsonSetter("ThreePMSFMark")
    public void setThreePMSFMark(String threePMSFMark) {
        this.threePMSFMark = threePMSFMark;
    }

    /**
     * Getter for IceGripPICT.
     * @return Returns the String
     */
    @JsonGetter("IceGripPICT")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIceGripPICT() {
        return iceGripPICT;
    }

    /**
     * Setter for IceGripPICT.
     * @param iceGripPICT Value for String
     */
    @JsonSetter("IceGripPICT")
    public void setIceGripPICT(String iceGripPICT) {
        this.iceGripPICT = iceGripPICT;
    }

    /**
     * Getter for URL5.
     * @return Returns the String
     */
    @JsonGetter("URL5")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getURL5() {
        return uRL5;
    }

    /**
     * Setter for URL5.
     * @param uRL5 Value for String
     */
    @JsonSetter("URL5")
    public void setURL5(String uRL5) {
        this.uRL5 = uRL5;
    }

    /**
     * Converts this ArticleCharacteristics into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArticleCharacteristics [" + "noisePerformance=" + noisePerformance
                + ", noiseClassType=" + noiseClassType + ", rollingResistance=" + rollingResistance
                + ", vehicleClass=" + vehicleClass + ", wetGrip=" + wetGrip + ", eUDirectiveNumber="
                + eUDirectiveNumber + ", threePMSFMark=" + threePMSFMark + ", iceGripPICT="
                + iceGripPICT + ", uRL5=" + uRL5 + "]";
    }

    /**
     * Builds a new {@link ArticleCharacteristics.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArticleCharacteristics.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .noisePerformance(getNoisePerformance())
                .noiseClassType(getNoiseClassType())
                .rollingResistance(getRollingResistance())
                .vehicleClass(getVehicleClass())
                .wetGrip(getWetGrip())
                .eUDirectiveNumber(getEUDirectiveNumber())
                .threePMSFMark(getThreePMSFMark())
                .iceGripPICT(getIceGripPICT())
                .uRL5(getURL5());
        return builder;
    }

    /**
     * Class to build instances of {@link ArticleCharacteristics}.
     */
    public static class Builder {
        private String noisePerformance;
        private String noiseClassType;
        private String rollingResistance;
        private String vehicleClass;
        private String wetGrip;
        private String eUDirectiveNumber;
        private String threePMSFMark;
        private String iceGripPICT;
        private String uRL5;



        /**
         * Setter for noisePerformance.
         * @param  noisePerformance  String value for noisePerformance.
         * @return Builder
         */
        public Builder noisePerformance(String noisePerformance) {
            this.noisePerformance = noisePerformance;
            return this;
        }

        /**
         * Setter for noiseClassType.
         * @param  noiseClassType  String value for noiseClassType.
         * @return Builder
         */
        public Builder noiseClassType(String noiseClassType) {
            this.noiseClassType = noiseClassType;
            return this;
        }

        /**
         * Setter for rollingResistance.
         * @param  rollingResistance  String value for rollingResistance.
         * @return Builder
         */
        public Builder rollingResistance(String rollingResistance) {
            this.rollingResistance = rollingResistance;
            return this;
        }

        /**
         * Setter for vehicleClass.
         * @param  vehicleClass  String value for vehicleClass.
         * @return Builder
         */
        public Builder vehicleClass(String vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
        }

        /**
         * Setter for wetGrip.
         * @param  wetGrip  String value for wetGrip.
         * @return Builder
         */
        public Builder wetGrip(String wetGrip) {
            this.wetGrip = wetGrip;
            return this;
        }

        /**
         * Setter for eUDirectiveNumber.
         * @param  eUDirectiveNumber  String value for eUDirectiveNumber.
         * @return Builder
         */
        public Builder eUDirectiveNumber(String eUDirectiveNumber) {
            this.eUDirectiveNumber = eUDirectiveNumber;
            return this;
        }

        /**
         * Setter for threePMSFMark.
         * @param  threePMSFMark  String value for threePMSFMark.
         * @return Builder
         */
        public Builder threePMSFMark(String threePMSFMark) {
            this.threePMSFMark = threePMSFMark;
            return this;
        }

        /**
         * Setter for iceGripPICT.
         * @param  iceGripPICT  String value for iceGripPICT.
         * @return Builder
         */
        public Builder iceGripPICT(String iceGripPICT) {
            this.iceGripPICT = iceGripPICT;
            return this;
        }

        /**
         * Setter for uRL5.
         * @param  uRL5  String value for uRL5.
         * @return Builder
         */
        public Builder uRL5(String uRL5) {
            this.uRL5 = uRL5;
            return this;
        }

        /**
         * Builds a new {@link ArticleCharacteristics} object using the set fields.
         * @return {@link ArticleCharacteristics}
         */
        public ArticleCharacteristics build() {
            return new ArticleCharacteristics(noisePerformance, noiseClassType, rollingResistance,
                    vehicleClass, wetGrip, eUDirectiveNumber, threePMSFMark, iceGripPICT, uRL5);
        }
    }
}
