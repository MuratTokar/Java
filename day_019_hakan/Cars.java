package day_019_hakan;

public class Cars {

    // instance(object) variables (fields)
    static String marka = "BMW";
    String model;

    // int default degeri 0
    int uretimYili = 2023; // default (varsayilan) deger olarak 2023 atandi
    // Yani, eger uretimYili degeri atanmazsa 2023 olarak al, yeni deger atanirsa yeni degeri kabul et
    String renk; // default degeri null
    String motorGucu; // default degeri null
    String yakitTuru; // default degeri null

    // instance method
    public void printMarka(){

        System.out.println("Bana class ulasamaz");
       // System.out.println(marka);
        // System.out.println(uretimYili);
    }

    // class(static) method
    public static void printHello(){

        System.out.println("Hello");
        // System.out.println(marka);
        // System.out.println(uretimYili);
    }

    // Access Modifier : public, default, private, protected
    // static, class keyword,


    public void printInfo(){
        System.out.println("Arabanin Modeli : " + model );
        System.out.println("Arabanin Uretim Yili : " + uretimYili );
        System.out.println("Arabanin Rengi : " + renk );
        System.out.println("Arabanin motor gücü : " + motorGucu );
        System.out.println("Arabanin yakit türü : " + yakitTuru );
    }

}
