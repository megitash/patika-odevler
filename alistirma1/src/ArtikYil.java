import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int artik;
        Scanner input = new Scanner(System.in);
        System.out.println("Yil Giriniz");
        artik = input.nextInt();

        if (artik % 4 == 0) {
            System.out.println(artik + " artik bir yildir");
        } else {
            System.out.println(artik + " bir artik yil degildir");
        }

    }
}

