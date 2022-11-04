package Sorular;

import java.util.Scanner;

public class C03_soru_3 {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isminiz = scan.next();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("soyisminiz");
        String soyisminiz = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");

        int yas = scan.nextInt();
        System.out.println("Kaydiniz basariyla tasmamlandi.");








    }
}
