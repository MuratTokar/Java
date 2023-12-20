package day_068_mrt;

import java.util.ArrayList;
import java.util.List;

public class C136 {
    public static void main(String[] args) {
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Tech"); // burasi Java oldu replaceAll ile =JavaGroup oldu
            arrayList.add("Expert");// burasi ExpertGroup oldu
            arrayList.set(0,"Java"); // update
            arrayList.forEach(a -> a.concat("Forum")); // etkisiz line cunku atama yapilmadi
            arrayList.replaceAll(s -> s.concat("Group")); // replacrAll ise degeri degistirip atiyor ve atama yapmaya gerek yok
            System.out.println(arrayList);

            // CEVAP=B([JavaGroup, ExpertGroup])
    }
}
