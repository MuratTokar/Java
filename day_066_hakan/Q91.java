package day_066_hakan;

public class Q91 {
    /**
     * public interface Hunter
     * public abstract class Animal
     * public class Cat extends Animal implements Hunter
     * public class Tiger extends Cat
     */
   /* Which answer fails to compile?

    A) ArrayList<Animal> myList = new ArrayList<>();
     myList.add(new Tiger());

    B) ArrayList<Hunter> myList = new ArrayList<>();
      myList.add(new Cat ());

      C) ArrayList<Hunter> myList = new ArrayList<>();
      myList.add (new Tiger());

    D) ArrayList<Tiger> myList = new ArrayList<>(); // polimorphism asagidan yukariya dogru olur.Cat bir tiger degil ,tiger bir cart
      myList.add(new Cat ());

    E) ArrayList<Animal> myList = new ArrayList<>();
    myList.add(new Cat ());

  //  D: Option D

    */


    }




