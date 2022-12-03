package ortak_soru;

public class S35 {

    //MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod
    //yazınız.
    //Not:
    //Mountain Array ==> [0, 2, 5, 3, 1]
    //B!r array elemanları en büyük deger!ne kadar sürekli artan, en büyük degerinden sonra sürekl
    //i azalan deger alıyorsa Mountain Array' dir.
    //Mountain Array Degil ==> [5, 2, 7, 1, 4]

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,8,5,4,3,2,0};
       // boolean output=validMountain(arr);
        System.out.println(validMountain(arr));
    }
    private static boolean validMountain(int [] arr){

        if (arr.length<3){
            return false;
        }
        int i=0;
        for (i = 1; i < arr.length; i++) {

            if (arr[i]<= arr[i -1]) {

                break;
            }
        }
        if (i ==arr.length || i ==1){

            return false;
        }
        for (i=arr[i-1]; i < arr.length; i++) {
            if (arr[i]>=arr[i -1])
                break;

        }
        return i == arr.length;
    }
}