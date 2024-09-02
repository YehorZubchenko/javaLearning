package org.example;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int rows2 = matrix2.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;
        int[][] resMatrix = new int[rows1][columns2];
        int tempsum;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                tempsum = 0;
                for (int k = 0; k < columns1; k++) {
                    tempsum += (matrix1[i][k] * matrix2[k][j]);
                }
                resMatrix[i][j] = tempsum;
            }
        }
        return resMatrix;
    }

    public static void main(String[] args) {
        int[][] a = {
                {6, 1, 2},
                {1, 3, 6} };
        int[][] b = {
                {5, 2},
                {4, 3},
                {3, 1} };
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
