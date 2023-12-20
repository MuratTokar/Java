package day_045_hakan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReviewExceptions {
    /**
     *
     * Compiletime Errors
     *  - alti kirmizi yanan hatalar
     *  - Bu hatalarda, kod run edilemez
     *  - Java sytaxinda yapilan temel hatalar
     *  - Kodun yanlis yazilimi/uygunsuzlugu
     *  - declare ya da handle edilemez
     *
     * Runtime Errors
     *  - run ettikten sonra karsimiza cikar
     *  - Kodun algoritmasindaki hatalar
     *  - Java nin kendi bunyesindeki hatalar
     *  - Data uyusmazligi hatalari
     *  - declare ve handle edilebilir(hepsi degil)
     *
     * 1. Checked Exceptions
     *  - Handle-declare edilmesi zorunlu
     *  - compile edilirken verilen hatalar
     *  - Throwable class inin altindaki, Error ve Runtime exception haricindekilerdir
     *  - Javanin icerisindeki kutuphane, classlardan kaynakli IOException, SQLException, FileNotFoundException
     *
     * 2. Unchecked Exceptions
     *  - Runtime Exceptions Classinin altindakiler
     *  - Handle-declare edilmesi DEV e baglidir, optionaldir.
     *  - ArithmeticException, ArrayOutOfBoundException, NullPointerException
     *  - Kendi yazdigimiz kodlardaki algoritmik hatalardan kaynaklanir
     *
     * 3. Errors
     *  - Telafi edilemezen hatalar
     *  - Handle-declare edilemez
     *  - Javanin kendi kaynak hatalaridir
     *  - OutOfMemoryError, StackOverFlowError, AWT(Abstract Window Toolkit) Error
     *
     *  Handle Exception :
     *
     *  try-catch-finally keyword
     *  catch(), try, finally
     *  try - catch
     *  try - catch - catch - ...
     *  try - catch ... - catch - finally
     *  try - finally
     *
     *  try {
     *      // calisacak kodu yaziyoruz
     *  } catch(ExceptionClass e) {
     *      // Log olarak tutulmasi gereken warning
     *      // exceptioni kullanmak zorunda degiliz
     *      // e.printStackTrace(): exception in tamamini kod bittikten sonra console a basar
     *      // e.getMessage(); : dan sonraki mesaji
     *  } finally {
     *      // yukaridan bagimsiz olarak her zaman calisacak kod
     *  }
     *
     *
     *  // birden fazla catch kullanilacak olursa,
     *      ilk catch te her zaman daha kucuk class tercih edilir
     *
     *
     *  try {
     *
     *  } catch(ExceptionA e){ // subclass
     *
     *  } catch(ExceptionB e){ // superclass
     *
     *  }
     *
     *  try {
     *
     *  } catch(ArithmeticException | ArrayIndexOutOfBoundException | NullPointerException e){
     *      e.printStackTrace();
     *  }
     *
     *  DECLARE
     *      - throws keywordu ile kullanilir
     *      - Checked exceptionlar icin genellikle kullanilir
     *      - Methodlarin isimlerinin yanina throws yazarak Exception class ini ekler
     *          Thread.sleep(); -> IOException
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number=0;
        while(0<= number){
            System.out.println("Lutfen bir sayi giriniz");
            try{
                number = input.nextInt();
                System.out.println("Girilen sayi : "  + number);
            } catch(InputMismatchException e){
                input.next();
                System.out.println("Invalid input");
            }
        }
    }
}
