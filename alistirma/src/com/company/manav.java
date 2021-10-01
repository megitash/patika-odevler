package com.company;

import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplamtutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kac Kilo? : ");
        armut = input.nextDouble();

        System.out.println("Elma Kac Kilo? : ");
        elma = input.nextDouble();


        System.out.println("Domates Kac Kilo? : ");
        domates = input.nextDouble();


        System.out.println("Muz Kac Kilo? : ");
        muz = input.nextDouble();


        System.out.println("Patlican Kac Kilo? : ");
        patlican = input.nextDouble();

        armut = armut * 2.14;
        elma = elma * 3.67;
        domates = domates * 1.11;
        muz = muz * 0.95;
        patlican = patlican * 5.0;

        toplamtutar = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar: " + toplamtutar + " Tl");

    }
}
