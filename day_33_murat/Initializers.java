package day_33_murat;
// once initializer eder sonra constractura gecer

public class Initializers {
    static int a =5;
    static {
        System.out.println("Static initializer 1"+a);
    }
    {
            System.out.println("Objeckt initializer 1");
        }
        static int b=10;

    static {
        System.out.println("Static initializer 2"+b+a);
        }
        {
            System.out.println("Objeckt initializer 2");

        }

    static {
        System.out.println("Static initializer 3");
        }
        {
            System.out.println("Objeckt initializer 3");

        }






    public static void main(String[] args) {

    }


        }
