package day_065_mrt;

public class C081 {
    /**
     * 81. Which two code fragments cause a compilation error? (Choose two.)
     * A. float flt = 100.00F; // float syntax f or F
     * B. float flt = (float) 1_11.00; // explicit casting var
     * C. Float flt = 100.00; // double to float ancak explicit casting(narrowing) ile mumkun--casting ve sonuna f
     * D. double y1 = 203.22;float flt = y1; / explicit casting gerekiyor.cunku double yi float a atamis
     * E. int y2 = 100;float flt = (float) y2 ; casting yapmasada olur
     */
    // C Ve D
    public static void main(String[] args) {
       // float flt=100.00f;// A
       // float flt=(float) 1_11.00;// B
       // Float flt=(float)100.00;// casting olmali // C
       // double y1=203.22;
        // float flt=y1;// casting olmadan double sonuc float a atanmaz// D
        //int y2=100;
        //float flt=(float) y2;// casting olsada olmasada olur // E

    }

}
