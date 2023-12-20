package day_069_mrt;

public class C174 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);
       // System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

class MyString {
    String msg;
    MyString(String msg) {
        this.msg = msg;
    }

   // @Override
    //public String toString() {
    //    return msg;
        // bir objeyi toString olmadan basarsak bize referans numarasi veririr .
       // Eger toString metodu olursa metot ne donuyorsa onu basar

}
// cevap=A(
//Hello Java SE 8
//Hello Java SE 8

