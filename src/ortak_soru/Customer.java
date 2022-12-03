package ortak_soru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

    //* Basit bir 5 ürünlü manav alisveris programi yaziniz.
    // * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
    // * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
    // * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
    // * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
    // * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
    // * goster.

    public static List<Product> product_mapping() {

        List<Product> products_list=new ArrayList<>();

        products_list.add(new Product("1 patetes",10));

        products_list.add(new Product("2 domates",12));

        products_list.add(new Product("3 sogan",13));

        products_list.add(new Product("4 ejder meyvesi",30));

        return products_list;
    }
    public static void main(String[] args) {

        product_mapping();

        boolean value=true;

        double total=0;

        while (value)
        {
            System.out.println("Ne satın almak istersiniz: ");

            Scanner scan=new Scanner(System.in);

            String selection=scan.nextLine();

            System.out.println("kaç KG "+selection+" almak istersiniz");

            double kilo=scan.nextDouble();

            double sum=the_total_cost(selection,kilo);

            System.out.println("Alış verişe devam etmek istiyormusunuz ? E / H");

            String cevap=scan.next();

            if (cevap.equals("h")) {

                total+=sum;

                value=false;
            }
            else if (cevap.equals("e"))

                total+=sum;

            else

                System.out.println("Affedersiniz! Hatali Giris");
        }

        System.out.println("Toplam Fiyat : "+total);
    }

    private static double the_total_cost(String selection, double kilo) {

        List<Product>products_list=product_mapping();

        double sum=0;

        switch (selection)
        {
            case "1":
                System.out.println("patates");
                sum+=kilo*products_list.get(0).getPrice();

                break;

            case "2":
                System.out.println("domates");
                sum+=kilo*products_list.get(1).getPrice();

                break;

            case "3":
                System.out.println("sogan");
                sum+=kilo*products_list.get(2).getPrice();

                break;

            case "4":
                System.out.println("ejder meyvesi");
                sum+=kilo*products_list.get(3).getPrice();

                break;

            default:
                System.out.println("Uzgunum!");
        }
        return sum;
    }
}