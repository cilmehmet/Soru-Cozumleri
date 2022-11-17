package ortak_soru;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class S24_K2_Registration {

        // 2- Registration isminde bir class oluşturun ve register isminde bir metod
        //  ekleyerek Kullanıcıdan user ismini alarak ArrayList e ekleyin

    ArrayList<S24_k1_User> userList = new ArrayList<>();

    void register(){

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi Giriniz : ");
        String isim = scan.nextLine();
        S24_k1_User user = new S24_k1_User(isim,rndTarih());
        userList.add(user);
        }
        private LocalDate rndTarih(){

        LocalDate tarih = null;
        // Math.random()* (max-min+1)+min;
            int rndGun = (int)Math.random()*(28-1+1)+1;
            int rndAy = (int)Math.random()*(12-1+1)+1;
            int rndYil = (int)Math.random()*(2022-2013+1)+2013;

            tarih = LocalDate.now().of(rndYil,rndAy,rndGun); // YYY-MM-DD
            return tarih;
    }
}
