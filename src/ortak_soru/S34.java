package ortak_soru;

import java.util.HashMap;
import java.util.Map;

public class S34 {

    // MAP Soru 3 : Count the words in a String one by one
    // Girilen bir String'deki kelimeleri tek tek saydiran java code create ediniz.
    // For Example:	  Input :  String is "Ali came to school and Ayse came to school"
    // Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1

    public static void main(String[] args) {

        String str = "Ali came to school and Ayse came to school";

        Map<String,Integer> myMap= new HashMap<>();

        for (String i:str.split(" ")){

            if (!myMap.containsKey(i)){
                myMap.put(i,1);
            }else {
                myMap.replace(i,myMap.get(i)+1);
            }
        }
        System.out.println(myMap);
    }
}
