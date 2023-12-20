package day_044_hakan;

public class throwClass {

    public static void main(String[] args) {
        int age=15;
        try {
            if (age < 18) {
                throw new ArithmeticException("Age is invalid to vote");
            } else {
                System.out.println("Please vote your choice");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Kod bitti");
    }
}
