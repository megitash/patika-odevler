package com.kodluyoruz;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int i = 0, sayi, k = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();

        while (i <= sayi) {
            if (i % 12 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("-----");

    }
}
