package day_038_hakan;

public class Polymorphism {

    /**
     * Polymorphism (Cok sekillilik)
     * - Declare, yani referans kismi parent, ama object kismi child/subclass olma yetenegi
     * - ReferenceType abstract bir class / interface olabilir (parent olmasi yeterli)
     *      Object type ise subclass / child olmasi yeterli
     *
     */
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        System.out.println(polymorphism.getClass().getName());
        System.out.println(polymorphism.getClass().getSimpleName());

    }
}
