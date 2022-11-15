package ortak_soru;

import java.util.ArrayList;
import java.util.List;

public class S23 {

    //Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
    //ayri bir liste olarak veren bir program yazin.

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5,6,7,8,9,0};
        int [] arr2 = {2,4,6,8,0};

        List<Integer> yeniArrayList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                arr1[i]=arr2[j];
                yeniArrayList.add(arr1[i]);
            }
            break;
        }
        System.out.println(yeniArrayList);
    }
}
