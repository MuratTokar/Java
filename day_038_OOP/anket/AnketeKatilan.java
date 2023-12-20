package day_038_OOP.anket;

import java.time.LocalDate;
import java.time.Period;

public class AnketeKatilan {

    private String isim;
    private String soyisim;
    private LocalDate dogumTarihi;   //  data type olarak javanin LocalDate classini kullandim. yasini ancak boyle hesaplayabilirim.
    private String katildigiAnket;
    private int evetSayisi;
    private int hayirSayisi;

    public AnketeKatilan(String isim, String soyisim, String dogumTarihi, String katildigiAnket) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = LocalDate.parse(dogumTarihi, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));  // LocalDate class da parse methodu ile dogum tarihinin formatini belirlerim.
        this.katildigiAnket = katildigiAnket;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public String getKatildigiAnket() {

        return katildigiAnket;
    }

    public int getEvetSayisi() {

        return evetSayisi;
    }

    public int getHayirSayisi() {

        return hayirSayisi;
    }

    // oyle bir method yazmaliyim ki, anket calismam bitince bana kac evet kac hayir oldugunu bildirmeli

    public void cevapEkle(String cevap) {

        if (cevap.equalsIgnoreCase("evet")) {
            evetSayisi++;

        } else if (cevap.equalsIgnoreCase("hayir")) {
            hayirSayisi++;
        }
    }

    // normalde otomatik olarak getYas, yada getDogumTarihi methodu create edebilirim ama o haliyle isime yaramaz.
    // bu nedenle oyle bir method yazayim ki dogumTarihi veriablesini kullanarak yasi hesaplasin.
    // bunun icin LocalDate class'dan obje yardimiyla simdiki tarihi alirim.  ===> LocalDate.now();
    // daha sonra cok basit bir period hesaplamasi yaparim. bunun icin Java'nin Period methodunu kullanirim.
    // Period classtan olusturdugum period objesi ile Period class'in bir methodu olan getYears() methodunu kullanirim.
    // Boylece yasi hesaplamis olurum.


    public int getYas() {

        LocalDate simdikiTarih = LocalDate.now();
        Period period = Period.between(dogumTarihi, simdikiTarih);
        return period.getYears();

    }

}
