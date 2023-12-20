package day_33_murat;

import java.util.Scanner;

public class Person {
    static  String city="";
    String name;

    static {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen sehrinizin plakasini giriniz");
        int plaka=Integer.parseInt(input.next());
        switch (plaka){
            case 1:
                city="Adiyaman";
                break;
            case 2:
                city="Adiyaman";
                break;
            case 3:
                city="Afyon";
                break;
            default:
                System.out.println("Lutfen gecerli bir plaka giriniz");
                break;



        }
    }

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        name=input.next();


    }

}
