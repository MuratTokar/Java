package day_015_hakan;

public class TernaryOperator {

    public static void main(String[] args) {
        int a = 5;
        if(a==5){
            System.out.println("a esittir 5");
        } else {
            System.out.println("a, 5'e esit degildir");
        }

        if(a==5)
            System.out.println("a esittir 5");
        else
            System.out.println("a, 5'e esit degildir");

        // ternary operator
        // statement/condition (boolean) ? true ise buradaki degeri : false ise buradaki degeri ata;
        String str = a == 5 ? "a esittir 5" : "a, 5'e esit degildir";
        System.out.println("Str degeri : " + str);
    }
}
