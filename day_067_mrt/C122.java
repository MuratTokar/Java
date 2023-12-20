package day_067_mrt;

public class C122 {
    public static void main(String[] args) {
        Short s1=200;
        Integer s2=400;
      // String s3=(String) ( s1 + s2 ); // line n1    // Wrapper class lar arsinda casting yapilamaz .
                                                     // Intger de zaten yapilamaz.Eger yana "" konulsaydi cevirirdi
        Long s4= (long)s1+s2; // line n2  // burda l kucuk oldugu iicn casting yapilabilir
        System.out.println("Sum is  " + s4 );
    }
    // Cevap =B (Compilation fails at line n1)
}
