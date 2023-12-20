package day_35_murat;

public class Inheritance {
    public static void main(String[] args) {
        /**
         * Inheritance, OOP 4 main principles, 4 ana prensipten biri
         * OOP (Object Orienting Programing)
         * Kalitim, miras...
         * Parent -> child
         * Super Class -> Sub class
         * Base Class -> Derived Class
         *
         * Parent Class : fields (instance variable), instance methods, class variables, class methods
         * Child :  kendine özel fields (instance variable), instance methods, class variables, class methods
         *          - ekstra olarak parent in paylastigi object members, class memberlara erisebilir
         *
         *
         * 4 type of Inheritance :
         * 1. single : 1 Parent - 1 sub class
         * 2. multi level : 1 Parent - childs (super class) - sub classes
         * 3. Hyerarchical : 1 parent - 1 den fazla child class oldugunda
         * 4. multiple : Multi parent , normal classlarda desteklenmiyor
         *
         * Class : object olustururken, constructor icerisinde "this" keyword u ile, o object e ait variable, method lari cagirabiliyorduk.
         *      String name;
         *      public Student(String name){
         *          this.name = name1;
         *          this(); // default constructor calling
         *          this(parameter); // parameterized constructor i call ediyor
         *      }
         *
         *      public Student(DT param1, DT param2, DT param3){
         *          this(param1, param2);
         *          this.param3 = param3;
         *      }
         *
         *      public Student(DT param1, DT param2){
         *                 this.param1 = param1;
         *                 this.param2 = param2;
         *                 this.instanceMethod();
         *      }
         *
         *      Student stu = new Student(name:)
         *
         *      !!! this keywordu ile
         *      - method icerisinde ayni isimde verilen
         *          parametre ve instance variables var ise,
         *          instance variables i cagirmak icin
         *      - this(), this(parameters) ile kodu tekrar yazmak yerine,
         *          var olan class icerisindeki constructor methodlari cagirip, kullanabilirim
         *
         *    super Keyword : Sadece inheritance yapisinda,
         *          parent class icerisindeki bilesenleri(members) cagirmak icin kullanilir
         *      - super keyword sadece ama sadece sub class(child) tan,
         *          parent classtaki(super class) izin verilen bilesenlere(members)
         *          erismek icin kullanilir
         *          - super.parentVariableName
         *          - super.parentMethod()
         *          - super(); // default constructor i cagirir
         *          - super(parameters); // super class in parameterized constructor ini cagirir
         *
         *          !!! super() super class default constrcutor i call eder
         *              - otomatik olarak, subclass taki tüm constructorlarda ilk super() kodu calisir
         *              - Gizli olarak, java tarafindan otomatik olusturulur
         *              - super() default constructor cagrisini, parametreler ile configure edebiliriz
         *                  - O zaman, java otamatik default constructor i cagirmak yerine,
         *                      bizim yazdigimiz parametreli constructor i cagiracak
         *                      - Yazdigimiz super(parameters) kodu, subclasstaki constructorlarda,
         *                          ilk satirda olmasi gerekir, yoksa compile error verir
         *
         *
         */
    }
}
