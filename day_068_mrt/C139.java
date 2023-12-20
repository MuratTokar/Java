package day_068_mrt;


public class C139 {
    int count;  // static bir metot tarafindan cagrilmaz

    public static void displayMsg(){

        //  System.out.println("Welcome Visit Count: " + count++); // line n1 // instance variable static bir metot ile cagrilamaz
                                                                  // static methot sadece static olani cagirir
    }
    public static void main(String[] args) {
        C139.displayMsg();                       // line n2
        displayMsg();
    }
} // Cevap=C (Compilation fails at line n1)
