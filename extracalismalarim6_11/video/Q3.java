package extracalismalarim6_11.video;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi girin");
        //String isim=scan.nextLine().toUpperCase();// 1.yol
        String isim=scan.nextLine();
        isim=isim.toUpperCase();

       System.out.println(isim);


       String str="Java code yaz";
        System.out.println(str.substring(8,8));
    }
}
