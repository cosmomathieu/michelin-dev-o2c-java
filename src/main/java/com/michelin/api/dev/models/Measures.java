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
 * This is a model class for Measures type.
 */
public class Measures {
    private GrossWeight grossWeight;
    private NetWeight netWeight;
    private Volume volume;

    /**
     * Default constructor.
     */
    public Measures() {
    }

    /**
     * Initialization constructor.
     * @param  grossWeight  GrossWeight value for grossWeight.
     * @param  netWeight  NetWeight value for netWeight.
     * @param  volume  Volume value for volume.
     */
    public Measures(
            GrossWeight grossWeight,
            NetWeight netWeight,
            Volume volume) {
        this.grossWeight = grossWeight;
        this.netWeight = netWeight;
        this.volume = volume;
    }

    /**
     * Getter for GrossWeight.
     * @return Returns the GrossWeight
     */
    @JsonGetter("GrossWeight")
    public GrossWeight getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter for GrossWeight.
     * @param grossWeight Value for GrossWeight
     */
    @JsonSetter("GrossWeight")
    public void setGrossWeight(GrossWeight grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter for NetWeight.
     * @return Returns the NetWeight
     */
    @JsonGetter("NetWeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetWeight getNetWeight() {
        return netWeight;
    }

    /**
     * Setter for NetWeight.
     * @param netWeight Value for NetWeight
     */
    @JsonSetter("NetWeight")
    public void setNetWeight(NetWeight netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter for Volume.
     * @return Returns the Volume
     */
    @JsonGetter("Volume")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Volume getVolume() {
        return volume;
    }

    /**
     * Setter for Volume.
     * @param volume Value for Volume
     */
    @JsonSetter("Volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    /**
     * Converts this Measures into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Measures [" + "grossWeight=" + grossWeight + ", netWeight=" + netWeight
                + ", volume=" + volume + "]";
    }

    /**
     * Builds a new {@link Measures.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Measures.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(grossWeight)
                .netWeight(getNetWeight())
                .volume(getVolume());
        return builder;
    }

    /**
     * Class to build instances of {@link Measures}.
     */
    public static class Builder {
        private GrossWeight grossWeight;
        private NetWeight netWeight;
        private Volume volume;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  grossWeight  GrossWeight value for grossWeight.
         */
        public Builder(GrossWeight grossWeight) {
            this.grossWeight = grossWeight;
        }

        /**
         * Setter for grossWeight.
         * @param  grossWeight  GrossWeight value for grossWeight.
         * @return Builder
         */
        public Builder grossWeight(GrossWeight grossWeight) {
            this.grossWeight = grossWeight;
            return this;
        }

        /**
         * Setter for netWeight.
         * @param  netWeight  NetWeight value for netWeight.
         * @return Builder
         */
        public Builder netWeight(NetWeight netWeight) {
            this.netWeight = netWeight;
            return this;
        }

        /**
         * Setter for volume.
         * @param  volume  Volume value for volume.
         * @return Builder
         */
        public Builder volume(Volume volume) {
            this.volume = volume;
            return this;
        }

        /**
         * Builds a new {@link Measures} object using the set fields.
         * @return {@link Measures}
         */
        public Measures build() {
            return new Measures(grossWeight, netWeight, volume);
        }
    }
}
