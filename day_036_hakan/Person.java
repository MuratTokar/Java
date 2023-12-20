package day_036_hakan;

class Person {
    static String className = "Person";
     // final int age;
      int age_accessible = 20;
      int age = 10;

    /*{
        age = 10;
    }*/

    Person(){

    }

    Person(int age){
        this.age = age;
    }

    Person(String name){

    }

    Person(String name, int age){
        this.age = age;
    }

    static public void printName(){
        System.out.println("\tPerson");
        System.out.println(className);
    }

    String overrideMethod(){
        System.out.println("Person override method");
        return "java";
    }

    void wakeUp(){
        System.out.println("Saat 07.00 da uyan");
    }

    final void sleep(){
        System.out.println("22:00 da uyu");
    }

    final void sleep(String name){
        System.out.println("22:00 da uyu");
    }

}

class PersonTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        // static variable ve methodlara objectName yerine
        // className ile erisilmesi tercih edilmelidir
         // System.out.println(employee.className);
        // employee.printName();

        System.out.println(Employee.className);
        System.out.println(Person.className);
        System.out.println("********** static method call *******");
        Employee.printName();
        Person.printName();

        final int a;
        a = 10;

        Person p_1 = new Person();
        Person p_2 = new Employee();

        System.out.println(employee.age);
        System.out.println(employee.age_accessible);
        p_1.printName();
        p_2.printName();

    }

}
