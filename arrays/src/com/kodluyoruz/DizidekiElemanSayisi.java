package com.kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanSayisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();

        int[] dizi = new int[n];

        System.out.print("Dizinin elemanlarini giriniz : ");
        System.out.println();
        int sayi = 0;
        for (int i = 0; i < n; ) {
            System.out.print((i + 1) + ". Elemani : ");
            sayi = input.nextInt();
            i++;

        }

    }

}

//        Arrays.sort();
//        System.out.println();

