package org.example;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int quantity = 0;
        int average;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
            quantity ++;
        }
        average = sum / quantity;
        System.out.println(average);
    }
}
