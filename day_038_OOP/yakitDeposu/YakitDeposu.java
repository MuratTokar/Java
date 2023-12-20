package day_038_OOP.yakitDeposu;

public class YakitDeposu {


    private final int maxHacim;
    private int mevcutHacim;
    private final double kmBasinaYakit;

    public YakitDeposu(int maxHacim, double kmBasinaYakit) {
        this.maxHacim = maxHacim;
        this.mevcutHacim = maxHacim;
        this.kmBasinaYakit = kmBasinaYakit;
    }

    public boolean depoBosMu() {
        double dolulukOrani = (double) mevcutHacim / maxHacim * 100;
        return dolulukOrani < 5;
    }

    public boolean depoFullMu() {
        double dolulukOrani = (double) mevcutHacim / maxHacim * 100;
        return dolulukOrani >= 90;
    }

    public void depoDoldur(int miktar) {

        mevcutHacim = Math.min(mevcutHacim + miktar, maxHacim);
    }

    public void depoBosalt(int km) {
        int yakitMiktari = (int) (km * kmBasinaYakit);
        mevcutHacim = Math.max(mevcutHacim - yakitMiktari, 0);
    }

    public int depoDolulukYuzdesi() {
        return (int) ((double) mevcutHacim / maxHacim * 100);
    }
}
