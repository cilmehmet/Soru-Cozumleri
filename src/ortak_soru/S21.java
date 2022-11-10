package ortak_soru;

import java.util.ArrayList;
import java.util.List;

public class S21 {

    // Verilen String bir array’deki her bir elementi kontrol edip,
    //- Kelimenin uzunlugu cift sayi ise ilk yarisini
    //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
    //yeni bir listeye ekleyip yazdirin.

    public static void main(String[] args) {

        String[] arr = {"Ali"," Hakan", "Heysem","Mehmet","Burak"};

        String ciftRakam = arr[0];
        String tekRakam = arr[0];

        List<String> yeniArr = new ArrayList<>();

        for (String each:
        arr) {

            if (each.length() %2==0){
                yeniArr.add(each.substring(0,each.length()/2));
            }else yeniArr.add(each.substring((each.length()-1)/2));
        }
        System.out.println(yeniArr);
    }
}
