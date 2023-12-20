package day_038_OOP.anket;

import java.util.ArrayList;
import java.util.List;

public class AnketSirketi {

    // Ankete katilan tum katilimcilari tutacagim bir contenier liste yapmam lazim, bunun icin bir List deklare ederim.
    // Ancak atama islemini constructor icinde yaparim.

    private List<AnketeKatilan> katilanKisiler;

    public AnketSirketi() {
        katilanKisiler = new ArrayList<>();
    }

    // Oyle bir method yazmaliyim ki ankete katilan herkesi Katilimcilar conteiner ine dahil etsin.
    // Bunu icin iki method yazmaliyim. once kisileri Katilimcilar conteinerine ekleyecegim, ardindan o kisinin cevabini (evet-hayir)
    // ekleyecegim.

    public void kisiEkle(AnketeKatilan kisi) {
        katilanKisiler.add(kisi);
    }

    public void cevapEkle(String katildigiAnket, String cevap) {

        for (AnketeKatilan kisi : katilanKisiler) {

            if (kisi.getKatildigiAnket().equalsIgnoreCase(katildigiAnket)) {
                kisi.cevapEkle(cevap);
            }
        }
    }

    //

    public void bilgileriGetir(String katildigiAnket) {

        for (AnketeKatilan kisi : katilanKisiler) {

            if (kisi.getKatildigiAnket().equalsIgnoreCase(katildigiAnket)) {
                System.out.println("Kisi: " + kisi.getIsim() + " " + kisi.getSoyisim());
                System.out.println("Yasi: " + kisi.getYas());
                System.out.println("Evet Sayisi: " + kisi.getEvetSayisi());
                System.out.println("Hayir Sayisi: " + kisi.getHayirSayisi());
                break;
            }

        }
    }

}
