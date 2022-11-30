package com.vidle.dataStructures;

import java.util.Arrays;

public class copyArray {

    /**
     * ForLoop
     */

    public static int[] copyArrForLoop(int[] A) {
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        return B;
    }

    /**
     clone()
     */

    public static int[] cloneArr(int[] A) {
        int[] B = A.clone();
        return B;
    }

    /**
     System.arraycopy(
     Object src, //:source array, in this case A
     int srcPos, //:the start index for copy, typically 0
     Object dest, //:destination object in this case B.
     int destPos, //:the index to place the copied elements
     int length //:the length of the contents to be copied
     )
     */

    public static int[] systemArrCopy(int[] A) {
        int[] B = new int[A.length];
        System.arraycopy(A, 0, B, 0, A.length);
        return B;
    }

    /**
     Arrays.copyOf(
     int[] original, // :source array in this case A
     int newLength // :the length of the contents to be copied
     )
     */

    public static int[] arrCopyOf(int[] A, int length) {
        int[] B = Arrays.copyOf(A, length);
        return B;
    }

    /**
     copyOfRange(
     int[] original, // :source array in this case A
     int from,  //:the start index for copy, typically 0
     int to // the end index exclusive
     );
     */

    public static int[] arrCopyOfRange(int[] A, int length) {
        int[] B = Arrays.copyOfRange(A, 0, A.length);
        return B;
    }


}
