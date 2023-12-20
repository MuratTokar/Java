package day_027_Exmpls;

public class Student {
    int score;
    int age;

    Student(int age, int score){
        this(5);
        System.out.println(age*score);
    }
    Student(int age){
        this();
        System.out.println(age*score);
    }
    Student(){
        System.out.println("default");
    }



}
