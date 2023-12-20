package day_061_hakan;

public class Q19 {

    String Q19;
    String name;

    /**
     * Select 3 true statements
     * A. A class cannot have the same name as its field. /F
     * // Bir class kendi isminde bir degiskene sahip olamaz /F
     * B. A public class must have a main method.
     * // public bir class, main methoda sahip olmali /F
     * C. A class can have final static methods. /T
     * // Bir class final static keywordlerine sahip methodlara sahip olabilir /T
     * D. A class can have overloaded private constructors. /T
     * // private constructors overloaded olabilir
     * E. Fields need to be initialized before use./F
     * // instance variables kullanilmadan once deger atanmali /F
     * F. Methods and fields are optional components of a class. /T
     * // Methodlar ve fields, class icerisinde ola da bilir, olmaya da bilir./T
     *
     */

    private Q19(){
        System.out.println("Merhaba Object, Hosgeldin!");
    }

    Q19(String name){
        this();
        this.name = name;
    }
}
