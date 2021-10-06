package com.kodluyoruz;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int x, n1=0, n2=1, n3;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        x= input.nextInt();
        System.out.print(n1 + " " + n2);

        for(int i=2; i<x; i++){
            n3=n2+n1;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}

