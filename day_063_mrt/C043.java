package day_063_mrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C043 {
    public static void main(String[] args) {
       // String[] arr=("Hi", "How", "Are", "You");// orijinal kod
        String[] arr={"Hi", "How", "Are", "You"};// suslu  parantez attik

        List<String> arrlist=new ArrayList<>(Arrays.asList(arr));
        //if (arrlist.removeIf((String s) -> (return s.length() <=2;))){// orijinal kod
        if (arrlist.removeIf(s->s.length() <=2)){// duzeltilen kod
          //  System.out.println(s+"removed"); orijinal kod
            System.out.println("removed"); // duzeltilen kod
        }
                    // cevap=A yani compilation fails

    }
}
