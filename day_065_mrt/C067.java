package day_065_mrt;

public class C067 {
    public static void main(String[] args) {
        Caller c=new Caller();
       // c.start(); metot private oldugu icin erisilmez
      //  c.init();metot private oldugu icin erisilmez


    }

}
class Caller{
    private void init(){ // private leri public,protected veya default  yapsak sorun cozuzlur
        System.out.println("Initialized");


    }
    private void start(){
        init();
        System.out.println("Started");
    }
    // D = Compilation fails
}
