package day_038_hakan;

public class AnimalP {
    public void eat(){
        System.out.println("Hayvan yemegini yedi");
    }
}

class Dog extends AnimalP {
    public void eat(){
        System.out.println("Köpek yemegini yedi");
    }
}

class Cat extends AnimalP {
    public void eat(){
        System.out.println("Kedi yemegini yedi");
    }
}
