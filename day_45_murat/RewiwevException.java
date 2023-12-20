package day_45_murat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RewiwevException {
    public static void main(String[] args) {
        /*
       1= Compiletime Errors:
        -alti kirmizi yanan nhatalardir
        -Bu hatalarda kod run edilemez
        -Java syntax inda yapilan temel haralardir
        -Koodun yanlis yazilimi /uygunsuzlugudur
        -Declare yada handele edilemez

        2=Runtime Errors:
        -Kodu run ettikten sonra karsimiza cikan hatalardir
        -Kodun algoritmasindaki hatalardir
        -Javanin kendi bunyesindeki hatalar
        -Data uyusmazligi hatalari
        -Declare ve handle edilebilir(amam hepsi degil)

        A) Checked exception:
        -Handle -declera edilmesi zorunludur
        -compile edilirken verilen hatalar
        -Throwable class in altindaki ,Erroor ve Runtime exception haricindekilerdir
        -Javanin icerisindeki kutuphane,classlardan kaynakli IOException-SQLException
        B) Unchecked Exception:
        -Runtime Exception class inin  altindaki hatalardir
        -Handle-declera edilmesi DEV e baglidir,optionaldir
        -ArithmeticException,ArrayOutOfBoundException,NullPointerException

        C) Errors:
        -Telafi edilemez hatalardir
        -Hanhle declere edilemez
        -Javanin kendi kaynak hatalaridir
        -OutOfMemoryError,StackOverFlowError,AWT Error

        HANDLE EXCEPTION
        -try-catch-finally keyword
        -Catch() metottur,,try,finally
        -try-catch
        -try-catch-catch
       - try-catch-catch-finally
        - try-finally

        try{
        // calisacak kodu yaziyoruz
        }catch(ExceptionClass e){
        // Log olarak tutulmasi gereken warning
        // exception kullanmak zorunda degiliz
        // e.printStackTrace():exception un tamamini kod bittikten sonra konsola basar
        // e.getMessage(): dan sonra ki mesaji
        }finally{
        // yukaridan bagimsiz olarak her zaman calisacak kod
        }

        // birden fazla catch kullanilacak olursa
        // ilk catch de her zaman daha kucuk class tercih edilir

        try{
        }catch(ExceptionA e)// sub class once gelir
        }catch(ExceptionB e) // super calss sonra gelir

        try{

        }catch(ArithmeticException I ArrayIndexOutOfBoundException I NullPointerException e)
        e.printStackTrace();

        // DECLARE:
        -throws keywordu kullanilir
        -checked exceptionlar icin genellikle kullanilir
        -methotlarin isimlerinin yanina throws yazarak exception class ini ekler
        Thread.sleep();--->IOException
         */

        Scanner input = new Scanner(System.in);
        int sayi = 0;
        while (sayi >= 0) {
            System.out.println("Lütfen bir int giriniz");
            try {
                sayi = input.nextInt();
                System.out.println("Girilen sayi" + sayi);
            }catch (InputMismatchException e){
                input.next();
                System.out.println("Invalid input");

            }

            System.out.println("Girilen sayi : " + sayi);
        }
    }
}
