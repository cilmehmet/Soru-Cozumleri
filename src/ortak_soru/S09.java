package ortak_soru;

import java.lang.reflect.Array;

public class S09 {

    public static void main(String[] args) {

        //Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //method olusturun.

        int [][] arr = {{1},{1,2},{4,6,9}};
       arraydeCiftSayiToplamaArray(arr);



    }
    public static void  arraydeCiftSayiToplamaArray(int[][] ciftSayiToplama){

        int toplam =0;

        for (int i = 0; i < ciftSayiToplama.length; i++) {

            for (int j = 0; j < ciftSayiToplama[i].length; j++) {

                if (ciftSayiToplama[i][j]%2==0){
                    toplam+=ciftSayiToplama[i][j];
                }
            }

        }
        System.out.println(toplam);
    }
}
