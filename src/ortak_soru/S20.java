package ortak_soru;

public class S20 {

    //Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
    //yazdiran bir method olusturun.

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};

        kareleriniToplamaArray(arr);
    }
    public static void kareleriniToplamaArray(int[]arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i]*arr[i];
        }
        System.out.println("Verilen arrayin karelerinin toplami : " + toplam);
    }
}
