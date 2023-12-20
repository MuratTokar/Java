package day_019_Exmpls;

public class Animal {

    boolean kanatliMi=true;              // false
    int ayakSayisi=2;                    // 0
    String yasamAlani;                   //  null


    static String kus="Karga";



   public  void getInfo(){

       System.out.println(kanatliMi);
       System.out.println(ayakSayisi);
       System.out.println(yasamAlani);

   }




   public static void staticMethot(){
       System.out.println("Static Method calisti.");
   }


    public void eat(){
        System.out.println(" Dari yer..");

    }


    public void fly(){
        System.out.println("Ucabilir..");

    }

    public void walk(){
        System.out.println("Iyi yurur, iyi kosar");

    }

    public void sleep(){

        System.out.println(" sever..");

    }







}
