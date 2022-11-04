package Sorular;

import java.util.Scanner;

public class C08_Soru_8 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println("Lutfen sayi giriniz.");

        double s1 = scan.nextDouble();
        System.out.println("A" + s1 );

        double s2 = scan.nextDouble();
        System.out.println("B" + s2);

        System.out.println("A : " + s2 + " B" + s1);


    }
}
