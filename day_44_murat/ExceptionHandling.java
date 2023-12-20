package day_44_murat;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //System.exit(0);// alltaki kodu basmadan cikacak .Yani java yi durudur ve cik komutudur
        //System.out.println("Hello world");
        // new RuntimeException("gjkdhjksöadhLVSLHAcsgblas")// hata objecktini olusturdu
        // throw new RuntimeException("gjkdhjksöadhLVSLHAcsgblas");//  hatayi throw ile de firlatti
        // System.out.println("Hello world");

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");// kullanici int yerine String gönderdi ama kodun kesilmemsi icin try ve catch kullan
        try {
            scan.nextInt();
            System.out.println("kullanici bir deger girdi");

        }catch (Exception e){ // kod calismaya devam eder.Hatayi handl ettik
            e.printStackTrace();

        }
        System.out.println("kod bitti");
        // compile Error lar handle edilemez:jAVA SYNTAX hatalari,javanin temel kurallarini
        // Runtime errorlari haldel edemiyoruz.//algoritm,logical errors
        // Runtime Exception olanlari haldeln edebiliriz.
        // Checked haldeln edilmesi zorunludur.try catch  ile.throws metodu kullanilir,
        // javanin kendi kütüphanesinde.Handle edilmezse  compile error verir.
        // unchecked haldeln edilmesi kisiye  kalmis// kod calismaya basladiktan sonra ortaya cikar.
        // Kendi yazdigimiz kodlar icin kullanilir.Handle edilmezse compile erroro vermez

       // try{
        // code blocku hata veririse  catch e girer  vermezse ise crtch e girmeden devam eder

      //  }catch (ExceptionTypeClass e){
          // try blockunda hata oldugunda exception class s hatayi kapsiyorsa
          // e yi kullanmak zorunda degiliz
          // e icin printStackTrace (); ve getMessage(); metotlari en popüler olanlaridir
          // log yazdirma olarak kullanilir
        }

        // FINALLY=hata olasada olmasada kodu calistir komutudur

    // try-catch+++++++++++++try-finally+++++++++try-catch-finally++++ try-catch---catch---finally


   // try{
      //  catch(NumberFormatException | IOException| inputMismatchException)

    // throw new ExceptionClass("message);

    }

