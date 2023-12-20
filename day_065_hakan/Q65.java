package day_065_hakan;


public class Q65 {
    public static void main(String[] args) {
        float var1 = (12_345.01<= 123_45.00) ? 12_456 : 124_56.02f;
        //float a = 12456.0; // compilation fails
        float var2 = var1 + 1024;
        System.out.println(var2); // 13_480.02f
    }
}

// hint : underscore, alt tire, sadece sayilari daha iyi
// okuyabilmek icin kullanilir, baska ekstra bir ozelligi yoktur
