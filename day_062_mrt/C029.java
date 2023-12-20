package day_062_mrt;


import java.util.ArrayList;

public class C029 {
    public static void main(String[] args) {
        ArrayList<Integer> points=new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);// gider 1.index teki sayiyi cikaririr.
      //  points.remove((Integer)1);// bu sewkilde yazilinca 1 degerini cikarir
        points.remove(null);
        System.out.println(points);// cevap={1,3,4}

    }
}
