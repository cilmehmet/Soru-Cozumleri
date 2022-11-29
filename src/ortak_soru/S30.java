package ortak_soru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S30 {

    public static void main(String[] args) {

        // SET Sorusu - 1 - Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        System.out.println(myList);

        Map<Integer,Integer> mapx = new HashMap<>();

        for (int i: myList){
            if (!mapx.containsKey(i)){
            mapx.put(i,1);
        }else {
            mapx.replace(i,mapx.get(i)+1);
           }
        }
        System.out.println(mapx);
    }
}