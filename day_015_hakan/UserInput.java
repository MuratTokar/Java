package day_015_hakan;


// alttaki 3 import yerine packageName.* seklinde yazarak,
// o package teki tüm classlari import edebiliriz

//import day_014_hakan.*;


import day_014_hakan.DoWhileLoop;
import day_014_hakan.NestedForLoops;
import day_014_hakan.Task_43;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) throws FileNotFoundException {

        /*

        // import package.class
        LabeledStatements labeledStatemasda234324 = new LabeledStatements();
        DoWhileLoop doWhile = new DoWhileLoop();
        NestedForLoops nestedForLoops = new NestedForLoops();
        Task_43 task_43 = new Task_43();


        String str = "Java is the best";

        System.out.println(str.length());

        System.out.println(Math.pow(2, 3));

        for (int i = 1; i <= 10; i++){
            System.out.println((int)(Math.random()*10));
        }




         */

        Scanner scan = new Scanner(System.in);
/*
        System.out.print("Degerli kullanici, lütfen bana yasinizi söyleyiniz : ");
        // integer bir deger almak istedigimizde
        int yas = scan.nextInt();

        System.out.println("Yasiniz : " + yas);


 */
        // string bir deger almak istedigimizde
        /*
        // bir kelime almak istedigimizde
        System.out.print("Lütfen isminizi yaziniz : ");
        String firstName = scan.next();
        System.out.println("My firstname is " + firstName);

         */
        // bir cümle almak istedigimizde
        System.out.print("Lütfen isminizi yaziniz : ");
        String fullName = scan.nextLine();
        System.out.println("My full name is " + fullName);









    }
}
