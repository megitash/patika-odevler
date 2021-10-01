package com.company;

import java.util.Scanner;

public class ogrencinotlari {

    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
	Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");

        mat = input.nextInt();


        System.out.println("Fizik Notunuzu Giriniz: ");

        fizik = input.nextInt();


        System.out.println("Kimya Notunuzu Giriniz: ");

        kimya = input.nextInt();


        System.out.println("Turkce Notunuzu Giriniz: ");

        turkce = input.nextInt();


        System.out.println("Tarih Notunuzu Giriniz: ");

        tarih = input.nextInt();


        System.out.println("Muzik Notunuzu Giriniz: ");

        muzik = input.nextInt();

        int toplam= (mat+ fizik+ kimya+ turkce+ tarih+ muzik);
        double sonuc = (toplam / 6.0);
               System.out.println("Ortalamaniz: " + sonuc);

        System.out.println(((sonuc>60)?"Gecti":"Kaldi"));
    }
}
