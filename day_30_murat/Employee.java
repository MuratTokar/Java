package day_30_murat;

public class Employee {
    // .static olanlar class a ait .En tepede butun objeler icin
    // genel gecer.
    // fields,instance variables
    String name;
    int salary;
    int employeeID;
    String titel;
    String department;

    //  static class variables
    static String CompanyName="Guider soft";
    static int countOfEmployees=0;
    //constructor lara static koymuyoruz cunkiu objecktler olusturacak
    // sadece objeler ulasacak disardan ulasilmayacak.static keyword u kullanmiyoruz
    // return yok.class ismini alir
    public Employee(String name,int employeeID,String titel,String department) {
        countOfEmployees++;
        this.name = name;
        this.employeeID = employeeID;// burdaki employee ustte class takidir
        this.titel = titel;
        this.department = department;
        this.salary = 10000;// isci maasini bilmediigm icin sadece default degre atadim
        // atamasamda default degeri 0 olur
        // System.out.println("objeckt create edildi");// burdan sout
        // yaptim ama main classede yazdi cunku new metodu main classe de call edildi
    }
   public Employee(String name, int employeeID, String titel, String department,int salary){// bu sekilde ekleyebilirz
            this(name, employeeID, titel, department);
            this.salary = salary;

    }
    public  void printEmployeeInfo(){// bu metot emlooye main de degerleri alip yazdirsin
        System.out.println("Name : " + name);
        System.out.println("Employee : " + employeeID);
        System.out.println("Titel : " + titel);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
        System.out.println("CompanyName: " + CompanyName);
        System.out.println("countOfEmployees : " + countOfEmployees);
    }


    }

