package ortak_soru;

import java.util.Arrays;
import java.util.Scanner;

public class S06 {

    public static void main(String[] args) {

        //Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun

        int [] kullaniciAreyi = kullaniciArrayi();

        System.out.println(Arrays.toString(kullaniciAreyi));

    }
    public static int [] kullaniciArrayi(){

            Scanner scan = new Scanner(System.in);

        System.out.println("Array boyutu giriniz.");
        int boyut = scan.nextInt();
            int [] girilenSayiArrayi = new int[boyut];

        System.out.println("Array icin tam sayi giriniz.");

        for (int i = 0; i < girilenSayiArrayi.length; i++) {

            System.out.println("Olusturulacak array icin sayi giriniz.");
            girilenSayiArrayi[i]=scan.nextInt();
        }
        return girilenSayiArrayi;
    }
}
