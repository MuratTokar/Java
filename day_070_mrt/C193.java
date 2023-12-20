package day_070_mrt;

public class C193 {
    public static void main(String[] args) {
        int sum = 0;

        for (int xVal = 1; xVal <= 5; xVal++) {  // foor icinde tanimlanmis ama diasri cikarilamaz

            sum = sum + xVal;
        }


     //System.out.println("The sum of " + xVal + " numbers is : " + sum);

    }
} // cevap=B (compille time error occurs)