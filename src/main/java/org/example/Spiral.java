package org.example;

public class Spiral {
    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(5, 5);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }

    static int[][] spiral(int rows, int columns) {
        int count = 0;
        int[][] array = new int[rows][columns];
        int a = 0;
        int b = 1;
        int c = 2;
        outer: while(true) {
            for (int i = a; i < columns - a; i++) {
                array[a][i] = ++count;
                if (count == rows * columns) break outer;
            }
            for (int i = b; i < rows - a; i++) {
                array[i][columns - b] = ++count;
                if (count == rows * columns) break outer;
            }
            for (int i = columns - c; i >= a; i--) {
                array[rows - b][i] = ++count;
                if (count == rows * columns) break outer;
            }
            for (int i = rows - c; i > a; i--) {
                array[i][a] = ++count;
                if (count == rows * columns) break outer;
            }
            a++;
            b++;
            c++;
        }
        return array;
    }

}
