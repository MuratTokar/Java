package day_038_hakan;

public class ReviewAbstractionInterface {
    /**
     * Abstraction(Soyutlama)
     * - public abstract class className
     * - class X extends className
     * - Normal classlarda abstract method olamaz iken,
     *          abstract classlarda abstract ve normal method bulunabilir
     * - abstract olan methodlar, ilk gercek subclass a kadar implementation
     *          yapilmadiysa, concrete class ta implementation yapilmak zorunda
     * - abstract variable olusturulamaz (Abstract class, abstract method)
     *          Abstract class : object initilazed olamaz
     *              - fakat, constructor methodlar olusturulabilir
     *          Abstract method : No Implementation (code block yok)
     * - abstract methodlar final ya da private olamazlar,
     *      cünkü override edilemezler, edilemedikleri icin implementation gerceklesemez...
     * - Abstraction, kodu organize edip, daha duzenli sekilde kullanmak icin uygulanir
     * - override method kurallari abstract methodlar icin de gecerli
     *          return type, access modifier
     *          daha genis veya ayni, ayni parametreler, ayni isimde olmali
     *
     * INTERFACE
     * - default ve static method haricinde tüm methodlari abstracttir.
     * - variables, final ve static keywordlerini otomatik alir
     * - default ve static methodlar haric, tüm methodlar abstract keywordunu otomatik alir
     * - multiple inheritance yapilabiliyor
     * - class A implements InterfaceB, InterfaceC
     * - constructor method olusturulamaz
     * - Interface interfaci implement edemez...
     *
     */


}
