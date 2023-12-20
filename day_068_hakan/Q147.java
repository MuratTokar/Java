package day_068_hakan;

public class Q147 {

    public static void main(String[] args) {
        // Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);

       // e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age){
    //    setName(name);
      //  setAge(age);
      //  setSalary(2000);
    }

    public Employee(String name, int age, int salary){
        this(name, age);
      //  setSalary(salary);
    }

    // getter setter here

    public void printDetails(){
        System.out.println(name + " : " + age + " : " + salary);
    }
}
