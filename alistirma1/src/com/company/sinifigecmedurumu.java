package com.company;

import java.util.Scanner;

public class sinifigecmedurumu {
    public static void main(String[] args) {

        int Matematik, Fizik, Türkçe, Kimya, Muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz : ");
        Matematik = input.nextInt();

        System.out.println("Fizik Notunuzu Giriniz : ");
        Fizik = input.nextInt();

        System.out.println("Turkce Notunuzu Giriniz : ");
        Türkçe = input.nextInt();

        System.out.println("Kimya Notunuzu Giriniz : ");
        Kimya = input.nextInt();

        System.out.println("Muzik Notunuzu Giriniz : ");
        Muzik = input.nextInt();

        double i = ((Matematik + Fizik + Türkçe + Kimya + Muzik) / 5);
        System.out.println("Ortalamaniz : " + i);

        if (i>55.0) {
            System.out.println("Gecti");

        }else if ((i<0) || (i>100)) {
            System.out.println("Ortalamaya girmediniz");

        } else{
                System.out.println("kaldi");

            }
        }

    }

