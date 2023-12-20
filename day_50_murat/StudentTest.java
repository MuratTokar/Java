package day_50_murat;

public class StudentTest {
    public static void main(String[] args) {
Student s1=new Student("Idris","101","A-10");
Student s2=new Student("Enes","101","A-102");
Student s3=new Student("Davut","103","A-103");
Student s4=new Student("Busra","104","A-104");
Student s5=new Student("Sevil","105","A-105");

        System.out.println(Student.studentlist);
        System.out.println(Student.studentlist.get("103"));
// key ihiyaci varsa
        for (Student student:Student.studentlist.values()) {
            if (student.getName().equals("Davut")){
                System.out.println(student.getId());
                System.out.println(student);
            }

        }
        // key ihtiyaci varsa
        for (String  key:Student.studentlist.keySet()){
            if (Student.studentlist.get(key).getName().equals("Davut")){
                System.out.println(key);
                System.out.println(Student.studentlist.get(key));
                System.out.println(Student.studentlist.get(key).getName());
            }

        }
    }
}
