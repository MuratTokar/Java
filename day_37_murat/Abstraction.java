package day_37_murat;

public class Abstraction {
    public static void main(String[] args) {
        /**
         * ABSTRACTION (Soyutlama)
         *
         * Alive -> Person -> Student -> Grundschüler
         *
         * Yapiyi organize etmek, kodun tekrarindan kacinmak,
         * yapiyi daha duzenli hale getirmek icin bir yaklasimdir.
         *
         * Normal method
         * public void methodName(parameters){
         *     // code block
         * }
         *
         * abstract method
         * public abstract void methodName(parameters);
         *
         *  REVIEW...
         *  Abstraction (soyutlama)
         *  soyut class, soyut method
         *  !!! soyut(abstract) variable olusturamiyoruz
         *
         *  public abstract class className{
         *      // Object olusturulamaz
         *      // abstract methodlar, sadece ama sadece
         *          abstract classlarin icerisinde tanimlanabilir
         *      // constructor olusturulabilir, ama subclasslarin
         *          kullanmasi icin (super() keyword u ile)
         *      // abstract class, baska abstract classlari inherit edebilir
         *      // abstract class, baska abstract classlar tarafindan inherit edilebilir
         *      // gercek bir class tarafindan da inherit edilebilir
         *        Substraction:cikarma
         *        Addition:toplama
         *        Multiplication:carpma
         *
         *
         *      public abstract void methodName();
         *      // abstract methodlarda *implementation* yapilmaz
         *      // bu methodlar, alt classlar tarafindan
         *              gercek methoda dönüstürülebilir (implementation yapilabilir)
         *              - Eger alt subclasslari abstract ise onlarin icerisinde de implement edilebilir
         *              - Altindaki subclasslardan gercek class a ulasana kadar implement edilmezse
         *                  ilk gercek subclass i icerisinde implementation gerceklesmek zorunda
         *                      - Bu karsilasilan gercek subclass a CONCRETE class denir
         *      // Bu method implementation süreci, override method süreci ile aynidir
         *          - access modifier ayni, yada daha genis olmali
         *          - return type i ayni olmali
         *          - parametre ayni olmali
         *
         *      // abstract methodlar, private veya final olamaz
         *          cünkü implementation gerceklesemez
         *
         *      // Abstract class, icerisinde abstract method veya non-abstract(gercek) method olabilir
         *          - abstract class icerisinde, abstract method olmak zorunda DEGIL
*/
         }
}