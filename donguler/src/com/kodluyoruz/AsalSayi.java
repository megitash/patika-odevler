package com.kodluyoruz;

public class AsalSayi {
    public static void main(String[] args) {

        int n = 0;
        for (int i = 2; i <= 100; i++) {
            int x = 0;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    x = 1;
                    break;
                }
            }
            if (x == 0) {
                System.out.print(i + " ");
                n++;
            }
        }
    }
}

