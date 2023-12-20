package day_069_mrt;

public class C177 {
    public static void main(String[] args) {



       Bird b = new Peacock(); // D
       Peacock p = (Peacock) b; // D



        p.fly();
        p.dance();
    }
}
class Bird{
    public void fly(){
        System.out.println("Fly.");
    }
}
class Peacock extends Bird{
    public void dance(){
        System.out.println("Dance.");
    }
} // cevap=D
   // Bird b = new Peacock(); // D
   // Peacock p = (Peacock) b; // D
