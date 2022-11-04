package Sorular;

import java.util.Scanner;

public class C14_Soru_14 {

    public static void main(String[] args) {

        //Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz.");
        int intpuut= scan.nextInt();

        int birlerBasanagi = 0;
        int rakamlarToplami = 0;

        birlerBasanagi = intpuut % 10;
        rakamlarToplami = rakamlarToplami + birlerBasanagi;
        intpuut = intpuut / 10;

        birlerBasanagi = intpuut % 10;
        rakamlarToplami= rakamlarToplami * birlerBasanagi;
        intpuut = intpuut / 10;

        birlerBasanagi = intpuut % 10;
        rakamlarToplami = rakamlarToplami * birlerBasanagi;
        intpuut = intpuut / 10;

        System.out.println("Verilen sayinin rakamlar toplami : " + (rakamlarToplami));


    }
}
