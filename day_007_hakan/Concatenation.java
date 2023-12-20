package day_007_hakan;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("My name " + "is " + "Hakan.");
        int age=40;
        System.out.println("I am " + age + "years old.");
        // Bir string ile int i eklediginizde, int string gibi davranir
        System.out.println("Toplam 3 + 5 = " + 3 + 5);
        // parantez varsa once islem olarak parantez icerisindeki islemi sonlandirir
        System.out.println("Toplam 3 + 5 = " + (3 + 5));
        System.out.println("Toplam 3 + 5 = " + 8);

        String s3, s4;
        // String s4, int a; compile error
    }
}
