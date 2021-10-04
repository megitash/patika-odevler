import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        int mounth, day;
        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        mounth = input.nextInt();

        System.out.print("Dogdugunuz gun : ");
        day = input.nextInt();

        if (mounth == 1) {

            if (day < 22) {
                System.out.println("Oglak Burcu");
            } else {
                System.out.println("Kova Burcu");
            }
        } else {

        }
        if (mounth == 2) {

            if (day < 20) {
                System.out.println("Kova Burcu");
            } else {
                System.out.println("Balik Burcu");
            }
        } else {

        }

        if (mounth == 3) {

            if (day < 21) {
                System.out.println("Balik Burcu");
            } else if (day > 20) {
                System.out.println("Koc Burcu");
            }
        } else {

        }

        if (mounth == 4) {

            if (day < 21) {
                System.out.println("Koc Burcu");
            } else if (day > 20) {
                System.out.println("Boga Burcu");
            }
        } else {

        }

        if (mounth == 5) {

            if (day < 22) {
                System.out.println("Boga Burcu");
            } else if (day > 21) {
                System.out.println("Ikizler Burcu");
            }
        } else {
        }
        if (mounth == 6) {

            if (day < 23) {
                System.out.println("Ikizler Burcu");
            } else if (day > 22) {
                System.out.println("Yengec Burcu");
            }
        } else {
        }
        if (mounth == 7) {

            if (day < 23) {
                System.out.println("Yengec Burcu");
            } else if (day > 22) {
                System.out.println("Aslan Burcu");
            }
        } else {
        }
        if (mounth == 8) {

            if (day < 23) {
                System.out.println("Aslan Burcu");
            } else if (day > 22) {
                System.out.println("Basak Burcu");
            }
        } else {
        }
        if (mounth == 9) {

            if (day < 23) {
                System.out.println("Basak Burcu");
            } else if (day > 22) {
                System.out.println("Terazi Burcu");
            }
        } else {
        }
        if (mounth == 10) {

            if (day < 23) {
                System.out.println("Terazi Burcu");
            } else if (day > 22) {
                System.out.println("Akrep Burcu");
            }
        } else {
        }
        if (mounth == 11) {

            if (day < 22) {
                System.out.println("Akrep Burcu");
            } else if (day > 21) {
                System.out.println("Yay Burcu");
            }
        } else {
        }
        if (mounth == 12) {

            if (day < 22) {
                System.out.println("Yay Burcu");
            } else if (day > 21) {
                System.out.println("Oglak Burcu");
            }
        } else {
        }


    }


}

