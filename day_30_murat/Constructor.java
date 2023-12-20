package day_30_murat;

public class Constructor {

   /*
   yapici metot
   bir objeckt olustururken cagrilir
        new student
        cotsructor metotlari class ismi ile ayni isimde olur
        static keyword u almaz
        return yapmaz
        public static void ali(){} bu metot
        public Ali(){} bu contructor .Ama contructor ismi class ismi ile ayni olmali ve metotdan fakli isim buyuk yazilir
        Java, otomatik olarak, default(no argument) constructor i olusturur,
         fakat Parametreli constructor olusturdugumuzda, artik bunu otomatik yapmaz, bizim yapmamiz gerekir

   public static void main(String[] args) {
       Student stud_1=new Student();     // obje olusturduk.eger constructor olusturmasak otomatik default olani olusur
       stud_1.name="Ayse";     // böyle tek tek ekleyebilirim
      stud_1.studentNo=123;


       Student stud_2=new Student("Fatma",123);     // böyle eklemek istersem eger objelerin oldugu sayfada parametreli
       Student stud_3=new Student("Said");        // bir counstruck olusturmaliyiz
       Student stud_4=new Student(125);

       System.out.println("######## Stud_1##################");
       stud_1.printStudentInfo();
       System.out.println("######## Stud_2##################");
       stud_2.printStudentInfo();
       System.out.println("######## Stud_3##################");
       stud_3.printStudentInfo();
       System.out.println("######## Stud_4##################");
       stud_4.printStudentInfo();

       Student stud_5=new Student("Ali",123);
       stud_5.name="Ali";
       stud_5.studentNo=123;
*/
   public static void main(String[] args) {
Student st_1=new Student("Ayse",1254);

Student st_2=new Student("Ali",45478);

Student st_3=new Student("Ahmet");

Student st_4=new Student(35418);

// böylede uzun yollla olur
Student st_5=new Student();
st_5.name="Veli";
st_5.studentNo=25486;


st_1.printStudentInfo();
st_2.printStudentInfo();
st_3.printStudentInfo();
st_4.printStudentInfo();
st_5.printStudentInfo();
   }
    }

