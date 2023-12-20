package day_065_hakan;

import java.io.IOException;

public class Q68 {
    public static void main(String[] args){
        try{
            method1();
        } catch (MyException | IOException me){
            System.out.println("A");
        }
    }


    public static void method1() throws IOException {
        try{
            throw 3>10 ? new MyException() : new IOException();
            //print "B"
        } catch (IOException ie){
            System.out.println("I"); // print "I"
           throw new MyException();// print "A"
        } catch(Exception e) {
            System.out.println("B");
        }
    }
}

class MyException extends RuntimeException { }

