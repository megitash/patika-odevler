
import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double tutar, kdvorani = 0.18, kdvorani1 =0.08, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Tutar Giriniz");
        tutar = input.nextInt();

        double kdvtutari = tutar * kdvorani;
        double kdvtutari1= tutar * kdvorani1;
        double gercekfiyat = tutar + kdvtutari;
        double gercekfiyat1 = tutar + kdvtutari1;
        if(tutar<1000){
            System.out.println(gercekfiyat);
        }
        else {
            System.out.println(gercekfiyat1);
        }

    }

}



