package org.example;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minute = seconds/60;
        int hour = seconds/3600;
        int second = seconds - (minute * 60);
        int k = hour/24;
        minute = (seconds - (hour * 3600)) / 60;
        hour = hour - k * 24;
        System.out.print(hour + ":");
        System.out.format("%02d:", minute);
        System.out.format("%02d", second);
    }
}