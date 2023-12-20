package day_064_mrt;

public class C062 {

    public static void main(String[] args) {

}
interface Downloadable{
    public void download();

}
interface Readable extends Downloadable{  // line n1--------interface interface yi extends eder
    public void readBook();
}
abstract class Book2 implements Readable{   // line n2
    public void readBook(){
        System.out.println("ReadBook");
    }
}
class EBook2 extends Book2{
        public void readBook(){
            System.out.println("Read E Book");

        }
        public void download(){ // download metodunun implement edilmesiyyle sorun cozulur
            // cevap=E (Compilation fails at line n3

        }

}

}




