package day_011_hakan;

public class Task_33 {
    public static void main(String[] args) {

        /**
         * Write a Java Program for the following logic:
         *  If marks < 60, then print “Fail”
         *  If marks >= 60, but less than 90, then print “Pass”
         *  If marks >= 90, then print “Passed with Distinction”
         */


        int marks = 60;
        if(marks < 60){
            System.out.println("FAIL");
        } else if(60 <= marks && marks < 90) {
            System.out.println("PASS");
        } else {
            System.out.println("PASSED with distinction");
        }

    }
}
