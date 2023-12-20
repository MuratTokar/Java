package day_038_OOP.parkmetre;

import java.util.Random;

public abstract class Parkmetre {

    private final int maxSure;
    private int kalanSure;

    // tek parametreli bir constuructor olusturdum.

    public Parkmetre(int maxSure) {
        this.maxSure = maxSure;
        this.kalanSure = maxSure;
    }


    public int getMaxSure() {

        return maxSure;
    }

    public int getKalanSure() {

        return kalanSure;
    }

    // kalan sureyi kontrol eden bir methot yazmaliyim. burada Random class kullanmaliyim

    public void sureyiKontrolEt() {

        if (kalanSure <= 0) {
            System.out.println("Süreniz doldu!");  //
        } else {
            Random random = new Random();
            int dakika = random.nextInt(maxSure) + 1;
            kalanSure -= dakika;
            System.out.println("Kalan sureniz: " + kalanSure + " dakika");
        }
    }

    public void yeniBiletAl(int ekSure) {
        kalanSure += ekSure;
        System.out.println("Yeni bilet alindi. Yeni kalan sure: " + kalanSure + " dakika");
    }
}
