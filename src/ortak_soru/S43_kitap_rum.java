package ortak_soru;

import java.util.List;
import java.util.Scanner;

public class S43_kitap_rum {

    static Scanner scan = new Scanner(System.in);
    static int kayitNo = 1001;


    public static <Tum> void menu (List<S43_kitap>kitapList){

        System.out.println("========= KİTAP PROGRAMI ============="+
                             "\n 1: Kitap ekle"+
                            "\n 2: Numara ile kitap sil"+
                            "\n 3: Tum kitaplari listele"+
                            "\n 4: Bitir");

        System.out.println(" ");

        System.out.println("Yapmak istediginiz islemi giriniz");

        int secilen = scan.nextInt();

        switch (secilen){

            case 1:
                kitapEkle(kitapList);
                break;
            case 2:
                Numara_ile_kitap_sil(kitapList);
                break;
            case 3:
                listele(kitapList);
                break;
            case 4:
                Bitir (kitapList);
                break;
            default:
                System.out.println("Hatali giris");
                break;
        }
    }

    public static void Bitir(List<S43_kitap> kitapList) {

        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz.");
    }

    public static void kitapEkle(List<S43_kitap> kitapList) {
        System.out.println("Kitap ismi giriniz.");
        String kitapGir = scan.nextLine();

        System.out.println("Yazar ismi giriniz.");
        String yazaİsmi = scan.nextLine();

        System.out.println("Yayin yili giriniz.");
        int yayin_yili = scan.nextInt();

        System.out.println("fiyat giriniz.");
        int fiyat = scan.nextInt();

        S43_kitap S43_kitap = new S43_kitap(kitapGir,yazaİsmi,++kayitNo,yayin_yili,fiyat);
        kitapList.add(S43_kitap);
        System.out.println("Basariyla kaydedildi.");
        menu(kitapList);
    }

    public static void Numara_ile_kitap_sil(List<S43_kitap> kitapList) {

        System.out.println("silmek istediginiz kitap kayıt no yazınız.");
        int silNo = scan.nextInt();

        for (S43_kitap ktp : kitapList){
            if (ktp.getKayitNo()==silNo){
                kitapList.remove(ktp);
                menu(kitapList);
            }
        }
        System.out.println(silNo + "no'lu kitap silindi");
        menu(kitapList);
    }

    public static void listele(List<S43_kitap> kitapList) {
        for (S43_kitap ktp:kitapList){
            System.out.println(ktp.toString());
        }
    }

    public static void kitapciKitaplari(List<S43_kitap> kitapList){

        S43_kitap kitap1 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 100);
        S43_kitap kitap2 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 110);
        S43_kitap kitap3 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 115);
        S43_kitap kitap4 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 120);
        S43_kitap kitap5 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 114);
        S43_kitap kitap6 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 105);
        S43_kitap kitap7 = new S43_kitap("al bak", "ali" , ++kayitNo, 2022, 250);

        kitapList.add(kitap1);
        kitapList.add(kitap2);
        kitapList.add(kitap3);
        kitapList.add(kitap4);
        kitapList.add(kitap5);
        kitapList.add(kitap6);
        kitapList.add(kitap7);
    }
}
