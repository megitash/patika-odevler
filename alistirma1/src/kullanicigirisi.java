import java.util.Scanner;

public class kullanicigirisi {

    public static void main(String[] args) {

        String username, password;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adiniz : ");
        username = input.nextLine();

        System.out.println("sifreniz : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("1234")) {
            System.out.println("Giris yapiniz");
        } else {
            System.out.println("Hatali Giris");
            System.out.println("Sifrenizi sifirlamak ister misiniz ? ");

            System.out.println("1-yes\n2-no");
            System.out.print("Seciminiz: ");
            select = input.nextInt();

            switch (select) {
                case (1):
                    System.out.println("oncekinden farkli bir sifre giriniz");
                    break;
                case (2):
                    System.out.println("Kullanici adi ve sifrenizi giriniz");
                    break;
                default:
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz. ");
                    break;
            }
        }
    }
}



