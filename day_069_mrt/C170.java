package day_069_mrt;

public class C170 {
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();
        Director director=new Director();
        // line n1
/*
  Which two options fail to compile when placed at line n1 of the main method?
 (Choose two.)
  A. employee.salary = 50_000;
  B. director.salary = 80_000;
  C. employee.budget = 200_000; // fail super class, subclass instance variable ini kullanamaz
  D. manager.budget = 1_000_000;
  E. manager.stockOption = 500; // fail super class, subclass instance variable ini kullanamaz
  F. director.stockOptions = 1_000;
 */
    } // Cevap=(C E)

}
class Employee{
    public int salary;

}
class Manager extends Employee{
    public int budget;

}
class Director extends Manager{
    public int stockOptions;

}
