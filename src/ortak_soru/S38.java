package ortak_soru;


import java.util.Random;
import java.util.Scanner;

public class S38 {

    // Kullanicidan istedigi buyuklukte bir diziyi 0-100 arasinda rastgele
    // olusturulmus sayilarla ( random class'indan faydalandik) doldurup
    // bu sayilarin standart sapmasini hesaplayin

    public static void main(String[] args) {

        int boyut, i, toplam;
        Scanner scan= new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz: ");
        boyut = scan.nextInt();

        int[] dizi= new int[boyut];
        toplam=0;

        Random r= new Random(); // Random sinifini ekledik ve yukarda java.util.Random olarak java kutuphanesi eklendi

        for ( i=0; i<boyut; i++){
            dizi[i] =r.nextInt(100); // o ile 100 arasi sayilari dizinin icine attik
            System.out.print(dizi[i]+"-");
            toplam +=dizi[i];
        }
        float ort =(float)toplam/boyut;
        System.out.println("\nOrtalama: " + ort);

        float farkToplam =0;

        for (i = 0;  i<boyut ; i++) {
            farkToplam += Math.pow((dizi[i]-ort),2);
        }
        double sapma;
        sapma = Math.sqrt(farkToplam/(boyut-1)); // karekokunu alan math. methodu
        System.out.println("Standart sapma = " + sapma);
    }
}