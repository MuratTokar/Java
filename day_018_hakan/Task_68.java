package day_018_hakan;

public class Task_68 {
    // yasiHesapla(dogumYili) -> return yas
    // emekliligeKalanSüreyiHesapla(isim, emeklilikYili) -> print "$Isim, {yil} icerisinde emekli olacak."
    final static int YIL=2023;
    final static int EMEKLILIK_YASI=65;

    public static void main(String[] args) {
        emekliligeKalanSüreyiHesapla("Idris", 1986);
    }

    public static void emekliligeKalanSüreyiHesapla(String name, int dogumYili){
        int yas = yasiHesapla(dogumYili);
        int emekliligeKalanSure = EMEKLILIK_YASI - yas;
        System.out.println(name + ", " + emekliligeKalanSure + " yil sonra emekli olacak, ölmezse..." );
    }

    public static int yasiHesapla(int dogumYili){
        return YIL - dogumYili;
    }

}
