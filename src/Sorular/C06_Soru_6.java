package Sorular;

import java.util.Scanner;

public class C06_Soru_6 {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("dairenin capini giriniz.");

         double yaricap;
         yaricap= scan.nextDouble();


        Scanner scan1 = new Scanner(System.in);
        System.out.println("dairenin yari capini giriniz.");
        double alan =scan.nextDouble();
        alan= (yaricap*yaricap*3.14);
        System.out.println("yari capi" + yaricap + "dairenin alani" + alan);





    }
}
