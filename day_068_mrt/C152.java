package day_068_mrt;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C152 {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("A","B","C","D");
        Iterator<String> itr=lst.iterator();
        while (itr.hasNext()){
            String e=itr.next();
            if (e=="C"){
                break;
            }
            else {
               // continue;  //Cevap=B (Comment line 19)   cunku continue den sonra kod yazilmaz
                System.out.println(e);
            }
        }

    }
}
