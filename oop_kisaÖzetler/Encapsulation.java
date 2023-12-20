package oop_kisaÖzetler;

public class Encapsulation {
private String aracMarka;
private String model;
private int aracYas;



public String getAracMarka(){
    return aracMarka;
}
public void setAracMarka(String aracMarka){
    this.aracMarka=aracMarka;
}
public String getModel(){
    return model;

}
public void setModel(String model){
    this.model=model;
}
public int getAracYas(){
    return aracYas;
}
public void setAracYas(int aracYas){
    this.aracYas=aracYas;
}

    public static void main(String[] args) {
        Encapsulation ec1=new Encapsulation();
        ec1.setAracMarka("Mercedes");
        ec1.setModel("A180");
        ec1.setAracYas(3);

        System.out.println("Arac markasi : " + ec1.getAracMarka());
        System.out.println("Arac model : " + ec1.getModel());
        System.out.println("Arac yasi : " + ec1.getAracYas());
    }


}
