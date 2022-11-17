package ortak_soru;

import java.util.ArrayList;

public class S24_K3_Listing {

    // 3-Listing isminde bir class oluşturun ve printHappyUsers isminde bir metod ekleyerek
    //    ArrayListteki userlardan her ayın ilk 10 gününde kaydolanları yazdıran metodu oluşturun.

    void listele(ArrayList<S24_k1_User> pakize){
        if (!pakize.isEmpty()){
            for (S24_k1_User abuziddin: pakize){
                if(abuziddin.registerDate.getDayOfMonth()<=10){
                    System.out.println(abuziddin.name+" Sansli kullanicisiniz."+abuziddin.registerDate+" tarihinde kaydoldu.");
                }else {
                    System.out.println(abuziddin.name+" Sansli kullanici degilsinz."+abuziddin.registerDate+" tarihinde kaydoldunuz.");
                }
            }
        }else {
            System.out.println("Liste bos");
        }
    }
}
