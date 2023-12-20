package day_037_hakan;

public abstract class AbstractPerson {
    // gercek method
    // soyut method
     abstract void printHelloPerson();

    public void printSelam(String name){
        System.out.println("Hallo" + name);
    }
}

abstract class AbstractStudent extends AbstractPerson{
    public abstract void printHelloStudent();



    // gercek method
    // soyut method
}

class Grundschuler extends AbstractStudent{
    // gercek method

    public void printHelloStudent(){

    }

    public void printHelloPerson(){

    }

    public void printHello(String name){

    }
}
