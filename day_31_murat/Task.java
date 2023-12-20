package day_31_murat;

public class Task {
    public static void main(String[] args) {
        Student student_1=new Student();
        student_1.name="Mike";
        student_1.age=17;
        student_1.gender='M';
        student_1.course="Java";
    }

}
class Student{
    String name;
    int age;
    char gender;
    int year;
    String course;
    static String universty="Guider soft";

    public void attendLecture(){
        System.out.println(this.name + "," + this.course + "dersine katildi");
    }
}
