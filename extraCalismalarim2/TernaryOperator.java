package extraCalismalarim2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // if else statements ile yapabilecegimiz basit islemleri  daha basit bir formda kodlama imkani verir
        // if(a>0) {a*=2;} else {a+=10;} bunu Ternary ile yapabiliriz
        // a = a > 0 ? a * 2 : a + 10 ; --------> a>0  boolean sarttir, yani soru isaretine kadar olan
        // a*2= sart True ise calisir yani soru isareti ile iki nokta : arasinda kalan kisim
        // a+10= sart True degilse calisacak yani  iki nokta ile noktali virgül arasi :---;


        /*
        Kullanicidan pozitif bir tam syai alin ve sayi cift ise "sayi cift " degilsede sayi tek yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi girin");
        int tamsayi=scan.nextInt();
        if (tamsayi%2==0){
            System.out.println("Sayi cifttir");
        }else {
            System.out.println("Sayi tektir");
        }

        System.out.println(tamsayi % 2 == 0 ? "cift sayi" : "Tek sayi"); // Ternary ile cözüm
    }
}
