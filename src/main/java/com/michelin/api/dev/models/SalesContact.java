/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SalesContact type.
 */
public class SalesContact {
    private String name;

    /**
     * Default constructor.
     */
    public SalesContact() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    public SalesContact(
            String name) {
        this.name = name;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("Name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this SalesContact into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SalesContact [" + "name=" + name + "]";
    }

    /**
     * Builds a new {@link SalesContact.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SalesContact.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name);
        return builder;
    }

    /**
     * Class to build instances of {@link SalesContact}.
     */
    public static class Builder {
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link SalesContact} object using the set fields.
         * @return {@link SalesContact}
         */
        public SalesContact build() {
            return new SalesContact(name);
        }
    }
}
