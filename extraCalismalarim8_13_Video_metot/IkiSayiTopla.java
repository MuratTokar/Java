package extraCalismalarim8_13_Video_metot;

import java.util.Scanner;

public class IkiSayiTopla {
    public static void main(String[] args) {
        // metot ,main metodun disinda ve class metodun icinde olusturulur


        sayilariTopla();// bir metodu kac kere cagirsak o kadar calisir
        sayilariTopla();

    }

 public static void sayilariTopla() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen toplanmak üzere iki sayi girin : " );
        double sayi1=scan.nextDouble();

        double sayi2=scan.nextDouble();
        System.out.println("iki sayinin toplami = " + (sayi1+sayi2));



    }

}
