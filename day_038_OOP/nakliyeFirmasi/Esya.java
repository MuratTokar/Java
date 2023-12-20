package day_038_OOP.nakliyeFirmasi;

public class Esya {

    private String isim;
    private String renk;
    private int miktar;
    private double hacim;

    public Esya(String isim, String renk, int miktar, double hacim) {
        this.isim = isim;
        this.renk = renk;
        this.miktar = miktar;
        this.hacim = hacim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getHacim() {
        return hacim;
    }

    public void setHacim(double hacim) {
        this.hacim = hacim;
    }
}
