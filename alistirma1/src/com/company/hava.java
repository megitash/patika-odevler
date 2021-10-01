package com.company;

import java.util.Scanner;

public class hava {
    public static void main(String[] args) {
        int d;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicaklik degeri giriniz");
        d = input.nextInt();

        if (d < 5) {
            System.out.println("Kayak ");
        } else if ((5 < d) && (d < 15)) {
            System.out.println("Sinema ");
        } else if ((15 < d) && (d < 25)) {
            System.out.println("piknik");
        } else {
            System.out.println("Yuzme ");
        }

            }
}



