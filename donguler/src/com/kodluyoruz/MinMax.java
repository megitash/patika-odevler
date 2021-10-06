package com.kodluyoruz;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int n, x, y, z, t;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        System.out.print((n-(n-1)) + ". Sayıyı giriniz : ");
        x = input.nextInt();

        System.out.print((n-(n-2)) + ". Sayıyı giriniz : ");
        y = input.nextInt();

        System.out.print((n-(n-3)) + ". Sayıyı giriniz : ");
        z = input.nextInt();

        System.out.print((n-(n-4)) + ". Sayıyı giriniz : ");
        t = input.nextInt();

        if ((x > y) && (x > z) && (x > t)) {
            System.out.println("En büyük sayı : " + x);
            if ((y > z) && (y > t)) {
                if (z > t) {
                    System.out.println("En kucuk sayı : " + t);
                } else {
                    System.out.println("En kucuk sayı : " + z);
                }
            } else {
                System.out.println("En kucuk sayı : " + y);
            }
        } else if ((y > x) && (y > z) && (y > t)) {
            System.out.println("En büyük sayı : " + y);
            if ((x > z) && (x > t)) {
                if (z > t) {
                    System.out.println("En kucuk sayı : " + t);
                } else {
                    System.out.println("En kucuk sayı : " + z);
                }
            } else {
                System.out.println("En kucuk sayı : " + x);
            }
        } else if ((z > x) && (z > y) && (z > t)) {
            System.out.println("En büyük sayı : " + z);
            if ((x > y) && (x > t)) {
                if (y > t) {
                    System.out.println("En kucuk sayı : " + t);
                } else {
                    System.out.println("En kucuk sayı : " + y);
                }
            } else {
                System.out.println("En kucuk sayı : " + x);
            }
        } else if ((t > x) && (t > y) && (t > z)) {
            System.out.println("En büyük sayı : " + t);
            if ((x > y) && (x > z)) {
                if (y > z) {
                    System.out.println("En kucuk sayı : " + z);
                } else {
                    System.out.println("En kucuk sayı : " + y);
                }
            } else {
                System.out.println("En kucuk sayı : " + x);
            }
        }
    }
}


