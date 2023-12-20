package day_38_murat;

public class TestShaePolymorphism {
    public static void main(String[] args) {
        CirclePolymorphism circle=new CirclePolymorphism(3);
        RectanglePolymorphism rect=new RectanglePolymorphism(5,8);
        calculateAre(circle);


    }// method overloading yaptik
    public static void calculateAre(ShapePolymorphism  shape){
        shape.calculateArea();
        System.out.println(shape instanceof ShapePolymorphism);

    }
    public static void calculateAre(CirclePolymorphism circle){
        circle.calculateArea();
        System.out.println(circle instanceof CirclePolymorphism);

    }
    public static void calculateAre(RectanglePolymorphism rect){
        rect.calculateArea();
        System.out.println(rect instanceof RectanglePolymorphism);

    }
}
