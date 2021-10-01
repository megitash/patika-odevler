import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz : ");
        n1 = input.nextInt();

        System.out.println("ikinci sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.println("ucuncu sayiyi giriniz : ");
        n3 = input.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            if (n2 > n3) {
                System.out.println("n3<n2<n1");
            } else {
                System.out.println("n2<n3<n1");
            }
        } else if ((n2 > n1) && (n1 > n3)) {
            if (n1 > n3) {
                System.out.println("n3<n1<n2");
            } else {
                System.out.println("n1<n3<n2");
            }
        } else if ((n3 > n2) && (n3 > n1)) {
            if (n2 > n1) {
                System.out.println("n1<n2<n3");
            } else {
                System.out.println("n2<n1<n3");
            }
        }
    }
}
