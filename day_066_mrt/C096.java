package day_066_mrt;

public class C096 {
}
 class Shop10 {
    public static void main(String[] args) {
        int price=1000;
        int qty=2;
        String grade="2";
        double discount=0.0;
        switch (grade){
            case "1":
                discount=price*0.1;
                break;
            case "2":
                discount=price*0.5;
              //  continue; continue buraya yazilamaz
            default:
                System.out.println("Thank you");
        }
        System.out.println(discount);

        // Hangisini commentling yaparasa thank you 500.0 basar
    }

}
