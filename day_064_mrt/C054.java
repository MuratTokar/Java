package day_064_mrt;

public class C054 {
    public static void main(String[] args) {
       /* 54.   You are asked to develop a program for a shopping application, and you are given this information:
                The application must contain the classes Toy, EduToy, and ConsToy. The Toy class is the superclass
                of the other two classes.
                The int calculatePrice (Toy t) method calculates the price of a toy.
                The void printToy (Toy t) method prints the details of a toy.
                Which definition of the Toy class adds a valid layer of abstraction to the class hierarchy?

                nasil bir abstract class olusabilir
                */
    }
}
class Toy{
    public int calculatePrice(Toy t){
        // calculate to price
        return 0;
    }
    void printToy(Toy t){
        // print the details of the toy
    }
    // Bady si olmayan bir method ta abstrack keyword u olmak zorunda yada bady eklemeliyiz

}
class EduToy extends Toy{

}
class ConsToy extends Toy{
    // abstract class icine yazilan metot ya abstract olacak yada gercek metot olup bady si olacak.Kivircik parantezi olacak

}// cevap A
//
