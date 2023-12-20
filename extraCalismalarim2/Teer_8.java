package extraCalismalarim2;

import java.util.Scanner;

public class Teer_8 {
    public static void main(String[] args) {
        // oru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf gitiniz");
        char harf=scan.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z' ? Character.toUpperCase(harf) : harf);

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        int a=5;
        int b=6;
        System.out.println(a < b ? a : b);
    }
}
