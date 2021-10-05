package com.kodluyoruz;

import java.util.Scanner;

public class IkininKuvveti {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        n= input.nextInt();

        for(int i =1; i<=n; i*=4){
            System.out.println(i);
        }
        System.out.println("------");

        for(int i =1; i<=n; i*=5){
            System.out.println(i);
        }

    }
}
