/*
 * MichelinOrder2Cash
 *
 * This file was automatically generated for Michelin by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.michelin.api.dev.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * AcceptEnum to be used.
 */
public enum AcceptEnum {
    ENUM_APPLICATIONJSON,

    ENUM_TEXTCSV;


    private static TreeMap<String, AcceptEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_APPLICATIONJSON.value = "application/json";
        ENUM_TEXTCSV.value = "text/csv";

        valueMap.put("application/json", ENUM_APPLICATIONJSON);
        valueMap.put("text/csv", ENUM_TEXTCSV);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AcceptEnum constructFromString(String toConvert) throws IOException {
        AcceptEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static AcceptEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of AcceptEnum values to list of string values.
     * @param toConvert The list of AcceptEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AcceptEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AcceptEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 