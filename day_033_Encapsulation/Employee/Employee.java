package day_033_Encapsulation.Employee;

public class Employee {
    private String name;
    private double salary;
    private String phoneNumber;
    private String emailAddress;

    public final static String companyName="Guider Soft";

    public Employee() {
    }

    public Employee(String name, double salary, String phoneNumber, String emailAddress) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void increaseSalary(int zam){
        salary+=zam;
    }

    public void decreaseSalary(int kesinti){
        salary-=kesinti;
    }

    public void sendMail(){
        System.out.println("Mailiniz gönderildi");
    }

    public void call(){
        System.out.println("Yeni bir cagri aldiniz");

    }

    public double getSalary() {
        return salary;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
