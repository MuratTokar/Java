package day_064_hakan;

public class Q60 {

    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }
}

interface Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable {
    public void readBook(){}
}

 class EBook extends Book {
    public void readBook(){}

     // abstract methods, concrete class icerisinde implement edilmeli
     public void setBookMark() {}

 }
