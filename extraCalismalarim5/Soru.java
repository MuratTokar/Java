package extraCalismalarim5;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
         - ilk harf kucuk harf olmali
         - son karakter rakam olmali
         - sifre bosluk icermemeli
         - uzunlugu en az 10 karakter olmali

         */
        String sifre="a123kjh.kj0";
        int flag=0;
        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("ilk harf kucuk harf olmali");

        }
        if (sifre.charAt(sifre.length()-1)>= '0' && sifre.charAt(sifre.length()-1)<='9'){
            flag++;
        }else {
            System.out.println("son karakter rakam olmali");

        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");

        }else {
            flag++;

        }
        if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
        }
        if (flag==4){
            System.out.println("Sifreniz basari ile kaydedildi");
        }




    }
}
