package ortak_soru;

import java.util.Scanner;

public class S22 {

    //Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
    //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String cumle = scan.next();;

        System.out.println("Bir harf giriniz.");
        String harf = scan.next();
        char krk = harf.charAt(0);
        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i)==krk){
                }else {
                    System.out.println("kullanilmadi");
                    break;
            }
            sayac++;
        }
        System.out.println("Sayac " + sayac +" defa Çalıstı");


    }
}
