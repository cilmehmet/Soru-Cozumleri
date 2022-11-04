package Sorular;

import java.util.Scanner;

public class C13_Soru_13 {

    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayi giriniz.");

        double dbl = scan.nextDouble();
        System.out.println("Lutfen 2. sayiyi giriniz.");
        int s1 =(int) dbl;

        int s2=scan.nextInt();

        System.out.println((s1)/(s2));


    }
}
