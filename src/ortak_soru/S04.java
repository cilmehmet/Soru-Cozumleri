package ortak_soru;

import java.util.Arrays;

public class S04 {

    public static void main(String[] args) {

        //Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn :

        int [] input= {4,5,6,7};

        input=elemaniSondanBasaTasima(input);
        System.out.println(Arrays.toString(input));
    }

    public static int[] elemaniSondanBasaTasima(int []arr){

        int tasima=arr[arr.length-1];

        for (int i = arr.length-2; i>=0; i--) {

            arr[i+1]=arr[i];
        }
        arr[0]=tasima;

        return  arr;
    }
}
