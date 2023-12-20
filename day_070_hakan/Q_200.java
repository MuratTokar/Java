package day_070_hakan;

import java.util.ArrayList;
import java.util.List;

public class Q_200 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        // insert code here
      //  int f = ps.indexOf(p2);
        int f = ps.indexOf(new Patient("Mike"));
        System.out.println(f);

        if (f >= 0) {
            System.out.println("Mike Found");
        }
    }
}


class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}