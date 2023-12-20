package day_068_hakan;
public class Q140 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar = 100.100f;
        double dVar = 123;
        fVar = iVar;
        iVar = (int) fVar;
        // iVar = fVar;
        fVar = (float) dVar;
      //  fVar = dVar;
        dVar = fVar;
        //iVar = dVar;
        iVar = (int) dVar;
        dVar = iVar;
    }
}
