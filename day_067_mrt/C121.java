package day_067_mrt;

public class C121 {
    public static void main(int[] args) {
        System.out.println("int  main " + args[0]); //
    }

    public static void main(Object[] args) {
        System.out.println("Object main " + args[0]);//
    }

    public static void main(String[] args) { // sifirinci index e 1 integer olarak geldi
        System.out.println("String main " + args[0]); // once string deger alacak.Eger string yoksa digerleri alir
    }
}
// Burada metot overloading yapilmis
// javac MainTest.java // java compailer
// Java MainTest 1 2 3// args ye deger gonderir
// Her zaman ilk degri String alir

// Cevap=C (String main 1)


