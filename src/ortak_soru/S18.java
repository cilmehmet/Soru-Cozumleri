package ortak_soru;

import java.util.Scanner;

public class S18 {

  //  Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
  //  bir liste olarak bize donduren bir method olusturun.


    public static void main(String[] args) {

        fibonacciKucukSayi();
    }

    public static int fibonacciKucukSayi (){

        Scanner scan = new Scanner(System.in);
        int n1 = 0,n2 = 1, n3, n;
        System.out.print("Lutfen n sayinı giriniz.");
        n = scan.nextInt();
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; i++) {

            n3 = n1 + n2;
            n1 =n2;
            n2=n3;

            if (n3<n)System.out.print(" " + n3);
        }

        System.out.println();
        return n;
    }
}
