package day_31_murat;

public class ReviewConstructors {
    public static void main(String[] args) {

        /**
         * Constructor : Yapici method
         * - Class ismini almali
         * - static keyword u almaz
         * - return type i yoktur (void dahi kullanilmaz)
         * - Diger methodlar, aksiyon icin olusturulurken;
         *      constructor ise yapici, object creation, olusturma icin kullanilir (new keyword ile cagrilir)
         * - Diger methodlar, ismi ile veya object.methodName veya className.methodName seklinde cagrilirken
         *      Constructor new keyword u ile, object olustururken cagrilir.
         * - Diger methodlar return type secenegine sahipken, constructor return yapamaz
         * -
         *
         *
         *
         * ClassName className = new ClassName();
         *
         * - Default/No-argument constructor java tarafindan otomatik tanimlanir,
         *          ta ki constructor methodlari manuel olarak olusturulana kadar
         *          (Eger developer, kendi constructor methodunu,
         *          parametreli sekilde olustursa bile,
         *          java artik default constructor i olusturmaz,
         *          developer in kendisi olusturmak zorunda kalir.)
         *
         *  - Parameterized constructor (Parametreli Constructor)
         *      olusacak object in, field larindan hangilerinin,
         *      object olusurken sart olarak doldurulmasi isteniyorsa,
         *      onlar parametre olarak eklenir
         *
         *      // Parametreli Constructor ornegi
         * ClassName obj = new ClassName(nameByUser);
         *
         *  public class ClassName{
         *
         *  String name;
         *
         *      public ClassName(String nameByUser){
         *          this.name = nameByUser;
         *      }
         *  }
         *
         *   // No-argument/default Constructor ornegi
         *
         *  ClassName obj = new ClassName();
         *  obj.name = "nameByUser";
         *
         *  public class ClassName{
         *
         *      String name;
         *
         *          public ClassName(){
         *
         *          }
         *    }
         *
         *
         *    // Birden fazla Parametreli Constructor(lar) ornegi
         *
         *      ClassName obj_1 = new ClassName(nameByUser);
         *      ClassName obj_2 = new ClassName(nameByUser, age);
         *
         *      public class ClassName{
         *
         *      String name;
         *      int age;
         *
         *          public ClassName(String nameByUser){
         *              this.name = nameByUser;
         *          }
         *
         *          public ClassName(String nameByUser, int userAge){
         *               this.name = nameByUser;
         *               this.age = userAge;
         *           }
         *      }
         *
         *      // Birden fazla Parametreli Constructor(lar) ornegi - THIS()
         *
         *            ClassName obj_1 = new ClassName(nameByUser);
         *            ClassName obj_2 = new ClassName(nameByUser, age);
         *
         *           public class ClassName{
         *
         *            String name;
         *            int age;
         *
         *                public ClassName(String nameByUser){
         *                    this.name = nameByUser;
         *                }
         *
         *                public ClassName(int userAge){
         *                         this.age = userAge;
         *               }
         *
         *                public ClassName(String nameByUser, int userAge){
         *                    this(nameByUser);
         *                    this(userAge);
         *                    // this.age = userAge;
         *                 }
         *          }
         */


    }
}
