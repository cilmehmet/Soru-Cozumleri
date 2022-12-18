package ortak_soru;

public class S43_kitap  {

    public String kitapAdi, yazarAdi;
    public int kayitNo, yayin_yili, fiyat;

    public S43_kitap () {}

    public S43_kitap(String kitapAdi, String yazarAdi, int kayitNo, int yayin_yili, int fiyat) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kayitNo = kayitNo;
        this.yayin_yili = yayin_yili;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "S43_kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kayitNo=" + kayitNo +
                ", yayin_yili=" + yayin_yili +
                ", fiyat=" + fiyat +
                '}';
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKayitNo() {
        return kayitNo;
    }

    public void setKayitNo(int kayitNo) {
        this.kayitNo = kayitNo;
    }

    public int getYayin_yili() {
        return yayin_yili;
    }

    public void setYayin_yili(int yayin_yili) {
        this.yayin_yili = yayin_yili;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
