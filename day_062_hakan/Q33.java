package day_062_hakan;

public class Q33 {
}

class Employee{
    String name;
    boolean contract;
    double salary;

    Employee() {
        // line n1
        /*
        // C true
        this.name = new String("Joe");
        this.contract = new Boolean(true); // unboxing
        this.salary = new Double(100);
        */
        /*
        // D false
        name = "Joe";
        contract = TRUE; // boolean kucuk harflerle yazilir true veya false
        salary = 100.0f;
         */
        /*
        // E false
        this("Joe", true, 100); // 3 parametreli constructror olmadigi icin
         */

    }

    public String toString(){
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // line n2

        /*
        // A true
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        */

         /*
        // B false
        this.name = "Joe"; // complilation fails, cunku static method icerisinde this veya instance variable, field cagirilamaz
        this.contract = true;
        this.salary = 100;
        */

        System.out.println(e);
        // name + ":" + contract + ":" + salary
        // Joe:true: 100.0
    }
}


/**
 *  int[] nums = {1,2,3};
 *  sout(nums); // day_062_hakan.Q33@4324jjh435435
 *  Arrays.toString(nums); // [1,2,3]
 *
 *  ArrayList<Integer> list = new ArrayList<>();
 *  list.add(1);
 *  list.add(2);
 *  list.add(3);
 *
 *  sout(list); // [1,2,3]
 */