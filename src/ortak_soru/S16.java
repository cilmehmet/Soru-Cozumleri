package ortak_soru;

import java.util.ArrayList;
import java.util.List;

public class S16 {

    //Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    //kismini list olarak bize donduren bir method olusturun

    public static void main(String[] args) {

        silmeArray();
    }
    public static List<String> silmeArray (){

        List<String> harler = new ArrayList<>();

        harler.add("abi");
        harler.add("baci");
        harler.add("cari");

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("abi");

        harler.removeAll(silinecekler);
        System.out.println(harler);

        return harler;
    }
}
