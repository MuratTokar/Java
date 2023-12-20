package extraCalismalarim2;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // Eger iyi calisirsan, sinavi gecersin
        // Eger=Sart cümlesi belirteci
        //Calisirsan =Boolean sart
        // Sinavi gecersin=Sart saglanirsa

        int a=10;
        int b=20;
        if (a>b){
            System.out.println("a b den büyüktür");// kod calisti ama body e girmedi cunku sart saglanmadi

        }
        if (a%2==0){
            System.out.println(" a cift sayidir");
        }
        if (b>100){
            System.out.println(" b 100 den büyüktür");
        }
        // bazen if statement da direk boolean bir deger sart olarak yazilabilir
        // bu durumda boolean variable degri true ise if body calisir falls ise body calismaz
        boolean sonuc=a*7>b;
        if (sonuc){
            System.out.println(" sart saglandi");
        }
        System.out.println("###############################################");
        // Kullanicidan bir syai alin ve sayiyi kontrol edin eger 5 e tam bölünüyorsa "sayi 5 in katidir yazin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin");
        int sayi= scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5 in katidir");
            System.out.println("###################################################");
            // 3-kullanicidan bir sayi alin ve sayi 3 ile bölünüyorsa " 3 ile bölünebilen sayi"
            // 5 ile bölünebiliyorsa "5 ile bölünebilen sayi" yazdirin
            if (sayi%3==0){
                System.out.println("sayi 3 ile bölünebiliyor");

            }
        }
    }
}
