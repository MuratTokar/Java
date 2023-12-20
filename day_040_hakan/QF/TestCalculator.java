package day_040_hakan.QF;

public class TestCalculator {

    public static void main(String[] args) {
        System.out.println(GrundschulerCalculator.getCalculator().sum(2, 4));
        System.out.println(GrundschulerCalculator.getCalculator().multiply(2, 4));
        System.out.println(GrundschulerCalculator.getCalculator().subtract(12, 4));
        System.out.println(GrundschulerCalculator.getCalculator().divide(4, 2));
        System.out.println(GrundschulerCalculator.getCalculator().divide(2, 0));
    }
}
