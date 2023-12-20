package day_34_murat;

 public class Person {
    public Person(){
        System.out.println("Person consrucort");
    }
    public Person(String name){
        System.out.println(name + "person constructor");
    }
    public void printHello(){
        System.out.println("Hello");
    }
}
class Student extends Person{
    public Student(){
        System.out.println("Student consrucort");

    }
    public Student(String name, int age) {
        super(name);
        System.out.println(name + "Student constructor");
        // super(); methodu ile parent classtaki constructorlari call ediyoruz
        // methot ve variableleri ise parantezsiz super ile cagioriyoruz
        // constructor cagirirken ikl sirada olmasi gerekir

    }


}
class UniversityStudents extends Student {
    public UniversityStudents(String name, int age) {
        super(name, age);
        System.out.println("University Studentsconsrucort");
        super.printHello();


    }


        public static void main(String[] args) {
            UniversityStudents students=new UniversityStudents("Halid",10);

        }
    }



