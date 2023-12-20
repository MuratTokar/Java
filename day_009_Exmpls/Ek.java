package day_009_Exmpls;

public class Ek {
    public static void main(String[] args) {

        int a=100, b=7, c=200;
        a%=b;
        a*=b;
        c/=b;
        c-=a;
        c+=b;

        System.out.println(c);   // 21
    }
}
