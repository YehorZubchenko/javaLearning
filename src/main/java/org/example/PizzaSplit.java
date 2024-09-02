package org.example;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int pieces = scanner.nextInt();
        int pizzas = 1;
        while (true) {
            if ((pizzas * pieces) % people != 0) pizzas++;
            else break;
        }
        System.out.println(pizzas);
    }
}
