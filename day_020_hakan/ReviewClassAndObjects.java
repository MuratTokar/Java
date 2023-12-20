package day_020_hakan;

public class ReviewClassAndObjects {
    // class is a blueprint/ template/ taslak
    // objelerin bir araya gelmesiyle olusan bir topluluk

    // Class lar Java Memory sinde yer tutmazlar, objects lerin aksine...
    // Objects, Java memory de yer tutarlar

    // ClassName object = new ClassName();

    // static keyword : class a özel degiskenler ve metodlar olusturmak icin kullanilir.
    // public, default, protected, private : Access modifiers
    // public : bütün packagelar arasinda ulasilabilir olmasi icin kullanilir

    // ClassName object = new ClassName();
    // object.field_1 = "value1";
    // object.field_2 = number;

    // System.out.println(object.field_1); // value1
    // public void methodName(){
    //    System.out.println("I am a object/instance method.");
    // }

    // object.methodName(); // I am a object/instance method.

    // Normal degiskenler bir default degere sahip degilken,
    // fields/ instance variables default(varsayilan) degerlere sahiptir.

    // String defaultValue = null
    // Boolean defaultValue = false
    // int defaultValue = 0
    // char defaultValue = \u0000

    /**
     * public class Animal(){
     *     String animalName;
     *     int animalAge = 1;
     *
     * }
     *
     * public class private_hakan.Test(){
     *     public static void main(String[] args){
     *         Animal animal_1 = new Animal();
     *         System.out.println(animal_1.animalName); // null
     *         System.out.println(animal_1.animalAge); // 1
     *
     *         animal_1.animalAge = 5;
     *         System.out.println(animal_1.animalName); // null
     *         System.out.println(animal_1.animalAge); // 5
     *
     *     }
     * }
     *
     *
     */



    public static void main(String[] args) {
        Cars car_1 = new Cars();
        car_1.model="Touran";
        System.out.println(car_1.model);
        //car_1=null;
        //Cars car_1 = new Cars();
        car_1.uretimYili=20;

        System.out.println(car_1.uretimYili);
        System.out.println(car_1.model);
    }

    public void sayHello(){
        String hello = "Hello"; // Local variable
        System.out.println(hello);
    }
}
