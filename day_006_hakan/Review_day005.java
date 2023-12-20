package day_006_hakan;

// bir java class file(dokuman) icerisinde "bir" tane public class olabilir

public class Review_day005 {

    // ayni class icerisindeki method isimleri farkli olmak zorunda (Parametreler ayni ise)
    public static void main(String[] args) {

        //System.out.println("kan\rHa");
        System.out.println("4, 2 ve 5 in toplami : " + (sumTwoNumbers(2, 5) + 4));
        int sumOfTwoNumbers = sumTwoNumbers(2,5);
        int total = sumTwoNumbers(4, sumOfTwoNumbers);

    }

    /*
    Asagida documentation comment ornegi verilecek
     */

    /**
     * Asagidaki method ile 2 sayinin toplaminin
     * sonucunu almak amaclanmaktadir.
     *
     * @param sayi1
     * @param sayi2
     * @return total, sum of 2 numbers
     */
    public static int sumTwoNumbers(int sayi1, int sayi2) {
        int total = sayi1 + sayi2;
        return total;
    }

    public static int sumThreeNumbers(int sayi1, int sayi2, int sayi3){

        return 4;
    }
}
