package day_068_mrt;

import java.util.ArrayList;

public class C154 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String"); // while dongusu oldugu zaman genelde (OutOfMemoryError) exception verir
            }
        }
        catch(RuntimeException re){
            System.out.println("Caught a RuntimeException");
        }
        catch (Exception e){
            System.out.println("Cought an Exception");
        }
        System.out.println("Ready to use");
    }
}// cevap= C ( A Runtime error is thrown in the thread "main"
