package extraCalismalarim3;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin  ,o harfle baslayan gün ismi varsa yazdirin ,yoksa gecersiz harf yazsin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
       char harf= scan.next().charAt(0);
       harf=Character.toUpperCase(harf);
       if (harf=='P'){
           System.out.println("Pazar,Pazartesi,Persembe");
       } else if (harf=='S') {
           System.out.println("Sali");

       } else if (harf=='C') {
           System.out.println("Carsamba,Cuma,Cumartesi");

       }else {
           System.out.println("Gecersiz harf");
       }
        System.out.println("*******************************************************************************************");
       // 2. ve kolayi SwitchCase----Switch te long,double,flot ve boolean kullanilmaz
        switch (harf){
            case 'P':
                System.out.println("Pazar,Pazartesi,Persembe");
                break;

            case 'S':
                System.out.println("Sali");
                break;

            case 'C':
                System.out.println("Carsamba,Cuma,Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }
    }
}
