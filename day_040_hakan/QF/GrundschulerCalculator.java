package day_040_hakan.QF;

public class GrundschulerCalculator implements Calculator {


    private static GrundschulerCalculator grundschulerCalculator;
    private static int counter=0;
    private GrundschulerCalculator(){
        counter++;
        System.out.println("Beni cagirdilar! : " + counter);
    }

    public static GrundschulerCalculator getCalculator(){

        if(grundschulerCalculator != null){
            return grundschulerCalculator;
        } else {
            grundschulerCalculator = new GrundschulerCalculator();
            return grundschulerCalculator;
        }
    /*
        if(grundschulerCalculator == null){
            grundschulerCalculator = new GrundschulerCalculator();
            return grundschulerCalculator;
        } else {
            return grundschulerCalculator;
        }*/
    }


    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        if(b == 0){
            return 0;
        }
        return a/b;
    }
}


