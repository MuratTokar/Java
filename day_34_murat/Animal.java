package day_34_murat;

public class Animal {    // super classe

    String name;
}
class Dog extends Animal{  // child calsse
    public Dog(String name){  // constructor olusturduk
        this.name=name;

    }
    public String getName(){ // metot
        return name;
    }
    class Bird extends Animal{
        public Bird(String name){
            this.name=name;

        }
        public String getName(){
            return name;
        }

    }
    class Cat extends Animal{

        public Cat(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }

    }
    class Test{
        public void main(String[] args) {
            Dog dog=new Dog("Luffy");
            Cat cat=new Cat("Mia");
            Bird bird=new Bird("Kac kedi geliyor");

            System.out.println(dog.getName());
            System.out.println(cat.getName());
            System.out.println(bird.getName());

        }

    }




}



