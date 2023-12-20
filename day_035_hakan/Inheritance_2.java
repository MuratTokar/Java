package day_035_hakan;

public class Inheritance_2 {
    static String name = "Class B";
    /**
     *
     */
}

class A_I2 extends Object{
    static String name = "Class A";

    static public void printClassName(){
        System.out.println("Class A");
    }

    static public void printDate(){
        System.out.println("Tuesday");
    }

    public String toString(){
        return "Class A";
    }


}

class B_I2 extends A_I2{
    static String name = "Class B";

    static public void printClassName(){
        System.out.println("Class B");
    }
}

class Test_I2 {
    public static void main(String[] args) {
        B_I2 obj_b = new B_I2();
        System.out.println(B_I2.name);
        System.out.println(A_I2.name);

        B_I2.printClassName();
        A_I2.printClassName();

        B_I2.printDate();
        A_I2.printDate();

        System.out.println(obj_b.toString());
    }
}