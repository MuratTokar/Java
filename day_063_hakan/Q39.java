package day_063_hakan;

public class Q39 {
    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");

        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);

        // Canine 60 Long
        // Feline 80 Short
    }
}
class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal(){}

    Animal(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

class WildAnimal extends Animal {
    String bounds;

    WildAnimal (String bounds){
        // super();
        this.bounds = bounds;
        // line n1
    }

    WildAnimal (String type, int maxSpeed, String bounds){
        //this.type = type;
       // this.maxSpeed = maxSpeed;
       // this.bounds = bounds;
        // line n2
        /**
         * super(type, maxSpeed);
         * this.bounds = bounds;
         */

        super(type, maxSpeed);
        // this(bounds); constructor da super() ya da this() ilk satirda cagrilir.
        // bu yuzden her ikisi cagrilamaz...
        this.bounds = bounds;

    }
}

