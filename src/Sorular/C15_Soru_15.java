package Sorular;

import java.util.Scanner;

public class C15_Soru_15 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz.");


        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int bolen =5;

        int input1 = sayi1 / bolen;
        int input2= sayi2/bolen;


            System.out.println(" Sayi 5’in tam kati " + (sayi1/bolen) + (sayi2/bolen));



    }


}
