package Sorular;

import java.util.Scanner;

public class C02_Soru_2 {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        // yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen onadlikli sayi giriniz.");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lutfen tamsayi giriniz.");
        int tamsayi = scan.nextInt();

        System.out.println("Girilen sayilarin taplami : " + (ondalikliSayi+tamsayi));
        System.out.println("Girilen sayilarin carpimi : " + ondalikliSayi*tamsayi);

    }
}
