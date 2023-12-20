package day_017_hakan;

public class Task_58 {

    public static void main(String[] args) {
        getGreaterNumber();
        getGreaterNumber(10,20);
        getGreaterNumber(50,30);
    }

    public static void getGreaterNumber(){
        int a=10, b=20;
        // ternary operator
        int greater = b < a ? a : b ;
        System.out.println(Math.max(a, b));
        System.out.println(greater);
    }

    public static void getGreaterNumber(int birinciSayi, int ikinciSayi){
        // ternary operator
        int greater = ikinciSayi < birinciSayi ? birinciSayi : ikinciSayi ;
        System.out.println(Math.max(birinciSayi, ikinciSayi));
        System.out.println(greater);
    }
}
