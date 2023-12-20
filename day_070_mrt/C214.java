package day_070_mrt;

public class C214 {
    public static final int MIN = 1;

    public static void main(String[] args) { // asagida test 1 dedigine gore burdaki args 0=1
        int x = args.length; // length 1 döner yani x=1
        if (checkLimit (x)) {           // line n1 // true dondu
            System.out.println("Java SE"); // true dondugu icin ("Java SE") basar
        } else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x) {
        return (x >=MIN) ? true : false; //( x>=MIN ) (1>=1) =True
    }
}
// javac Test.java
// java test 1

// Cevap=A(Java SE )