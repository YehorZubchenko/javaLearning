package org.example;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199, 10, 6, 11, 15, 17, 4, 7};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sum = 0;
        if (array == null || array.length == 0) {
            return sum;
        } else {
            for (int j : array) {
                if (j % 2 == 0) sum += j;
            }
            return sum;
        }
    }
}

