package day_37_murat;
// abstract bir metot private olamaz
// final metortlarin overriding ini engelledigi icin abstrackt metotolar final olamz
// fibal class ta subclass olusturmaz ve variable lerde degeri degistirmeye izin vermez

public abstract class AbstractPerson {
    // gercek method
    // soyut method
    abstract void printHelloPerson();

    public void printSelam(String name){
        System.out.println("Hallo" + name);
    }
}

abstract class AbstractStudent extends AbstractPerson {
    public abstract void printHelloStudent();

    public void printHelloPerson() {


        // gercek method
        // soyut method
    }

    class Grundschuler extends AbstractStudent {
        // gercek method

        public void printHelloStudent() {

        }


        public void printHello(String name) {

        }
    }
}




