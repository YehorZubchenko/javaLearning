package org.example;

import java.util.Arrays;

public class CycleSwap {
    public static void main(String[] args) {
        int[] array = {};
        CycleSwap.cycleSwap(array, 2);
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array) {
        if (array.length > 0) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            int[] temp = new int[shift];
            for (int i = 0; i < shift; i++) {
                temp[temp.length - 1 - i] = array[array.length - 1 - i];
            }
            for (int i = array.length - 1; i >= shift; i--) {
                array[i] = array[i - shift];
            }
            for (int i = 0; i < shift; i++) {
                array[i] = temp[i];
            }
        }
    }
}
