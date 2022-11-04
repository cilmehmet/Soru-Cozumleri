package ortak_soru;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class S14 {

    public static void main(String[] args) {

        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun

        int [] arr = {1,1,2,2,3,3,4,4,5,5,5};

        arraydekiTekrarlariSilme(arr);
    }
    public static List<Integer> arraydekiTekrarlariSilme(int[]arr){

        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])){

                tekrarsizListe.add(arr[i]);
            }
        }
        System.out.println(tekrarsizListe);
        return tekrarsizListe;
    }
}
