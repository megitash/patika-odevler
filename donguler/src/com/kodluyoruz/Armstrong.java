package com.kodluyoruz;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int number = inp.nextInt();
        int basnumber = 0;
        int tempnumber = number;
        int basValue = 0;
        int result = 0;
        int bastoplam = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;
            basnumber++;
        }
        tempnumber = number;
        while (tempnumber != 0) {
            basValue = tempnumber % 10;

            for (int i = 1; i <= basnumber; i++) {
                bastoplam += basValue;

            }
            tempnumber /= 10;
            System.out.println(bastoplam);

        }
    }
}

