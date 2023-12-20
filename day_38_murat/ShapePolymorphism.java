package day_38_murat;

public abstract class ShapePolymorphism {    // obje olusmasin diye abstract yaptim
    abstract void calculateArea(); // abstract metotot
}
class RectanglePolymorphism extends ShapePolymorphism{ // gercek class olunca ustteki abstract metot implement olmalidir
    int sideA;
    int sideB;
    RectanglePolymorphism(int sideA,int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    public void calculateArea(){
        System.out.println("Dikdortgenin alani = " + sideA * sideB);
    }
}
class CirclePolymorphism extends ShapePolymorphism{
    int radius;
    CirclePolymorphism(int radius){
        this.radius=radius;
    }
    public void calculateArea(){
        System.out.println("Dairenin alani = " + Math.pow(radius,2)*Math.PI);
    }

}

