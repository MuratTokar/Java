package day_010_hakan;

public class Task_28 {

    public static void main(String[] args) {

        int hasilat, miktar=51, fiyat = 100, iskonto=0;
        hasilat = miktar * fiyat;

        if(5000 < hasilat ){
            iskonto = 10;
        }
        System.out.println("Net Hasilat = " + hasilat + " ve iskonto = " + iskonto);

    }
}
