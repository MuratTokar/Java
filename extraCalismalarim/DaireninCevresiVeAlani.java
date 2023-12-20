package extraCalismalarim;

import java.util.Scanner;

public class DaireninCevresiVeAlani {
    public static void main(String[] args) {
        // Kullanicidan bir cemberin yaricapini alip,ccevresini ve alaninini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cemberin yaricapini girin");
        // Kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olustur.
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next methodunu kullan

        double yariCap=scan.nextDouble();
        double PI=3.14; // 2.Yol
        double alan=PI*yariCap*2;// 2.Yol
        double cevre=2*PI*yariCap;// 2.Yol
        System.out.println("Cemberin cevresi: " + cevre + " dir.Cemberin alani: " + alan+ " dir");
      //  System.out.println("Cemberin cevresi: " + 2*3.14*yariCap); //1.Yol
       // System.out.println("Cemberin alani: " + 3.14*yariCap*yariCap);// 1.Yol

    }
}
