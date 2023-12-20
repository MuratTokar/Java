package day_035_hakan;

class Person {
    String name;

    public Person(){
        System.out.println("Person default constructor");
    }

    public Person(String name){
        this.name = name;
    }
   public String toString(){
        return "Name : " + name;
    }

    public String toString(String param){
        return param;
    }
}

class Employee extends Person {
    int salary;

    public Employee(String name, int salary){
        super.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Name : " + name +
                " Salary : " + salary;
    }

}

class Student extends Person {
    int studentId;

    public Student(String name, int studentId){
        // super();
        super.name = name;
        this.studentId = studentId;
    }

    public String toString(){
        return "Name : " + name +
                " StudentId : " + studentId;
    }

}

class TestPerson{
    public static void main(String[] args) {
        Person person = new Person("Said");
        Student student = new Student("Said",123);
        Employee employee = new Employee("Zafer", 5000);

        System.out.println(person.toString());
        System.out.println(student.toString("Java"));
        System.out.println(employee.toString());

    }
}

// Method Overloading
/**
 * - Ayni class icerisinde olmali
 * - access modifier, return type farkli olabilir
 * - method name ayni olmak zorunda
 * - Parameters farkli olmak zorunda, sirasi da farkli olabilir
 */



// Method Overriding
/**
 * - Super - subclass iliskisi olmali
 * - access modifier, daha geni sveya ayni olmali
 * - return type, ayni olmali
 * - method name ayni olmali
 * - Parameters ayni olmali, fakat farkli oldugunda
 *          farkli bir method olarak(method overloading) kabul edilir
 */