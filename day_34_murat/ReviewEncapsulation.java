package day_34_murat;

public class ReviewEncapsulation {

    /**
     * OOP 4 main Principles
     * - Encapsulation - Sarma(Data gizleme)
     *      - private access modifier
     *          - sadece class members erisebilir, disaridan erisim yok
     *      - getter & setter methodlari kullanilir
     *      - getter() : Read data, returns data
     *      - setter(parameter) : datayi update eder, write data, parameter
     *
     *  STATIC KEYWORD
     *  - class variable
     *  - class methodlar
     *
     *  NON-STATIC
     *  - fields, instance variables
     *  - instance methods
     *
     *  INSIDE CLASS :
     *  - instance method : static & non-static variables, static & non-static methods
     *  - static method : static variables, static method
     *
     *  OUTER CLASS :
     *  - className : static methods, static variables
     *  - object : non-static(fields, instance) variables, static & non-static methods
     *         - static methoda, object erisebilse de, className ile erismek tercih edilmeli
     *          ClassName.methodName()
     *          objectName.methodName()
     *  static int a = 5;
     *  static (initializer) {
     *      sout(a);
     *      sout(b); // compile error
     *      // Class yüklenirken, ilk calismasini istedigimiz kod
     *      // static variables, static methods erisebilir
     *      // static keyword une sahip memberslarda yukaridan
     *              asagiya calisma prensibi vardir (static variables, static initializer)
     *  }
     *  static int b= 10;
     *
     *
     *
     *  Class obj = new Class();
     *  (instance initializer) {
     *      sout(1);
     *      // static & instance methods ve variables erisir
     *      // constructor dan önce calisir
     *      // Bir object olusmadan önce, object datasi ile ilgili sartlar varsa burada kullanilir
     *      // instance variables burada assign edilebilir
     *  }
     *
     *  Class(){
     *      sout(2);
     *  }
     *
     *
     * - Inheritance - Kalitim
     * - Abstraction - Soyutlama
     * - Polymorphism - Cok yapililik
     */
}
