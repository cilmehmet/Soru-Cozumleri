package Sorular;

import java.util.Scanner;

public class C11_Soru_11 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tamsayi giriniz.");

        int girilenSayi = scan.nextInt();

        byte donisensayi= (byte) girilenSayi;

        System.out.println("Giediginiz sayi " + girilenSayi + " donusen sayi " + donisensayi);

        ;





    }
}
