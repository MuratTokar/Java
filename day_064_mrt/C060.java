package day_064_mrt;

public class C060 {
    public static void main(String[] args) {
        Book book1=new EBook();
        book1.readBook();
    }


}
interface Readable{
    public void readBook();
    public void setBookMark();

}
abstract class Book implements Readable{ //  line n1
    public void readBook(){
        // line n2

    }
}
class EBook extends Book{ // line n3
    public void readBook(){
        // D sikkinda bu class i abstract yapmayi soylemis ama bu kez de obje olusturamayiz

        // line n4
    }
  //  public void setBookMark(){ // setBookMark // D implement etmek zorundayiz
    public void setBookMark(){ // setBookMark
    }
}
