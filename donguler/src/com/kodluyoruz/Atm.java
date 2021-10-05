package com.kodluyoruz;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int right = 3;
        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz : ");
            String username = input.nextLine();

            System.out.print("Sifrenizi giriniz : ");
            String password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para Yatirma\n" + "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                int select = input.nextInt();

                int balance = 1500;
                switch (select) {
                    case (1):
                        System.out.print("Para Miktari : ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println(balance);
                        break;
                    case (2):
                        System.out.print("Para Miktari : ");
                        int price1 = input.nextInt();
                        if (price1 > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price1;
                            System.out.println(balance);
                        }
                        break;
                    case (3):
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case (4):
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }


        }


    }
}

