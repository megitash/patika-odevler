import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int yas, tip;
        double tutar, km;
        Scanner input = new Scanner(System.in);
        System.out.println("Km Giriniz : ");
        km = input.nextInt();

        if (km > 0) {

            System.out.println("Yas Giriniz : ");
            yas = input.nextInt();

            System.out.println("Ucus Tipi Seciniz : 1-Tek Yon, 2- Gidis/donus");
            tip = input.nextInt();

            tutar = 0.1 * km;

            switch (tip) {
                case (1):
                    if (yas < 12) {
                        System.out.println(tutar - (tutar / 2));
                    } else if (yas > 12 && yas < 24) {
                        System.out.println(tutar - (tutar * 0.1));
                    } else if (yas > 24 && yas < 65) {
                        System.out.println(tutar);
                    } else {
                        System.out.println(tutar - (tutar * 0.3));
                    }
                    break;

                case (2):
                    if (yas < 12) {
                        System.out.println(tutar - ((tutar - (tutar / 2)) * 0.2));
                    } else if (yas > 12 && yas < 24) {
                        System.out.println(tutar - (tutar - (tutar * 0.1)) * 0.2);
                    } else if (yas > 24 && yas < 65) {
                        System.out.println(tutar - tutar * 0.2);
                    } else {
                        System.out.println(tutar - (tutar - (tutar * 0.3)) * 0.2);
                    }
                    break;

                default:
                    System.out.println("Hatali Veri Girdiniz");
                    break;
            }
        } else {
            System.out.println("Hatali Veri Girdiniz");
        }
    }
}







