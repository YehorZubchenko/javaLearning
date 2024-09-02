package org.example;

public class MaxMethod {
    public static void main(String[] args) {
        int[] vals = new int[]{ -2, 0, 10, 5, 20, -1, 0, 6, 21, 22, 19, 18 };
        int result = max(vals);
        System.out.println(result);
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) max = value;
        }
        return max;
    }

}
