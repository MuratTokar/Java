package day_068_mrt;

public class C158 {
    public static void main(String[] args) {
        int aVar=9;// eger aVar=9 olursa hangi kod calisir yaziyor .Buraya aVar a 9 atadigimizda if calisir
        if (aVar++<10){ // aVar in sonraki degeri 10
            System.out.println(aVar + "Hello Universel"); // 10Hello Universel
        }else {
            System.out.println(aVar+"Hello World");
        }
    } // cevap=B (10Hello Universel)
}
