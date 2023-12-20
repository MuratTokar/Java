package day_031_hakan;

public class Task {

    public static void main(String[] args) {
        Student student_1 = new Student();
        student_1.name = "Mike";
        student_1.age = 17;
        student_1.gender = 'M';
        student_1.course = "Java";
        student_1.year = 2016;

        Student student_2 = new Student("Smith", 18, 'M', 2015, "JS");
        Student student_3 = new Student("Mary", 19, 'F', 2017, "TS");

        Student student_4 = new Student("Mary", 19, 'F', 1990, "TS");

        student_2.attendLab();
        student_2.attendLecture();
        student_2.submitAssignment();
    }

}

class Student{
    String name;
    int age;
    char gender;
    int year;
    String course;

    static String university = "Guider Soft";

    public Student(){

    }

    public Student(String name, int age, char gender, int year, String course){

        if(year < 2000){
            System.out.println("Lütfen gecerli bir yil giriniz");
        } else {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.course = course;
            this.year = year;
        }
    }

    public void attendLecture(){
        System.out.println(this.name + ", " + this.course + " dersine katildi.");
    }

    public void submitAssignment(){
        System.out.println(this.name + ", " + this.course + " dersine ait ödevi teslim etti.");
    }

    public void attendLab(){
        System.out.println(this.name + ", " + this.course + " labina katildi.");
    }

}
