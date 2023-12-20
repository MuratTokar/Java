package day_070_mrt;

public class C202 {
    public static void main(String[] args) {
    Employee12 employee = new Employee12(); // hepsinin referansi Employee12 oldugu icin salary e ulasabilirler
    Employee12 manager = new Manager12();
    Employee12 director = new Director12();
    //employee.salary=50000;
   // employee.salary=80000;


        //  line n1
    }
}

class Employee12 {
    public int salary;
}

class Manager12 extends Employee12 {
        public int budget;
}

class Director12 extends Manager12 {
            public int stockOptions;

}

// variable lere uste dogru erisilir

// hepsinin referansi Employee12 oldugu icin salary e ulasabilirler
// cevap=B F