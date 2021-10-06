package com.kodluyoruz;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int x, y, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        x = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        y = input.nextInt();

        int i = 1;
        while (i <= x) {
            if (x % i == 0 && y % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        ekok = (x * y) / ebob;
        System.out.println("EKOK : " + ekok);
    }
}
