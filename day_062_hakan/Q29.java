package day_062_hakan;

import java.util.ArrayList;

public class Q29 {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        //points.add(5,40);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        // { 1 , 2 , 3 , 4 , null}
        points.remove(1); // remove index 1 : 2 degerini cikar
        // points.remove((Integer)1);
        points.remove(null); // remove null value
        // { 1 , 3 , 4}
        System.out.println(points);
    }
}
