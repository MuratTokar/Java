package day_38_murat;

public class AnimalP {
    public void eat(){
        System.out.println("Hayvan yemegini yedi");
    }
}
class Dog extends AnimalP{
    public void eat(){
        System.out.println("Kopek yemegini yedi");
    }

}
class Cat extends AnimalP{
    public void eat(){
        System.out.println("Kedi yemegini yedi");
    }

}
