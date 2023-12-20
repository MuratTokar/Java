package day_068_mrt;

public class C140 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar = 100.100f;
        double dVar = 123;
        fVar = iVar;
        iVar = (int) fVar;
       // iVar = fVar;  // zoraki casting yapmaliyiz
        fVar = (float) dVar;
       // fVar = dVar; // zoraki casting yapmaliyiz
        dVar = fVar;
       // iVar = dVar; // zoraki casting yapmaliyiz
        iVar = (int) dVar;
        dVar = iVar;
    }
    // CEVAP=B C E
}
