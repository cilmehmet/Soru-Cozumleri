package ortak_soru;

import java.util.Arrays;

public class S40 {

    /*
    verilen arrayin simetrik array olup omadiğini kontrol ediniz

    İNPUT={5,6,7,8,8,7,6,5}

    OUTPUT "verilen array simetriktir."
     */

    public static void main(String[] args) {

        int [] input={5,6,7,8,8,7,6,5};
        int [] arrIlkYarisi = new int[input.length/2];
        int [] arrIkinciYarisi = new int[input.length/2];

        if (input.length%2==0) {

            for (int i = 0; i<input.length/2; i++) {

                arrIlkYarisi[i] = input[i];
                arrIkinciYarisi[i] = input[i+4];
            }

            Arrays.sort(arrIkinciYarisi);
        }
        else System.out.println("Simetrik olması icin cift olmalidir.");

            System.out.println(Arrays.toString(arrIlkYarisi));
            System.out.println(Arrays.toString(arrIkinciYarisi));

        if (Arrays.equals(arrIlkYarisi,arrIkinciYarisi)){

            System.out.println("Simetriktir.");
        }
        else System.out.println("Simetrik degildir.");
    }
}