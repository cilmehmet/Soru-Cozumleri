package ortak_soru;

import java.util.Random;
import java.util.Scanner;

public class S42 {

    /*
    Kullanicidan oynamak istedigi oyun alaninin buyuklugunu girmesin istensin.

    Kullanici tarafindan girilen buyuklukte bir matris rastgele olusturulsun. Olusturulan matriste sadece

    0 ve 1 degerleri vardir.

    0 degerleri temiz; 1 degerleri mayinli bolgeleri gostersin.

    Oyunun baslangicinda kullanicinin puan degeri 0'dir. Kullanicidan secmek istedigi lokasyonun satir ve

    sutun sayisi girmesi istensin.

    Eger kullanicinin girdigi pozisyonda mayin yoksa oyuncunun puani 10 artirilir ve "Hala hayattasin....

    Devam" mesaji verilir

    ve yeni satir ve sutun degerleri girmesi istenir. eger kullanici mayinli bir bolge secmis ise

    "Oyun bitti! Puaniniz: "

    mesaji ile program sonlandirilir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Mayin tarlasi icin satir sayisi giriniz.");
        int satir = scan.nextInt();

        System.out.println("Mayin tarlasi icin sutun sayisi giriniz.");
        int sutun = scan.nextInt();

        int [][] olusacakMatris = mayinTarlasi(satir,sutun);
        int kazanilanPuan = 0;
        boolean giris = true;

        while (giris){
            System.out.println("x. degerini giriniz.");
            int apsis = scan.nextInt();

            System.out.println("y. degerini giriniz.");
            int ordinal = scan.nextInt();

            if (olusacakMatris[apsis][ordinal]==1){
                giris=false;
            }else {
                System.out.println("Hayla hayattasin... Devam");
                kazanilanPuan = kazanilanPuan + 10;
            }
        }
        System.out.println("Gema OVER" + "\n Puaniniz = " + kazanilanPuan);
    }

    public static int [][] mayinTarlasi (int satir, int sutun) {

        Random rom= new Random();

        int[][] matris = new int [satir+1][sutun+1];

        int x = 0;
        int y = 0;

        while (x<satir){

            while (y<sutun){

                matris [x][y] = rom.nextInt(2);

                y=y+1;
            }
            x=x+1;
        }

        for (int i = 0; i <satir; i++) {
            for (int j = 0; j <sutun; j++) {
                System.out.println(matris[i][j]);
            }
        }
        return matris;

    }
}