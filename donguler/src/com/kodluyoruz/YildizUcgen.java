package com.kodluyoruz;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = n; x >= 1; x--) {
            for (int m = 1; m <= (n - x); m++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * x) - 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}

