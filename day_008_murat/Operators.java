package day_008_murat;

public class Operators {
    public static void main(String[] args) {

        System.out.println("" + 4 + 10/2 + 1); // OUTPUT : 451
        System.out.println("" + 4 + 10%2 + 1); // OUTPUT : 401
        System.out.println("" + 4 + 10*2 + 1); // OUTPUT : 4201
        // System.out.println("" + 4 + 10*2 - 1); // Compile Error : String - isaretini uygulayamiyor


        // int num1 = 5;
        // int num2 = 10;

        int num1 = 5, num2 = 10, num3 = 20, num4 = 55;

        double ortalama = (num1 + num2 + num3 + num4) / 4.0;
        System.out.println("ortalama (4.0) : " + ortalama); // 22.5

        double ortalama2 = (num1 + num2 + num3 + num4) / 4;
        System.out.println("ortalama (4) : " + ortalama2); // 22.0

        int ortalama3 = (int) ((num1 + num2 + num3 + num4) /  4.0);
        System.out.println("ortalama (4.0 - int) : " + ortalama3); // 22

        int a = (int) 2000000000000l;
        System.out.println("a : " + a );

        byte b = (byte) 130;
        System.out.println("b : " + b);

        // Istisna : double 8 byte, int 4 byte
        // zoraki cevirme ile double i int e cevirirsiniz, fakat veri kaybi olusur

        int x;
        double y = 2.5;
        //x = y; // compile error : double > int
        x = (int) y;
        System.out.println("x in degeri : " + x);

    }
}
