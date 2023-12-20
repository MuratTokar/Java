package day_030_hakan;

public class EmployeeMain {

    public static void main(String[] args) {
        // Employee class inda constructor methodlarina dokunulmadan
        // asagidaki gibi default/no-argument constructor i kullanarak object olusturabiliyorum
        Employee emp_1 = new Employee("Hakki",1,"Captain","Electrical");
        Employee emp_2 = new Employee("Hakan",2,"Captain","Electrical");
        Employee emp_3 = new Employee("Said",3,"Captain","Electrical");
        Employee emp_4 = new Employee("Idris",4,"Captain","Electrical");
        Employee emp_5 = new Employee("Zafer",5,"Captain","Electrical");
        Employee emp_6 = new Employee("Turgut",6,"Captain","Electrical");

        emp_3.printEmployeeInfo();
        System.out.println(Employee.countOfEmployees); // 6

    }
}
