package org.example;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5, 4, 2};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int newArrayLength = 0;
        if (array[0] <= array[1]) {
            newArrayLength++;
        }
        if (array[array.length - 1] <= array[array.length - 2]) {
            newArrayLength++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
                newArrayLength++;
            }
        }
        int[] resultArray = new int[newArrayLength];
        int index = 0;

        if (array[0] <= array[1]) {
            resultArray[index++] = array[0];
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (!(array[i] > array[i - 1] && array[i] > array[i + 1])) {
                resultArray[index++] = array[i];
            }
        }

        if (array[array.length - 1] <= array[array.length - 2]) {
            resultArray[index++] = array[array.length - 1];
        }

        return resultArray;
    }
}
