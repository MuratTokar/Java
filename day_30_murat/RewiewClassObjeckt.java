package day_30_murat;

public class RewiewClassObjeckt {

        /**
         * Taslak, Blueprint, template
         * Memory de yer tutmaz
         * Object olusturmak icin kullanilir
         * Icerisinde static keyword lu variable lara class variables denir
         * Icerisinde static keyword lu olan methodlara da class methodu denir
         *
         */

        /**
         * !!! static keyword lu variablelara ve methodlara objectler ulasabilirken;
         *     class, objectlerin field(instance variable) lara ulasamaz !!!
         */

        // OBJECT
        /**
         * - Class lardan new keyword u ile olusturulan, icerigi dolu
         *    ve kendisine özgü degerleri olan, class tan üretilen gercek bir örnektir.
         *
         * - object variable lari field, instance variable olarak adlandirilir.
         * - Sadece objectler ve static keyword une sahip olmayan methodlar tarafindan kullanilabilir
         * - Fields, default degerlere sahiptir, such as int = 0, String = null, char /u0000
         */

        /**
         *
         *  public class Student{
         *
         *      String name;
         *      int studentNo;
         *      static int counter;
         *      static String welcomeMessage = "Welcome to School!";
         *      static String schoolName = "Cumhuriyet Ilkokulu";
         *
         *      public void printName(){
         *         System.out.println("Ogrenci ismi : " + name);
         *      }
         *
         *      public void printStudentNo(){
         *         System.out.println("Ogrenci No : " + StudentNo);
         *      }
         *
         *  }
         *
         *  // baska public class
         *
         *  public class General{
         *
         *      public static void main(String[] args){
         *          Student student_1 = new Student();
         *          System.out.println(student_1.name); // null
         *          System.out.println(student_1.studentNo); // 0
         *
         *          student_1.name = "Said";
         *          student_1.studentNo = 10;
         *
         *          Student student_2 = new Student();
         *          student_2.name = "Idris";
         *          student_2.studentNo = 100;
         *
         *          Student.name; // compile error, static keyword u yok
         *          Student.studentNo; // compile error
         *

         *      }
         *  }
         *
         */

        public static void main(String[] args) {
            String name = "Java";
            int counter = 0;
            for(int i = 0; i < name.length(); i++){

                if(name.charAt(i) == 'a'){
                    counter++;
                }
            }

            System.out.println(counter);
    }
}
