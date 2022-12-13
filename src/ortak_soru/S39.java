package ortak_soru;

import java.util.Arrays;

public class S39 {

    // n>=0 verildiğinde, {1, 1,2, 1,2,3, 1,2,3,4} kalıbına sahip bir
    // dizi oluşturun (gruplamayı göstermek için boşluk eklendi)
    // Dizinin uzunluğunun, toplamının tam olarak n*(n+1)/2 olduğu bilinen 1+2+3...+n olacağını unutmayın.

    public static void main(String[] args) {

        int n=4;

         int [] seriOlusturma = new int[n*(n+1)/2];

         int index = 0;

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=i; j++) {
                seriOlusturma[index]=j;
                index++;
            }
        }
        System.out.println(Arrays.toString(seriOlusturma));
    }
}