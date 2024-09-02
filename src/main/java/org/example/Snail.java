package org.example;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        int height = scanner.nextInt();
        
        if((height>day) && (day-night<=0)) {
            System.out.println("Impossible");
        } else{
            int counter = 1;
            int progress = 0;
            for (int i = day; i < height; i+=day-night) {
                progress += day;
                counter++;
                progress -= night;
            }
            System.out.println(counter);
        }
    }
}
