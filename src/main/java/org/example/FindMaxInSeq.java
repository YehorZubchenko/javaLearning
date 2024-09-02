package org.example;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
