package extraCalismalarim;

import java.util.Scanner;

public class ScannerSoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi girin");// Ali Can
       // String ad= scan.next();// next ile alininca sadece Ali alir bu yuzden nextLine ile alinmali
       // System.out.println(ad);
        System.out.println("#####################################################");
        char c=scan.next().charAt(0);
        System.out.println(c);
        System.out.println("#####################################################");
       // int fiyat=127;
        //System.out.println("fiyat");
        System.out.println("#####################################################");
        int num=11;
        num=num-2;
        num+=3;
        num++;
        System.out.println(num);
        System.out.println("#####################################################");

    }
}
