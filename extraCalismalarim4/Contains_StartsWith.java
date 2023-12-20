package extraCalismalarim4;

import java.util.Scanner;

public class Contains_StartsWith {
    public static void main(String[] args) {
        String str="Java ögren isi kap";
        System.out.println(str.contains("Java"));// test yapilirken cok kullanilir

        String s="ka";
        System.out.println(str.contains(s)); // true -- burada s in degeri ka ve str icinde ka aradigimizdan dolayi true
        System.out.println(str.contains("a"));// kac tane a olduguna vakmaz  a var mi yok mu ona bakar
        System.out.println(str.contains("java"));// fals verir cunku ilk harfi kücük


        System.out.println(str.startsWith("Ja"));// TRUE
        System.out.println(str.startsWith(str));// True


        System.out.println(str.endsWith("ka"));// falls
        System.out.println(str.endsWith("a"));// fals
        System.out.println(str.endsWith("ap"));// true


        //SORU : kullanicidan bir mail alin- mail @ icermiyorsa "gecersiz mail"- mail @gmail.com icermiyorsa, "mail gmail olmali"-
        // mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen e mail adresinizi girin");
        String email= scan.nextLine();
        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
            

        } else if (!email.contains("@gmail.com")) {
            System.out.println("maiaal gmail olmali");

            
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");

        }
    }
}
