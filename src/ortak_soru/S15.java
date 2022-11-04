package ortak_soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S15 {

    //Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
    //liste olarak dondurecek bir method olusturun.

    public static void main(String[] args) {

        System.out.println(listeleme());

    }
    public static List<String> listeleme(){

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz bitirmek icin Q tusuna basiniz.");

        String girilenIsimler = "";

        while (!girilenIsimler.equalsIgnoreCase("q")){

            girilenIsimler = scan.nextLine();

            if (!girilenIsimler.equalsIgnoreCase("q")){

                isimler.add(girilenIsimler);
            }
        }
        return isimler;
    }
}
