package ortak_soru;

import java.sql.Time;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class S27 {

    public static void main(String[] args) {

        // * Java dilini kullanarak, TimeConvert(num) methodunun kullanicidan integer veri
        // tipinde num parametresini almasını sağlayın
        //  * ve parametrenin dönüştürdüğü saat ve dakika sayısını döndürun (yani, num = 63 ise,
        //  çıktı 1:3 olmalıdır).
        //  *
        //  * Saat ve dakika sayısını iki nokta üst üste ile ayırın.
        //  Ornegin giris 126 ise output 2:6 seklinde olmalidir..

        System.out.println(timeConvert(601));
    }

    public static String timeConvert(int time){

        String saat;
        String dakika;

        if (time<60){
            saat="0";
            dakika=Integer.toString(time);
        }else {
            saat=Integer.toString(time/60);
            dakika=Integer.toString(time%60);
        }
        return saat+":"+dakika;
    }
}