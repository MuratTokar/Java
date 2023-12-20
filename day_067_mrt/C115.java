package day_067_mrt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class C115 {
   public static void main(String[] args) {
        LocalDate date1= LocalDate.now();
        LocalDate date2=LocalDate.of(6,20,2014);// tarih siralamasindan dolayi An exception is thrown at runtime
        LocalDate date3=LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);

        // Cevap=D (An exception is thrown at runtime)


    }
}
