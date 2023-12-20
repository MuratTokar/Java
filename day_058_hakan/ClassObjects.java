package day_058_hakan;

public class ClassObjects {
    // class variables
    static int counter = 0;

    // instance variables
    String name;
    int age;

    ClassObjects(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}
