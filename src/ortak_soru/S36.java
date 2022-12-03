package ortak_soru;

import java.util.ArrayList;
import java.util.List;

public class S36 {

    //LEETCODE Soru  : 1 . İki Toplam Sorusu
    //Bir tamsayı dizisi
    //nums ve bir tamsayı verildiğinde
    //target, iki sayının dizinlerini, toplamları şuna eşit olacak şekilde döndürüntarget .
    //Her girdinin tam olarak bir çözümü olacağını varsayabilir ve aynı öğeyi iki kez kullanamazsınız .
    //Cevabı istediğiniz sırayla geri gönderebilirsiniz.
    //
    //Örnek 1:
    //Giriş: sayilar = [2,7,11,15], hedef = 9
    // Çıkış: [0,1]
    // Açıklama: sayilar[0] + sayilar[1] == 9 olduğu için [0, 1] döndürürüz.
    //Örnek 2:
    //Giriş: nums = [3,2,4], hedef = 6
    // Çıkış: [1,2]
    //Örnek 3:
    //Giriş: nums = [3,3], hedef = 6
    // Çıkış: [0,1]

    public static void main(String[] args) {

        int [] arr = {2, 7, 11, 15};

        int hedef = 9;

        List<Integer> arananHedef=new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]+ arr[i-1]==hedef){
                arananHedef.add(i);
                arananHedef.add(i-1);
            }
        }
        System.out.println(arananHedef);
    }
}
