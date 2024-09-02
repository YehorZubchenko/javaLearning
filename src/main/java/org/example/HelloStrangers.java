package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner first_scanner = new Scanner(System.in);
        int quantity = first_scanner.nextInt();
        if (quantity == 0) {
            System.out.println("Oh, it looks like there is no one here");
        }
        else if (quantity < 0) {
            System.out.println("Seriously? Why so negative?");
        }
        else {
            for (int i = 0; i < quantity; i++) {
                Scanner names_scanner = new Scanner(System.in);
                System.out.println("Hello, " + names_scanner.nextLine());
            }
        }
    }
}
