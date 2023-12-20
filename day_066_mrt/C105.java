package day_066_mrt;

import java.time.LocalDate;

public class C105 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,01,32);// 32 den dolayi hata verir
        date.plusDays(10);
        System.out.println(date);

        // runtime exception veririr yani D
    }
}
