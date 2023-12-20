package day_070_mrt;


import java.time.LocalDate;

public class C205 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10);
        System.out.println(date);
    }
} // cevap=B(2012-01-30)
