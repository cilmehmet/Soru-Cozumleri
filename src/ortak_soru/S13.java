package ortak_soru;

public class S13 {

    public static void main(String[] args) {

        //Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun.

        int [][] arr={{3,7},{1,99}};

        sonElementlerinToplami(arr);
    }
    public static void sonElementlerinToplami(int[][] arr){

        int sonElemanlarinToplami=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sonElemanlarinToplami+=arr[i][j]-1;
            }
        }
        System.out.println(sonElemanlarinToplami);

    }
}
