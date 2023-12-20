package day_008_murat;

public class Task16 {
    public static void main(String[] args) {
        double radius = 5.5;
        final double PI = 22/7.0;
        double perimeter = 2 * radius * PI;
        double area = PI * radius * radius;

        System.out.println("Cevre : " + perimeter);
        System.out.println("Alan : " + area);
        System.out.println("PI value : " + PI);
    }
}
