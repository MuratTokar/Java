package day_033_Encapsulation.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println(Employee.companyName);

        Employee amele1=new Employee("Adem Baba", 5000, "135798201", "adem61@gmail.pom");
        System.out.println(amele1.toString());
        System.out.println("Baslangic Salary; "+ amele1.getSalary());

        amele1.increaseSalary(599);
        System.out.println("Zamli Salary; "+ amele1.getSalary());
        System.out.println(amele1.toString());

        amele1.decreaseSalary(299);
        System.out.println("Kesintili Salary; "+amele1.getSalary());
        System.out.println(amele1.toString());



    }
}
