package ortak_soru;

public class S03 {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int [] arr = {1,2,3,4,-5,-6,-7};

        System.out.println(poazifTamSayiDondurme(arr));
    }

    public static int poazifTamSayiDondurme(int[]arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        return toplam;
    }
}
