package ortak_soru;

import java.util.ArrayList;
import java.util.Scanner;

public class S41_runner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int islem;
        S41_registration kullaniciKayit = new S41_registration();

        boolean cikis = false;
        ArrayList<S41_user> kayitEdilenler = new ArrayList<>();

        while (!cikis){

            System.out.println("Yapmak istediginiz islemi secin." +
                               "\n kisi kayit icin : 1" +
                               "\n sanslı kullanici icin : 2" +
                               "\n cikis icin : 3");

            islem = scan.nextInt();

            switch (islem){

                case 1:
                   kayitEdilenler = kullaniciKayit.register();
                   break;
                case 2:
                    kullaniciKayit.printHappyUser(kayitEdilenler);
                    break;
                case 3:
                    cikis = true;
                    break;
                default:
                    System.out.println("Hatali tuslama.");
                    break;
            }
        }
    }
}