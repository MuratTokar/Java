package day_036_hakan;

class Employee extends Person{
    //static String className = "Employee";

    // No-argument/default constructor
    // Java otamatik olusturuyordu
    // Eger biz, constructor methodu olusturmazsak
    int age = 5;
    public Employee(){
        // ilk islem olarak
        // super(); super class in default constructori cagriliyor
        super("Ahmet");
    }

    public Employee(String name, int age){
        // ilk islem olarak
        // super(); super class in default constructori cagriliyor

    }

    static public void printName(){
        System.out.println("\tEmployee");
        System.out.println(className);
    }

    public String overrideMethod(){
        System.out.println("Person override method");
        return "java";
    }

    //  public void overrideMethod() methodunun overloading versiyonu
    private void overrideMethod(String name){
        System.out.println("Person override method");
    }

    // super class ta final keyword kullanildigi icin, override edilemez
   /* void sleep(){
        System.out.println("22:00 da uyu");
    }*/



    void wakeUp(){
        System.out.println("Saat 06.00 da uyan");
    }

}
// METHOD OVERRIDING
// - static methodlar override edilemez
// - subclass taki override edilen method ayni genislikte
//      veya daha genis bir access modifier a sahip olmali
// - return type ayni ( veya daha genis bir object tipine sahip olmali )
// - parametreler ayni olmali
// subclass - super class iliskisi olmali (is-A relationship)
// methodlar ayni isimde olmali

// METHOD OVERLOADING
// ayni classta olmalilar
// static/instance method overloading yapilabilir
// Parametre farkli olmak zorunda
// return type farketmez (ayni veya farkli olmasi)
// methodlar ayni isimde olmali
// access modifier farketmez (ayni veya farkli olmasi)

/*
findClient(1234567);
findClient("Tas");
findClient("Tas", "Ahmet");
findClient("Tas", "Ahmet", "babaAdi");*/

//
/**
 * FINAL VARIABLE
 * - final local variable (method icerisinde kullanilan),
 *      declare edildikten sonra da degeri assign edilebilir
 * - final instance variable, constructor veya instance initializer da assign edilmesi gerekir
 * - Büyük harfle yazilmasi tercih edilir ve atanan deger degistirilemez
 *
 * FINAL METHOD
 * - Subclasslar tarafindan override edilmesi istenmeyen methodlarda kullanilir
 * - Method overloading icin engel teskil etmez
 *
 * FINAL CLASS
 * - Bir class tan subclass olusmasini istemedigimiz class yapilarinda kullanilir
 */

/**
 * METHOD HIDING
 * - static keyword ile kullanilan class
 *      methodlarinin overriding gibi yapilmasi durumuna Method Hiding denir
 */

