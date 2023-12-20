package day_070_hakan;



public class Q_201 {
    public static void main(String[] args) {
       Student [] students = new Student[3];
       students[1] = new Student("Richard");
       students[2] = new Student("Donald");
       for (Student s : students){
           // [null, new Student(), new Student()]
           System.out.println(s);
           if(s != null){
               System.out.println(""+s.name); // null.name
           }

       }
    }
}

class Student {
    String name;
    public Student(String name) {
        this.name=name;
    }
}
