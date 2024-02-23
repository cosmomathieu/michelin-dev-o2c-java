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
 * This is a model class for InformationContact12 type.
 */
public class InformationContact12 {
    private List<String> name;

    /**
     * Default constructor.
     */
    public InformationContact12() {
    }

    /**
     * Initialization constructor.
     * @param  name  List of String value for name.
     */
    public InformationContact12(
            List<String> name) {
        this.name = name;
    }

    /**
     * Getter for Name.
     * @return Returns the List of String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for List of String
     */
    @JsonSetter("name")
    public void setName(List<String> name) {
        this.name = name;
    }

    /**
     * Converts this InformationContact12 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InformationContact12 [" + "name=" + name + "]";
    }

    /**
     * Builds a new {@link InformationContact12.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InformationContact12.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link InformationContact12}.
     */
    public static class Builder {
        private List<String> name;



        /**
         * Setter for name.
         * @param  name  List of String value for name.
         * @return Builder
         */
        public Builder name(List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link InformationContact12} object using the set fields.
         * @return {@link InformationContact12}
         */
        public InformationContact12 build() {
            return new InformationContact12(name);
        }
    }
}
