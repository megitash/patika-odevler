package com.kodluyoruz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();
        for (int i = 0; i <= sayi; i++ {

            if (sayi % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
