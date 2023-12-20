package day_034_hakan;
class Person {
    public Person(){
        System.out.println("Person constructor");
    }

    public Person(String name){
        System.out.println(name + " Person constructor");
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
class Students extends Person{

    public Students(){
        System.out.println("Students constructor");
    }

    public Students(String name, int age){
        super(name);

        System.out.println(name + " Students constructor");
        super.printHello();
    }
}
class UniversityStudents extends Students{
    public UniversityStudents(String name, int age){
        super(name, age);
        super.printHello();
        System.out.println(name + " UniversityStudents constructor");
        //
    }
}
class TestPerson{
    public static void main(String[] args) {
        UniversityStudents uniStu = new UniversityStudents("Halid", 10);
    }
}
