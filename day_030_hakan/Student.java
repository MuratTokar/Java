package day_030_hakan;

public class Student {

    String name;

    String favoriteColor;
    int studentNo;
    static String schoolName = "Europa Grundschule";
    static int counter = 0;

    // No-argument constructor - Default constructor
    public Student(){
        counter++;
    }

    // parameterized constructor
    public Student(String isim, int ogrenciNo){
        counter++;
        this.name = isim;
        this.studentNo = ogrenciNo;
    }

    public Student(int ogrenciNo, String isim){
        counter++;
        this.name = isim;
        this.studentNo = ogrenciNo;
    }

    public Student(String name){
        counter++;
        this.name = name;
    }

    public Student( int studentNo){
        counter++;
        this.studentNo = studentNo;
    }

    public void printStudentInfo(){
        System.out.println("Name : " + name);
        System.out.println("Student No : " + studentNo);
        System.out.println("School Name : " + schoolName);
    }

    public int getCountOfStudents(){
        return counter;
    }
}
