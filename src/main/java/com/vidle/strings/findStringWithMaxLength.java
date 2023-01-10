package com.vidle.strings;

import java.util.Arrays;
import java.util.Comparator;

public class findStringWithMaxLength {

    /**
     * Find string with max length from Array of Strings via stream.
     */
    public static String findStringWithMaxLengthViaStream(String[] arrStr) {
        return Arrays.stream(arrStr).max(Comparator.comparingInt(String::length)).get();
    }

    public static void main(String[] args) {
        System.out.println(findStringWithMaxLengthViaStream(new String[] {"Hello world!"}));
    }
}
