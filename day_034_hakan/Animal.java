package day_034_hakan;

public class Animal {
    String name;
}

class Dog extends Animal {

    public Dog(String name){

        this.name = name;
    }

    public String getName (){
        return name;
    }
}

class Bird extends Animal {

    public Bird(String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }
}

class Cat extends Animal {

    public Cat(String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }
}



class Test{
    public static void main(String[] args) {
        Dog dog = new Dog("Luffy");
        Cat cat = new Cat("Mia");
        Bird bird = new Bird("kac kedi geliyor");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(bird.getName());
    }
}
