package day_36_murat;

public class Emplooye extends Person {
    // no argument constructor
    // java otomatik olusturyordu
    // eger biz constructor methodu olusturmazsak
    // ilk islem olarak super(); super classin default constructoru cagriliyor
    // eger parametreli constructor olusturp cagirirsak o zaman private olur
    // cunku default constructordan kurtulmus oluruz
    public Emplooye(){// parametresiz consructor
        super("Ahmet");

    }
    public Emplooye(String name){

    }
    static String className = "Emplooye";

    static public void printName() {
        System.out.println(className);

        // METHOD OVERRIDING
        //static metotlar override edilemez
        // ama override gibi kullaniriz ama override tanimina girmez
        // subclass taki override edilen metot ayni genislikte veya daha
        // genis bir acces modifiera sahip olmalidir
        // return type ayni veya daha genis bir object tipine sahip olamli
        // parametreler ayni olamli
        // sub class ile super class iliskisi olmali
    }

    public void overrideMethod() {
        System.out.println("Person override method");

    }
    public void overrideMethod(String name) {
        System.out.println("Person override method");

        // METHOD OVERLOADING
        // bu metot usttekinin overloading versiyonudur.
        // ayni classsta olmali
        // static /instance method overloading yapilabilir
        // parametre farkli olmak zorunda ve retun type farketmez
        // acces modifier fark etmez

        // Final variable:

        // final local variable (method icerisinde kullanillan )
        // declare edildikten sonra degeri assign edilebilir
        // final instance variable ,constructor veya instance
        // initializer da assign edilmesi gerekir
        // Buyuk harfle yazilmasi tercih edilir ve atanan deger degistirilemez
        // immutable(degistirilemez)


        // Final Method:
        // subclasslar tarafindan override edilmesi istenmeyen methot
        // larda kullanilir.Methot overloading icin engel teskil etmez

        // Final Class

        // bir class tan subcalss olusmasini istemedigimiz
        // class yapilarinda kullanilir

        // METHOD HIDING:
        //* static keyword ile kullanilan class methodlarinin overriding
        // gibi yapilmasi durumuna method hiding denir


    }
}