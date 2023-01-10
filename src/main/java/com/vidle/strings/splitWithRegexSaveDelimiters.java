package com.vidle.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class splitWithRegexSaveDelimiters {

    /**
     * split String and save delimiters
     * @link  https://www.baeldung.com/java-split-string-keep-delimiters
     */
    public static String convertToSnakeCase(String str) {
        return Arrays.stream(str.split("(?=[A-Z])")).map(String::toLowerCase).collect(Collectors.joining("_"));
    }

    public static void main(String[] args) {
        System.out.println(convertToSnakeCase("camelCaseTwice"));
    }
}
