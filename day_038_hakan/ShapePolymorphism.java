package day_038_hakan;
public abstract class ShapePolymorphism {
    abstract void calculateArea();

    public void printInfo(){
        System.out.println("I am a shape.");
    }
}
class RectanglePolymorphism extends ShapePolymorphism {
    int sideA;
    int sideB;
    RectanglePolymorphism(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public void calculateArea(){
        System.out.println("Dikdortgenin alani " + sideA * sideB);
    }

    public void printInfo(){
        System.out.println("I am a rectangle.");
    }
}
class CirclePolymorphism extends ShapePolymorphism {
    int radius;
    CirclePolymorphism(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        System.out.println("Dairenin alani : " + Math.pow(radius,2)*Math.PI );
    }

    public void printInfo(){
        System.out.println("I am a circle.");
    }
}

