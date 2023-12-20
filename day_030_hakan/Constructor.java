package day_030_hakan;

public class Constructor {
    // yapici method
    // bir object olustururken cagrilir
    // new Student()
    // Contsructor methodlari, class ismi ile ayni isimde olur
    // static keyword u almaz
    // return yapmaz
    // class ismi oldugu icin büyük harfle yazilir

    // public Student(){ bu sekilde constructor oluturulamaz, class ismi ile ayni olmak zorunda

    // Java, otomatik olarak, default(no argument) constructor i olusturur,
    // fakat Parametreli constructor olusturdugumuzda, artik bunu otomatik yapmaz, bizim yapmamiz gerekir

    public static void main(String[] args) {
        Student stud_1 = new Student();
        // stud_1.name = "Ayse";
        // stud_1.studentNo = 123;

        Student stud_2 = new Student("Fatma", 124);

        Student stud_3 = new Student("Said");

        Student stud_4 = new Student(125);

        System.out.println("************** stud_1 ***********");
        stud_1.printStudentInfo();
        System.out.println("************** stud_2 ***********");
        stud_2.printStudentInfo();
        System.out.println("************** stud_3 ***********");
        stud_3.printStudentInfo();
        System.out.println("************** stud_4 ***********");
        stud_4.printStudentInfo();



        Student stud_5 = new Student( 123,"Ayse");

    }
}
