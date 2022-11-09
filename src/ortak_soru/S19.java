package ortak_soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S19 {

    //Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
    //tamsayilari bir liste olarak bize donduren bir method olusturun.

    public static void main(String[] args) {

        System.out.println(bolenListe());
    }
    public static List<Integer> bolenListe () {

        List<Integer> tamBolunenListesi= new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif Bir Tamsayi Giriniz.");

        int girilenSayi = scan.nextInt();

        for (int i = 1; i < girilenSayi; i++) {
            if (girilenSayi % i ==0){

                tamBolunenListesi.add(i);
            }
        }

        return tamBolunenListesi;
    }
}
