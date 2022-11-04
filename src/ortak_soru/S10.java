package ortak_soru;

import java.util.Arrays;

public class S10 {
    // Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
    //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    //input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    //output: [5, 7, 11]

    public static void main(String[] args) {

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        int ortakIndexler = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int[] ortskIndexToplami = new int[ortakIndexler];

        for (int i = 0; i < ortskIndexToplami.length; i++) {

            ortskIndexToplami[i]=arr[0][i] + arr[1][i];
        }
        System.out.println(Arrays.toString(ortskIndexToplami));
    }
}