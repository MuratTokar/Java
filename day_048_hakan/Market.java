package day_048_hakan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Market {
    private int branchId;
    private String name;
    private String city;
    private Employee director;
    private Set<Product> listOfProduct;
    private Set<Employee> employeeList;

    private static int branchCounter = 0;

    Market( String name, String city, Employee director){
        this.name = name;
        this.city = city;
        this.director = director;
        listOfProduct = new HashSet<>();
        employeeList = new HashSet<>();
        addEmployee(director);
        this.branchId = ++branchCounter;

    }


    public int getBranchId() {
        return branchId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getDirector() {
        return director.toString();
    }

    public String getListOfProduct() {
        String listOfProduct="";
        for (Product product : this.listOfProduct){
            listOfProduct += product.toString() +"\n";
        }
        return listOfProduct;
    }

   /* public Set<Employee> getEmployeeList() {
        Set<Employee> employeeListForOuter = new HashSet<>();
        employeeListForOuter.addAll(employeeList);
        return employeeListForOuter;
    }*/

    public String getEmployeeList() {
        String listOfEmployee="";
        for (Employee employee : employeeList){
            listOfEmployee += employee.toString() + "\n";
        }
        return listOfEmployee;
    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void addEmployeeList(List<Employee> employees){
        employeeList.addAll(employees);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    public void addProduct(Product product){
        listOfProduct.add(product);
    }

    public void addProductList(List<Product> products){
        listOfProduct.addAll(products);
    }

    public void removeProduct(Product product){
        listOfProduct.remove(product);
    }


}
