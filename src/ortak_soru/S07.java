package ortak_soru;

public class S07 {

    public static void main(String[] args) {

        //Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String [] str ={ "kısa", "uzuun", "cok uzun", "cock uzuun"};

        uzunKisaKelime(str);;
    }
    public static void uzunKisaKelime (String [] arr){

        String kisaKeline = arr[0];
        String uzunKeline = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length()>uzunKeline.length()) uzunKeline= arr[i];
            if (arr[i].length()<kisaKeline.length()) kisaKeline= arr[i];
        }
        System.out.println("En uzun kelime : " + uzunKeline);
        System.out.println("En kisa kelime : " + kisaKeline);
    }
}
