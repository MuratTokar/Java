package day_012_hakan;

public class Task_36 {
    public static void main(String[] args) {
        // Calculator

        int a = 5, b = 10;
        char operator = '-';

        // switch(degeri check edilecek degisken){ case leri yaz}
        switch(operator){
            // case leri yaziyoruz
            case '+':
                System.out.println("Toplam = " + (a+b));
                break;
            case '-':
                System.out.println("Fark = " + (a-b));
                break;
            case '*':
                System.out.println("Carpim = " + (a*b));
                break;
            case '/':
                System.out.println("Bölüm = " + (a/b));
                break;
            case '%':
                System.out.println("Mod = " + (a%b));
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz");
                break;
        }






    }
}
