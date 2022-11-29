package ortak_soru;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class S29 {

    // MAP Soru -1 - Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    //bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
    //yazınız.

    public static void main(String[] args) {


        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Map<String,Integer>treeMap= new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        treeMap.putAll(product);

        System.out.println(product.containsKey("Laptop"));
    }
}
