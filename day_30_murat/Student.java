package day_30_murat;
public class Student {
    String favoriteColor;
    String name;
    int studentNo;
    static String schoolName="Europa Grundschule";
    static int counter=0;
     public Student(){
         counter++;
     }


    public Student(String name,int studentNo){
         counter++;
        this.name=name;
        this.studentNo=studentNo;

    }
    public Student(int ogrenciNo, String isim){
        counter++;
        this.name = isim;
        this.studentNo = ogrenciNo;
    }

    public Student(String name){
        counter++;
        this.name = name;
    }

    public Student( int studentNo){
        counter++;
        this.studentNo = studentNo;
    }

    public void printStudentInfo(){
        System.out.println("Name : " + name);
        System.out.println("Student No : " + studentNo);
        System.out.println("School Name : " + schoolName);

    }
    public  int getCountOfStudents() {
        return counter;

    }

    }






