package ortak_soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S25 {

    /*
        * Basit bir 5 ürünlü manav alisveris programi yaziniz.
        * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        * 2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
   */

    static List<String> urunListesi = new ArrayList<>();
    static int elmaFyt = 10, portakalFyt = 15, mandalinaFyt = 15, domatesFyt = 10, patatesFyt = 8, toplam = 0, kg = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        urunListesi.add("1.Elma= " + elmaFyt+" tl");
        urunListesi.add("2.Portakal= " + portakalFyt+" tl");
        urunListesi.add("3.Mandalina= " + mandalinaFyt+" tl");
        urunListesi.add("4.Domates= " + domatesFyt+" tl");
        urunListesi.add("5.Patates= " + patatesFyt+" tl");
        urunListele(urunListesi);

    }

    private static void urunListele(List<String> urunListesi) {
        for (String each : urunListesi) {
            System.out.println(each);
        }
        urunSec();
    }

    private static void urunSec() {
        System.out.println("Seçmek istediğiniz ürünün numarasını giriniz(Çıkmak için 0 basınız)= ");
        int urunNo = scan.nextInt();
        if (urunNo != 0) {
            if (urunNo == 1 || urunNo == 2 || urunNo == 3 || urunNo == 4 || urunNo == 5) {
                switch (urunNo) {
                    case 1: {
                        fiyatHesapla(kgIste(), elmaFyt);
                        System.out.println("Toplsm : " + toplam);
                        urunListele(urunListesi);
                    }
                    case 2: {
                        fiyatHesapla(kgIste(), portakalFyt);
                        System.out.println("Toplsm : " + toplam);
                        urunListele(urunListesi);
                    }
                    case 3: {
                        fiyatHesapla(kgIste(), mandalinaFyt);
                        System.out.println("Toplsm : " + toplam);
                        urunListele(urunListesi);
                    }
                    case 4: {
                        fiyatHesapla(kgIste(), domatesFyt);
                        System.out.println("Toplsm : " + toplam);
                        urunListele(urunListesi);
                    }
                    case 5: {
                        fiyatHesapla(kgIste(), patatesFyt);
                        System.out.println("Toplsm : " + toplam);
                        urunListele(urunListesi);
                    }
                }
            } else {
                System.out.println("Doğru ürün seçiniz!!");
                urunListele(urunListesi);
            }
        } else {
            System.out.println("toplam = " + toplam+" tl");
            System.exit(0);
        }
    }

    private static void fiyatHesapla(int kg, int fiyat) {
        toplam += fiyat * kg;
    }

    private static int kgIste() {
        System.out.println("Kaç kg alacaksınız= ");
        kg = scan.nextInt();
        return kg;
    }
}