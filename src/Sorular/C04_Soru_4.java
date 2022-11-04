package Sorular;

import java.util.Scanner;

public class C04_Soru_4 {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("dikdortgenin kısa kenar uzunlugunu giriniz.");
        double dikdortgeninKisaKenarUzunlugu = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz.");
        double dikdortgeninİUzuninciKenarUzunlugu = scan.nextDouble();

        System.out.println("dikdortgenin kisa kenar uzunlugu : " + "dikdortgenin uzun kenar uzunlugu : " +
                (dikdortgeninKisaKenarUzunlugu*dikdortgeninİUzuninciKenarUzunlugu));


    }
}
