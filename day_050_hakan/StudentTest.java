package day_050_hakan;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Idris","101","A-101");
        Student s2 = new Student("Enes","101","A-102");
        Student s3 = new Student("Davut","103","A-103");
        Student s4 = new Student("Busra","104","A-104");
        Student s5 = new Student("Birsen","105","A-105");

        System.out.println(Student.studentList);
        System.out.println(Student.studentList.get("103"));

        // key ihtiyaci yok ise
        for(Student student : Student.studentList.values()){
            if(student.getName().equals("Davut")){
                System.out.println(student.getId());
                System.out.println(student);
            }
        }
        // key ihtiyaci var ise
        for(String key : Student.studentList.keySet()){
            if(Student.studentList.get(key).getName().equals("Davut")){
                System.out.println(key);
                System.out.println(Student.studentList.get(key));
                System.out.println(Student.studentList.get(key).getName());
            }
        }
    }
}
