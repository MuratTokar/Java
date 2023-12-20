package day_015_murat;
// alttaki 3 import yerine packageName.* seklinde yazarak,
// o package teki tüm classlari import edebiliriz

//import day_014_hakan.*;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

       /* BranchStatements branchStatements = new BranchStatements();
        Methoths methoths = new Methoths();*/




        Scanner scan = new Scanner(System.in);// scanner obje kaydettik
        System.out.print("Yasinizi giriniz : ");// kullaniciya mesaj yaziyoruz
        // integer  deger icin alttaki
        int yas = scan.nextInt();//kullanucudan gelen data lari hangi türden almak istesek next sonuna o olacak
                                // int yas ise scan.nextInt ten kullanicini versini alip yas icine atacak
        System.out.println("Yasiniz:" + yas);
        // String deger icin asagidaki gibidir
        System.out.println("Lütfen isminizi  girin");
        String name=scan.next();// tek kelime
        System.out.println("Adim: " + name);

        System.out.println("Lütfen soyisminizi  girin");
        String fullname=scan.nextLine(); // satir icin
        System.out.println("Soyadim :" + fullname);
    }
}