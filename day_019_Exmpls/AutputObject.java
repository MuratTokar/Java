package day_019_Exmpls;

public class AutputObject {

    public static void main(String[] args) {

        Animal animal= new Animal();

        animal.fly();
        // animal.getInfo();
        animal.ayakSayisi=5;
        animal.getInfo();


       Animal.kus="Papagan";
       Animal.staticMethot();


        System.out.println("###################");

        CellPhone cp=new CellPhone();

        cp.call();
        //cp.getInfo();
        cp.brand="Iphone";
        cp.getInfo();
        System.out.println("###################");

        JavaTraining jt=new JavaTraining();
        jt.againStudy();
        // jt.getInfo();
        jt.country="USA";
        jt.getInfo();
        System.out.println("###################");

    }







}
