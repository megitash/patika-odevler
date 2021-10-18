package com.kodluyoruz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Frekans {
    public static void main(String[] args) {

        int sayac1 = 0;
        int sayac2 = 0;
        int sayac3 = 0;

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi : [10, 20, 20, 10, 10, 20, 5, 20]");


        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 10) {
                sayac1 = sayac1 + 1;
            }
            if (dizi[i] == 20) {
                sayac2 = sayac2 + 1;
            }
            if (dizi[i] == 5) {
                sayac3 = sayac3 + 1;

            }
        }
        System.out.println(10 + " sayısı " + sayac1 + " kere tekrar edildi.");
        System.out.println(20 + " sayısı " + sayac2 + " kere tekrar edildi.");
        System.out.println(5 + " sayısı " + sayac3 + " kere tekrar edildi.");

    }

}


