package day_32_murat;

public class Encapsulation {
    /*
    OOP objeckt orieting programming
    4 tane main principles (4 ana prensip)
    -Encapsulation(sarma)
    -inharitance(kalitim)
    -abstraction(soyutlama)
    -Polymorphism(cok bicimcilik)
    ENCAPSULATION.
    -Veri saklama
    -Private field
    private,default,protected,public
    --Private=ev
    --default=ankara
    --- protected=Ankaralilar ve sehir disindaki Ankaralilar
public: Elemanımızı public olarak tanımlarsak, elemanımıza herkes ulaşabilir.
protected: Aynı pakette bulunan sınıflar tarafından erişilebilir ve cocuklari baska sehirde olsada ulasir
private: Sadece bulunduğu sınıftan erişilebilen elemanlardır.
default: Paket içerisinden erişilebilen elemanlardır.
-Private acces modifier ina sahip field method sadece ama sedece o class icerisinden erisilebilir
Getters ve Setters metodlariyla ulasabiliriz

--getter=
obj_1.message xxxx ulasilamaz
obj_1.getMessage(); // message degerini getirir
private String message;
public getMessage(){
return this.message;
}

Person{
private int getTcKinlikNo;

person ( int getTcKinlikNo){
this.tcKimlikNo=tcKimlikNo

public int getTcKinlikNo;
return this.tcKimlikNo;
}

Disardan nufus mud.biri
public class NufusMudurlugu{ //class

public static void main (String[] args){

person said=new person(12345678912)// bir kisi olusturduk

arada epey zaman geciyor ve baska memur gelip tc no yu 5 yapiyor

sadi.tcKimlikNo=5;// xxx ulasilmaz hatasi cunku private yaptik

said.getTcKimlikNo();// 12345678912 // bu sekilde tc kimlik numarayi get ile cagiracak tekrar

Getters vs Setters
     *  - getter : parametre yok, setter : yeni deger parametre olarak gonderilir
     *  - getter : return private field, setter : no return

Bu verileri okuyabilmek için getter, içerisindeki verileri değiştirmek için setter metotlarını kullanırız.

Getter metodu okuma yaptığı için parametre almaz. Setter metotlar ise private elemanlara değer ataması gerçekleştirdiği için parametre alırlar.


     */
}
