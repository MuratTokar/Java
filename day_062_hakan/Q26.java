package day_062_hakan;

public class Q26 {
    Character c;
    Integer i;
    String str;
    Double dou;
    Float flo;



    double d;
    float f;
    int in;
    short s;
    byte b;
    long l;
    char ch;
    boolean bool;

    public void printAll(){
        System.out.println("Character (default value) : " + c); // null
        System.out.println("Integer (default value) : " + i); // null
        System.out.println("String (default value) : " + str); // null
        System.out.println("Double (default value) : " + dou); // null
        System.out.println("Float (default value) : " + flo); // null
        System.out.println("double (default value) : " + d); // 0.0
        System.out.println("float (default value) : " + f); // 0.0
        System.out.println("int (default value) : " + in); // 0
        System.out.println("short (default value) : " + s); // 0
        System.out.println("byte (default value) : " + b); // 0
        System.out.println("long (default value) : " + l); // 0
        System.out.println("char (default value) : " + ch); // u/0000
        System.out.println("boolean (default value) : " + bool); // false
    }

    public static void main(String[] args) {
        Q26 defaultValues = new Q26();
        defaultValues.printAll();
    }
}
