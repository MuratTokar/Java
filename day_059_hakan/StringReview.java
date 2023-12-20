package day_059_hakan;

import java.util.Arrays;
import java.util.Random;

public class StringReview {

    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("asdsad");
        String name = new String("Java");
        String course = "Java"; // literal
        StringBuilder strBuilder = new StringBuilder("Programming");

        /**
         *         StringBuffer
         *         - Synchronized bir class tir
         *         - Thread-safe bir classtir
         *         - Performanci dusuktur ve yavastir
         *         - reverse methodu
         */

        System.out.println(strBuilder.reverse());

        String[] splitArr = "   Merhaba Dunya  Selam    ".trim().replaceAll("  "," ").split(" ");
        System.out.println(Arrays.toString(splitArr));

        Random rn = new Random();
        int a = rn.nextInt(1,11); // 1-10
        System.out.println(a);

    }
}
