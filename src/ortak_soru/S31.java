package ortak_soru;

public class S31 {

    // SET Sorusu 2 : Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
    //Örnek: ‘Mississippi’ ´ Misp

    public static void main(String[] args) {

        String str= "Mississippi";
        String strTek= "";

        for (String i:str.split("")) {

            if (!strTek.contains(i)){
                strTek+=i;
            }
        }
        System.out.println(strTek);
    }
}
