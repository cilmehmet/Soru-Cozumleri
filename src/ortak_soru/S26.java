package ortak_soru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S26 {

        //Girilen desimal değeri binary değere çeviren metodu oluşturunuz.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı giriniz= ");
            int sayi = scanner.nextInt();
            System.out.println(binaryCevir(sayi));

        }

        private static List binaryCevir(int sayi) {
            List<Integer> list = new ArrayList<Integer>();
            while (sayi>1){
                list.add(sayi%2);
                sayi=sayi/2;
            }
            list.add(sayi);
            Collections.reverse(list);
            return list;
    }
}