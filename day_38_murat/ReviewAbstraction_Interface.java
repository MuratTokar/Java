package day_38_murat;

public class ReviewAbstraction_Interface {
    /*
    ABSTRACTION:
    *-normal classlarda abstract method olamaz iken ,abstract classlarda hem normal hem de abstract metolar olusturulabilir
    *-Abstract classlarda metotlar ilk gercek subclassa kadar implementation (gercege donusme) yapilmadiysa
    concrete(gercege donustugu an) calss ta implementation yapilmak zorunda
    *-Abstract classlarda variable olusturulamaz,ve object initilazed (olusturulamaz) olamaz,fakat constructor olusturulabilir
    *-Abstract metotolarda implementation (yani kod blogu) yok .metot sonunda sadece parantez () olur
    *-Abstract metotlar final yada private olamaz cunku override edilemedikleri icin ipmlemetation gerceklesmez
    *-Abstract metotlar kodu organize edip daha duzenli sekilde kullanmk icin uygulanir
    *-Override metoto kurallari abstract metotlar icinde gecerlidir.
    return type,acces modifier daha genis yada ayni olamli

    INTERFACE:
    *-default ve static metot haricinde tum metotlari abstractir.yani nasilki static classa ait ise default ta interfaceye aittir.
    *-variables fianl ve static key wordunu otomatik alirlar.
    *-Multiple inheritance yapilabilir
    *- class A implements interface ,interface B
    *-constructor olusturulamaz
    *-interface interfaceyi implement edemez yani alt class olamz onun icin Abstract ile baslar

    public interface person{
    }
    abstract class Student implemets Person{// bu sekilde olmali
    }


     */
}
