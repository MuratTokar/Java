package extraCalismalarim2;

import java.util.Scanner;

public class IfSoru5 {
    public static void main(String[] args) {
        // kullanicidan bir harf isteyin ,girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,yoksa girilen harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");
        char krkt=scan.next().charAt(0);
        if (krkt>='a'&& krkt<='z'){
            System.out.println(Character.toUpperCase(krkt));// wrapper classe den yardim aldik
        }else {
            System.out.println(krkt);
        }
    }
}
