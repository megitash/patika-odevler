package com.kodluyoruz;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n, x, y;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayisi giriniz : ");
        n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (x = 1; x <= (n-i); x++) {
                System.out.print(" ");
            }
            for (y = 1; y <=((2 * i) - 1); y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
