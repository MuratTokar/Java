package day_34_murat;

public class Book {
    String title;
    String type;
    String author;
    double price;

}
class EBook extends Book{
    double size;
    int pages;
    String type="Ebook";

    public void readBook(){
        System.out.println("Kittap okunuyor");

    }
    public void getBookInfo(){
        System.out.println("Ebook Info...");
    }
}
class AudioBook extends Book{
    double length;
    String narrator;
    String type="AudioBook";

    public void Listen(){
        System.out.println("AudioBook is plaing..");

    }
    public void getaudioBookInfo(){
        System.out.println("Parent class Book Info...");
    }

       public static void main(String[] args) {
          EBook eBook=new EBook(); // obje ile metot cagirdik
          eBook.readBook();
          eBook.price=5.6;
          AudioBook audioBook=new AudioBook();
          audioBook.Listen();
          audioBook.price=10.0;
           System.out.println(eBook.type);
           System.out.println(audioBook.type);

       }
   }

