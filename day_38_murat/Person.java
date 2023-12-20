package day_38_murat;

public interface Person { // interface class
 void eat();

 void sleep();

 void wakeUp(); // metot olusturduk ve bu metotlar final ve statictir

 void drink();

 void growUp();
}
 // Person(interface)----->AbstractStudent =1-Grundschuler      2-UniverstyStudent

 abstract class Student implements Person {// implemets class

  public void drink() {
   System.out.println("su ic");
  }

  public void sleep() {
   System.out.println("uyku saati 22.00 da");
  }

  public void wakeUp() {
   System.out.println("Kalkma saati 07,00");// metodu overrid e ettik
  }
 }

 class Grundschuler extends Student {// imlement olmus student class tan gercek bir class  turettik

  public void eat() { // abstract bir sub classta gercek metot olustu
   System.out.println("Döner ye");
  }

  public void growUp() {
   System.out.println("Bol süt icmeliyim");
  }

  public void wakeUp() {
   System.out.println("Kalkma saati 8.00");// metodu overrid e ettik
  }

  public void drink() {
   System.out.println("süt ic");
  }
 }


 class UniverstyStudent extends Student {

  public void eat() { // abstract bir sub classta gercek metot olustu
   System.out.println("Shawarma ye");
  }

  public void sleep() {
   System.out.println("uyku saati 23.00"); // metodu overrid ettik
  }

  public void growUp() {
   System.out.println("Cok kirap okumalisin");
  }

 }


 class testPerson {
  public static void main(String[] args) {
   UniverstyStudent universtyStudent = new UniverstyStudent();
   Grundschuler grundschuler = new Grundschuler();
   grundschuler.drink();
   universtyStudent.growUp();

   Student student = new Student() {
    @Override
    public void eat() {

    }

    @Override
    public void growUp() {

    }
   };
//inner Class
   Person p = new Person() {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void wakeUp() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void growUp() {

    }
   };
  }
 }








