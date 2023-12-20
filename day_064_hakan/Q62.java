package day_064_hakan;

public class Q62 {

    public static void main(String[] args) {
        Book2 book1 = new EBook2();
        book1.readBook();
    }
}

interface Downloadable{
    public void download();
}

interface Readable2 extends Downloadable {
    public void readBook();
}

abstract class Book2 implements Readable2 {
    public void readBook(){}
}

class EBook2 extends Book2 {
    public void readBook(){
        System.out.println("Read E-Book");
    }
    // alttaki method implement edilmezse class Ebook2 satiri compile error verir
   public void download() {}
}
