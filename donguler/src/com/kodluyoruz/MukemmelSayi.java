package com.kodluyoruz;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        n = input.nextInt();

        int i = 1, toplam = 0;
        while (i < n) {
            if (n % i == 0) {
                toplam += i;
            }
            i++;
        }
        if (toplam==n){
            System.out.println(n + " Mukemmel sayidir.");
        }else{
            System.out.println(n + " Mukemmel sayi degildir.");
        }
    }
}
