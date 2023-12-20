package day_067_mrt;

public class C107 {

    public static void main(String[] args) {
       // boolean  a=new Boolean(Boolean.valueOf(args[0]));
      // boolean b=new Boolean(args[1]);
      //  System.out.println(a  + " " + b);+

        System.out.println(Boolean.valueOf("true"));// true  ----ignoreCase olarak degerlendiriyor arka planda
                                                        // ve boolean in  true degeri ile karsilasitriyor
        System.out.println(Boolean.valueOf("tRuE")); // true
        System.out.println(Boolean.valueOf("Lale")); // false
        System.out.println(Boolean.valueOf("TRUE")); // true


        System.out.println(Boolean.valueOf("1")); // false
        System.out.println(Boolean.valueOf(null)); // false// string gonderdi

        System.out.println(Boolean.valueOf(true)); // true// boolean deger gonderdi

        // Cevap=False -false

    }
    // javac Test.java
    // java Test 1 null
}
// ValueOf hem string hemde booleión kabul eder,Primitive data type yi alip wrapper class a  cevirir
// buyuk kucuk harfe bakmiyor



