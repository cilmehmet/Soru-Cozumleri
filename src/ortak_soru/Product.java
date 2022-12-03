package ortak_soru;

import java.util.HashMap;
import java.util.Map;

public class Product {

    /* Basit bir 5 ürünlü manav alisveris programi yaziniz.
    // * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
    // * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
    // * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
    // * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
    // * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
    // * goster.
     */

    String urunler;
    double price;

    Product(String urunler, double price) {

        this.urunler = urunler;

        this.price=price;

        Map<String,Double> product_map=new HashMap<>();

        product_map.put(urunler,price);

        System.out.println(product_map);
    }
    public double getPrice() {
        return price;
    }
}