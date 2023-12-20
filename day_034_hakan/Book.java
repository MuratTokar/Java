package day_034_hakan;

public class Book {
    protected String protectedTitle="protected Book Title";
    public String publicTitle="public Book Title";
    private String privateTitle="private Book Title";
    String defaultTitle = "default Book title";

    String type = "Book";
    String author;
    double price;

    public void getBookInfo() {
        System.out.println("Parent class Book Info...");
    }
}

class EBook extends Book {
    double size;
    int pages;
    String type = "Ebook";

    public void readBook(){
        System.out.println("Kitap okunuyor...");
    }

    public String toString(){
        return "Hallo Hallo, Eboooook";
    }

//    public void getBookInfo(){
//        System.out.println("Ebook Info...");
//    }
}

class AudioBook extends Book {
    double length;
    String narrator;
    // String type = "AudioBook";

    public void listen(){
        System.out.println("Audibook is playing...");
    }

    public void getBookInfo(){
        System.out.println("Audibook Info...");
    }


}

class TestBook {
    public static void main(String[] args) {
        EBook eBook = new EBook();
        eBook.readBook();
        eBook.price = 5.6;
        AudioBook audioBook = new AudioBook();
        audioBook.listen();
        audioBook.price = 10.0;

        System.out.println(eBook.type);
        System.out.println(audioBook.type);

        System.out.println("************ getBookInfo() ***********");
        eBook.getBookInfo();
        audioBook.getBookInfo();

        System.out.println(eBook.toString());

        System.out.println(eBook.defaultTitle);

    }
}
