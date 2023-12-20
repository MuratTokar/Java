package day_069_mrt;

public class C176 {
    public static void main(String[] args) {
        Robot r=new Humanoid();
        r.process();
        r.speak("Done");
    }
}
abstract class Robot implements Speakable{
  //  public  void process(); // burasida abstrack olmali
  public abstract void process(); // burasida abstrack olmali
}
class Humanoid extends Robot {
    public void speak(String s) {
        System.out.println(s);
    }
    public void process() {
        System.out.println("Helping..");
    }

}
interface Speakable{
    public void speak(String s);
}
// cevap=C (replace public void process)

