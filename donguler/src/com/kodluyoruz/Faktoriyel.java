package com.kodluyoruz;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N Giriniz : ");
        int n = input.nextInt();
        System.out.print("R Giriniz : ");
        int r = input.nextInt();
        int ntoplam = 1;

        for (int i = 1; i <= n; i++) {
            ntoplam = ntoplam*i;
        }
        System.out.println(n + "Faktoriyel : " + ntoplam);

        int rtoplam = 1;
        for (int i = 1; i <= r; i++) {
            rtoplam = rtoplam*i;
        }
        System.out.println(r + "Faktoriyel : " + rtoplam);

        int nrtoplam = 1;
        for (int i = 1; i <= (n-r); i++) {
            nrtoplam = nrtoplam*i;
        }
        System.out.println((n-r) + "Faktoriyel : " + nrtoplam);
        System.out.println("----");

        System.out.println(ntoplam/(rtoplam*nrtoplam));
    }
}
