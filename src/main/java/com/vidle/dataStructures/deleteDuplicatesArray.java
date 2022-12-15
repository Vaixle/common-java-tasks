package com.vidle.dataStructures;

import java.util.Arrays;

public class deleteDuplicatesArray {

    /**
     * Delete duplicates from array of primitives
     */
    private static int[] deleteDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}
