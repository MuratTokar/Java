package day_070_hakan;

public class Q_202 {
    public static void main(String[] args) {
        Employee11 e = new Director11();
        Manager11 m = new Director11();
        Director11 d = new Director11();
        // d nin ulasabilecegi
        // budget. salary, stockOptions

        // m nin ulasabilecekleri
        // budget ve salary

        // e nin ulasabilecegi
        // sadece salary


        Employee11 employee = new Employee11();
        Employee11 manager = new Manager11();
        Employee11 director = new Director11();
        //  employee.salary=50_000;
        //  director.salary=80_000;
        employee.doTest();
        manager.doTest();
        director.doTest();

        employee.employeeTest();

    }
}

class Employee11 {
    public int salary;

    public void doTest(){
        System.out.println("Employee");
    }

    public void employeeTest(){
        System.out.println("employee test method");
    }
}

class Manager11 extends Employee11 {
    public int budget;
    public void doTest(){
        System.out.println("Manager");
    }

    public void managerTest(){
        System.out.println("manager test method");
    }
}

class Director11 extends Manager11 {
    public int stockOptions;
    public void doTest(){
        System.out.println("Director");
    }

    public void directorTest(){
        System.out.println("Director test method");
    }
}