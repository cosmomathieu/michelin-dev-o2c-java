/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for HeaderNote type.
 */
public class HeaderNote {
    private String languageCode;
    private List<String> note;

    /**
     * Default constructor.
     */
    public HeaderNote() {
    }

    /**
     * Initialization constructor.
     * @param  languageCode  String value for languageCode.
     * @param  note  List of String value for note.
     */
    public HeaderNote(
            String languageCode,
            List<String> note) {
        this.languageCode = languageCode;
        this.note = note;
    }

    /**
     * Getter for LanguageCode.
     * @return Returns the String
     */
    @JsonGetter("LanguageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Setter for LanguageCode.
     * @param languageCode Value for String
     */
    @JsonSetter("LanguageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Getter for Note.
     * @return Returns the List of String
     */
    @JsonGetter("Note")
    public List<String> getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * @param note Value for List of String
     */
    @JsonSetter("Note")
    public void setNote(List<String> note) {
        this.note = note;
    }

    /**
     * Converts this HeaderNote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "HeaderNote [" + "languageCode=" + languageCode + ", note=" + note + "]";
    }

    /**
     * Builds a new {@link HeaderNote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link HeaderNote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(languageCode, note);
        return builder;
    }

    /**
     * Class to build instances of {@link HeaderNote}.
     */
    public static class Builder {
        private String languageCode;
        private List<String> note;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  languageCode  String value for languageCode.
         * @param  note  List of String value for note.
         */
        public Builder(String languageCode, List<String> note) {
            this.languageCode = languageCode;
            this.note = note;
        }

        /**
         * Setter for languageCode.
         * @param  languageCode  String value for languageCode.
         * @return Builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  List of String value for note.
         * @return Builder
         */
        public Builder note(List<String> note) {
            this.note = note;
            return this;
        }

        /**
         * Builds a new {@link HeaderNote} object using the set fields.
         * @return {@link HeaderNote}
         */
        public HeaderNote build() {
            return new HeaderNote(languageCode, note);
        }
    }
}
