package extraCalismalarim2;

import java.util.Scanner;

public class IfSoru4 {
    public static void main(String[] args) {
        // kullanicidan bir karakter girmesini isteyin,girilen karakterin buyuk harf olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen birharf giriniz ");
        char krktr=scan.next().charAt(0);
        if (66<=krktr&& krktr<=90){// yada  ('A'<=krktr&& krktr<='Z')
            System.out.println("Girdiginiz karakter büyük harftir");

        }else {
            System.out.println("Girdiginiz harf büyük degil");
        }
    }
}
