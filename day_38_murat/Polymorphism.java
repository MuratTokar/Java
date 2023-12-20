package day_38_murat;

public class Polymorphism {
    /*
    *-Polymorphism (cok sekillik)
    * Declare ,yani referans kismi parent,ama object kismi child/subclass olma yetenegi
    * Referans type abstract bir class / interface olabilir(parent olmasi yeterli)
    *
    * public interface MyInterface{}
    *
    * public calss ClassA implements  MyInterface{}
    *
    * public calss ClassB implements  MyInterface{}
    *
    * ClassA a =new ClassA();
    * ClassB b =new ClassB();
    *
    * MyInterface a =new ClassA();
    * MyInterface b =new ClassB();
    *
    * - Object type ise subclass/ child olmasi yeterlidir
    *
     */
    public static void main(String[] args) {
        Polymorphism polymorphism=new Polymorphism();
        System.out.println(polymorphism.getClass());//class day_38_murat.Polymorphism
        System.out.println(polymorphism.getClass().getName());//day_38_murat.Polymorphism
        System.out.println(polymorphism.getClass().getSimpleName());//Polymorphism
    }
}
