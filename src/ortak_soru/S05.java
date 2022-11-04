package ortak_soru;

import java.util.concurrent.LinkedTransferQueue;

public class S05 {

    public static void main(String[] args) {

        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int [] arr = {1,2,3,4,5,5,5,6,6,6,23,67};

        int arananEleman=5;

        arananEleman(arr, arananEleman);

    }

    public static void arananEleman(int[] arr, int arananEleman){

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]== arananEleman){
                sayac++;
            }
        }
        if (sayac==0){
        System.out.println("Aradiginiz eleman : " + arananEleman + " Aranan eleman yok");
         } else {
        System.out.println("Aradiginiz eleman : " + arananEleman + " Aranan eleman sayisi : " + sayac);
        }
    }
}
