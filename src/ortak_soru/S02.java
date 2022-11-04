package ortak_soru;

import java.util.Arrays;

public class S02 {

    public static void main(String[] args) {


        //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr ={1,2,3,4};

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;
        }


        System.out.println(Arrays.toString(arr));
        arr = arrayElemanArttirma(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayElemanArttirma (int[]arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;
    }
        return arr;
    }
}

