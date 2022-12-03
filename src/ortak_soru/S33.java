package ortak_soru;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S33 {

    // SET Sorusu 4 : Bir listede kaç farklı öge oldugunu gösteren kodu yazınız.
    // Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void main(String[] args) {

        List<Integer> aylist=new ArrayList<>();

        aylist.add(10);
        aylist.add(31);
        aylist.add(15);
        aylist.add(7);
        aylist.add(15);
        aylist.add(7);
        aylist.add(7);

        Set<Integer> mySet = new HashSet<>();

        for (int i: aylist){
            mySet.add(i);
        }
        System.out.println(mySet.size());
    }
}
