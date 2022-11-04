package ortak_soru;

import java.util.Scanner;

public class S17 {

    //Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
    //sayisini bir list olarak donduren bir method olusturun.

    public static void main(String[] args) {

        fibonacciSayi();
    }

    public static int fibonacciSayi (){

        Scanner scan = new Scanner(System.in);
        int n1 = 0,n2 = 1, n3, n;
        System.out.print("Lutfen n sayinı giriniz.");
        n = scan.nextInt();
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < n; i++) {

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 =n2;
            n2=n3;
        }
        System.out.println();
        return n;

    }
}
