package com.company;

import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {
        double a, b, c, u;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Kenari Giriniz");
        a = input.nextInt();

        System.out.println("Ikinci Kenari Giriniz");
        b = input.nextInt();

        System.out.println("Ucuncu Kenari Giriniz");
        c = input.nextInt();

        u= (a+ b+ c)/2;
        double ucgenincevresi=2*u;
        double ucgeninalani=(u*(u-a)*(u-b)*(u-c));
        System.out.println(Math.pow(ucgeninalani,1.0/2.0));
    }
}

