package com.kodluyoruz;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Girilen sayi : ");
        int sayi = input.nextInt();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i : list) {
            if (i < sayi) {


            }
            if (i < sayi) {

            }

        }
        System.out.println("Girilen sayıdan buyuk en yakın sayı : " + min);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + max);
    }
}