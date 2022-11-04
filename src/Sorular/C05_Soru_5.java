package Sorular;

import java.util.Scanner;

public class C05_Soru_5 {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz.");
        String isminiz = scan.next();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Lutfen soyisminizi giriniz.");
        String soyisminiz = scan.next();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");

        int yas = scan.nextInt();


        System.out.println("TEBRİKLER");

        System.out.println(isminiz +" "+ soyisminiz +" "+ yas);



    }
}
