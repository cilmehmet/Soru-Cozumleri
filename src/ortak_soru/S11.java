package ortak_soru;

import java.util.Arrays;

public class S11 {

    public static void main(String[] args) {

        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]

        int [][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[] yeniToplamArrayi = new int[arr.length];

        int elemanlarToplami = 0;

        for (int i = 0; i < arr.length; i++) {

            elemanlarToplami = 0;

            for (int j = 0; j < arr[i].length; j++) {
                elemanlarToplami+= arr[i][j];

            }
            yeniToplamArrayi[i] = elemanlarToplami;
        }
        System.out.println(Arrays.toString(yeniToplamArrayi));
    }
}
