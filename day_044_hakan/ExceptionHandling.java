package day_044_hakan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    /**
     *  System.exit(1)
     *
     *  Handling an exception : try - catch block
     *  Compile Errors > Syntax error > No try-catch
     *  Runtime Errors > Algorithm, logical errors
     *  1. Errors   : StackOverFlow, OutOfMemorz, AWT, JVM errors
     *      - not recoverable, handle edilemez, no try-catch
     *
     *  2. Checked Exceptions
     *      - Handle edilmesi zorunlu exceptions
     *      - Handle edilmezse compile error verir
     *      - try catch
     *      - throws keywordu kullanilir (methods)
     *      - Javanin kendi kutuphanelerinde
     *
     *  3. Unchecked Exceptions
     *      - handle edilmezse compile error Vermez
     *      - try catch
     *      - handle is optional, dev e baglidir
     *      - kendi yazdigimiz kodlar icin kullanilir
     *      - Error ve Runtimeexception classlarindan inherit edilen her class
     *
     *   try {
     *       // code block u
     *       // hata verirse catch e girer, vermezse catch e girmeden devam eder
     *   } catch(ExceptionTypeClass e){
     *       // try block unda hata oldugunda, Exception classi, hatayi kapsiyor ise bu blocka girer
     *       // e yi kullanmak zorunda degiliz
     *       // e icin printStackTrace() ve getMessage() methodlari en populer methodlardir
     *       // LOG yazdirma olarak kullanilir
     *   } finally {
     *       // hata verse de vermese de calismasi istenen code
     *   }
     *
     *   - try - catch kendi baslarina kullanilamaz,
     *          try- catch
     *          try - finally
     *          try - catch - finally
     *          try - catch ... catch - finally
     *   - try - catch sirasi ile beraber kullanilmali
     *   - finally is optional, zorunlu degil
     *   - try - catch ... catch yazilabilir
     *      Fakat, catch icerisindeki Exception Class lar level olarak ozelden genele olmalidir
     *      En genel Exception Class i en alta(son) yazilir
     *      En geneli Exception e seklinde yazilir
     *
     *    Declare > throws keyword u ile
     *    method throws CheckedExceptionClassName {
     *        // CheckedException hatasi verecek code
     *    }
     *
     *    try {
     *        // checked exception hatasi verebilecek code
     *    } catch(Exception e){
     *
     *    }
     *
     *    try {
     *
     *    } catch(NumberFormatException | IOException | InputMismatchException e){
     *
     *    }
     *
     *    throw new ExceptionClass("message");
     *
     */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        //System.exit(1);
        //System.out.println("Hello World");
        //throw new RuntimeException("fsdfsdfsdf");

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        try {
            int a = sc.nextInt(); // int
            // method(a); accepts int
            System.out.println("Kullanici integer bir deger girdi");
        } catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid input");
            // return label;
        }


        System.out.println("Kod bitti");
        try {
            int a = 100/5;
            File file = new File("C:\\Users\\HS\\Desktop\\JavaTraining\\June.pdf");
            new Scanner(file);
        } catch(ArithmeticException | FileNotFoundException e){

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("/ bolme hatasi");
        } finally {
            System.out.println("Handle block bitti");
        }

        System.out.println("Keske kodum devam etseydi :(");

         //throw new IOException(" fsdfsd");
         //Thread.sleep(3000);
         //throw new RuntimeException("fsdfdsf");



    }
}
