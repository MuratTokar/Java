package day_068_mrt;

public class C159 {
    public static void main(String[] args) {
        App9 obj=new App9();
        Book objBook=new Book();
        System.out.println(objBook.pages + ":" + obj.count);
        obj.method(objBook,obj.count);
        System.out.println(objBook.pages + ":" + obj.count);
    }
}
class Book{
    int pages;
}
 class App9{
    int count;
    public void method(Book x,int k){
        x.pages=100;
        k=200;

    }
    //cevap=A (0:0  100:0)

}

