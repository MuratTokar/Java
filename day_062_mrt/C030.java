package day_062_mrt;

import java.util.ArrayList;
import java.util.List;

public class C030 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){// Bran varsa jon u cikar Bran yoksa jon u cikarma
            names.remove("Jon");
        }
        System.out.println(names);// Rob,Rick,Bran

        // sette iki ayni isim olamaz ama listte olabilir
    }
}
