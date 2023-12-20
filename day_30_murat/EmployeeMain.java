package day_30_murat;

public class EmployeeMain {
    public static void main(String[] args) {


        // Employee class in da consructor methotlarina  dokunulmadan  asagidaki gibi default/no-argument i kullanarak objeckt
        // olusturabiliyorum
             Employee emp_1 = new Employee("Hakki", 1, "Captain", "Electrical");
             Employee emp_2 = new Employee("Hakan", 2, "Captain", "Electrical");
             Employee emp_3 = new Employee("Said", 3, "Captain", "Electrical");
             Employee emp_4 = new Employee("Idris", 4, "Captain", "Electrical");
             Employee emp_5 = new Employee("Zafer", 5, "Captain", "Electrical");
             Employee emp_6 = new Employee("Turgut", 6, "Captain", "Electrical");

                            // burada bunlari isci icin olusturduk ama henuz isciye oturtmadik .Bunu da
                            // class ta this ile yapariz.normalde burda tek tek atardim her isci icn
                            // ama this ile yapinca hepsi icin
                            // örnk=emp_1.name="Hakki"
                            emp_3.printEmployeeInfo();// burdan cagiriyoruz
                            System.out.println(Employee.countOfEmployees);// 6


    }



                }