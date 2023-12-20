package day_069_mrt;

public class C175 {
    public static void main(String[] args) {
        App firstobj=new App();
        App.process(); // 10
        System.out.println(firstobj.bar); //10

        App secondobj=new App();
        App.process(); // 20
        System.out.println(secondobj.bar); // 20

        // instance variables ,static metodlarda kullanilamaz
        // instance metot,static metotolarda cagrilamaz

    }
}
class App{
    int foo;
    static int bar;
    static void process(){
     // foo+=10; bundan dolayi compile error verecektir.cunku static metotta instance variable cagirdik
        bar+=10;  // her cagrildiginda 10 ekleyecek
    }
}

