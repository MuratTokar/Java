package day_037_hakan;

public class ReviewFinalDataHiding {
    /**
     * FINAL KEYWORD
     * - Variables
     *      - variable isimleri büyük harfle yazilmasi tercih edilir
     *      - Atanan deger, degistirilemez (constant value)
     *      - local variables, declare ve assign farkli siralarda gerceklesebilir
     *              final String name;
     *              name = "value";
     *      - instance veya class variables ise,
     *          init blocklarda veya constructorlarda,
     *          veya kendi satirinda tanimlamam gerekiyor
     *
     *          class A {
     *              final String name;
     *
     *              {
     *                  name = "value";
     *              }
     *
     *              public A() {
     *                  this.name = "value";
     *              }
     *          }
     *
     * - Methods
     *      - Override edilmesi istenmeyen methodlarda kullanilir
     *      - Geri kalan tüm özellikleri normal method gibidir
     *
     * - Classes
     *      - final keywordune sahip class, super class olamaz
     *          (bu class tan subclass olusturulamaz)
     *          (bu class extend edilemez)
     *          (bu class inherit edilemez)
     *
     * ACCESS MODIFIERS
     * - private
     *      - sadece class icerisinde kullanilmasi istenilen members icin kullanilir
     *      - private access modifierina sahip bir variable'a ya da bir method 'a o class disindan erisilemez
     *
     * - public
     *      - Projectin her yerinden, yani tüm packagelarindan erisim izni verir
     *
     * - default
     *      - sadece kendi packege icerisinden erisim izni verir
     *
     * - protected
     *      - default gibi kendi package'i ve subclasslari erisebilir
     *
     *      private < default < protected < public
     *
     *
     * DATA HIDING
     * - static keyword e sahip super class icerisindeki bir variable i,
     *      ayni isimde subclass larda olusturdugumuzda,
     *      bu variable a subclasslar erisemezdi
     *
     *      public class SuperClass {
     *          static public int age = 20;
     *      }
     *
     *      class SubClass extends SuperClass {
     *          static int age = 5;
     *      }
     *
     *      class TestClass {
     *          public static void main(String[] args){
     *              SubClass.age; // 5
     *              SuperClass.age; // 20
     *          }
     *      }
     *
     */
}
