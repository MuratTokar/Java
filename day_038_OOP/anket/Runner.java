package day_038_OOP.anket;

public class Runner {


    public static void main(String[] args) {

        AnketSirketi anketSirketi=new AnketSirketi();
        // Kişi 1
        AnketeKatilan kisi1 = new AnketeKatilan("Hudaverdi", "Korkar", "03.10.1984", "Anket_1");
        anketSirketi.kisiEkle(kisi1);
        anketSirketi.cevapEkle("Anket_1", "evet");
        anketSirketi.cevapEkle("Anket_1", "hayir");
        anketSirketi.cevapEkle("Anket_1", "evet");

        // Kişi 2
        AnketeKatilan kisi2 = new AnketeKatilan("Ayse", "Yilmaz", "15.05.1990", "Anket_1");
        anketSirketi.kisiEkle(kisi2);
        anketSirketi.cevapEkle("Anket_1", "hayir");
        anketSirketi.cevapEkle("Anket_1", "evet");
        anketSirketi.cevapEkle("Anket_1", "hayir");

        // Kişi 3
        AnketeKatilan kisi3 = new AnketeKatilan("Mehmet", "Aydin", "27.12.1987", "Anket_2");
        anketSirketi.kisiEkle(kisi3);
        anketSirketi.cevapEkle("Anket_2", "evet");
        anketSirketi.cevapEkle("Anket_2", "evet");
        anketSirketi.cevapEkle("Anket_2", "hayir");

        // Bilgileri getirme
        System.out.println("Anket_1 Katilimci Bilgileri:");
        anketSirketi.bilgileriGetir("Anket_1");

        System.out.println("Anket_2 Katilimci Bilgileri:");
        anketSirketi.bilgileriGetir("Anket_2");




        // 2. yol

        System.out.println("#################################");


        anketSirketi.bilgileriGetir("Anket_2");
    }





    }

