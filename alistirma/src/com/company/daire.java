package com.company;

import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double alan, r, pi, aci;
        Scanner input = new Scanner(System.in);
        System.out.println("Yaricap Giriniz: ");
        r = input.nextInt();
        System.out.println("Aci Giriniz: ");
        aci = input.nextInt();

        pi = 3.14;
        alan = pi * r * r * aci / 360;
        System.out.println("Alan: " + alan);

    }
}
