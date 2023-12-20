package day_30_murat;

public class Car {
    String marka;
    int model;
    String renk;


    public  Car(String marka,int model,String renk){
        this.marka=marka;
        this.model=model;
        this.renk=renk;

    }
   public void printInfo(){
       System.out.println("Marka " + marka);
       System.out.println("Model " + model);
       System.out.println("Renk " + renk);

   }



}
