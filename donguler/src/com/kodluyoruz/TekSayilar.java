package com.kodluyoruz;

import java.util.Scanner;

public class TekSayilar {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz : ");
            sayi = input.nextInt();

            if (sayi % 2 == 1 && sayi % 4 == 1 && sayi % 4 == 2 && sayi % 4 == 3) ;
            toplam = toplam + sayi;
        }
        while (sayi % 2 == 0);
        System.out.println(toplam);

    }
}
