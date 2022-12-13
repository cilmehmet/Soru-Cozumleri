package ortak_soru;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class S41_registration {

    //  2- Registration isminde bir class olusturun ve register isminde bir method ekleyerek
    //     kullanicidan user ismini alarak ArrayList'e ekleyin ve bu List'i return edin

    public ArrayList <S41_user> register() {

        Scanner scan = new Scanner(System.in);
        ArrayList<S41_user> users = new ArrayList<>();
        System.out.println("Adinizi Giriniz.");
        String isim = scan.next();

        S41_user user = new S41_user (isim, LocalDateTime.now());
        users.add(user);

        return users;
    }
       /*
         3- Registration class'i ayni zamanda kendine verilen ArrayList'teki userlardam her dakikanin
         ilk 10 saniyesinde kaydolanlari yazdiran printHappyUser isminde bir method daha ekleyiniz
      */

    public void  printHappyUser (ArrayList<S41_user> users){

        for (S41_user each : users) {

            if (each.registerDate.getSecond()<=10){
                System.out.println(each.name + " : Lucy's brooo");
            }else System.out.println("unfortunately you didn't win");
        }
    }
}