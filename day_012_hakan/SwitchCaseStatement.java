package day_012_hakan;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        // 0-10     kücük
        // 10-20    orta
        // 20-30    büyük
        // if-else de bu örnek, operators yardimiyla, kücüktür büyüktür isaretiyle, kolayca yazilabilir.

        // Switch Case
        // Daha keskin ifadeler, aralik olmayan ifadeler icin kullanilir

        // if(num == 15) => Sonuc
        // Switch case 15: => Sonuc

        String ulke = "Türkiye";

        if(ulke == "Türkiye"){
            System.out.println("Girilen ülke : Türkiye");
        } else if(ulke == "Almanya"){
            System.out.println("Girilen ülke : Almanya");
        } else if(ulke == "Hollanda"){
            System.out.println("Girilen ülke : Hollanda");
        } else {
            System.out.println("Lütfen gecerli bir ülke degeri giriniz");
        }

        System.out.println("***********************************************");

        switch(ulke){
            case "Türkiye":
                System.out.println("Girilen ülke : Türkiye");
                break;
            default:
                System.out.println("Lütfen gecerli bir ülke degeri giriniz");
                break;
            case "Almanya":
                System.out.println("Girilen ülke : Almanya");
                break;
            case "Hollanda":
                System.out.println("Girilen ülke : Hollanda");
                break;
        }


    }
}
