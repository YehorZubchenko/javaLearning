package org.example;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextInt();
        double quantity = scanner.nextInt();
        long payment_with_tips;
        if (amount < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (quantity <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            double part_to_pay = amount / quantity;
            System.out.println(part_to_pay);
            double tips = part_to_pay * 0.1;
            System.out.println(tips);
            double amount_from_friend = part_to_pay + tips;
            System.out.println(amount_from_friend);
            payment_with_tips =  Math.round(amount_from_friend);
            System.out.println(payment_with_tips);
        }
    }
}
