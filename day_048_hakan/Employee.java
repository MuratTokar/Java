package day_048_hakan;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private static List<Employee> employeeList = new ArrayList<>();
    private String name;
    private int employeeId;
    private double salary;
    private String title;
    private static int employeeCounter = 0;

    Employee(String name, double salary, String title){
        this.name = name;
        this. salary = salary;
        this.title = title;
        employeeId = ++employeeCounter;
        employeeList.add(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", title='" + title + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
