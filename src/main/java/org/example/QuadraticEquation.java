package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = (b * b) - (4 * a * c);
        double x1;
        double x2;
        if (D<0) {
            System.out.println("no roots");
        } else if (D==0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(format(x1));
        } else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(format(x1) + " " + format(x2));
        }
    }
    private static String format ( double value )
    {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(16);
        return nf.format(value);
    }
}

