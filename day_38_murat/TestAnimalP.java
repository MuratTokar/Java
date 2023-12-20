package day_38_murat;

public class TestAnimalP {
    public static void main(String[] args) {
        AnimalP a =new AnimalP();
        Dog d =new Dog();
        Cat c=new Cat();
       // a.eat();
       // d.eat();
        //c.eat();
        System.out.println("******************************");
        AnimalP aP=new AnimalP();
        AnimalP dP=new Dog();
        AnimalP cP=new Cat();

        aP.eat();
        dP.eat();
        cP.eat();
        System.out.println("********");
        feedAnimal(a);
        feedAnimal(d);
        feedAnimal(c);
    }
    public static void feedAnimal(AnimalP a){
        a.eat();

    }
    public static void feedAnimal(Dog d){
        d.eat();

    }
    public static void feedAnimal(Cat c){
        c.eat();

    }
}
