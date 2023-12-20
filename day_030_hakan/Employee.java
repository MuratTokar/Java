package day_030_hakan;

public class Employee {

    // fields, instance variables
    String name;
    int salary;
    int employeeID;
    String titel;
    String department;

    // static, yani class variables
    static String CompanyName = "Guider Soft";
    static int countOfEmployees = 0;

    // static keyword u kullanmiyoruz
    // return yapamaz
    // class ismini alir
    public Employee(String name, int employeeID, String titel, String department){
        countOfEmployees++;
        this.name = name;
        this.employeeID = employeeID;
        this.titel = titel;
        this.department = department;
        this.salary = 10000;
    }


    public Employee(String name, int employeeID, String titel, String department, int salary){
        this(name, employeeID, titel, department);
        this.salary = salary;
    }

    public void printEmployeeInfo(){
        System.out.println("Name : " + name);
        System.out.println("employeeID : " + employeeID);
        System.out.println("titel : " + titel);
        System.out.println("department : " + department);
        System.out.println("salary : " + salary);
        System.out.println("CompanyName : " + CompanyName);
        System.out.println("countOfEmployees : " + countOfEmployees);
    }






















}
