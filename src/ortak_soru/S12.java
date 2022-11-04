package ortak_soru;

public class S12 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int [][] arr1 = {{1,2},{2,99},{4,5}};
        ciftKatliArray(arr1);
    }

    public static int ciftKatliArray(int [][]arr){

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                carpim*= arr[i][j];
            }
        }
        System.out.println(carpim);
        return carpim;
    }
}
