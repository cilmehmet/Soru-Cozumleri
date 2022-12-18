package ortak_soru;

import java.util.ArrayList;
import java.util.List;

public class S42_kitapci {

    static List<S43_kitap> kitapList = new ArrayList<> ();

    public static void main(String[] args) {

        S43_kitap_rum.kitapciKitaplari(kitapList);

        S43_kitap_rum.kitapEkle(kitapList);

        S43_kitap_rum.menu(kitapList);
    }
}
