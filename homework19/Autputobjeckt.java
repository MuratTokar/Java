package homework19;

public class Autputobjeckt {
    public static void main(String[] args) {  // cevap B

        Animal animal=new Animal(); // animal e deger atmadigimiyz icin default verir
        animal.getInfo();
        animal.fly();
        animal.ayakSayisi=5;
        System.out.println("********************************************************************");


        CellPhone cp=new CellPhone(); // instance her yerde cagirilir.static te statici cagirabiliriz
        cp.getInfo();
        cp.call();
        cp.brand="Ihaone";
        System.out.println("*****************************************************************");


        JavaTraining jt=new JavaTraining();
        jt.getInfo();
        jt.againStudy();
        jt.country="USA"; //cagirdik objeleri ama degerler degismedi.ama getinfo yu


    }
}
