package day_012_hakan;

public class Exercises_1 {

    public static void main(String[] args) {
        /*
         	Girilen rakamin, yazi olarak ciktisini veren programi yaziniz.
          Input : 4	Output : Dört
          Input : 7	Output : Yedi
         */

        int rakam=5;
        switch (rakam){
            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Üc");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Lütfen bir rakam giriniz! (0-9)");
                break;
        }

        System.out.println("##########################################");


    }
}
