package Sorular;

import java.util.Scanner;

public class C01_Soru_1 {

    public static void main(String[] args) {

        // Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen İsminizi giriniz.");

        String KullaniciAdi= scan.next();
        System.out.println();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz.");

        int sayi= scan.nextInt();
        System.out.println();

        Scanner snan2 = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz.");

        double sayi2= scan.nextDouble();
        System.out.println("İdealin Ustundesiniz.");

    }
}
