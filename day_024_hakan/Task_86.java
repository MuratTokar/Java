package day_024_hakan;

public class Task_86 {

    /**
     * 12 ay ismini icerisinde tutan array olusturunuz.
     *
     */

    public static void main(String[] args) {
        /*
        String[] months = {"Hakan"};
        System.out.println(months[0]);
        months[1] = "Java"; // Array index Out Of Bounds Exceptions
         */

        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        int numberOfMonth = 5;
        System.out.println("The month name is " + months[numberOfMonth-1]);

    }
}
