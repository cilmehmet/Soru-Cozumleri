package Sorular;

import java.util.Scanner;

public class C12_Soru_12 {

    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        // isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ondalikli sayi giriniz.");

        double dbl1 = scan.nextDouble();
        double dbl2 = scan.nextDouble();

        int sayi1 = (int)dbl1;
        int sayi2 = (int)dbl2;


        System.out.println(sayi1 / sayi2);



    }
}
