package day_070_mrt;

public class C201 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students){

            System.out.println(""+s.name); // null.name
            }

        }
    }

class Student {
    String name;
    public Student(String name) {
        this.name=name;
    }
}       //cevap=E( NullPointerException)

