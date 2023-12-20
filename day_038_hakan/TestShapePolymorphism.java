package day_038_hakan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestShapePolymorphism {
    public static void main(String[] args) {
        CirclePolymorphism circle = new CirclePolymorphism(3);
        RectanglePolymorphism rect = new RectanglePolymorphism(5,8);
        //calculateArea(rect);
        //calculateArea(circle);


        ShapePolymorphism circleP = new CirclePolymorphism(3);
        ShapePolymorphism rectP = new RectanglePolymorphism(5,8);

        calculateArea(circleP);
        calculateArea(rectP);

        //ArrayList<String> arrayList = new ArrayList<>();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        addElementToList(arrayList, "Java");
        addElementToList(linkedList, "Javascript");

        ArrayList<String> arrayList2 = new ArrayList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        addElementToList(arrayList2, "Java");
        addElementToList(linkedList2, "Javascript");

    }



    public static void addElementToList( List<String> list, String text){
       list.add(text);
    }

    public static void addElementToList( ArrayList<String> list, String text){
        list.add(text);
    }

    public static void addElementToList( LinkedList<String> list, String text){
        list.add(text);
    }


// method overloading
   public static void calculateArea(ShapePolymorphism shape){
        shape.calculateArea();
        shape.printInfo();
    }

    public static void calculateArea(CirclePolymorphism circle){
        circle.calculateArea();
        circle.printInfo();
    }

    public static void calculateArea(RectanglePolymorphism rect){
        rect.calculateArea();
        rect.printInfo();
    }

     /*public static void calculateArea(ShapePolymorphism shape) {
        if (shape instanceof CirclePolymorphism) {
            shape.calculateArea();
            ((CirclePolymorphism) shape).printInfo();
        } else if (shape instanceof RectanglePolymorphism) {
            shape.calculateArea();
            ((RectanglePolymorphism) shape).printInfo();
        }
    }*/

    /*public static void calculateArea(ShapePolymorphism shape){
       // shape.calculateArea();
       // shape.printInfo();

        if (shape instanceof CirclePolymorphism) {
            shape.calculateArea();
            ((CirclePolymorphism) shape).printInfo();
        } else if (shape instanceof RectanglePolymorphism) {
            shape.calculateArea();
            ((RectanglePolymorphism) shape).printInfo();
        }
    }*/

}


