package day_054_hakan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /**
     * Java Regex  veya Regular Expression
     * - Bir API (Application Programming Interface) Browser - API - DB
     * - Cogunlukla password, email, username restriction(sinirlama) icin kullanilir
     * - java.util.regex
     * - Pattern Class & Matcher Class
     */

    public static void main(String[] args) {
        String patt = "I like java asa";
        char search = 'a';
        int index = patt.indexOf(search);
        int counter = 0;
        while(0 < index){
            counter++;
            index = patt.indexOf(search,index+1);
        }

        System.out.println(counter);


        // REGEX
        System.out.println("************* REGEX ****************");
        String reg = "like";
        String pat = "I like java asa";

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(pat);

        /*
        if(matcher.find()){
            System.out.println("'" + pat + "' icerisinde '" + reg + "' bulunur" );
        } else {
            System.out.println("Bulunamadi");
        }
        */

        int count = 0;
        while(matcher.find()){
            count ++;
            System.out.println("Bulundu : " + matcher.group());
            System.out.println("Bulundu : " + matcher.start());
        }
        System.out.println("count : " + count);

        // matcher.find(); returns boolean, eslesen bir regex bulduysa, true, aksi takdirde false
        // matcher.find(int indexFrom); returns boolean, indexFrom dan sonra eslesen bir regex bulduysa, true, aksi takdirde false

        System.out.println("**************************");
        pattern = Pattern.compile(reg);
        matcher = pattern.matcher(pat);
        System.out.println(matcher.find());
        //System.out.println(matcher.group());
        System.out.println(matcher.start());
        System.out.println(matcher.end());

        System.out.println("************** Pattern.matches() ************");
        System.out.println(Pattern.matches("..", "ab")); // boolean, true, 2 characters
        System.out.println(Pattern.matches("..", "abc")); // boolean, false 3 characters
        System.out.println(Pattern.matches("..c", "abc")); // boolean, true 3 characters and ends with 'c'
        System.out.println(Pattern.matches("..c", "abd")); // boolean, false 3 characters but not ends with 'c'

        System.out.println(Pattern.matches("[abc]", "amerik")); // false, a or b or c
        System.out.println(Pattern.matches("[abc]", "b")); // true, a or b or c
        System.out.println(Pattern.matches("[^abc]", "k")); // true, not (a or b or c)
        System.out.println(Pattern.matches("[a-zA-Z]", "a")); // true, not (a or b or c)
        System.out.println(Pattern.matches("[a-zA-Z]", "A")); // true, not (a or b or c)
        System.out.println(Pattern.matches("[a-zA-Z]", "1")); // false, only characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]", "1")); // true,  letters and numbers
        System.out.println(Pattern.matches("[a-z][A-Z][0-9]", "aA1")); // true,  letters and numbers
        System.out.println(Pattern.matches("[a-z[M-Z]]", "d")); // true,  a-z or M-Z
        System.out.println(Pattern.matches("[a-z&&[^def]]", "A")); // a b c (d e f) g ... z
    }
}
