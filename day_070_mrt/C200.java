package day_070_mrt;

import java.util.ArrayList;
import java.util.List;

public class C200 {

    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        // insert code here
        int f=ps.indexOf(p2); // cevap=A
        if (f >= 0) {
            System.out.println("Mike Found");
        }
    }
}
       // Hangi kod, 14 satira yazildiginda ,kod "Mike Found" yazar?

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}
