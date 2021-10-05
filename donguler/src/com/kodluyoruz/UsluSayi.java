package com.kodluyoruz;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int x, y, total=1;
        Scanner input = new Scanner(System.in);
        System.out.print("ussu alinacak sayi : ");
        x= input.nextInt();

        System.out.print("us : ");
        y= input.nextInt();

        for (int i=1; i<=y; i++){
            total*=x;
        }
        System.out.println(total);
    }
}
