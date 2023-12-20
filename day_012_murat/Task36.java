package day_012_murat;

public class Task36 {
    public static void main(String[] args) {
        int a=5,b=10;
        char operator='*';
        switch (operator){
            case '+':
                System.out.println("Toplam = " + (a+b));
                break;
            case '-':
                System.out.println("Fark ="+ (a-b));
                break;
            case '*':
                System.out.println("Carpim="+(a*b));
                break;
            case '/':
                System.out.println("Bölüm="+(a/b));
                break;
            case '%':
                System.out.println("Mod="+(a%b));
                break;
            default:
                System.out.println("Lütfen gecerli bir islem girin");
                break;
















        }
    }
}
