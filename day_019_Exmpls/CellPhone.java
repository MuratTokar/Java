package day_019_Exmpls;

public class CellPhone {



    boolean dokunmatikMi=true;


    boolean support5G=false;

    String brand="Samsung";


    static int num=5;

    double price;

    public static void staticCellPhone(){

        System.out.println("Static method calisti");
    }


    public void getInfo(){


        System.out.println(dokunmatikMi);
        System.out.println(brand);
        System.out.println(price);


    }


    public void call(){

        System.out.println(" Ara benii");

    }

    public void message(){

        System.out.println("Marastan bir haber geldi");

    }

    public void openApp(){

        System.out.println(" Play storda var");


    }












}
