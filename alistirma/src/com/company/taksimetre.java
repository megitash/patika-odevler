package com.company;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double km, tutar, toplamtutar, acilis;
        Scanner input = new Scanner(System.in);
        System.out.println("Km Giriniz: ");
        km = input.nextInt();

        tutar = km * 2.20;
        acilis = 10 ;
        toplamtutar = acilis + tutar;
        System.out.println((toplamtutar<20)?20:toplamtutar);

            }
        }
