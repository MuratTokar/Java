


public class Employee {

       /* Asagida UML Diagram i verilen class lari olusturunut. Methodlari uygun parameter ve
        kod icerigiyle doldurunuz. Test icin ayri classlar olusturup methodlari, instance
        variablesi, class variablesi test ediniz…
        - Gerekli gördügünüz instance variablelara getter & setter yazini
         */
     private String name;
     private double salary;
     private String phoneNumber;
     private String emailAddress;

    public final static String companyName="Guider Soft";
    public Employee(){

    }

    public Employee(String name, double salary, String phoneNumber, String emailAddress) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public  void increaseSalary(int zam){
        salary+=zam;

    }
    public  void decreSalary(int kesinti){
        salary-=kesinti;
    }
    public void sendMail(){
        System.out.println(" mailiniz gönderildi");

    }
    public void call(){
        System.out.println("Yeni bir cagri aldiniz");

    }

    public double getSalary() {
        return salary;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

